package com.group.cms.business.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.group.cms.business.entity.UserDetails;
import com.group.cms.core.service.BaseService;
import com.group.cms.core.service.impl.BaseServiceImpl;

@Service
@Transactional
public class UserDetailsService extends BaseServiceImpl<UserDetails, String> implements BaseService {
	
}
