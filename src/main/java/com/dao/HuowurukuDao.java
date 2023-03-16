package com.dao;

import com.entity.HuowurukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuowurukuVO;
import com.entity.view.HuowurukuView;


/**
 * 货物入库
 * 
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public interface HuowurukuDao extends BaseMapper<HuowurukuEntity> {
	
	List<HuowurukuVO> selectListVO(@Param("ew") Wrapper<HuowurukuEntity> wrapper);
	
	HuowurukuVO selectVO(@Param("ew") Wrapper<HuowurukuEntity> wrapper);
	
	List<HuowurukuView> selectListView(@Param("ew") Wrapper<HuowurukuEntity> wrapper);

	List<HuowurukuView> selectListView(Pagination page,@Param("ew") Wrapper<HuowurukuEntity> wrapper);
	
	HuowurukuView selectView(@Param("ew") Wrapper<HuowurukuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuowurukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuowurukuEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuowurukuEntity> wrapper);
}
