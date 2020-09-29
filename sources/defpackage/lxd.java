package defpackage;

import android.os.Bundle;

/* renamed from: lxd reason: default package */
public final class lxd implements wig<String> {
    private final wzi<Bundle> a;

    public static String a(Bundle bundle) {
        return (String) wil.a(bundle.getString("key_ac_search_title"), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
