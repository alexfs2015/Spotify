package defpackage;

import android.app.Application;
import java.util.Random;

/* renamed from: kys reason: default package */
public final class kys implements vua<kyr> {
    private final wlc<Application> a;
    private final wlc<hfx> b;
    private final wlc<Random> c;

    public static kyr a(Application application, hfx hfx, Random random) {
        return new kyr(application, hfx, random);
    }

    public final /* synthetic */ Object get() {
        return new kyr((Application) this.a.get(), (hfx) this.b.get(), (Random) this.c.get());
    }
}
