package com.spotify.libs.signup.validators;

import com.spotify.music.R;

public final class PasswordValidator {
    private final gmy a;

    public enum PasswordValidation {
        VALID(false, 0),
        TOO_SHORT(true, R.string.email_signup_password_too_short_eight_characters),
        TOO_WEAK(true, R.string.email_signup_password_too_weak),
        NOT_SET(true, 0),
        NOT_VALIDATED(true, 0);
        
        private final boolean mErrorState;
        private final int mMessageResource;

        private PasswordValidation(boolean z, int i) {
            this.mErrorState = z;
            this.mMessageResource = i;
        }
    }

    public PasswordValidator(gmy gmy) {
        this.a = gmy;
    }

    public final PasswordValidation a(String str) {
        if (str.isEmpty()) {
            return PasswordValidation.NOT_SET;
        }
        if (str.length() < 8) {
            return PasswordValidation.TOO_SHORT;
        }
        gmy gmy = this.a;
        if (gmy != null && gmy.a(str)) {
            return PasswordValidation.TOO_WEAK;
        }
        return PasswordValidation.VALID;
    }
}
