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


import com.dao.MendianxinxiDao;
import com.entity.MendianxinxiEntity;
import com.service.MendianxinxiService;
import com.entity.vo.MendianxinxiVO;
import com.entity.view.MendianxinxiView;

@Service("mendianxinxiService")
public class MendianxinxiServiceImpl extends ServiceImpl<MendianxinxiDao, MendianxinxiEntity> implements MendianxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MendianxinxiEntity> page = this.selectPage(
                new Query<MendianxinxiEntity>(params).getPage(),
                new EntityWrapper<MendianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MendianxinxiEntity> wrapper) {
		  Page<MendianxinxiView> page =new Query<MendianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MendianxinxiVO> selectListVO(Wrapper<MendianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MendianxinxiVO selectVO(Wrapper<MendianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MendianxinxiView> selectListView(Wrapper<MendianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MendianxinxiView selectView(Wrapper<MendianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
