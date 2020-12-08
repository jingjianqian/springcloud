package auth.entity;


import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "sys_role")
@Alias(value = "sysRole")
public class Role {
    private String id;
    @Column
    private String role_name;
    @Column
    private String role_description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_description() {
        return role_description;
    }

    public void setRole_description(String role_description) {
        this.role_description = role_description;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", role_name='" + role_name + '\'' +
                ", role_description='" + role_description + '\'' +
                '}';
    }
}
