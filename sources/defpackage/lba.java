package defpackage;

import android.content.Context;

/* renamed from: lba reason: default package */
public final class lba implements wig<laz> {
    private final wzi<Context> a;
    private final wzi<sso> b;
    private final wzi<fqn> c;

    private lba(wzi<Context> wzi, wzi<sso> wzi2, wzi<fqn> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static lba a(wzi<Context> wzi, wzi<sso> wzi2, wzi<fqn> wzi3) {
        return new lba(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new laz((Context) this.a.get(), (sso) this.b.get(), (fqn) this.c.get());
    }
}
