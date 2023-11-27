package IteratorDesignPattern;

public class IteratorMain {
    public static void main(String args[]) {


        ChannelCollection channelCollection = populateChannels();
        ChannelIterator channelIterator = channelCollection.getChannelIterator(ChannelType.ALL);
        while (channelIterator.hasNext()) {
            Channel c = channelIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("********************");
        ChannelIterator hindichannelIterator = channelCollection.getChannelIterator(ChannelType.ENGLISH);
        while (hindichannelIterator.hasNext()) {
            Channel c = hindichannelIterator.next();
            System.out.println(c.toString());
        }
    }



    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImp();
        channels.addChannel(new Channel(98.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelType.HINDI));
        channels.addChannel(new Channel(100.5, ChannelType.MARATHI));
        channels.addChannel(new Channel(101.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelType.HINDI));
        channels.addChannel(new Channel(103.5, ChannelType.MARATHI));
        channels.addChannel(new Channel(104.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelType.HINDI));
        channels.addChannel(new Channel(106.5, ChannelType.MARATHI));
        return channels;
}
}
