package com.dao;

import com.entity.ZixunshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZixunshiView;

/**
 * 咨询师 Dao 接口
 *
 * @author 
 */
public interface ZixunshiDao extends BaseMapper<ZixunshiEntity> {

   List<ZixunshiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
