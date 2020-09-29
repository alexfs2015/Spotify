package com.spotify.libs.signup.validators;

import com.spotify.music.R;
import java.util.regex.Pattern;

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
        Pattern pattern = hp.c;
        if (str.isEmpty()) {
            return EmailValidation.NOT_SET;
        }
        if (pattern.matcher(str).matches()) {
            return EmailValidation.VALID;
        }
        return EmailValidation.INVALID;
    }
}
