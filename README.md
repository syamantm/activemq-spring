ActiveMQ with Spring-JMS
=============================

This is a jms example using Spring-JMS and ActiveMQ.


Dependencies
------------

[Spring Framework 3.2 {Core, Context, JMS} ](http://www.springsource.org/)

[ActiveMQ 5.8.0](http://activemq.apache.org/activemq-580-release.html)


Getting Started
---------------

### Setting up ActiveMQ
1. Install ActiveMQ on the local machine(localhost). Check the [Getting Started](http://activemq.apache.org/getting-started.html) guide.
2. Login to the [ActiveMQ admin console](http://localhost:8161/admin) and create a queue named **testSpringJms**.


### Code walk-through

* Message sender class - com.syamantakm.mq.MessageSender.Java

    /**
     * Inject a JMS Template
     * @param jmsTemplate
     */
    public MessageSender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }


* Message receiver class - com.syamantakm.mq.MessageReceiver.java

    /**
     * Implement javax.jms.MessageListener interface
     *
     * @author Syamantak Mukhopadhyay
     */
    public class MessageReceiver implements MessageListener {
        ....
    }

* Spring configuration  - main/resources/applicationContext.xml
* Queue url and name - test/resources/mq-example.properties

