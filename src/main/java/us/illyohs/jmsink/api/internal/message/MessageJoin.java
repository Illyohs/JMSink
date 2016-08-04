package us.illyohs.jmsink.api.internal.message;

import us.illyohs.jmsink.api.message.JMSMessage;
import us.illyohs.jmsink.api.internal.state.StateJoin;

import org.jgroups.Address;

public class MessageJoin extends JMSMessage
{
    public MessageJoin(Address address, String node)
    {
        super(address, node,new StateJoin());
    }
}
