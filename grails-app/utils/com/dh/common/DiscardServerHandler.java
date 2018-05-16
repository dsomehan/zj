package com.dh.common;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

/**
 * Created by HSH on 2018/5/16 9:55
 */
public class DiscardServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        // 默默地丢弃收到的数据
//        ((ByteBuf) msg).release(); // (3)
        ByteBuf in = (ByteBuf) msg;
        try {
           while (in.isReadable()){
               System.out.print((char) in.readByte());
               System.out.flush();
           }
        }finally {
            ReferenceCountUtil.release(msg);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        // 当出现异常就关闭连接
        cause.printStackTrace();
        ctx.close();
    }
}
