package br.com.testejson.consumirjson;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by andre on 10/10/2017.
 */

public interface DadoAPI {
    @Headers("Content-Type: application/json")
    @POST("/login.php")
    Call<Dados> getDados(@Body String login);
}
