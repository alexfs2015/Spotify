package defpackage;

import android.content.Context;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: htv reason: default package */
public final class htv implements wig<htu> {
    private final wzi<hxx> a;
    private final wzi<Context> b;
    private final wzi<hgy> c;
    private final wzi<RxResolver> d;
    private final wzi<Scheduler> e;
    private final wzi<jty> f;

    private htv(wzi<hxx> wzi, wzi<Context> wzi2, wzi<hgy> wzi3, wzi<RxResolver> wzi4, wzi<Scheduler> wzi5, wzi<jty> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static htv a(wzi<hxx> wzi, wzi<Context> wzi2, wzi<hgy> wzi3, wzi<RxResolver> wzi4, wzi<Scheduler> wzi5, wzi<jty> wzi6) {
        htv htv = new htv(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return htv;
    }

    public final /* synthetic */ Object get() {
        htu htu = new htu((hxx) this.a.get(), (Context) this.b.get(), (hgy) this.c.get(), (RxResolver) this.d.get(), (Scheduler) this.e.get(), (jty) this.f.get());
        return htu;
    }
}
