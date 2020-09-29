package defpackage;

import android.content.Context;

/* renamed from: tvs reason: default package */
public final class tvs<T> implements wig<tvr<T>> {
    private final wzi<Context> a;
    private final wzi<sso> b;

    private tvs(wzi<Context> wzi, wzi<sso> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static <T> tvs<T> a(wzi<Context> wzi, wzi<sso> wzi2) {
        return new tvs<>(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tvr((Context) this.a.get(), (sso) this.b.get());
    }
}
