package com.webshop.basicwebshop.controller;

import com.webshop.basicwebshop.model.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class WebShopController {
    List<ShopItem> shopItems = new ArrayList<>(Arrays.asList(
            new ShopItem("HP 63XL, Ink Cartridge, Black", "Original HP ink cartridges: genuine ink for your HP printer", 41, 22),
            new ShopItem("Roku Express HD Streaming Media Player", "WORKS WITH ALEXA", 29, 112),
            new ShopItem("WD 2TB Elements Portable External Hard Drive", "USB 3.0 and USB 2.0 Compatibility", 65, 49),
            new ShopItem("Samsung SSD 860 EVO 1TB 2.5 Inch SATA III", "Innovative V-Nand Technology", 139, 1225),
            new ShopItem("Acer Nitro 5 Gaming Laptop", "9th Generation Intel Core i5-9300H Processor", 599, 19),
            new ShopItem("Columbia Women's Newton Ridge Plus Waterproof Hiking Boot", "Made in USA or Imported", 66, 28),
            new ShopItem("Hiking & Walking Socks 3-Pack for Men", "MERINO WOOL FOR COMFORTABLE & DRY FEET", 28, 224),
            new ShopItem("Salomon X Ultra 3 GORE-TEX Men's Hiking Shoes", "100% Synthetic", 109, 0),
            new ShopItem("Nike Women's Revolution 5 Running Shoe", "Shaft measures approximately low-top from arch", 35, 67),
            new ShopItem("Nike Men's Lunar Fingertrap Cross Trainer", "Dynamic fit technology provides a glove-like feel", 58, 451),
            new ShopItem("Fitbit Charge 3 Fitness Activity Tracker", "Better measure calorie burn, understand resting heart rate", 99, 22),
            new ShopItem("Under Armour Adult Resistor 3.0 No Show Socks, 6-Pairs", "Dynamic arch support helps reduce foot fatigue", 18, 26),
            new ShopItem("Perfect Fitness Perfect Pushup Elite", "Ergonomic grips help distribute weight evenly", 28, 46),
            new ShopItem("Coca-Cola Coca Cola CCR01 Vintage Style Am/FM Radio", "This vintage style radio from Coca-Cola helps create an ambiance reminiscent of the by-gone era", 17, 23),
            new ShopItem("STQ Women's Running Shoes Breathable Air Cushion Sneakers", "Air Cushioning-and-rubber sole", 38, 15),
            new ShopItem("Coca-Cola Men's Coke Classic Vintage Logo T-shirt", "Official licensed coke classic Coca-Cola logo t-shirt by mad engine", 10, 1364),
            new ShopItem("Anker Wireless Charger", "Complete Charging Convenience", 9, 198),
            new ShopItem("Robot Vacuum, GOOVI 1600PA Robotic Vacuum Cleaner with Self-Charging", "1600Pa of intense suction picks up dust, crumbs, and dirts", 152, 27),
            new ShopItem("PureMobility Glucosamine for Dogs - Premium Dog Joint Supplement Support with Glucosamine", "PREMIUM NATURAL INGREDIENTS - NO GMOs, CORN, SOY or PRESERVATIVES", 33, 12),
            new ShopItem("GearLight LED Tactical Flashlight S1000 [2 PACK]", "ULTRA BRIGHT & LONG-LASTING", 15, 48),
            new ShopItem("Dr. Squatch Pine Tar Soap", "Mens Soap with Natural Woodsy Scent and Skin Scrub Exfoliation", 8, 1165),
            new ShopItem("Lavender Goat Milk Soap Bars", "GREAT FOR ALL SKIN TYPES", 21, 4563),
            new ShopItem("Logitech BRIO Ultra HD Webcam for Video Conferencing", "Spectacular video quality", 289, 0),
            new ShopItem("Tower Fan, Taotronics 36” Oscillating Tower Fan with Remote", "Quiet Cooling", 67, 36)

    ));

    @GetMapping("/webshop")
    public String index(Model model) {                  //a Model model-t itt hívom meg
        ShopItem shopItem = new ShopItem("NUBWO Gaming headsets", "lmmersive Gaming Audio", 24, 68);
        model.addAttribute("shopItem", shopItem);       //a html egy modelt vár, itt adom meg neki, az elsővel!
        model.addAttribute("shopItems", shopItems);
        return "index";
    }

    @GetMapping("/only-available")
    public String onlyAvailable(Model model) {
        List<ShopItem> onlyAvailableItems = shopItems.stream()
                .filter(x -> x.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
        model.addAttribute("shopItems", onlyAvailableItems);
        return "index";
    }

    @GetMapping("/cheapest-first")
    public String cheapestFirst(Model model) {
        List<ShopItem> cheapestFirstItems = shopItems.stream()
                .sorted(Comparator.comparingDouble(ShopItem::getPrice))
                .collect(Collectors.toList());
        model.addAttribute("shopItems", cheapestFirstItems);
        return "index";
    }

    @GetMapping("/contains-nike")
    public String containsNike(Model model) {
        List<ShopItem> containsNike = shopItems.stream()
                .filter(x -> x.getName().toLowerCase().contains("nike") || x.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
        model.addAttribute("shopItems", containsNike);
        return "index";
    }

    @GetMapping("/average-stock")
    public String avgStock(Model model) {
        int sum = shopItems.stream()
                .mapToInt(ShopItem::getQuantityOfStock).sum();
        double avg = (double) sum / shopItems.size();
        model.addAttribute("text", "Average stock: " + avg);
        return "index2";
    }

    @GetMapping("/most-expensive")
    public String mostExpensive(Model model) {
        double max = shopItems.stream()
                .filter(c -> c.getQuantityOfStock() > 0)
                .mapToDouble(ShopItem::getPrice)
                .max().getAsDouble();
        List<ShopItem> mostExp = shopItems.stream().filter(c -> c.getPrice() == max).collect(Collectors.toList());
        model.addAttribute("text", "The most expensive item: " + mostExp.get(0).getName());
        return "index2";
    }
}


