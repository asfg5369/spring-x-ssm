package com.ssm.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * <p>
 * 
 * </p>
 *
 * @since 2018-06-25
 */
@TableName("sys_permissions")
public class Permissions implements Serializable {

private static final long serialVersionUID = 1L;

/**
 * 
 */
	    @TableId(type = IdType.UUID)
		private Long id;

/**
 * 
 */
		private String permission;

/**
 * 
 */
		private String description;

/**
 * 
 */
		private Integer available;


		
public Long getId() {
        return id;
        }

public void setId(Long id) {
        this.id = id;
        }
		
public String getPermission() {
        return permission;
        }

public void setPermission(String permission) {
        this.permission = permission;
        }
		
public String getDescription() {
        return description;
        }

public void setDescription(String description) {
        this.description = description;
        }
		
public Integer getAvailable() {
        return available;
        }

public void setAvailable(Integer available) {
        this.available = available;
        }

        }
