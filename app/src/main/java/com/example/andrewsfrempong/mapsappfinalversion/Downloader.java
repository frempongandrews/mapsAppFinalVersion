package com.example.andrewsfrempong.mapsappfinalversion;


import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.example.andrewsfrempong.mapsappfinalversion.models.FoodLocation;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


//class Downloader extends AsyncTask<RequestPackage, String, String> {
//
//    ArrayList<FoodLocation> resultFoodLocations = new ArrayList<FoodLocation>();
//
//    ArrayList<FoodLocation> foodLocations = new ArrayList<FoodLocation>();
//
//        @Override
//        protected String doInBackground(RequestPackage... params) {
//
//            //Log.d(HttpManager.getData(params[0]);
//
//            return HttpManager.getData(params[0]);
//        }
//
//        //The String that is returned in the doInBackground() method is sent to the
//        // onPostExecute() method below. The String should contain JSON data.
//        @Override
//        protected void onPostExecute(String result) {
//            try {
//                //We need to convert the string in result to a JSONObject
//
//
//
//                JSONArray jsonArray = new JSONArray(result);
//
////                String price = jsonObject.getString("ask");
//
//                String name = null;
//                String address1 = null;
//                String address2 = null;
//                String address3 = null;
//                String postcode = null;
//                String fullAddress = null;
//                String rating = null;
//                String ratingDate = null;
//                Double latitude = null;
//                Double longitude = null;
//                String distanceInKm = null;
//
//                for (int i = 0; i < jsonArray.length(); i++) {
//                    JSONObject jsonobject = jsonArray.getJSONObject(i);
//                    name = jsonobject.getString("BusinessName");
//                    address1 = jsonobject.getString("AddressLine1");
//                    address2 = jsonobject.getString("AddressLine2");
//                    address3 = jsonobject.getString("AddressLine3");
//                    postcode = jsonobject.getString("PostCode");
//                    fullAddress = address1 + " " + address2 + ", " + address3 + ", " + postcode;
//                    rating = jsonobject.getString("RatingValue");
//                    ratingDate = jsonobject.getString("RatingDate");
//                    latitude = Double.parseDouble(jsonobject.getString("Latitude"));
//                    longitude = Double.parseDouble(jsonobject.getString("Longitude"));
//                    distanceInKm = jsonobject.getString("DistanceKM");
//
//
//                    //create places with data
//                    //TODO
//                    FoodLocation newFoodLocation = new FoodLocation(name, fullAddress, rating, ratingDate, latitude, longitude, distanceInKm);
//                    foodLocations.add(newFoodLocation);
//
//                    Log.d("TAG", "$$$$$$$$$$$$$$$$$$$ newFoodLocation: " + newFoodLocation);
//                }
//
//                Log.d("TAG", "$$$$$$$$$$$$$$$$$$$ FoodLocations: " + foodLocations);
//
//
//
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//
//
//
//}



