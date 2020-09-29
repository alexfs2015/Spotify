package defpackage;

import android.content.Context;

/* renamed from: ine reason: default package */
public final class ine implements wig<ind> {
    private final wzi<Context> a;
    private final wzi<ino> b;
    private final wzi<ini> c;

    private ine(wzi<Context> wzi, wzi<ino> wzi2, wzi<ini> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ine a(wzi<Context> wzi, wzi<ino> wzi2, wzi<ini> wzi3) {
        return new ine(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ind((Context) this.a.get(), (ino) this.b.get(), (ini) this.c.get());
    }
}
