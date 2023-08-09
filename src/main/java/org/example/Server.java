package org.example;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(12398);
        byte[] bytes = new byte[1024];

        DatagramPacket receivePacket = new DatagramPacket(bytes, bytes.length);
        datagramSocket.receive(receivePacket);
        String receive = new String(receivePacket.getData(),0,receivePacket.getLength());
        System.out.println(receive);

        DatagramPacket sendPacket =


    }
}
