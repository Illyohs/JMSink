package us.illyohs.jmsink.api.message;

import java.io.Serializable;

import us.illyohs.jmsink.api.state.State;

import org.jgroups.Address;

public class JMSMessage implements Serializable
{
    Address address;
    String  node;
    State   state;

    public JMSMessage(Address address, String node, State state)
    {
        this.state = state;
        this.address = address;
        this.node = node;
    }

    public Address getAddress()
    {
        return address;
    }

    public String getNode()
    {
        return node;
    }

    public State getState()
    {
        return state;
    }

    public String getStateKey()
    {
        return getState().getKey();
    }
}
