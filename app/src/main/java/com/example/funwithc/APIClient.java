package com.example.funwithc;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class APIClient {

    private static final String BASE_URL = "https://api.jdoodle.com/v1/";

    static final String API_ID = "7dacb8e4bfd8db382549353ff2cf204b";
    static final String API_SECRET = "3357cd40e41099256e5c742e78a3fcd0a8939624c1cd222fa0ca7e26398573f7";
    static final String LANGUAGE = "c";

    private static APIClient mInstance;
    private Retrofit retrofit;

    private APIClient(OkHttpClient.Builder builder) {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build();
    }

    static synchronized APIClient getInstance() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(interceptor);

        if (mInstance == null) {
            mInstance = new APIClient(builder);
        }
        return mInstance;
    }

    APIService getAPI() {
        return retrofit.create(APIService.class);
    }
}
