package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.CangkuxinxiEntity;
import com.entity.view.CangkuxinxiView;

import com.service.CangkuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 仓库信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-18 14:44:57
 */
@RestController
@RequestMapping("/cangkuxinxi")
public class CangkuxinxiController {
    @Autowired
    private CangkuxinxiService cangkuxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CangkuxinxiEntity cangkuxinxi, 
		HttpServletRequest request){

        EntityWrapper<CangkuxinxiEntity> ew = new EntityWrapper<CangkuxinxiEntity>();
    	PageUtils page = cangkuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cangkuxinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CangkuxinxiEntity cangkuxinxi, 
		HttpServletRequest request){
        EntityWrapper<CangkuxinxiEntity> ew = new EntityWrapper<CangkuxinxiEntity>();
    	PageUtils page = cangkuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cangkuxinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CangkuxinxiEntity cangkuxinxi){
       	EntityWrapper<CangkuxinxiEntity> ew = new EntityWrapper<CangkuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( cangkuxinxi, "cangkuxinxi")); 
        return R.ok().put("data", cangkuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CangkuxinxiEntity cangkuxinxi){
        EntityWrapper< CangkuxinxiEntity> ew = new EntityWrapper< CangkuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( cangkuxinxi, "cangkuxinxi")); 
		CangkuxinxiView cangkuxinxiView =  cangkuxinxiService.selectView(ew);
		return R.ok("查询仓库信息成功").put("data", cangkuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CangkuxinxiEntity cangkuxinxi = cangkuxinxiService.selectById(id);
        return R.ok().put("data", cangkuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CangkuxinxiEntity cangkuxinxi = cangkuxinxiService.selectById(id);
        return R.ok().put("data", cangkuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CangkuxinxiEntity cangkuxinxi, HttpServletRequest request){
    	cangkuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(cangkuxinxi);

        cangkuxinxiService.insert(cangkuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CangkuxinxiEntity cangkuxinxi, HttpServletRequest request){
    	cangkuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(cangkuxinxi);

        cangkuxinxiService.insert(cangkuxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody CangkuxinxiEntity cangkuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(cangkuxinxi);
        cangkuxinxiService.updateById(cangkuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        cangkuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<CangkuxinxiEntity> wrapper = new EntityWrapper<CangkuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = cangkuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
