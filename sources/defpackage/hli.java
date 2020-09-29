package defpackage;

import android.os.Handler;
import io.reactivex.Flowable;

/* renamed from: hli reason: default package */
public final class hli implements wig<hlh> {
    private final wzi<hlf> a;
    private final wzi<Flowable<fqn>> b;
    private final wzi<Handler> c;
    private final wzi<jkp> d;
    private final wzi<kae> e;

    public static hlh a(hlf hlf, Flowable<fqn> flowable, Handler handler, jkp jkp, kae kae) {
        hlh hlh = new hlh(hlf, flowable, handler, jkp, kae);
        return hlh;
    }

    public final /* synthetic */ Object get() {
        hlh hlh = new hlh((hlf) this.a.get(), (Flowable) this.b.get(), (Handler) this.c.get(), (jkp) this.d.get(), (kae) this.e.get());
        return hlh;
    }
}
