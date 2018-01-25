package com.javarush.task.task30.task3008.client;

/**
 * Created by TRACTEL_RND on 25.01.2018.
 */
public class ClientGuiController extends Client {

    public static void main(String[] args) {
        ClientGuiController controller=new ClientGuiController();
        controller.run();
    }

    private ClientGuiModel model = new ClientGuiModel();
    private ClientGuiView view = new ClientGuiView(this);


    protected SocketThread getSocketThread() {

        return new GuiSocketThread();
    }
    public void run() {
        SocketThread socketThread=getSocketThread();
        socketThread.run();
    }
    public String getServerAddress(){
        return view.getServerAddress();
    }
    public int getServerPort(){
        return view.getServerPort();
    }
    public String getUserName() {
        return view.getUserName();
    }

    public ClientGuiModel getModel() {
        return model;
    }

    public class GuiSocketThread extends SocketThread {

        public void processIncomingMessage(String message) {
            model.setNewMessage(message);
            view.refreshMessages();
            super.processIncomingMessage(message);
        }
        public void informAboutAddingNewUser(String userName) {
            model.addUser(userName);
            view.refreshUsers();
            super.informAboutAddingNewUser(userName);
        }

        public void informAboutDeletingNewUser(String userName) {
            model.deleteUser(userName);
            view.refreshUsers();
            super.informAboutDeletingNewUser(userName);
        }

        public void notifyConnectionStatusChanged(boolean clientConnected){
            view.notifyConnectionStatusChanged(clientConnected);
            super.notifyConnectionStatusChanged(clientConnected);
        }
    }
}
