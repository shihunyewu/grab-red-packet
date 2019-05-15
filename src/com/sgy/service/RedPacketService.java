package com.sgy.service;

import com.sgy.pojo.RedPacket;

public interface RedPacketService {
	public RedPacket getRedPacket(Long id);
	public int decreaseRedPacket(Long id);
}
