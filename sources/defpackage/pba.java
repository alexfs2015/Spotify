package defpackage;

import android.os.Bundle;

/* renamed from: pba reason: default package */
public final class pba implements vua<String> {
    private final wlc<Bundle> a;

    private pba(wlc<Bundle> wlc) {
        this.a = wlc;
    }

    public static pba a(wlc<Bundle> wlc) {
        return new pba(wlc);
    }

    public static String a(Bundle bundle) {
        return (String) vuf.a(CC.a(bundle), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
