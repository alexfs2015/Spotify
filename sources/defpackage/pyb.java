package defpackage;

import android.os.Bundle;

/* renamed from: pyb reason: default package */
public final class pyb implements vua<shj> {
    private final wlc<Bundle> a;

    private pyb(wlc<Bundle> wlc) {
        this.a = wlc;
    }

    public static pyb a(wlc<Bundle> wlc) {
        return new pyb(wlc);
    }

    public final /* synthetic */ Object get() {
        return (shj) ((Bundle) this.a.get()).getParcelable("EXTRA_TRANSITION_PARAMS");
    }
}
