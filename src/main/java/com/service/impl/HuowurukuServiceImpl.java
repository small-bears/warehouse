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


import com.dao.HuowurukuDao;
import com.entity.HuowurukuEntity;
import com.service.HuowurukuService;
import com.entity.vo.HuowurukuVO;
import com.entity.view.HuowurukuView;

@Service("huowurukuService")
public class HuowurukuServiceImpl extends ServiceImpl<HuowurukuDao, HuowurukuEntity> implements HuowurukuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuowurukuEntity> page = this.selectPage(
                new Query<HuowurukuEntity>(params).getPage(),
                new EntityWrapper<HuowurukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuowurukuEntity> wrapper) {
		  Page<HuowurukuView> page =new Query<HuowurukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuowurukuVO> selectListVO(Wrapper<HuowurukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuowurukuVO selectVO(Wrapper<HuowurukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuowurukuView> selectListView(Wrapper<HuowurukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuowurukuView selectView(Wrapper<HuowurukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<HuowurukuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<HuowurukuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<HuowurukuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
