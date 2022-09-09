package com.peaksoft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {

    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson gson = BUILDER.setPrettyPrinting().create();

    public static final Path WRITE_PATH = Paths.get("./cars.json");


    public static void main(String[] args) {
//        Car[] car = {
//                Car.makeCar("M1", 9000, Model.BMW),
//                Car.makeCar("RS8", 6000, Model.AUDI),
//                Car.makeCar("Accord", 5000, Model.HONDA),
//                Car.makeCar("Abie", 8000, Model.TESLA)
//        };
//        String allCars = gson.toJson(car);
//        //  System .out.println(allCars);
//   //     writeFile(allCars);
//        System.out.println(readFile());
//    }
//
//    private static void writeFile(String object) {
//        Path write = Paths.get(String.valueOf(WRITE_PATH));
//
//        try {
//            Files.writeString(write, object, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
//        } catch (Exception e) {
//            e.getMessage();
//        }
//    }
//
//    private static String readFile() {
//        String json = "";
//        try {
//            FileReader reader = new FileReader(String.valueOf(WRITE_PATH));
//            int a;
//            while ((a = reader.read())   != -1) {
//                json += (char)a;
//            }
//        } catch (Exception e) {
//            e.getMessage();
//        }
//        return json;
        Autobaza autobaza = new Autobaza(1,"Moscow");
        System.out.println(autobaza);
    }


}