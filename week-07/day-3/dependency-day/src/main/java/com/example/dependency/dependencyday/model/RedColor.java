package com.example.dependency.dependencyday.model;

import com.example.dependency.dependencyday.service.MyColor;
import com.example.dependency.dependencyday.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
@Primary
public class RedColor implements MyColor {

    Printer printer;

    @Autowired
    public RedColor(Printer printer){
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is red in color...");
    }
}
