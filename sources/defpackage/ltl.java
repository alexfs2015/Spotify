package defpackage;

import android.os.Bundle;

/* renamed from: ltl reason: default package */
public final class ltl implements vua<ltk> {
    private final wlc<Bundle> a;

    private ltl(wlc<Bundle> wlc) {
        this.a = wlc;
    }

    public static ltl a(wlc<Bundle> wlc) {
        return new ltl(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ltk((Bundle) this.a.get());
    }
}
