package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.connect.ConnectManager;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: gqv reason: default package */
public final class gqv implements vua<Observable<ConnectManager>> {
    private final wlc<Activity> a;
    private final wlc<vhw> b;
    private final wlc<Scheduler> c;

    private gqv(wlc<Activity> wlc, wlc<vhw> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static gqv a(wlc<Activity> wlc, wlc<vhw> wlc2, wlc<Scheduler> wlc3) {
        return new gqv(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(CC.a((Activity) this.a.get(), (vhw) this.b.get(), (Scheduler) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
