package testDao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sgy.dao.RedPacketDao;
import com.sgy.pojo.RedPacket;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class testDao {
	 
	@Resource
	 private RedPacketDao redPacketDao;
	    @Test
	    public void testDecreaseRedPacket(){
	       redPacketDao.decreaseRedPacket(1L);
	       RedPacket redPacket = redPacketDao.getRedPacket(1L);
	       System.out.println(redPacket.toString());
	    }
}
