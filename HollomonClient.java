import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.*;

public class HollomonClient {
    String username;
    String password;
    int port;
    String check;
    List<Card> listOfCards;
    String server;
    Socket socket;
    
    OutputStream outputStream; 
    DataOutputStream dataOutputStream;

    BufferedReader bufferedReader;
    BufferedWriter bufferedWriter;

    public HollomonClient (String server, int port){
        this.server = server;
        this.port = port;
    }
    public List<Card> login (String username, String password){
        /* outputStream = socket.getOutputStream();
        dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(username);
        dataOutputStream.writeUTF(password);
        dataOutputStream.flush();
        dataOutputStream.close();

        InputStream inputStream = new InputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        check = dataInputStream.readUTF();
        while */
        try{
            socket = new Socket(server, port);
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            
            bufferedWriter.write(username);
            bufferedWriter.newLine();
            bufferedWriter.write(password);
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.flush();

            String temp;
            if ((temp = bufferedReader.readLine()) != null){
                return listOfCards;
            }
            else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listOfCards;
    }

    // public void close(){
    //     try {
    //         bufferedReader.close();
    //         bufferedWriter.close();
    //         socket.close();
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
            
    // }
}