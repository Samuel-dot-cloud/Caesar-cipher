package models;

public class Class {
private String Statement;
private int Key;

public Class (String Statement, int Key){
    this.Statement = Statement.toUpperCase();
    this.Key = Key;
 }
    public String getStatement() {
        return this.Statement;
    }

    public int getKey() {
        return this.Key;
    }
}