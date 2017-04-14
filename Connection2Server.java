package com.example.root.gpsservice;

import android.util.Log;

import io.socket.client.IO;
import io.socket.client.Socket;

/**
 * Created by root on 4/12/17.
 */

public class Connection2Server extends MainActivity {

        Socket socket;
    public Socket getSocket(){
        if (socket == null) {
            try{
                socket = IO.socket("http://192.168.10.106:8000");
            }catch(Exception e){
                Log.d("Connection", e.toString());
            }

        }

        return socket;
    }


}
