package defpackage;

import android.os.Bundle;

/* renamed from: pij reason: default package */
public final class pij implements wig<String> {
    private final wzi<Bundle> a;

    private pij(wzi<Bundle> wzi) {
        this.a = wzi;
    }

    public static String a(Bundle bundle) {
        return (String) wil.a(CC.a(bundle), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static pij a(wzi<Bundle> wzi) {
        return new pij(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
