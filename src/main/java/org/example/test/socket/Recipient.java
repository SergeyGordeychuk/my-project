package org.example.test.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Recipient {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(1050);
            while (true) {
                DatagramPacket packet = new DatagramPacket(new byte[11], 11);
                socket.receive(packet);
                System.out.println(new String(packet.getData()));
            }
        } catch (SocketException e) {
            throw new RuntimeException("Can't receive " + e);
        } catch (IOException e) {
            throw new RuntimeException("Can't receive packet "+e);
        }
    }
}
