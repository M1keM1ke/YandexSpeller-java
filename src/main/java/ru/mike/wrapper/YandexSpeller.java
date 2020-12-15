package ru.mike.wrapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.mike.wrapper.service.CheckTextService;
import ru.mike.wrapper.service.CheckTextsService;

public class YandexSpeller {

    private Retrofit retrofit;

    private Retrofit retrofitBuilder() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://speller.yandex.net/services/spellservice.json/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    private Retrofit getRetrofit() {
        if (this.retrofit == null) {
            this.retrofit = this.retrofitBuilder();
        }
        return retrofit;
    }

    public CheckTextService checkTextService() {
        return this.getRetrofit().create(CheckTextService.class);
    }

    public CheckTextsService checkTextsService() {
        return this.getRetrofit().create(CheckTextsService.class);
    }
}
