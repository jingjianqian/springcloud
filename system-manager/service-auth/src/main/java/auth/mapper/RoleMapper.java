package auth.mapper;

import auth.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RoleMapper {

    @Select("select id, role_name,role_description from sys_role t")
    public List<Role> list();

}
