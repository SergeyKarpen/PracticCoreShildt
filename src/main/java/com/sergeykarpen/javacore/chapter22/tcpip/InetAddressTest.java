package main.java.com.sergeykarpen.javacore.chapter22.tcpip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress InetAddressTest = InetAddress.getLocalHost();
        System.out.println(InetAddressTest);

        InetAddressTest = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(InetAddressTest);

        InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
        for (int i = 0; i<SW.length; i++)
            System.out.println(SW[i]);

    }
}
