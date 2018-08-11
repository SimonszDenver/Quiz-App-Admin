package com.ceyentra.adminquiz.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ceyentra.adminquiz.R;
import com.ceyentra.adminquiz.socket.SocketConnection;
import com.github.nkzawa.socketio.client.Socket;

public class ControlActivity extends AppCompatActivity {

    private Socket socket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        this.socket = SocketConnection.getInstance().getSocket();
        this.socket.connect();
    }

    public void onClickStart(View view){
        this.socket.emit("Start");
    }

    public void onClickReset(View view){
        this.socket.emit("Reset");
    }
}
