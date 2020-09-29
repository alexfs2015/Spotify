package defpackage;

import android.os.Bundle;

/* renamed from: nfy reason: default package */
public final class nfy implements vua<String> {
    private final wlc<Bundle> a;

    private nfy(wlc<Bundle> wlc) {
        this.a = wlc;
    }

    public static nfy a(wlc<Bundle> wlc) {
        return new nfy(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((Bundle) this.a.get()).getString("redirect_uri", ""), "Cannot return null from a non-@Nullable @Provides method");
    }
}
