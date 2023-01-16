package com.test.service;

import org.springframework.stereotype.Service;

import com.test.domain.BordMapper;
import com.test.domain.BordVO;
@Service
//@Transctional
public class BoardService {
		
	
	
	//@SetteronMethod_ = @Autowired)
	private BordMapper boardMapper;
	
	public int register(BordVO bordVO) {
		return boardMapper.insert(bordVO);
	}
	
	
	
	
}
