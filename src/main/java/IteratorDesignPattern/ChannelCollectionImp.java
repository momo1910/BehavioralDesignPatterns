package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImp implements ChannelCollection{
    List<Channel> channelList;

    public ChannelCollectionImp() {
        this.channelList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel c) {
        channelList.add(c);

    }

    @Override
    public void removeChannel(Channel c) {
       channelList.remove(c);
    }

    @Override
    public ChannelIterator getChannelIterator(ChannelType channelType) {
        return new ChannelIteratorImpl(channelList,channelType);
    }

    public class ChannelIteratorImpl implements ChannelIterator{
        private int position;
        private List<Channel> channelList;
        private ChannelType channelType;

        public ChannelIteratorImpl( List<Channel> channelList, ChannelType channelType) {
            this.channelList = channelList;
            this.channelType = channelType;
        }

        @Override
        public boolean hasNext() {
            while(position<channelList.size()){
                Channel c = channelList.get(position);
                if(c.getChannelType().equals(channelType)|| channelType.equals(ChannelType.ALL))
                    return true;
                else
                    position++;
            }
            return false;
        }

        @Override
        public Channel next() {
          Channel c = channelList.get(position);
          position++;
          return c;
        }
    }
}
