//my singleton pattern made in 114 for a movie app, modified (very roughly made to fit this class)
//importing/removing all required/unrequired packages as per my IDE
package Singleton.Java;

import java.net.Authenticator.RequestorType;

import javax.naming.Context;

public class Singleton {

    //setting up the variables, IDE made me make changes
    private  RequestorType requestQueue;
    private static Singleton instance;


    //the constructor.
    private void Singleton( Context context) {
        requestQueue = Volley.newRequestQueue(context.getApplicationContext());
    }

    //if instance is found to be NULL, create new instance. otherwise return the instance, insures only one instance is made.
    public static synchronized Singleton getInstance(Context context) {
        if (instance == null) {
            instance = new Singleton(context);
        }
        return instance;
    }

    //checks the queue
    public RequestorType getRequestQueue() {
        return requestQueue;
    }
}

//THE ORIGINAL FROM 114 THAT I MADE

// package com.example.popularmovies;

// import android.content.Context;

// import com.android.volley.RequestQueue;
// import com.android.volley.toolbox.Volley;

// public class VolleySingleton {

//     private  RequestQueue requestQueue;
//     private static VolleySingleton instance;

//     private VolleySingleton( Context context) {
//         requestQueue = Volley.newRequestQueue(context.getApplicationContext());
//     }

//     public static synchronized VolleySingleton getInstance(Context context) {
//         if (instance == null) {
//             instance = new VolleySingleton(context);
//         }
//         return instance;
//     }

//     public RequestQueue getRequestQueue() {
//         return requestQueue;
//     }
// }
