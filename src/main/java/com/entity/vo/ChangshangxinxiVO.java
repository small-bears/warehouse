package com.entity.vo;

import com.entity.ChangshangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 厂商信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public class ChangshangxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
