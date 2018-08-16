package ssm.com.jammy.dao;

import ssm.com.jammy.model.User;

/**
 * Created by moqiandemac on 2017/7/5.
 */
public interface UserDao {
    //这里以接口形式定义了数据库操作方法,我们只需
    // 在Mybatis映射文件中对其进行映射就可以直接使用
    public User selectById(int id);
    public User selectByName(String username);
}