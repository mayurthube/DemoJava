package com.designpatterns.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotificationService {

	public static void main(String[] args) throws IOException {

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Notification which you want: SMS or EMAIL or PUSH ");  
        String notifyType=br.readLine();  
        System.out.print("\n");  
		NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification(notifyType.toUpperCase());
        notification.notifyUser();
	}

}
