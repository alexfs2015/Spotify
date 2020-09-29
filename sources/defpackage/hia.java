package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: hia reason: default package */
public final class hia implements wig<hid> {
    private final wzi<Cosmonaut> a;
    private final wzi<hib> b;

    private hia(wzi<Cosmonaut> wzi, wzi<hib> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hia a(wzi<Cosmonaut> wzi, wzi<hib> wzi2) {
        return new hia(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (hid) wil.a(new hid((Cosmonaut) this.a.get(), (hib) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
