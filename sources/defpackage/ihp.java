package defpackage;

import android.os.Bundle;

/* renamed from: ihp reason: default package */
public final class ihp implements vua<String> {
    private final wlc<Bundle> a;

    public static String a(Bundle bundle) {
        return (String) vuf.a(CC.a(bundle), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
