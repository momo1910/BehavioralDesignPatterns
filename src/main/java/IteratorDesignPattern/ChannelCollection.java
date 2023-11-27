package IteratorDesignPattern;

public interface ChannelCollection {
    public  void addChannel(Channel c);
    public  void removeChannel(Channel c);
    public  ChannelIterator getChannelIterator(ChannelType channelType);

}
