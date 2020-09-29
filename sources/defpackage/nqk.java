package defpackage;

import android.os.Bundle;

/* renamed from: nqk reason: default package */
public final class nqk implements wig<String> {
    private final wzi<Bundle> a;

    private nqk(wzi<Bundle> wzi) {
        this.a = wzi;
    }

    public static String a(Bundle bundle) {
        return (String) wil.a(bundle.getString("key_home_mix_uri"), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static nqk a(wzi<Bundle> wzi) {
        return new nqk(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
