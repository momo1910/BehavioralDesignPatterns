package IteratorDesignPattern;

public class Channel {
    public double frequnecy;
    public ChannelType channelType;

    public Channel(double frequnecy, ChannelType channelType) {
        this.frequnecy = frequnecy;
        this.channelType = channelType;
    }

    public double getFrequnecy() {
        return frequnecy;
    }

    public void setFrequnecy(double frequnecy) {
        this.frequnecy = frequnecy;
    }

    public ChannelType getChannelType() {
        return channelType;
    }

    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "frequnecy=" + frequnecy +
                ", channelType=" + channelType +
                '}';
    }
}
