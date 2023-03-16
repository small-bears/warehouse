package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChangshangxinxiDao;
import com.entity.ChangshangxinxiEntity;
import com.service.ChangshangxinxiService;
import com.entity.vo.ChangshangxinxiVO;
import com.entity.view.ChangshangxinxiView;

@Service("changshangxinxiService")
public class ChangshangxinxiServiceImpl extends ServiceImpl<ChangshangxinxiDao, ChangshangxinxiEntity> implements ChangshangxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChangshangxinxiEntity> page = this.selectPage(
                new Query<ChangshangxinxiEntity>(params).getPage(),
                new EntityWrapper<ChangshangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChangshangxinxiEntity> wrapper) {
		  Page<ChangshangxinxiView> page =new Query<ChangshangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChangshangxinxiVO> selectListVO(Wrapper<ChangshangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChangshangxinxiVO selectVO(Wrapper<ChangshangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChangshangxinxiView> selectListView(Wrapper<ChangshangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChangshangxinxiView selectView(Wrapper<ChangshangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
