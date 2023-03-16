package com.entity.model;

import com.entity.SijixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 司机信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public class SijixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private Integer nianling;
		
	/**
	 * 驾龄
	 */
	
	private Integer jialing;
		
	/**
	 * 司机手机
	 */
	
	private String sijishouji;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：驾龄
	 */
	 
	public void setJialing(Integer jialing) {
		this.jialing = jialing;
	}
	
	/**
	 * 获取：驾龄
	 */
	public Integer getJialing() {
		return jialing;
	}
				
	
	/**
	 * 设置：司机手机
	 */
	 
	public void setSijishouji(String sijishouji) {
		this.sijishouji = sijishouji;
	}
	
	/**
	 * 获取：司机手机
	 */
	public String getSijishouji() {
		return sijishouji;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
			
}
