package defpackage;

import java.util.Calendar;

/* renamed from: ljo reason: default package */
public final class ljo implements vua<Calendar> {
    private final wlc<gbd> a;

    private ljo(wlc<gbd> wlc) {
        this.a = wlc;
    }

    public static ljo a(wlc<gbd> wlc) {
        return new ljo(wlc);
    }

    public final /* synthetic */ Object get() {
        gbd gbd = (gbd) this.a.get();
        return (Calendar) vuf.a(gbd.a().f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
