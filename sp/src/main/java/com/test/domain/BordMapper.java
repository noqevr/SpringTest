package com.test.domain;

import java.sql.Date;
import java.util.List;

import com.test.domain.BordVO;

public interface BordMapper {

	 int insert(BordVO bordVO);
	 int getTotalCount();
	 int nextBordNUM();
	 void updateReadcount(int num);
	 BordVO getBord(int num);
	 List<BordVO> getBords();
	 int deleteBord(int num);
	 int deleteAll();
	

}
