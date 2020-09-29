package defpackage;

import android.os.Bundle;

/* renamed from: hyl reason: default package */
public final class hyl implements vua<hxz> {
    private final wlc<Bundle> a;

    public static hxz a(Bundle bundle) {
        return (hxz) vuf.a(CC.a(bundle), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
