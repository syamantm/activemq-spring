package com.syamantakm.mq;

import org.springframework.jms.core.JmsTemplate;

import java.util.Collections;
import java.util.Map;

/**
 * @author Syamantak Mukhopadhyay
 */
public class MessageSender {
    private final JmsTemplate jmsTemplate;

    public MessageSender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void simpleSend(final String url) {
        Map<String, String> map = Collections.singletonMap(MessageParams.URL_PARAM.toString(), url);
        this.jmsTemplate.convertAndSend(map);
    }
}
