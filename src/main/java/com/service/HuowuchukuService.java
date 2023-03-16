package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuowuchukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuowuchukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuowuchukuView;


/**
 * 货物出库
 *
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public interface HuowuchukuService extends IService<HuowuchukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuowuchukuVO> selectListVO(Wrapper<HuowuchukuEntity> wrapper);
   	
   	HuowuchukuVO selectVO(@Param("ew") Wrapper<HuowuchukuEntity> wrapper);
   	
   	List<HuowuchukuView> selectListView(Wrapper<HuowuchukuEntity> wrapper);
   	
   	HuowuchukuView selectView(@Param("ew") Wrapper<HuowuchukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuowuchukuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<HuowuchukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<HuowuchukuEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<HuowuchukuEntity> wrapper);
}

