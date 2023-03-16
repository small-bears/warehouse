package com.dao;

import com.entity.HuowuchukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuowuchukuVO;
import com.entity.view.HuowuchukuView;


/**
 * 货物出库
 * 
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public interface HuowuchukuDao extends BaseMapper<HuowuchukuEntity> {
	
	List<HuowuchukuVO> selectListVO(@Param("ew") Wrapper<HuowuchukuEntity> wrapper);
	
	HuowuchukuVO selectVO(@Param("ew") Wrapper<HuowuchukuEntity> wrapper);
	
	List<HuowuchukuView> selectListView(@Param("ew") Wrapper<HuowuchukuEntity> wrapper);

	List<HuowuchukuView> selectListView(Pagination page,@Param("ew") Wrapper<HuowuchukuEntity> wrapper);
	
	HuowuchukuView selectView(@Param("ew") Wrapper<HuowuchukuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuowuchukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuowuchukuEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuowuchukuEntity> wrapper);
}
