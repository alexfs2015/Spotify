package defpackage;

import android.content.Context;

/* renamed from: ove reason: default package */
public final class ove implements wig<ovd> {
    private final wzi<Context> a;
    private final wzi<ftm> b;

    private ove(wzi<Context> wzi, wzi<ftm> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ove a(wzi<Context> wzi, wzi<ftm> wzi2) {
        return new ove(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ovd((Context) this.a.get(), (ftm) this.b.get());
    }
}
