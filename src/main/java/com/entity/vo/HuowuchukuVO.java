package com.entity.vo;

import com.entity.HuowuchukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 货物出库
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public class HuowuchukuVO  implements Serializable {
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
	 * 司机姓名
	 */
	
	private String sijixingming;
		
	/**
	 * 司机手机
	 */
	
	private String sijishouji;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 门店编号
	 */
	
	private String mendianbianhao;
		
	/**
	 * 门店名称
	 */
	
	private String mendianmingcheng;
		
	/**
	 * 门店地址
	 */
	
	private String mendiandizhi;
		
	/**
	 * 咨询电话
	 */
	
	private String zixundianhua;
		
	/**
	 * 出库时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chukushijian;
		
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 出库备注
	 */
	
	private String chukubeizhu;
				
	
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
	 * 设置：司机姓名
	 */
	 
	public void setSijixingming(String sijixingming) {
		this.sijixingming = sijixingming;
	}
	
	/**
	 * 获取：司机姓名
	 */
	public String getSijixingming() {
		return sijixingming;
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
				
	
	/**
	 * 设置：门店编号
	 */
	 
	public void setMendianbianhao(String mendianbianhao) {
		this.mendianbianhao = mendianbianhao;
	}
	
	/**
	 * 获取：门店编号
	 */
	public String getMendianbianhao() {
		return mendianbianhao;
	}
				
	
	/**
	 * 设置：门店名称
	 */
	 
	public void setMendianmingcheng(String mendianmingcheng) {
		this.mendianmingcheng = mendianmingcheng;
	}
	
	/**
	 * 获取：门店名称
	 */
	public String getMendianmingcheng() {
		return mendianmingcheng;
	}
				
	
	/**
	 * 设置：门店地址
	 */
	 
	public void setMendiandizhi(String mendiandizhi) {
		this.mendiandizhi = mendiandizhi;
	}
	
	/**
	 * 获取：门店地址
	 */
	public String getMendiandizhi() {
		return mendiandizhi;
	}
				
	
	/**
	 * 设置：咨询电话
	 */
	 
	public void setZixundianhua(String zixundianhua) {
		this.zixundianhua = zixundianhua;
	}
	
	/**
	 * 获取：咨询电话
	 */
	public String getZixundianhua() {
		return zixundianhua;
	}
				
	
	/**
	 * 设置：出库时间
	 */
	 
	public void setChukushijian(Date chukushijian) {
		this.chukushijian = chukushijian;
	}
	
	/**
	 * 获取：出库时间
	 */
	public Date getChukushijian() {
		return chukushijian;
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
	 * 设置：出库备注
	 */
	 
	public void setChukubeizhu(String chukubeizhu) {
		this.chukubeizhu = chukubeizhu;
	}
	
	/**
	 * 获取：出库备注
	 */
	public String getChukubeizhu() {
		return chukubeizhu;
	}
			
}
