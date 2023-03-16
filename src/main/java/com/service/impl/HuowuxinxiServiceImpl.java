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


import com.dao.HuowuxinxiDao;
import com.entity.HuowuxinxiEntity;
import com.service.HuowuxinxiService;
import com.entity.vo.HuowuxinxiVO;
import com.entity.view.HuowuxinxiView;

@Service("huowuxinxiService")
public class HuowuxinxiServiceImpl extends ServiceImpl<HuowuxinxiDao, HuowuxinxiEntity> implements HuowuxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuowuxinxiEntity> page = this.selectPage(
                new Query<HuowuxinxiEntity>(params).getPage(),
                new EntityWrapper<HuowuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuowuxinxiEntity> wrapper) {
		  Page<HuowuxinxiView> page =new Query<HuowuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuowuxinxiVO> selectListVO(Wrapper<HuowuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuowuxinxiVO selectVO(Wrapper<HuowuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuowuxinxiView> selectListView(Wrapper<HuowuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuowuxinxiView selectView(Wrapper<HuowuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<HuowuxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<HuowuxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<HuowuxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
