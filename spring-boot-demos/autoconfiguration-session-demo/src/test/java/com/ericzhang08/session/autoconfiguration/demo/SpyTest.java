package com.ericzhang08.session.autoconfiguration.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class SpyTest {

    @Spy
    List<String> spiedList = new ArrayList<String>();

    @Test
    public void whenUseSpyAnnotation_thenSpyIsInjectedCorrectly() {
        spiedList.add("one");
        spiedList.add("two");

//        Mockito.verify(spiedList).add("one");
//        Mockito.verify(spiedList).add("two");

        assertEquals(2, spiedList.size());

//        given(spiedList.size()).willReturn(100);
        Mockito.doReturn(100).when(spiedList).size();
        assertEquals(100, spiedList.size());
    }
}
