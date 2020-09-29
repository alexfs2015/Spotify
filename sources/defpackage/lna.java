package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.mobile.android.orbit.OrbitFactory;
import java.util.Random;

/* renamed from: lna reason: default package */
public final class lna implements wig<Optional<OrbitServiceInterface>> {
    private final wzi<OrbitFactory> a;
    private final wzi<Context> b;
    private final wzi<jty> c;
    private final wzi<Random> d;
    private final wzi<jvf> e;

    private lna(wzi<OrbitFactory> wzi, wzi<Context> wzi2, wzi<jty> wzi3, wzi<Random> wzi4, wzi<jvf> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static lna a(wzi<OrbitFactory> wzi, wzi<Context> wzi2, wzi<jty> wzi3, wzi<Random> wzi4, wzi<jvf> wzi5) {
        lna lna = new lna(wzi, wzi2, wzi3, wzi4, wzi5);
        return lna;
    }

    public final /* synthetic */ Object get() {
        return (Optional) wil.a(CC.a((OrbitFactory) this.a.get(), (Context) this.b.get(), (jty) this.c.get(), (Random) this.d.get(), (jvf) this.e.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
