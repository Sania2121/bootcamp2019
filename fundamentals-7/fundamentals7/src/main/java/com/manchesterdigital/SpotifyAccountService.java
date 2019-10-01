package com.manchesterdigital;

public class SpotifyAccountService {


    private AuthenticationService authenticationService;

    public SpotifyAccountService(AuthenticationService authenticationService) {

        this.authenticationService = authenticationService;
        // create field is same as bind
    }

    public SpotifyAccount verify(String username, String password) {
        if(!authenticationService.authenticate(username, password)) {
            // when it doesnt authenticate cleanly we will throw an exception
            throw new SpotifyAccountNotValidException();
        }
// sets the default/boiler plate
// need to add authentication bit here


        return new SpotifyAccount(username, password);
        // always write bare minimum to make it pass
   // was returning null which is the default
        // always put what you expect
        // we expect it to return the spotify account (just before method name)
        // minimum line of code that returns the account
        // error on the account so went to spotify method where we did the hash thing


    }
}
