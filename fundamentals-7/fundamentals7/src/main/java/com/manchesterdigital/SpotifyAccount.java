package com.manchesterdigital;

import java.util.Objects;

public class SpotifyAccount {
    private final String username;
    private final String password;

    public SpotifyAccount(String username, String password) {

        this.username = username;
        this.password = password;
    }
    // basically sets the username here to the constructor username

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpotifyAccount that = (SpotifyAccount) o;
        return Objects.equals(username, that.username) &&
                Objects.equals(password, that.password);
    }
// checking objects and comparing them. equality checking
    //

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

}

/*
to be able to do above, you need to click yellow light bulb and click bind option
keyword is also FINAL which is at top but this is done automatically
it binds it to the constructor created on the other page
 */