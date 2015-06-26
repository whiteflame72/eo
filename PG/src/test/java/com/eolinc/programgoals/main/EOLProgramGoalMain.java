package com.eolinc.programgoals.main;

import java.util.Date;

import com.eolinc.dao.BaseDao;
import com.eolinc.dto.Profile;

public class EOLProgramGoalMain {
		public static void main(String[] args) throws Exception {
		BaseDao dao = new BaseDao();
		Profile item = new Profile();
		item.setAccountId(1L);
		item.setProfileType('S');
		item.setProfileFname("Fname");
		item.setProfileMname("M");
		item.setProfileLname("Lname");
		item.setProfileSuffx("Mr.");
		item.setProfileAddr1("Addr1");
		item.setProfileAddr2("Addr2");
		item.setProfileAddr3("Addr3");
		item.setProfileCity("City");
		item.setProfileState("State");
		item.setProfileZip("Zip");
		item.setProfileCntry("Cntry");
		item.setProfileAttn("Attn");
		item.setProfileBdayDt(new Date());
		item.setProfileEmail("Email");
		item.setProfileTextMsg(1L);
		item.setAddedDt(new Date());
		item.setAddedBy("addedBy");
		item.setUpdtDt(new Date());
		item.setUpdtBy("updtBy");

		dao.save(item);
	}
}
