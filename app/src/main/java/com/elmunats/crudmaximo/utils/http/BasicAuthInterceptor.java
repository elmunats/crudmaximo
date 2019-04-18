package com.elmunats.crudmaximo.utils.http;

import java.io.IOException;

import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Reja on 24,January,2019
 * Jakarta, Indonesia.
 */
public class BasicAuthInterceptor implements Interceptor {

    private String credentials;

    /**
     * Basic Authentication Interceptor
     *
     * @param user
     * @param password
     */
    public BasicAuthInterceptor(String user, String password) {
        this.credentials = Credentials.basic(user, password);
    }

    /**
     * Intercept Basic Authentication
     *
     * @param chain
     * @return
     * @throws IOException
     */
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request authenticatedRequest = request.newBuilder()
                .header("maxauth", credentials).build();
        return chain.proceed(authenticatedRequest);
    }

}
