import indi.ssm.pojo.User;
import indi.ssm.service.UserService;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// Spring时，可以使用注解的方式来引入配置文件和类，然后再将 service 接口对象注入，就可以进行测试了。
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:/spring/applicationContext-dao.xml","classpath:/spring/applicationContext-service.xml"})
public class TestMyBatisBySpring {
	@Resource
	private UserService userService;

	@Test
	public void testUserBySpring() {
		List<User> list = userService.selectUser();
		for (User user : list) {
			System.out.println(user.getUuid()+":"+user.getUserName());
		}
	}
}
