package main.java.com.sergeykarpen.javacore.patterns.creational.singleton;

public class Database {
    private static Database database;
    private static String informationFromBD = "Information from the database."+"\n";

    public static synchronized Database getInfoFromBD() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    public Database() {
    }

    public void addInfoInBD(String newInfo) {
        informationFromBD += newInfo + "\n";
    }

    public void showInfoInBD() {
        System.out.println(informationFromBD);
    }
}
