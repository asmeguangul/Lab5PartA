package domain;

import javax.persistence.Entity;

@Entity
public class CD extends Product{

   private String artist;

   public CD(String artist) {
      this.artist = artist;
   }

   public CD(){}

   public CD(String name, String description, double price, String artist) {
      super(name, description, price);
      this.artist = artist;
   }
}
