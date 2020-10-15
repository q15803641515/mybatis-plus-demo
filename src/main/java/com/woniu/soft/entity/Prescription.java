package com.woniu.soft.entity;

import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * <p>
 * 处方表
 * </p>
 *
 * @author liming
 * @since 2020-10-12
 */
public class Prescription implements Serializable {
	private static final long serialVersionUID = 1L;
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	@TableField(exist = false)
	private List<PresDrug> info;
	@TableField(exist = false)
	private User user;
	/**
	 * 医嘱id
	 */
	private Integer adId;
	/**
	 * 0未完成，1已完成
	 */
	private Integer status;

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	public List<PresDrug> getInfo() {
		return info;
	}

	public void setInfo(List<PresDrug> info) {
		this.info = info;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAdId() {
		return adId;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", info=" + info + ", adId=" + adId + ", status=" + status + "]";
	}

}
