package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuowurukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuowurukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuowurukuView;


/**
 * 货物入库
 *
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public interface HuowurukuService extends IService<HuowurukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuowurukuVO> selectListVO(Wrapper<HuowurukuEntity> wrapper);
   	
   	HuowurukuVO selectVO(@Param("ew") Wrapper<HuowurukuEntity> wrapper);
   	
   	List<HuowurukuView> selectListView(Wrapper<HuowurukuEntity> wrapper);
   	
   	HuowurukuView selectView(@Param("ew") Wrapper<HuowurukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuowurukuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<HuowurukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<HuowurukuEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<HuowurukuEntity> wrapper);
}

