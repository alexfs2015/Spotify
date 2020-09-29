package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Flowable;

/* renamed from: kxi reason: default package */
public final class kxi implements wig<kxh> {
    private final wzi<Flowable<SessionState>> a;
    private final wzi<kwy> b;
    private final wzi<kxf> c;

    public static kxh a(Flowable<SessionState> flowable, kwy kwy, Object obj) {
        return new kxh(flowable, kwy, (kxf) obj);
    }

    public final /* synthetic */ Object get() {
        return new kxh((Flowable) this.a.get(), (kwy) this.b.get(), (kxf) this.c.get());
    }
}
