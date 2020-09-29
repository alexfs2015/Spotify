package defpackage;

import android.app.Application;
import android.content.Context;

/* renamed from: kzw reason: default package */
public final class kzw implements vua<mc> {
    private final wlc<Application> a;

    private kzw(wlc<Application> wlc) {
        this.a = wlc;
    }

    public static kzw a(wlc<Application> wlc) {
        return new kzw(wlc);
    }

    public final /* synthetic */ Object get() {
        return (mc) vuf.a(mc.a((Context) (Application) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
