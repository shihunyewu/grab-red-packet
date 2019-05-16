package com.sgy.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sgy.dao.RedPacketDao;
import com.sgy.dao.UserRedPacketDao;
import com.sgy.pojo.RedPacket;
import com.sgy.pojo.UserRedPacket;
import com.sgy.service.UserRedPacketService;

@Service
public class UserRedPacketServiceImpl implements UserRedPacketService {
	
	@Autowired
	private UserRedPacketDao userRedPacketDao = null;
	
	@Autowired
	private RedPacketDao redPacketDao = null;
	
	// 失败
	private static final int FAILED = 0 ;
	
	@Override
	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public int grapRedPacket(Long redPacketId, Long userId) {
		// 获取红包信息
//		RedPacket redPacket = redPacketDao.getRedPacketForUpdate(redPacketId);
		RedPacket redPacket = redPacketDao.getRedPacket(redPacketId);
		if(redPacket.getStock() > 0) {
			redPacketDao.decreaseRedPacket(redPacketId);
			// 生成抢红包信息
			UserRedPacket userRedPacket =new UserRedPacket();
			userRedPacket.setRedPacketId(redPacketId);
			userRedPacket.setUserId(userId);
			userRedPacket.setAmount(redPacket.getUnitAmount());
			userRedPacket.setNote("抢红包" + redPacketId);
			// 插入抢红包信息
			int result= userRedPacketDao.grapRedPacket(userRedPacket);
			return result ;
		}
		return FAILED;
	}
}
