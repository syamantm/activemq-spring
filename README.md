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

### Spring JMS
Reference manual is [Here](http://static.springsource.org/spring/docs/3.0.x/spring-framework-reference/html/jms.html).

### Code walk-through

##### Message sender class
Class name - [MessageSender.java](src/main/java/com/syamantakm/mq/MessageSender.java), uses Spring JMS Template
    ```java
    /**
     * Inject a JMS Template
     * @param jmsTemplate
     */
    public MessageSender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }
    ```

##### Message receiver class
Class name - [MessageReceiver.java](src/main/java/com/syamantakm/mq/MessageReceiver.java), implements javax.jms.MessageListener

    /**
     * Implement javax.jms.MessageListener interface
     *
     * @author Syamantak Mukhopadhyay
     */
    public class MessageReceiver implements MessageListener {
        @Override
        public void onMessage(Message message) {
            ....
        }
    }

##### Spring configuration
Context Configuration file  - [applicationContext.xml](src/main/resources/applicationContext.xml)

##### Queue url and name
test/resources/mq-example.properties

    jms.broker.url=tcp://localhost:61616
    jms.queue.name=testSpringJms

