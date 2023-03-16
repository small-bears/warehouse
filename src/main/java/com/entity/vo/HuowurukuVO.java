package com.entity.vo;

import com.entity.HuowurukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 货物入库
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public class HuowurukuVO  implements Serializable {
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
	 * 厂商地址
	 */
	
	private String changshangdizhi;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 入库时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date rukushijian;
		
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 入库备注
	 */
	
	private String rukubeizhu;
				
	
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
	 * 设置：入库时间
	 */
	 
	public void setRukushijian(Date rukushijian) {
		this.rukushijian = rukushijian;
	}
	
	/**
	 * 获取：入库时间
	 */
	public Date getRukushijian() {
		return rukushijian;
	}
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：入库备注
	 */
	 
	public void setRukubeizhu(String rukubeizhu) {
		this.rukubeizhu = rukubeizhu;
	}
	
	/**
	 * 获取：入库备注
	 */
	public String getRukubeizhu() {
		return rukubeizhu;
	}
			
}
