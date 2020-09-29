package defpackage;

import android.content.Context;

/* renamed from: ukp reason: default package */
public final class ukp implements vua<ukk> {
    private final wlc<Context> a;
    private final wlc<tch> b;

    private ukp(wlc<Context> wlc, wlc<tch> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ukp a(wlc<Context> wlc, wlc<tch> wlc2) {
        return new ukp(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (ukk) vuf.a(new ukl(((Context) this.a.get()).getResources(), (tch) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
