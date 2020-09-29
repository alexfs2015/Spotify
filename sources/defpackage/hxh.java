package defpackage;

import android.app.Application;
import io.reactivex.Flowable;

/* renamed from: hxh reason: default package */
public final class hxh implements wig<hxg> {
    private final wzi<Application> a;
    private final wzi<Flowable<fqn>> b;
    private final wzi<hzx> c;

    public static hxg a(Application application, Flowable<fqn> flowable, hzx hzx) {
        return new hxg(application, flowable, hzx);
    }

    public final /* synthetic */ Object get() {
        return new hxg((Application) this.a.get(), (Flowable) this.b.get(), (hzx) this.c.get());
    }
}
