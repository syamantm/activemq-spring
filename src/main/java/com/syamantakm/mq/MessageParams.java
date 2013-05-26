package com.syamantakm.mq;

/**
 * @author Syamantak Mukhopadhyay
 */
public enum MessageParams {
    URL_PARAM("url");

    private String param;

    private MessageParams(String param) {
        this.param = param;
    }

    @Override
    public String toString() {
        return param;
    }
}
