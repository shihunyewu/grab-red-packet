package com.sgy.dao;

import org.springframework.stereotype.Repository;

import com.sgy.pojo.UserRedPacket;

@Repository
public interface UserRedPacketDao {
	
	public int grapRedPacket(UserRedPacket userRedPacket);
}
