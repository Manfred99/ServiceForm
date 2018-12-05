package com.serviceform.serviceform.serviceform;

public enum Credentials_DBAAndroid {

    //SERVER_DBA("estudiantesrp","estudiantesrp","IF4100_B63817_2018","163.178.173.148");
    SERVER_DBAAndroid("SA","sql_devdata4001","DevAndroidServerControllingDataBase","192.168.1.22");

    private final String user;
    private final String password;
    private final String database;
    private final String server;

    Credentials_DBAAndroid(String user, String password, String database, String server) {
        this.user = user;
        this.password = password;
        this.database = database;
        this.server = server;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getDatabase() {
        return database;
    }

    public String getServer() {
        return server;
    }
}
