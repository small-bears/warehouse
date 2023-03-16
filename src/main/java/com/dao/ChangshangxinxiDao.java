package com.dao;

import com.entity.ChangshangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChangshangxinxiVO;
import com.entity.view.ChangshangxinxiView;


/**
 * 厂商信息
 * 
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public interface ChangshangxinxiDao extends BaseMapper<ChangshangxinxiEntity> {
	
	List<ChangshangxinxiVO> selectListVO(@Param("ew") Wrapper<ChangshangxinxiEntity> wrapper);
	
	ChangshangxinxiVO selectVO(@Param("ew") Wrapper<ChangshangxinxiEntity> wrapper);
	
	List<ChangshangxinxiView> selectListView(@Param("ew") Wrapper<ChangshangxinxiEntity> wrapper);

	List<ChangshangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChangshangxinxiEntity> wrapper);
	
	ChangshangxinxiView selectView(@Param("ew") Wrapper<ChangshangxinxiEntity> wrapper);
	

}
