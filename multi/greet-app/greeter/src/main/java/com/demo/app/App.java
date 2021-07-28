package com.demo.app;
import com.demo.service.MessageService;

public class App 
{
    public static void main( String[] args )
    {
		MessageService ms= new MessageService();
        System.out.println( ms.getMessage() );
    }
}
