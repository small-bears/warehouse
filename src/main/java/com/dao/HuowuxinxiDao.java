package com.dao;

import com.entity.HuowuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuowuxinxiVO;
import com.entity.view.HuowuxinxiView;


/**
 * 货物信息
 * 
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public interface HuowuxinxiDao extends BaseMapper<HuowuxinxiEntity> {
	
	List<HuowuxinxiVO> selectListVO(@Param("ew") Wrapper<HuowuxinxiEntity> wrapper);
	
	HuowuxinxiVO selectVO(@Param("ew") Wrapper<HuowuxinxiEntity> wrapper);
	
	List<HuowuxinxiView> selectListView(@Param("ew") Wrapper<HuowuxinxiEntity> wrapper);

	List<HuowuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuowuxinxiEntity> wrapper);
	
	HuowuxinxiView selectView(@Param("ew") Wrapper<HuowuxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuowuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuowuxinxiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HuowuxinxiEntity> wrapper);
}
