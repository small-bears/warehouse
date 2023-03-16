package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CangkuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CangkuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CangkuxinxiView;


/**
 * 仓库信息
 *
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public interface CangkuxinxiService extends IService<CangkuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CangkuxinxiVO> selectListVO(Wrapper<CangkuxinxiEntity> wrapper);
   	
   	CangkuxinxiVO selectVO(@Param("ew") Wrapper<CangkuxinxiEntity> wrapper);
   	
   	List<CangkuxinxiView> selectListView(Wrapper<CangkuxinxiEntity> wrapper);
   	
   	CangkuxinxiView selectView(@Param("ew") Wrapper<CangkuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CangkuxinxiEntity> wrapper);
   	

}

