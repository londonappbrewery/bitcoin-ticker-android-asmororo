package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {

    private double mPrice;

    public static BitcoinDataModel fromJson(JSONObject jsonObject){
        try{
            BitcoinDataModel bitcoinData = new BitcoinDataModel();
            bitcoinData.mPrice = jsonObject.getDouble("ask");

            return bitcoinData;

        }catch (JSONException e){
            e.printStackTrace();
            return null;
        }
    }

    public double getPrice() {
        return mPrice;
    }
}
