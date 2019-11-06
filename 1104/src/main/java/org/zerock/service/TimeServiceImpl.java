package org.zerock.service;

import org.kakarrot.mapper.TimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;

@Service
public class TimeServiceImpl implements TimeService{
	
	@Setter(onMethod_= @Autowired)
	private TimeMapper timeMapper;
	
	@Override
	public String now() {
		// TODO Auto-generated method stub
		return timeMapper.getTime2();
	}

}
