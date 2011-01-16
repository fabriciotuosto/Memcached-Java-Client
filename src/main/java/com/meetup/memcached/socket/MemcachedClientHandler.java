package com.meetup.memcached.socket;

import org.jboss.netty.channel.ChannelEvent;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

public class MemcachedClientHandler extends SimpleChannelHandler{

	@Override
	public void channelClosed(ChannelHandlerContext ctx, ChannelStateEvent e)
			throws Exception {
		// TODO Auto-generated method stub
		super.channelClosed(ctx, e);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e)
			throws Exception {
		// TODO Auto-generated method stub
		super.exceptionCaught(ctx, e);
	}

	@Override
	public void handleDownstream(ChannelHandlerContext arg0, ChannelEvent arg1)
			throws Exception {
		// TODO Auto-generated method stub
		super.handleDownstream(arg0, arg1);
	}

	@Override
	public void handleUpstream(ChannelHandlerContext arg0, ChannelEvent arg1)
			throws Exception {
		// TODO Auto-generated method stub
		super.handleUpstream(arg0, arg1);
	}

	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e)
			throws Exception {
		// TODO Auto-generated method stub
		super.messageReceived(ctx, e);
	}

	
	
}
