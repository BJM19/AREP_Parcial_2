package edu.eci.arep.parcial.controller;


import edu.eci.arep.parcial.api.ApiCalculadora;
import edu.eci.arep.parcial.api.impl.ApiImplCalculadora;
import com.google.gson.Gson;

import static spark.Spark.*;

public class Controller {

    public static void main(String[] args) {
        port(getPort());

        get("/sin",(req,res)-> {
        	ApiCalculadora calculApi = new ApiImplCalculadora();
            Double result =calculApi.sin(Double.parseDouble(req.queryParams("value")));
            String json = "{\"operation\":\"sin\",\"input\":"+req.queryParams("value")+",\"output\":"+result+"}";
           return new Gson().toJson(json);
        });

        get("/log",(req,res)-> {
        	ApiCalculadora calculApi = new ApiImplCalculadora();
            Double result =calculApi.log(Double.parseDouble(req.queryParams("value")));
            String json = "{\"operation\":\"log\",\"input\":"+req.queryParams("value")+",\"output\":"+result+"}";
            return new Gson().toJson(json);
        });
    }

    private static int getPort() {
        if(System.getenv("PORT")!= null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 8080;
    }

}