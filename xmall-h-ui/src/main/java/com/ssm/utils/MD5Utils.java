package com.ssm.utils;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 *  MD5加密工具类
 */
public class MD5Utils {

	public static String md5(String saltSource, String password) {
		String hashAlgorithmName = "MD5";
		int hashIterations = 2;
		ByteSource credentialsSalt = ByteSource.Util.bytes(saltSource);
		Object result = new SimpleHash(hashAlgorithmName, password, credentialsSalt, hashIterations);
		return result.toString();

	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String pwd = MD5Utils.md5("salt", "123");
		System.out.println(pwd);
	}

}
