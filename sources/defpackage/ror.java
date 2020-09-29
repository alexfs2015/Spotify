package defpackage;

import android.content.Context;

/* renamed from: ror reason: default package */
public final class ror implements vua<roq> {
    private final wlc<Context> a;

    private ror(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static ror a(wlc<Context> wlc) {
        return new ror(wlc);
    }

    public final /* synthetic */ Object get() {
        return new roq((Context) this.a.get());
    }
}
