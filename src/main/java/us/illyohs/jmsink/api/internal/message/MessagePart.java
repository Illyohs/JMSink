package us.illyohs.jmsink.api.internal.message;

import us.illyohs.jmsink.api.message.JMSMessage;
import us.illyohs.jmsink.api.internal.state.StatePart;

import org.jgroups.Address;

public class MessagePart extends JMSMessage
{
    public MessagePart(Address address, String node)
    {
        super(address, node, new StatePart());
    }
}
