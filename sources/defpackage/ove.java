package defpackage;

import android.content.Context;

/* renamed from: ove reason: default package */
public final class ove implements vua<ovd> {
    private final wlc<Context> a;

    private ove(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static ove a(wlc<Context> wlc) {
        return new ove(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ovd((Context) this.a.get());
    }
}
