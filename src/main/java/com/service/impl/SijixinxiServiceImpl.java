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


import com.dao.SijixinxiDao;
import com.entity.SijixinxiEntity;
import com.service.SijixinxiService;
import com.entity.vo.SijixinxiVO;
import com.entity.view.SijixinxiView;

@Service("sijixinxiService")
public class SijixinxiServiceImpl extends ServiceImpl<SijixinxiDao, SijixinxiEntity> implements SijixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SijixinxiEntity> page = this.selectPage(
                new Query<SijixinxiEntity>(params).getPage(),
                new EntityWrapper<SijixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SijixinxiEntity> wrapper) {
		  Page<SijixinxiView> page =new Query<SijixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SijixinxiVO> selectListVO(Wrapper<SijixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SijixinxiVO selectVO(Wrapper<SijixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SijixinxiView> selectListView(Wrapper<SijixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SijixinxiView selectView(Wrapper<SijixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
