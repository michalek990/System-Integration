package com;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try {
            //Test działania lokalnego REST API
            String temp_url = "http://localhost/IS_LAB6_REST/cities/read/10";
            URL url = new URL(temp_url);
            System.out.println("Wysyłanie zapytania...");
            InputStream is = url.openStream();
            System.out.println("Pobieranie odpowiedzi...");
            String source = new BufferedReader(new InputStreamReader(is)).lines().collect(Collectors.joining("\n"));
            System.out.println("Przetwarzanie danych...");
            JSONObject json = new JSONObject(source);
            JSONArray recieveddata = (JSONArray) json.get("cities");
            System.out.println("City name: " +
                    recieveddata.getJSONObject(0).get("Name") + "District: " +
                        recieveddata.getJSONObject(0).get("District") + "Population: " +
                        recieveddata.getJSONObject(0).get("Population"));

            recieveddata.forEach(json2 -> {
                System.out.println("City name: " +
                        recieveddata.getJSONObject(0).get("Name") + "District: ");/*+
                        recieveddata.getJSONObject(0).get("District") + "Population: " +
                        recieveddata.getJSONObject(0).get("Population"));*/
            });

        } catch (Exception e) {
            System.err.println("Wystąpił nieoczekiwany błąd!!! ");
                e.printStackTrace(System.err);
        }
    }
}

