package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class SpotifyAccountServiceTest {
@Rule
public ExpectedException expectedException = ExpectedException.none();

@Rule
public MockitoRule mockitoRule = MockitoJUnit.rule();


// adds mockito

@Mock // treats it as a mock controlled by given, when, then later on under BDD Mockito
private AuthenticationService authenticationService;

    private SpotifyAccountService subject;

    @Before
    public void setUp() {
        subject = new SpotifyAccountService(authenticationService);
    }
    // cmd and n then setup
    // will create a brand new subject initialised as an account initialised as a mock
    // put things here that need to be created all the time



    @After
    public void tearDown() throws Exception {

    } // cmd + n teardown
    // closes something after things are made. rarely used and opposite of above

    @Test
    public void whenUsernameAndPasswordValidThenAccountReturned() {
        //Arrange
        // happy path as in anything that will work
       // SpotifyAccountService subject= new SpotifyAccountService(authenticationService);
        // no longer need above because of set up
        String username = "john@test.com";
        String password = "123abc";

        SpotifyAccount expectedAccount = new SpotifyAccount(username, password);

        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(), Mockito.anyString()))
                .willReturn(true);

        //Act
        SpotifyAccount result = subject.verify(username, password);
         // allows intelliJ to drive it for you. look at recording
// should only ever be one act

        //Assert
        Assertions.assertThat(result).isEqualTo(expectedAccount);
        /* can also use result.getUserName.isEqualTo(expectedAccount.getUserName)
        this does the same as what we have done with hashes
        you then have to create a function called getUserName or a 'getter'
         */
// failing because we did equals to

    }

    @Test
    public void whenUsernameAndPasswordInvalidThenExsceptionThrown() {
       //ARRANGE
      //  SpotifyAccountService subject= new SpotifyAccountService(authenticationService);
        String username = "john@test.com";
        String password = "123abc";

        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(), Mockito.anyString()))
                .willReturn(false);
        // expects an exception
    // i expect a return of false
        expectedException.expect(SpotifyAccountNotValidException.class);
        //.expect always expects a class so always make a class
        // allows it to trap the exception in essence
        // assertion of exception

        //ACT
        subject.verify(username, password);

        //ASSERT
        // verification using third party authenticity -> mock
        BDDMockito.verify(authenticationService).authenticate(username, password);
        // proving that it has actually been called as well as the fact that it has actually failed
                //don't always have to insert assertions
        //can assert things that will go wrong to prove that what you have put in actually does what it needs to
        // seal of approval to prove that it called the service to throw the exception
        // this line isn't needed

    }
}
/*
examples of these are in the Claimant API download

 */