package com.manisha;

import com.manisha.security.PasswordService;

public class Demo {

	public static void main(String[] args) {
		String encodedTxt = PasswordService.encode("india@123");
		System.out.println(encodedTxt);
		//co
		String decodedTxt = PasswordService.decode(encodedTxt);
		System.out.println(decodedTxt);
	}

}
