package defpackage;

import com.spotify.libs.signup.validators.AgeValidator;
import java.util.Calendar;

/* renamed from: gmw reason: default package */
public final class gmw implements vua<AgeValidator> {
    private final wlc<Calendar> a;

    private gmw(wlc<Calendar> wlc) {
        this.a = wlc;
    }

    public static gmw a(wlc<Calendar> wlc) {
        return new gmw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new AgeValidator((Calendar) this.a.get());
    }
}
