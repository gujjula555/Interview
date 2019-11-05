package com.example.interview.ui.home;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.interview.model.FbModel;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }

    public String loadJSONFromAsset(Context context) {
        String json = null;
        try {
            InputStream is = context.getAssets().open("fbdata.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
    public LiveData<List<FbModel>> getAllData(Context context, Gson gson){
        MutableLiveData<List<FbModel>> fbModelMutableLiveData =new MutableLiveData<>();

        try {
            JSONObject obj = new JSONObject(loadJSONFromAsset(context));
            JSONArray m_jArry = obj.getJSONArray("data");
            fbModelMutableLiveData.setValue(Arrays.asList(gson.fromJson(m_jArry.toString(), FbModel[].class)));

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return fbModelMutableLiveData;
    }

}