package com.elmunats.crudmaximo.utils.http;

import com.elmunats.crudmaximo.BuildConfig;
import com.elmunats.crudmaximo.base.BaseParam;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import timber.log.Timber;

/**
 * Created by Reja on 23,January,2019
 * Jakarta, Indonesia.
 */
public class RetrofitClient {
    private static Retrofit retrofit;

    /**
     * Create Retrofit instance
     *
     * @param okHttpClient
     * @return
     */
    public static Retrofit getRetrofitInstance(OkHttpClient okHttpClient) {
        Timber.d("getRetrofitInstance() okhttp client: %s", okHttpClient);
        String url = BaseParam.BASE_URL;
        if (BuildConfig.DEBUG) {
            url = BaseParam.DEV_URL;
        }
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(MoshiConverterFactory.create())
                .client(okHttpClient)
                .build();

        return retrofit;
    }

    /**
     * Create Retrofit instance
     *
     * @param okHttpClient
     * @param url
     * @return
     */
    public Retrofit getRetrofitInstance(OkHttpClient okHttpClient, String url) {
        Timber.d("getRetrofitInstance() okhttp client: %s, url: %s", okHttpClient, url);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(MoshiConverterFactory.create())
                .client(okHttpClient)
                .build();
        return retrofit;
    }
}
