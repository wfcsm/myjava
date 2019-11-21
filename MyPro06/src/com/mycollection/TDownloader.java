package com.mycollection;

public class TDownloader extends Thread {
    private  String url;
    private String name;

    @Override
    public void run() {
        WebDownloader wb = new WebDownloader();
        wb.downloader(url,name);
        System.out.println(name);
    }

    public TDownloader(String url, String name) {
        this.url = url;
        this.name = name;

    }

    public static void main(String[] args) {
        TDownloader td1 = new TDownloader("https://www.agri35.com/UploadFiles/img_1_851737981_3302155990_26.jpg","a.jpg");
        TDownloader td2 = new TDownloader("https://www.agri35.com/UploadFiles/img_1_2174611471_3877977112_26.jpg","b.jpg");
        TDownloader td3 = new TDownloader("https://www.agri35.com/UploadFiles/img_2_2404527917_1613736453_26.jpg","c.jpg");

//        td1.start();
//        td2.start();
//        td3.start();
        td1.run();
        td2.run();
        td3.run();
    }
}
