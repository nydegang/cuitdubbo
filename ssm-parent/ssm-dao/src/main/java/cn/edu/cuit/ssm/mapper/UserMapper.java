package cn.edu.cuit.ssm.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
/**
 * 
 * 南阳德刚版权所有<br>
 * 个人主页http://www.guodexian.com<br>
 *
 * 说明:用户映射
 */
public interface UserMapper {
    @Select("select count(*) from users where user_name=#{name} and user_pass=#{pass}")
	int findUserByNameAndPwd(@Param("name") String name,@Param("pass") String pass);

}
