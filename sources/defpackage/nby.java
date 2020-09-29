package defpackage;

import android.os.Bundle;

/* renamed from: nby reason: default package */
public final class nby implements wig<String> {
    private final wzi<nbh> a;

    private nby(wzi<nbh> wzi) {
        this.a = wzi;
    }

    public static nby a(wzi<nbh> wzi) {
        return new nby(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((Bundle) fbp.a(((nbh) this.a.get()).i)).getString("artist_view_uri"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
