package defpackage;

import android.os.Bundle;

/* renamed from: qgz reason: default package */
public final class qgz implements wig<srq> {
    private final wzi<Bundle> a;

    private qgz(wzi<Bundle> wzi) {
        this.a = wzi;
    }

    public static qgz a(wzi<Bundle> wzi) {
        return new qgz(wzi);
    }

    public final /* synthetic */ Object get() {
        return (srq) ((Bundle) this.a.get()).getParcelable("EXTRA_TRANSITION_PARAMS");
    }
}
