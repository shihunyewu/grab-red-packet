package com.sgy.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sgy.service.UserRedPacketService;

@Controller
@RequestMapping("/userRedPacket")
public class UserRedPacketController {
	@Autowired
	UserRedPacketService userRedPacketService;
	
	@RequestMapping(value = "/grapRedPacket")
	@ResponseBody
	public Map<String, Object> grapRedPacket(Long redPacketId, Long userId){
		int result = userRedPacketService.grapRedPacket(redPacketId, userId);  // 会返回影响行数
		Map<String, Object> retMap = new HashMap<String, Object>();
		boolean flag = result > 0;
		retMap.put("success", flag);
		retMap.put("message", flag ? "抢红包成功" :"抢红包失败");
		return retMap;
	}
	
	@RequestMapping("/grab_packet")
	public String index() {
		return "grab_packet";
	}
	
}
