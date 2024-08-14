package com.juaracoding;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) {
        // Mengatur lokasi WebDriver
        System.setProperty("webdriver.chrome.driver", "C://chromedriver-win64//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Membuka browser dan menavigasi ke URL
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/checkbox");
        System.out.println("Open Browser URL");

        // Mengklik tombol collapse untuk menampilkan checkbox
        driver.findElement(By.cssSelector("#tree-node > ol > li > span > button > svg")).click();

        // Scroll ke bawah jika diperlukan
        js.executeScript("window.scrollBy(0,300)");

        // Mengklik checkbox yang diinginkan
        driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(3) > span > label > span.rct-checkbox > svg")).click();
        System.out.println("Checkbox clicked");

        // Tunggu beberapa detik untuk melihat hasil
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Menutup browser setelah selesai
        driver.quit();
        System.out.println("Exit Browser");
    }
}
