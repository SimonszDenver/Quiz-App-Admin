package com.ceyentra.adminquiz.socket;

import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

public class SocketConnection {

    /*
     * This is a singleton class to make the socket connection.
     */

    private static SocketConnection socketConnection;
    //    private final String SERVER_IP = "http://192.168.8.106:3000/";
//    private final String SERVER_IP = "http://192.168.1.2:3000/";
//    private final String SERVER_IP = "http://192.168.8.101:3000/";
//    private final String SERVER_IP = "http://192.168.8.108:9029/";
//    private final String SERVER_IP = "http://192.168.1.2:9029/";
    private final String SERVER_IP = "http://sv2.ideamarthosting.dialog.lk:9029";
    private Socket socket;

    private SocketConnection() {
        try {
            socket = IO.socket(SERVER_IP);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static SocketConnection getInstance() {
        if (socketConnection == null) {
            socketConnection = new SocketConnection();
        }
        return socketConnection;
    }

    public Socket getSocket() {
        return socket;
    }
}
