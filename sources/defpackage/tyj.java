package defpackage;

import android.os.Bundle;

/* renamed from: tyj reason: default package */
public final class tyj implements vua<tzd> {
    private final wlc<Bundle> a;

    public static tzd a(Bundle bundle) {
        return (tzd) vuf.a(CC.a(bundle), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
