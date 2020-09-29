package defpackage;

import android.os.Handler;
import io.reactivex.Flowable;

/* renamed from: hio reason: default package */
public final class hio implements vua<hin> {
    private final wlc<hil> a;
    private final wlc<Flowable<fpt>> b;
    private final wlc<Handler> c;
    private final wlc<jhz> d;
    private final wlc<jye> e;

    public static hin a(hil hil, Flowable<fpt> flowable, Handler handler, jhz jhz, jye jye) {
        hin hin = new hin(hil, flowable, handler, jhz, jye);
        return hin;
    }

    public final /* synthetic */ Object get() {
        hin hin = new hin((hil) this.a.get(), (Flowable) this.b.get(), (Handler) this.c.get(), (jhz) this.d.get(), (jye) this.e.get());
        return hin;
    }
}
