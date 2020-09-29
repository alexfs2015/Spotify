package defpackage;

import android.content.Context;

/* renamed from: jru reason: default package */
public final class jru implements wig<jrt> {
    private final wzi<Context> a;
    private final wzi<jyg> b;

    private jru(wzi<Context> wzi, wzi<jyg> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static jru a(wzi<Context> wzi, wzi<jyg> wzi2) {
        return new jru(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new jrt((Context) this.a.get(), (jyg) this.b.get());
    }
}
