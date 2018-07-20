package com.ssm.pojo;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 * @since 2018-06-25
 */
@TableName("sys_roles_permissions")
public class RolesPermissions implements Serializable {

private static final long serialVersionUID = 1L;

/**
 * 
 */
	    @TableId(type = IdType.UUID)
		    @TableField(value="role_id")
	private Long roleId;

/**
 * 
 */
		    @TableField(value="permission_id")
	private Long permissionId;


		
public Long getRoleId() {
        return roleId;
        }

public void setRoleId(Long roleId) {
        this.roleId = roleId;
        }
		
public Long getPermissionId() {
        return permissionId;
        }

public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
        }

        }
