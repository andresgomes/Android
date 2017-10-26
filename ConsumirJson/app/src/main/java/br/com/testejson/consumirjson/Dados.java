package br.com.testejson.consumirjson;

import java.io.Serializable;

/**
 * Created by andre on 10/10/2017.
 */

public class Dados implements Serializable {

    private String login;
    private String name;
    private String email;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "name='" + name + '\'' +
                '}';
    }
}
