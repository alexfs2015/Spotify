package defpackage;

import android.app.Application;
import java.util.Random;

/* renamed from: rwj reason: default package */
public final class rwj implements vua<glm> {
    private final wlc<glo> a;
    private final wlc<jjf> b;
    private final wlc<Random> c;
    private final wlc<Application> d;

    private rwj(wlc<glo> wlc, wlc<jjf> wlc2, wlc<Random> wlc3, wlc<Application> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static rwj a(wlc<glo> wlc, wlc<jjf> wlc2, wlc<Random> wlc3, wlc<Application> wlc4) {
        return new rwj(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (glm) vuf.a(new glm((glo) this.a.get(), new rwd((jjf) this.b.get()), (Random) this.c.get(), ((Application) this.d.get()).getApplicationContext()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
