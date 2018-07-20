package com.ssm.pojo;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @since 2018-06-25
 */
@TableName("sys_menu")
public class Menu implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId(type = IdType.UUID)
	private Long id;

	/**
	 *
	 */
	private String name;

	/**
	 *
	 */
	private String url;

	/**
	 *
	 */
	private Long parentid;

	/**
	 *
	 */
	private String icon;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getParentid() {
		return parentid;
	}

	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
