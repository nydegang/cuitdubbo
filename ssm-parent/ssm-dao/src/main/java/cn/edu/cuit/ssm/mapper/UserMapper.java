package cn.edu.cuit.ssm.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select count(*) from users where user_name=#{name} and user_pass=#{pass}")
	int findUserByNameAndPwd(@Param("name") String name,@Param("pass") String pass);

}
