package com.spotify.libs.signup.validators;

import com.spotify.music.R;

public final class PasswordValidator {
    private final gon a;

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

    public PasswordValidator(gon gon) {
        this.a = gon;
    }

    public final PasswordValidation a(String str) {
        if (str.isEmpty()) {
            return PasswordValidation.NOT_SET;
        }
        if (str.length() < 8) {
            return PasswordValidation.TOO_SHORT;
        }
        gon gon = this.a;
        return gon != null && gon.a(str) ? PasswordValidation.TOO_WEAK : PasswordValidation.VALID;
    }
}
