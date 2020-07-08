package com.example.dependency.dependencyday.model;


import com.example.dependency.dependencyday.service.MyColor;
import com.example.dependency.dependencyday.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("greenColor")
public class GreenColor implements MyColor {

    Printer printer;

    @Autowired
    public GreenColor(Printer printer){
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is Green Fox in color...");
    }
}
