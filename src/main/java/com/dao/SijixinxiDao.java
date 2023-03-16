package com.dao;

import com.entity.SijixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SijixinxiVO;
import com.entity.view.SijixinxiView;


/**
 * 司机信息
 * 
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public interface SijixinxiDao extends BaseMapper<SijixinxiEntity> {
	
	List<SijixinxiVO> selectListVO(@Param("ew") Wrapper<SijixinxiEntity> wrapper);
	
	SijixinxiVO selectVO(@Param("ew") Wrapper<SijixinxiEntity> wrapper);
	
	List<SijixinxiView> selectListView(@Param("ew") Wrapper<SijixinxiEntity> wrapper);

	List<SijixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<SijixinxiEntity> wrapper);
	
	SijixinxiView selectView(@Param("ew") Wrapper<SijixinxiEntity> wrapper);
	

}
