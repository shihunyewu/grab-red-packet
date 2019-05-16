package com.sgy.dao;

import org.springframework.stereotype.Repository;

import com.sgy.pojo.RedPacket;
@Repository
public interface RedPacketDao {
	public RedPacket getRedPacket(Long id);
	public RedPacket getRedPacketForUpdate(Long id);
	
	public int decreaseRedPacket(Long id);
}
