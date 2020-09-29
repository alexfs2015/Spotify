package defpackage;

import android.os.Bundle;

/* renamed from: lte reason: default package */
public final class lte implements vua<String> {
    private final wlc<Bundle> a;

    public static String a(Bundle bundle) {
        return (String) vuf.a(bundle.getString("key_ac_search_title"), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
