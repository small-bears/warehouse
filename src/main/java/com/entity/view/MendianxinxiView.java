package com.entity.view;

import com.entity.MendianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 门店信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
@TableName("mendianxinxi")
public class MendianxinxiView  extends MendianxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MendianxinxiView(){
	}
 
 	public MendianxinxiView(MendianxinxiEntity mendianxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, mendianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
