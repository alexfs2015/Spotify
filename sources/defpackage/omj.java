package defpackage;

import android.content.Context;

/* renamed from: omj reason: default package */
public final class omj implements vua<omi> {
    private final wlc<Context> a;

    private omj(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static omj a(wlc<Context> wlc) {
        return new omj(wlc);
    }

    public final /* synthetic */ Object get() {
        return new omi((Context) this.a.get());
    }
}
