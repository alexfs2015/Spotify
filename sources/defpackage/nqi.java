package defpackage;

import android.os.Bundle;

/* renamed from: nqi reason: default package */
public final class nqi implements wig<ozl> {
    private final wzi<Bundle> a;

    private nqi(wzi<Bundle> wzi) {
        this.a = wzi;
    }

    public static nqi a(wzi<Bundle> wzi) {
        return new nqi(wzi);
    }

    public static ozl a(Bundle bundle) {
        return (ozl) wil.a(CC.a(bundle), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
