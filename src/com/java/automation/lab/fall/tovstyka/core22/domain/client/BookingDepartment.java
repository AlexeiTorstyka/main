package com.java.automation.lab.fall.tovstyka.core22.domain.client;

public class BookingDepartment {
    private String name;

    private long[] clientListId;
    Client client;
    private void addClientId(int i) {
        clientListId[i] =client.getId();
    }


    BookingDepartment(String name, long[] clientListId, Client someClient) {
        this.name = name;
        this.clientListId=clientListId;
        this.client = someClient;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
    public long[] getClientListId(){
        return clientListId;
    }
    public void setClientListId(long[] clientListId){
        this.clientListId = clientListId;
    }
}