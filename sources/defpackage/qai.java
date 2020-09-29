package defpackage;

import android.os.Bundle;

/* renamed from: qai reason: default package */
public final class qai implements wig<qag> {
    private final wzi<Bundle> a;

    private qai(wzi<Bundle> wzi) {
        this.a = wzi;
    }

    public static qai a(wzi<Bundle> wzi) {
        return new qai(wzi);
    }

    public final /* synthetic */ Object get() {
        return (qag) wil.a((qag) ((Bundle) this.a.get()).getParcelable("EXTRA_TRIGGER"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
