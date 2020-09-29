package defpackage;

import android.content.Context;
import com.spotify.android.storage.MovingOrchestrator;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: uyy reason: default package */
public final class uyy implements wig<uyx> {
    private final wzi<Context> a;
    private final wzi<jtz> b;
    private final wzi<b> c;
    private final wzi<SpSharedPreferences<Object>> d;
    private final wzi<gbg> e;
    private final wzi<MovingOrchestrator> f;
    private final wzi<a> g;
    private final wzi<hit> h;

    private uyy(wzi<Context> wzi, wzi<jtz> wzi2, wzi<b> wzi3, wzi<SpSharedPreferences<Object>> wzi4, wzi<gbg> wzi5, wzi<MovingOrchestrator> wzi6, wzi<a> wzi7, wzi<hit> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static uyy a(wzi<Context> wzi, wzi<jtz> wzi2, wzi<b> wzi3, wzi<SpSharedPreferences<Object>> wzi4, wzi<gbg> wzi5, wzi<MovingOrchestrator> wzi6, wzi<a> wzi7, wzi<hit> wzi8) {
        uyy uyy = new uyy(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return uyy;
    }

    public final /* synthetic */ Object get() {
        uyx uyx = new uyx((Context) this.a.get(), (jtz) this.b.get(), (b) this.c.get(), (SpSharedPreferences) this.d.get(), (gbg) this.e.get(), (MovingOrchestrator) this.f.get(), (a) this.g.get(), (hit) this.h.get());
        return uyx;
    }
}
