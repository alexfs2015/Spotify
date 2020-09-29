package defpackage;

import android.os.Bundle;

/* renamed from: qgp reason: default package */
public final class qgp implements wig<a> {
    private final wzi<Bundle> a;

    private qgp(wzi<Bundle> wzi) {
        this.a = wzi;
    }

    public static a a(Bundle bundle) {
        return (a) wil.a(CC.b(bundle), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static qgp a(wzi<Bundle> wzi) {
        return new qgp(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
