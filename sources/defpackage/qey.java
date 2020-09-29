package defpackage;

import android.os.Bundle;

/* renamed from: qey reason: default package */
public final class qey implements vua<qex> {
    private final wlc<Bundle> a;

    private qey(wlc<Bundle> wlc) {
        this.a = wlc;
    }

    public static qey a(wlc<Bundle> wlc) {
        return new qey(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qex((Bundle) this.a.get());
    }
}
