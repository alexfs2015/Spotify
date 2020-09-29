package defpackage;

import android.os.Bundle;

/* renamed from: iag reason: default package */
public final class iag implements vua<ibc> {
    private final wlc<Bundle> a;

    public static ibc a(Bundle bundle) {
        return (ibc) vuf.a(CC.a(bundle), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
