package com.webshop.basicwebshop.controller;

import com.webshop.basicwebshop.model.ShopItem;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class WebShopController {
    List<ShopItem> foods = new ArrayList<>(Arrays.asList(
            new ShopItem("HP 63XL, Ink Cartridge, Black", "Original HP ink cartridges: genuine ink for your HP printer", 41, 22),
            new ShopItem("Roku Express HD Streaming Media Player","WORKS WITH ALEXA", 29, 112),
            new ShopItem("WD 2TB Elements Portable External Hard Drive", "USB 3.0 and USB 2.0 Compatibility", 65, 49),
            new ShopItem("Samsung SSD 860 EVO 1TB 2.5 Inch SATA III", "Innovative V-Nand Technology", 139, 1225),
            new ShopItem("Acer Nitro 5 Gaming Laptop", "9th Generation Intel Core i5-9300H Processor", 599, 19),
            new ShopItem("Columbia Women's Newton Ridge Plus Waterproof Hiking Boot", "Made in USA or Imported", 66, 28),
            new ShopItem("Hiking & Walking Socks 3-Pack for Men", "MERINO WOOL FOR COMFORTABLE & DRY FEET", 28, 224),
            new ShopItem("Salomon X Ultra 3 GORE-TEX Men's Hiking Shoes", "100% Synthetic", 109, 88),
            new ShopItem("Nike Women's Revolution 5 Running Shoe", "Shaft measures approximately low-top from arch", 35, 67),
            new ShopItem("Nike Men's Lunar Fingertrap Cross Trainer", "Dynamic fit technology provides a glove-like feel", 58, 451),
            new ShopItem("Fitbit Charge 3 Fitness Activity Tracker", "Better measure calorie burn, understand resting heart rate", 99, 22),
            new ShopItem(),
            new ShopItem(),
            new ShopItem(),
            new ShopItem("STQ Women's Running Shoes Breathable Air Cushion Sneakers", "Air Cushioning-and-rubber sole", 38, 15),
            new ShopItem(),
            new ShopItem(),
            new ShopItem(),
            new ShopItem(),
            new ShopItem(),
            new ShopItem(),
            new ShopItem(),
            new ShopItem(),
            new ShopItem()


    ));
}
