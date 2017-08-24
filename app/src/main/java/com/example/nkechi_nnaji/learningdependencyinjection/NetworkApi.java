package com.example.nkechi_nnaji.learningdependencyinjection;

/**
 * Created by nkechi_nnaji on 8/24/17.
 */

import javax.inject.Inject;

/**
 * Dagger has to know about this class. So an @Inject annotation
 * should be added to the constructor of the class.
 *
 * This means that an object of this class can be
 * injected into other objects.
 *
 * In your entry point (MainActivity) adjust the activity to be
 * able to recieve an instance of NetworkApi.
 */
public class NetworkApi {

    @Inject
    public NetworkApi() {
    }

    public boolean validateUser(String username, String password) {
        if (username == null || username.length() <= 7)
            {
            return false;
            }
        else
            {
            return true;
            }
    }
}
