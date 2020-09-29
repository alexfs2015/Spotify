package defpackage;

import android.content.Context;

/* renamed from: tun reason: default package */
public final class tun implements wig<jvv> {
    private final wzi<Context> a;

    private tun(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static tun a(wzi<Context> wzi) {
        return new tun(wzi);
    }

    public final /* synthetic */ Object get() {
        return (jvv) wil.a(new jvv((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
