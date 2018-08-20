package org.whispersystems.signalservice.api.push.exceptions;

/**
 * Created by jnovkovic on 5/30/18.
 */

public class AuthorizationWhiteListException extends NonSuccessfulResponseCodeException {
    public AuthorizationWhiteListException(String s) {
        super(s);
    }
}
