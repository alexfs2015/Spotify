package defpackage;

import android.os.Bundle;

/* renamed from: lxe reason: default package */
public final class lxe implements wig<String> {
    private final wzi<Bundle> a;

    public static String a(Bundle bundle) {
        return (String) wil.a(bundle.getString("key_ac_search_uri"), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
