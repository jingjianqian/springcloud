package auth.mapper;

import auth.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface UserMapper {

    @Select("select password  from sys_user where username = #{username}")
    String getUser(String username);


    @Insert("insert into user(id,username,password,phone,state) value(#{id},#{username},#{password},,#{phone},#{state})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int insert(User user);
}
