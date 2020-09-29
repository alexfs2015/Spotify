package defpackage;

import com.spotify.rcs.model.proto.Platform;

/* renamed from: lbv reason: default package */
public final class lbv implements vua<rof> {
    private final wlc<jro> a;
    private final wlc<jrs> b;

    private lbv(wlc<jro> wlc, wlc<jrs> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lbv a(wlc<jro> wlc, wlc<jrs> wlc2) {
        return new lbv(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        jro jro = (jro) this.a.get();
        return (rof) vuf.a(new a().a(jro.c()).b(jro.a()).c(((jrs) this.b.get()).b()).a(Platform.ANDROID).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
