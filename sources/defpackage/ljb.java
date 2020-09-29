package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.mobile.android.orbit.OrbitFactory;
import java.util.Random;

/* renamed from: ljb reason: default package */
public final class ljb implements vua<Optional<OrbitServiceInterface>> {
    private final wlc<OrbitFactory> a;
    private final wlc<Context> b;
    private final wlc<jro> c;
    private final wlc<Random> d;
    private final wlc<jsz> e;

    private ljb(wlc<OrbitFactory> wlc, wlc<Context> wlc2, wlc<jro> wlc3, wlc<Random> wlc4, wlc<jsz> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static ljb a(wlc<OrbitFactory> wlc, wlc<Context> wlc2, wlc<jro> wlc3, wlc<Random> wlc4, wlc<jsz> wlc5) {
        ljb ljb = new ljb(wlc, wlc2, wlc3, wlc4, wlc5);
        return ljb;
    }

    public final /* synthetic */ Object get() {
        return (Optional) vuf.a(CC.a((OrbitFactory) this.a.get(), (Context) this.b.get(), (jro) this.c.get(), (Random) this.d.get(), (jsz) this.e.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
