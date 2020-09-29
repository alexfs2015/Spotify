package defpackage;

import android.content.Context;

/* renamed from: kxl reason: default package */
public final class kxl implements vua<kxi> {
    private final wlc<Context> a;
    private final wlc<sih> b;
    private final wlc<fpt> c;

    private kxl(wlc<Context> wlc, wlc<sih> wlc2, wlc<fpt> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static kxl a(wlc<Context> wlc, wlc<sih> wlc2, wlc<fpt> wlc3) {
        return new kxl(wlc, wlc2, wlc3);
    }

    public static kxi a(Context context, sih sih, fpt fpt) {
        return (kxi) vuf.a(CC.a(context, sih, fpt), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get(), (sih) this.b.get(), (fpt) this.c.get());
    }
}
