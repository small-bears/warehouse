package com.entity.vo;

import com.entity.HuowuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 货物信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public class HuowuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 货物类型
	 */
	
	private String huowuleixing;
		
	/**
	 * 货物图片
	 */
	
	private String huowutupian;
		
	/**
	 * 货物规格
	 */
	
	private String huowuguige;
		
	/**
	 * 货物数量
	 */
	
	private Integer huowushuliang;
		
	/**
	 * 货物详情
	 */
	
	private String huowuxiangqing;
		
	/**
	 * 有效期至
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date youxiaoqizhi;
		
	/**
	 * 仓库编号
	 */
	
	private String cangkubianhao;
		
	/**
	 * 仓库名称
	 */
	
	private String cangkumingcheng;
		
	/**
	 * 仓库位置
	 */
	
	private String cangkuweizhi;
				
	
	/**
	 * 设置：货物类型
	 */
	 
	public void setHuowuleixing(String huowuleixing) {
		this.huowuleixing = huowuleixing;
	}
	
	/**
	 * 获取：货物类型
	 */
	public String getHuowuleixing() {
		return huowuleixing;
	}
				
	
	/**
	 * 设置：货物图片
	 */
	 
	public void setHuowutupian(String huowutupian) {
		this.huowutupian = huowutupian;
	}
	
	/**
	 * 获取：货物图片
	 */
	public String getHuowutupian() {
		return huowutupian;
	}
				
	
	/**
	 * 设置：货物规格
	 */
	 
	public void setHuowuguige(String huowuguige) {
		this.huowuguige = huowuguige;
	}
	
	/**
	 * 获取：货物规格
	 */
	public String getHuowuguige() {
		return huowuguige;
	}
				
	
	/**
	 * 设置：货物数量
	 */
	 
	public void setHuowushuliang(Integer huowushuliang) {
		this.huowushuliang = huowushuliang;
	}
	
	/**
	 * 获取：货物数量
	 */
	public Integer getHuowushuliang() {
		return huowushuliang;
	}
				
	
	/**
	 * 设置：货物详情
	 */
	 
	public void setHuowuxiangqing(String huowuxiangqing) {
		this.huowuxiangqing = huowuxiangqing;
	}
	
	/**
	 * 获取：货物详情
	 */
	public String getHuowuxiangqing() {
		return huowuxiangqing;
	}
				
	
	/**
	 * 设置：有效期至
	 */
	 
	public void setYouxiaoqizhi(Date youxiaoqizhi) {
		this.youxiaoqizhi = youxiaoqizhi;
	}
	
	/**
	 * 获取：有效期至
	 */
	public Date getYouxiaoqizhi() {
		return youxiaoqizhi;
	}
				
	
	/**
	 * 设置：仓库编号
	 */
	 
	public void setCangkubianhao(String cangkubianhao) {
		this.cangkubianhao = cangkubianhao;
	}
	
	/**
	 * 获取：仓库编号
	 */
	public String getCangkubianhao() {
		return cangkubianhao;
	}
				
	
	/**
	 * 设置：仓库名称
	 */
	 
	public void setCangkumingcheng(String cangkumingcheng) {
		this.cangkumingcheng = cangkumingcheng;
	}
	
	/**
	 * 获取：仓库名称
	 */
	public String getCangkumingcheng() {
		return cangkumingcheng;
	}
				
	
	/**
	 * 设置：仓库位置
	 */
	 
	public void setCangkuweizhi(String cangkuweizhi) {
		this.cangkuweizhi = cangkuweizhi;
	}
	
	/**
	 * 获取：仓库位置
	 */
	public String getCangkuweizhi() {
		return cangkuweizhi;
	}
			
}
