package defpackage;

import android.os.Bundle;

/* renamed from: nlo reason: default package */
public final class nlo implements wig<String> {
    private final wzi<Bundle> a;

    private nlo(wzi<Bundle> wzi) {
        this.a = wzi;
    }

    public static String a(Bundle bundle) {
        return (String) wil.a(CC.a(bundle), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static nlo a(wzi<Bundle> wzi) {
        return new nlo(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
