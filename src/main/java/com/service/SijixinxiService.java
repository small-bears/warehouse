package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SijixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SijixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SijixinxiView;


/**
 * 司机信息
 *
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public interface SijixinxiService extends IService<SijixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SijixinxiVO> selectListVO(Wrapper<SijixinxiEntity> wrapper);
   	
   	SijixinxiVO selectVO(@Param("ew") Wrapper<SijixinxiEntity> wrapper);
   	
   	List<SijixinxiView> selectListView(Wrapper<SijixinxiEntity> wrapper);
   	
   	SijixinxiView selectView(@Param("ew") Wrapper<SijixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SijixinxiEntity> wrapper);
   	

}

