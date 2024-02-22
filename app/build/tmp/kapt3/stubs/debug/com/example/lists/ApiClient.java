package com.example.lists;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/lists/ApiClient;", "", "()V", "client", "Lretrofit2/Retrofit;", "getClient", "()Lretrofit2/Retrofit;", "httpClient", "Lokhttp3/OkHttpClient$Builder;", "Companion", "app_debug"})
public final class ApiClient {
    @org.jetbrains.annotations.NotNull
    private final okhttp3.OkHttpClient.Builder httpClient = null;
    @org.jetbrains.annotations.NotNull
    private final retrofit2.Retrofit client = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String BASE_URL = "https://akabab.github.io";
    @org.jetbrains.annotations.NotNull
    public static final com.example.lists.ApiClient.Companion Companion = null;
    
    @javax.inject.Inject
    public ApiClient() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit getClient() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/lists/ApiClient$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}