package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: gdk reason: default package */
public final class gdk implements wig<gdg> {
    private final wzi<Cosmonaut> a;
    private final wzi<RxResolver> b;

    private gdk(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static gdk a(wzi<Cosmonaut> wzi, wzi<RxResolver> wzi2) {
        return new gdk(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (gdg) wil.a(CC.a((Cosmonaut) this.a.get(), (RxResolver) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
