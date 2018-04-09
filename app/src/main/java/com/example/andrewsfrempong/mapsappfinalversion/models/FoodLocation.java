package com.example.andrewsfrempong.mapsappfinalversion.models;

import android.net.Uri;

import com.google.android.gms.maps.model.LatLng;


public class FoodLocation {



        private String name;
        private String address;
        private String rating;
        private String ratingDate;
        private Double latitude;
        private Double longitude;
        private String distanceInKm;


        public FoodLocation(String name, String address, String rating, String ratingDate, Double latitude, Double longitude, String distanceInKm) {
            this.name = name;
            this.address = address;
            if (rating.equals("-1")) {
                rating = "Exempt";
            }
            this.rating = rating;
            this.ratingDate = ratingDate;
            this.latitude = latitude;
            this.longitude = longitude;
            this.distanceInKm = distanceInKm;



        }

        public FoodLocation() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }



        public String getRatingDate() {
            return ratingDate;
        }

        public void setRatingDate(String ratingDate) {
            this.ratingDate = ratingDate;
        }

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

        public String getDistanceInKm() {
            return distanceInKm;
        }

        public void setDistanceInKm(String distanceInKm) {
            this.distanceInKm = distanceInKm;
        }



        @Override
        public String toString() {
            return "foodLocation{" +
                    "name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", rating='" + rating + '\'' +
                    '}';
        }

}
