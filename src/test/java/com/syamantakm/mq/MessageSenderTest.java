package com.syamantakm.mq;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * @author Syamantak Mukhopadhyay
 */
public class MessageSenderTest {

    private MessageSender messageSender;
    private OutputCollector outputCollector;

    @BeforeMethod
    public void setUp() {
         messageSender = AppFactory.getInstance().getBean(MessageSender.class);
         outputCollector = AppFactory.getInstance().getBean(OutputCollector.class);
    }

    @Test
    public void shouldReceiveSameMessageFromSender() {
        //Given
        String url = "http://www/example.com";

        //When
        messageSender.simpleSend(url);

        //Then
        Map<String, String> outputMap = outputCollector.getOutputMap();
        assertEquals(outputMap.size(), 1);
        assertEquals(outputMap.get(MessageParams.URL_PARAM.toString()), url);
    }
}
