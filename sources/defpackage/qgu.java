package defpackage;

import android.os.Bundle;

/* renamed from: qgu reason: default package */
public final class qgu implements wig<b> {
    private final wzi<Bundle> a;

    private qgu(wzi<Bundle> wzi) {
        this.a = wzi;
    }

    public static b a(Bundle bundle) {
        return (b) wil.a(CC.a(bundle), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static qgu a(wzi<Bundle> wzi) {
        return new qgu(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((Bundle) this.a.get());
    }
}
