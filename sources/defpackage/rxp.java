package defpackage;

import android.content.Context;
import java.util.Calendar;

/* renamed from: rxp reason: default package */
public final class rxp implements vua<rxo> {
    private final wlc<Context> a;
    private final wlc<Calendar> b;

    private rxp(wlc<Context> wlc, wlc<Calendar> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rxp a(wlc<Context> wlc, wlc<Calendar> wlc2) {
        return new rxp(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rxo((Context) this.a.get(), (Calendar) this.b.get(), (Calendar) this.b.get());
    }
}
