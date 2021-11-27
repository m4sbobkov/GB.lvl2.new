package lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
        static boolean serverStop = false;

        synchronized void isStopping() {
            serverStop = true;
    }


        public static void main(String[] args) {
            Socket socket = null;

            try (ServerSocket serverSocket = new ServerSocket(8189)) {
                System.out.println("Сервер запущен, ожидаем подключения...");
                socket = serverSocket.accept();
                System.out.println("Клиент подключился");
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                Thread outMessageThread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        Scanner serverMess = new Scanner(System.in);
                        while (!serverMess.equals("/exit")) {
                            try {

                                out.writeUTF(serverMess.nextLine());

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                });
                outMessageThread.start();



                while (true) {
                    String str = in.readUTF();
                    System.out.println(str);

                    if (str.equals("/end")) {
                        serverStop = true;

                        break;
                    }
                }
                if (serverStop == true) {
                    System.exit(1);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }




        }
    }

