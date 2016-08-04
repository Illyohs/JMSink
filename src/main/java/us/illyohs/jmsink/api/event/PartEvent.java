package us.illyohs.jmsink.api.event;

import us.illyohs.jmsink.api.internal.message.MessagePart;

public class PartEvent extends JMSEvent
{
    public PartEvent(MessagePart message)
    {
        super(message);
    }
}
