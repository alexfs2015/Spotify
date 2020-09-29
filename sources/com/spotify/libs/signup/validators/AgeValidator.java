package com.spotify.libs.signup.validators;

import com.spotify.music.R;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class AgeValidator {
    private final Calendar a;
    private final Calendar b = new GregorianCalendar(this.a.get(1) - 112, this.a.get(2), this.a.get(5));
    private final Calendar c;

    public enum AgeVerification {
        OK(false, 0),
        BAD_AGE(true, R.string.choose_username_bad_age),
        TOO_YOUNG(true, R.string.choose_username_too_young),
        NOT_SET(true, R.string.signup_v1_no_birth_date_error);
        
        private final boolean mErrorState;
        private final int mMessageResource;

        private AgeVerification(boolean z, int i) {
            this.mErrorState = z;
            this.mMessageResource = i;
        }
    }

    public AgeValidator(Calendar calendar) {
        this.a = calendar;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.a.get(1) - 13, this.a.get(2), this.a.get(5), 23, 59, 59);
        this.c = gregorianCalendar;
        this.c.set(14, 999);
    }

    public final AgeVerification a(Calendar calendar) {
        return calendar == null ? AgeVerification.NOT_SET : calendar.before(this.b) ? AgeVerification.BAD_AGE : calendar.after(this.c) ? AgeVerification.TOO_YOUNG : AgeVerification.OK;
    }

    public final void a(int i) {
        this.c.set(this.a.get(1) - i, this.a.get(2), this.a.get(5), 23, 59, 59);
        this.c.set(14, 999);
    }
}
