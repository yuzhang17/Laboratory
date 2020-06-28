package com.ericzhang08.session.autoconfiguration.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class InjectMockTest {

    @Mock
    Map<String, String> wordMap;

    @InjectMocks
    MyDictionary dic = new MyDictionary();

    @Test
    public void whenUseInjectMocksAnnotation_thenCorrect() {
//        Mockito.when(wordMap.get("aWord")).thenReturn("aMeaning");
        given(wordMap.get("aWord")).willReturn("aMeaning");

        assertEquals("aMeaning", dic.getMeaning("aWord"));
    }
}
