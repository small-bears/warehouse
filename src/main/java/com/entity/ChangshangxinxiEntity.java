package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 厂商信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
@TableName("changshangxinxi")
public class ChangshangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChangshangxinxiEntity() {
		
	}
	
	public ChangshangxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 厂商编号
	 */
					
	private String changshangbianhao;
	
	/**
	 * 厂商名称
	 */
					
	private String changshangmingcheng;
	
	/**
	 * 负责人
	 */
					
	private String fuzeren;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 厂商地址
	 */
					
	private String changshangdizhi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：厂商编号
	 */
	public void setChangshangbianhao(String changshangbianhao) {
		this.changshangbianhao = changshangbianhao;
	}
	/**
	 * 获取：厂商编号
	 */
	public String getChangshangbianhao() {
		return changshangbianhao;
	}
	/**
	 * 设置：厂商名称
	 */
	public void setChangshangmingcheng(String changshangmingcheng) {
		this.changshangmingcheng = changshangmingcheng;
	}
	/**
	 * 获取：厂商名称
	 */
	public String getChangshangmingcheng() {
		return changshangmingcheng;
	}
	/**
	 * 设置：负责人
	 */
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：厂商地址
	 */
	public void setChangshangdizhi(String changshangdizhi) {
		this.changshangdizhi = changshangdizhi;
	}
	/**
	 * 获取：厂商地址
	 */
	public String getChangshangdizhi() {
		return changshangdizhi;
	}

}
