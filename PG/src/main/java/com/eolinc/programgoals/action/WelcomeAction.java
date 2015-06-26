/*
 * COMPANY NAME: Education OnLine
 * COPYRIGHT
 * UNPUBLISHED WORK
 * ALL RIGHTS RESERVED
 * PROJECT NAME: Program Goals
 *
 */

package com.eolinc.programgoals.action;

import java.util.List;

import org.apache.log4j.Logger;

import com.eolinc.action.BaseAction;
import com.eolinc.dao.BaseDao;
import com.eolinc.dto.Profile;
import com.eolinc.exception.EOLException;

@SuppressWarnings("unchecked")
public class WelcomeAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private BaseDao dao = new BaseDao();
	Logger log = Logger.getLogger(getClass().getName());
	private List<Profile> profileList; 
	private Long profileId;
	

	public String execute(){
		if (profileId != null) {
			Profile user;
			try {
				user = (Profile) dao.find(Profile.class, profileId);
				if (user != null) {
					session.put("User", user);
					if (user.getProfileType() == 'P') return "parent_input_form";
					if (user.getProfileType() == 'T') return "teacher_input_form";
				}
			} catch (EOLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return SUCCESS;
	}
	
	public List<Profile> getProfileList() {
		if (profileList == null) {
			try {
				profileList = dao.findAll(Profile.class);
			} catch (EOLException e) {
				handleError(e, null);
			}
		}
		return profileList;
	}
	public Long getProfileId() {
		return profileId;
	}
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}
}



