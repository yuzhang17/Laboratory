package com.ericzhang08.session.autoconfiguration.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)

public class CaptorTest {

    @Mock
    List mockedList;

    @Captor
    ArgumentCaptor argCaptor;

    @Test
    public void whenUseCaptorAnnotation_thenTheSam() {
        given(mockedList.add(argCaptor.capture())).willReturn(true);
        mockedList.add("one");

        assertEquals("one", argCaptor.getValue());
        System.out.println(argCaptor.getAllValues());
    }
}
