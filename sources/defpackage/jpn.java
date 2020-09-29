package defpackage;

import android.app.Activity;
import com.spotify.cosmos.android.RxResolver;

/* renamed from: jpn reason: default package */
public final class jpn implements wig<jpm> {
    private final wzi<jon> a;
    private final wzi<Activity> b;
    private final wzi<jvf> c;
    private final wzi<kaj> d;
    private final wzi<kal> e;
    private final wzi<RxResolver> f;
    private final wzi<gcb> g;

    private jpn(wzi<jon> wzi, wzi<Activity> wzi2, wzi<jvf> wzi3, wzi<kaj> wzi4, wzi<kal> wzi5, wzi<RxResolver> wzi6, wzi<gcb> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static jpn a(wzi<jon> wzi, wzi<Activity> wzi2, wzi<jvf> wzi3, wzi<kaj> wzi4, wzi<kal> wzi5, wzi<RxResolver> wzi6, wzi<gcb> wzi7) {
        jpn jpn = new jpn(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return jpn;
    }

    public final /* synthetic */ Object get() {
        jpm jpm = new jpm((jon) this.a.get(), (Activity) this.b.get(), (jvf) this.c.get(), (kaj) this.d.get(), (kal) this.e.get(), (RxResolver) this.f.get(), (gcb) this.g.get());
        return jpm;
    }
}
