package defpackage;

import com.spotify.libs.signup.validators.AgeValidator;
import java.util.Calendar;

/* renamed from: gol reason: default package */
public final class gol implements wig<AgeValidator> {
    private final wzi<Calendar> a;

    private gol(wzi<Calendar> wzi) {
        this.a = wzi;
    }

    public static gol a(wzi<Calendar> wzi) {
        return new gol(wzi);
    }

    public final /* synthetic */ Object get() {
        return new AgeValidator((Calendar) this.a.get());
    }
}
