package org.kiot.network;

import java.util.Scanner;
import org.kiot.network.Network;

/**
 *	NetworkSupport class performs network operations
 *	@version 04/03/2022
 *  @author praveen kandhan
 */
public class NetworkSupport {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Network network = new Network();
		String ipAddress = scanner.next();
		if(network.isValidIPaddress(ipAddress)) {
			System.out.println("Valid ipaddress");
		} else {
			System.out.println("inValid ipaddress");
		}
	}
}

