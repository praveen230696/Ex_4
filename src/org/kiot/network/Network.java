package org.kiot.network;

/**
 *	Network class performs network operations
 *	@version 04/03/2022
 *  @author praveen kandhan
 */
public class Network {
	public boolean isValidIPaddress(String ipAddress ) {
		if(ipAddress.length() == 7 || ipAddress.length() <= 15) {
			if( ((ipAddress.startsWith(".") || ipAddress.endsWith(".")) 
					== false) ){
				int count = 0;
				for(int i = 0; i< ipAddress.length(); i++) {
					if(ipAddress.charAt(i) == '.') {
						count++;
					}
				}
				if(count == 3) {
					int flag = 1;
					char dot = '.';
					for(int i = 0; i< ipAddress.length(); i++) {
						if(ipAddress.charAt(i) == dot) {
							if(ipAddress.charAt(i) == ipAddress.charAt(i+1)) {
								flag = 0;
								break;
						}
					}
					if(flag == 1) {
						int alpha = 0, special = 0, number = 0;
						for(int j = 0; i< ipAddress.length(); i++) {
							if( (ipAddress.charAt(j) >= 65 && ipAddress.charAt
									(j) <= 90) || (ipAddress.charAt(j) >= 90 
									&& ipAddress.charAt(j) <= 122) ){
								alpha = 1;
								break;
							} else if(ipAddress.charAt(j) >= 48 
									&& ipAddress.charAt(j) <= 57) {
								number = 1;
							} else {
								special = 1;
								break;								
							}
						}
						if ( (alpha != 1 || special != 1) && number == 1)
							return true;
					}
						
				}
			}
		}
		
		}
		return false;
	}
}
	
