package cn.pomit.lt.zingfront.three.dao;

import org.apache.ibatis.annotations.Mapper;

import cn.pomit.jpamapper.core.mapper.CrudMapper;
import cn.pomit.lt.zingfront.three.domain.TTravelInfo;

@Mapper
public interface TTravelInfoDao extends CrudMapper<TTravelInfo, Integer> {
	
}
