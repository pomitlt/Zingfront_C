package cn.pomit.lt.zingfront.three.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.pomit.lt.zingfront.three.domain.TTravelInfo;
import cn.pomit.lt.zingfront.three.dto.ResultModel;
import cn.pomit.lt.zingfront.three.service.TTravelInfoService;

@RestController
@RequestMapping("/travel")
public class TravelRest {
	@Autowired
	TTravelInfoService tTravelInfoService;

	@RequestMapping(value = "/add", method = { RequestMethod.POST })
	public ResultModel add(@RequestBody TTravelInfo tTravelInfo) {
		tTravelInfo.setCreateTime(new Date());
		tTravelInfoService.save(tTravelInfo);
		return ResultModel.ok();
	}
	
	@RequestMapping(value = "/delete", method = { RequestMethod.POST })
	public ResultModel delete(@RequestBody TTravelInfo tTravelInfo) {
		tTravelInfoService.delete(tTravelInfo);
		return ResultModel.ok();
	}
	
	@RequestMapping(value = "/update", method = { RequestMethod.POST })
	public ResultModel update(@RequestBody TTravelInfo tTravelInfo) {
		tTravelInfoService.save(tTravelInfo);
		return ResultModel.ok();
	}
	
	@RequestMapping(value = "/getAll", method = { RequestMethod.GET })
	public ResultModel getAll() {
		return ResultModel.ok(tTravelInfoService.findAll());
	}
	
	@RequestMapping(value = "/getOne", method = { RequestMethod.GET })
	public ResultModel getOne(@RequestParam("id") Integer id) {
		return ResultModel.ok(tTravelInfoService.findById(id));
	}
	
}