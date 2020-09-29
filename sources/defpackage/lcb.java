package defpackage;

import android.app.Application;
import java.util.Random;

/* renamed from: lcb reason: default package */
public final class lcb implements wig<lca> {
    private final wzi<Application> a;
    private final wzi<hit> b;
    private final wzi<Random> c;

    public static lca a(Application application, hit hit, Random random) {
        return new lca(application, hit, random);
    }

    public final /* synthetic */ Object get() {
        return new lca((Application) this.a.get(), (hit) this.b.get(), (Random) this.c.get());
    }
}
