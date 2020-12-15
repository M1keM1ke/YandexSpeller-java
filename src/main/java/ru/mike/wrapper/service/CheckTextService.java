package ru.mike.wrapper.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.mike.wrapper.dto.CheckTextResult;

import java.util.List;

public interface CheckTextService {

    /**
     * Documentation for the method is taken from the official website and translated into English,
     * see https://yandex.ru/dev/speller/doc/dg/reference/checkText.html/ for more info about this method.
     *
     * @param text Text to check.
     * Limitations:
     * For POST requests, the maximum size of the transmitted text is 10000 characters.
     * GET requests do not limit the size of the transmitted text, but the size of the entire query string,
     * which may contain other parameters in addition to the text. The maximum size of a query string is 10Kb
     * (2KB in Internet Explorer 6 and 7).
     *
     * @param lang Verification languages (separated by commas).
     * Possible value:
     * ru-Russian;
     * uk-Ukrainian;
     * en — English.
     * Default: "ru, en".
     *
     * @param options Yandex Speller. The value is the sum of the required options, see
     * https://yandex.ru/dev/speller/doc/dg/reference/speller-options.html
     * For example, options=6 is the sum of the IGNORE_DIGITS and IGNORE_URLS options. By default, options=0.
     *
     * @param format Format of the text to be checked.
     * Possible value:
     * plain - text without markup (default value);
     * html — HTML text.
     *
     * @param callback Name of the callback function (only for the JSONP interface).
     * For example: "myCallback".
     *
     * @return list of CheckTextResult objects
     */
    @GET("checkText")
    Call<List<CheckTextResult>> checkText(@Query("text") String text, @Query("lang") String lang, @Query("options") int options, @Query("format") String format, @Query("callback") String callback);
}
