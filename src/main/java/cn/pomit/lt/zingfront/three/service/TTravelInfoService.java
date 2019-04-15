package cn.pomit.lt.zingfront.three.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pomit.lt.zingfront.three.dao.TTravelInfoDao;
import cn.pomit.lt.zingfront.three.domain.TTravelInfo;

@Service
public class TTravelInfoService {
	@Autowired
	TTravelInfoDao tTravelInfoDao;

	public void save(TTravelInfo tTravelInfo) {
		tTravelInfoDao.save(tTravelInfo);
	}

	public void delete(TTravelInfo tTravelInfo) {
		tTravelInfoDao.deleteEntity(tTravelInfo);
	}

	public void update(TTravelInfo tTravelInfo) {
		tTravelInfoDao.save(tTravelInfo);
	}

	public List<TTravelInfo> findAll() {
		return (List<TTravelInfo>) tTravelInfoDao.findAll();
	}

	public TTravelInfo findById(Integer id) {
		return tTravelInfoDao.findOne(id);
	}
}