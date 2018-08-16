package ssm.com.jammy;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssm.com.jammy.dao.UserDao;
import ssm.com.jammy.model.User;

/**
 * Created by moqiandemac on 2017/7/5.
 */
public class Test {
    private static ApplicationContext ac;
    static {
        ac = new ClassPathXmlApplicationContext("classpath*:ssm/com/jammy/config/applicationContext.xml");
    }

    public static void main(String[] args) {
        System.out.println("获取");
        UserDao mapper = (UserDao) ac.getBean("UserDao");
        System.out.println("获取jammy");
        User user = mapper.selectByName("jammy");

        System.out.println(user.getId()+":"+"username:"+user.getUsername());
        System.out.println("password:"+user.getPassword());

    }
}
