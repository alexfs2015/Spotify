package defpackage;

import android.os.Bundle;

/* renamed from: oxp reason: default package */
public final class oxp implements vua<String> {
    private final wlc<Bundle> a;

    private oxp(wlc<Bundle> wlc) {
        this.a = wlc;
    }

    public static oxp a(wlc<Bundle> wlc) {
        return new oxp(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((Bundle) this.a.get()).getString("uri", ""), "Cannot return null from a non-@Nullable @Provides method");
    }
}
