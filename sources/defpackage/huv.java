package defpackage;

import android.app.Application;
import io.reactivex.Flowable;

/* renamed from: huv reason: default package */
public final class huv implements vua<huu> {
    private final wlc<Application> a;
    private final wlc<Flowable<fpt>> b;
    private final wlc<hxl> c;

    public static huu a(Application application, Flowable<fpt> flowable, hxl hxl) {
        return new huu(application, flowable, hxl);
    }

    public final /* synthetic */ Object get() {
        return new huu((Application) this.a.get(), (Flowable) this.b.get(), (hxl) this.c.get());
    }
}
