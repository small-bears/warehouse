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


import com.dao.CangkuxinxiDao;
import com.entity.CangkuxinxiEntity;
import com.service.CangkuxinxiService;
import com.entity.vo.CangkuxinxiVO;
import com.entity.view.CangkuxinxiView;

@Service("cangkuxinxiService")
public class CangkuxinxiServiceImpl extends ServiceImpl<CangkuxinxiDao, CangkuxinxiEntity> implements CangkuxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CangkuxinxiEntity> page = this.selectPage(
                new Query<CangkuxinxiEntity>(params).getPage(),
                new EntityWrapper<CangkuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CangkuxinxiEntity> wrapper) {
		  Page<CangkuxinxiView> page =new Query<CangkuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CangkuxinxiVO> selectListVO(Wrapper<CangkuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CangkuxinxiVO selectVO(Wrapper<CangkuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CangkuxinxiView> selectListView(Wrapper<CangkuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CangkuxinxiView selectView(Wrapper<CangkuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
