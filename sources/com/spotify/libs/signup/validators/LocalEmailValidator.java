package com.spotify.libs.signup.validators;

import com.spotify.music.R;

public final class LocalEmailValidator {

    public enum EmailValidation {
        VALID(false, 0),
        INVALID(true, R.string.email_signup_bad_email),
        NOT_SET(true, 0);
        
        private final boolean mErrorState;
        private final int mMessageResource;

        private EmailValidation(boolean z, int i) {
            this.mErrorState = z;
            this.mMessageResource = i;
        }
    }

    public static EmailValidation a(String str) {
        return str.isEmpty() ? EmailValidation.NOT_SET : hp.c.matcher(str).matches() ? EmailValidation.VALID : EmailValidation.INVALID;
    }
}