package com.group.cms.business.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;

public class PasswordUtil {
	
	public static Map<String, String> encrypt(String password) {
		
		RandomNumberGenerator rng = new SecureRandomNumberGenerator();
		String salt = rng.nextBytes().toHex();
		password = new Md5Hash(password, salt, 1024).toHex();
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("password", password);
		map.put("salt", String.valueOf(salt));
		
		return map;
	}

}
