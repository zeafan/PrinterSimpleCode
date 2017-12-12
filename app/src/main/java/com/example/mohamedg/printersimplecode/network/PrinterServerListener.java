package com.example.mohamedg.printersimplecode.network;
import java.net.Socket;

public interface PrinterServerListener {
    public void onConnect(Socket socket);
}
