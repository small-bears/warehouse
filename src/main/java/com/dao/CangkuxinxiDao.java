package com.dao;

import com.entity.CangkuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CangkuxinxiVO;
import com.entity.view.CangkuxinxiView;


/**
 * 仓库信息
 * 
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public interface CangkuxinxiDao extends BaseMapper<CangkuxinxiEntity> {
	
	List<CangkuxinxiVO> selectListVO(@Param("ew") Wrapper<CangkuxinxiEntity> wrapper);
	
	CangkuxinxiVO selectVO(@Param("ew") Wrapper<CangkuxinxiEntity> wrapper);
	
	List<CangkuxinxiView> selectListView(@Param("ew") Wrapper<CangkuxinxiEntity> wrapper);

	List<CangkuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CangkuxinxiEntity> wrapper);
	
	CangkuxinxiView selectView(@Param("ew") Wrapper<CangkuxinxiEntity> wrapper);
	

}
