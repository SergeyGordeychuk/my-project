package org.example.test.socket;

import java.io.IOException;
import java.net.*;

public class Sender {
    String host;
    int port;

    public Sender(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void send(String message) {
        try {
            byte[] data = message.getBytes();
            InetAddress address = InetAddress.getByName(host);
            DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
            DatagramSocket socket = new DatagramSocket();
            socket.send(packet);
            socket.close();
        } catch (UnknownHostException e) {
            throw new RuntimeException("Can't inetAddress  " + e);
        } catch (SocketException e) {
            throw new RuntimeException("Can't socket  " + e);
        } catch (IOException e) {
            System.err.println("Can't send message " + e);
        }
    }
}
