package defpackage;

import android.app.Service;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;

/* renamed from: hkn reason: default package */
public final class hkn implements wig<hkm> {
    private final wzi<Service> a;
    private final wzi<vwy> b;
    private final wzi<hww> c;
    private final wzi<PlayerFactory> d;

    private hkn(wzi<Service> wzi, wzi<vwy> wzi2, wzi<hww> wzi3, wzi<PlayerFactory> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static hkn a(wzi<Service> wzi, wzi<vwy> wzi2, wzi<hww> wzi3, wzi<PlayerFactory> wzi4) {
        return new hkn(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new hkm((Service) this.a.get(), (vwy) this.b.get(), (hww) this.c.get(), (PlayerFactory) this.d.get());
    }
}
