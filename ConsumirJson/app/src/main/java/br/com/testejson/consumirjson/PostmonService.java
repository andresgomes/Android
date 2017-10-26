package br.com.testejson.consumirjson;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by andre on 11/10/2017.
 */

public interface PostmonService {
    @GET("{cep}")
    Call<Endereço> getEndereco(@Path("cep") String cep);
}
