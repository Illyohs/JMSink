package us.illyohs.jmsink.api.event;

import us.illyohs.jmsink.api.message.JMSMessage;

public class JMSEvent
{
    JMSMessage message;

    public JMSEvent(JMSMessage message)
    {
        this.message = message;
    }
}
