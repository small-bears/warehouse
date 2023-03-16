package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuowuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuowuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuowuxinxiView;


/**
 * 货物信息
 *
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public interface HuowuxinxiService extends IService<HuowuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuowuxinxiVO> selectListVO(Wrapper<HuowuxinxiEntity> wrapper);
   	
   	HuowuxinxiVO selectVO(@Param("ew") Wrapper<HuowuxinxiEntity> wrapper);
   	
   	List<HuowuxinxiView> selectListView(Wrapper<HuowuxinxiEntity> wrapper);
   	
   	HuowuxinxiView selectView(@Param("ew") Wrapper<HuowuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuowuxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<HuowuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<HuowuxinxiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<HuowuxinxiEntity> wrapper);
}

