package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChangshangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChangshangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangshangxinxiView;


/**
 * 厂商信息
 *
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
public interface ChangshangxinxiService extends IService<ChangshangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChangshangxinxiVO> selectListVO(Wrapper<ChangshangxinxiEntity> wrapper);
   	
   	ChangshangxinxiVO selectVO(@Param("ew") Wrapper<ChangshangxinxiEntity> wrapper);
   	
   	List<ChangshangxinxiView> selectListView(Wrapper<ChangshangxinxiEntity> wrapper);
   	
   	ChangshangxinxiView selectView(@Param("ew") Wrapper<ChangshangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChangshangxinxiEntity> wrapper);
   	

}

