package com.example.designmode.decorator.decorators;

public interface DataSource {

    void writeData(String data);

    String readData();
}
