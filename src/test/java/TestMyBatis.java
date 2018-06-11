import indi.ssm.pojo.User;
import indi.ssm.service.UserService;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//不使用 Spring 时，一般情况下的一种测试方法 ；
public class TestMyBatis {
	
	private ApplicationContext ac = null;
	private UserService userService = null;
	
	@Before
	public void before() {
		//第一种方式
		//ac = new ClassPathXmlApplicationContext(new String[]{"/spring/applicationContext-service.xml","/spring/applicationContext-dao.xml"});
		//第二种方式
		ac = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext-*.xml");
		userService = (UserService) ac.getBean("userService");
	}

	@Test
	public void testUser() {
		List<User> list = userService.selectUser();
		for (User user : list) {
			System.out.println(user.getUuid()+":"+user.getUserName());
		}
	}
}
