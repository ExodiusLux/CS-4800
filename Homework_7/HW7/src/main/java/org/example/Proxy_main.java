package org.example;

public class Proxy_main {
    public static void main(String[] args){
       SongService service = new ProxySongService();

       service.searchById(1);
       service.searchById(2);
       service.searchById(3);
       service.searchById(4);
       service.searchById(5);
       service.searchById(6);
       service.searchById(7);
       service.searchById(8);
       service.searchById(9);
       service.searchById(10);

       System.out.println(service.searchByAlbum("The First Album"));
       System.out.println(service.searchByAlbum("Reflections"));
       System.out.println(service.searchByAlbum("One off from Lucky"));
       System.out.println(service.searchByAlbum("Take it all"));
       System.out.println(service.searchByAlbum("infinity"));
       System.out.println(service.searchByAlbum("Highest Single"));
       System.out.println(service.searchByAlbum("5 time 2"));

       System.out.println(service.searchByTitle("The First Song"));
       System.out.println(service.searchByTitle("2nd times the try"));
       System.out.println(service.searchByTitle("3 is the best number"));
       System.out.println(service.searchByTitle("3rd times the charm"));
       System.out.println(service.searchByTitle("33 is two Threes"));
       System.out.println(service.searchByTitle("66"));
       System.out.println(service.searchByTitle("777"));
       System.out.println(service.searchByTitle("Snowman"));
       System.out.println(service.searchByTitle("Almost Double Digits"));
       System.out.println(service.searchByTitle("10 to the power of 1"));


    }
}
