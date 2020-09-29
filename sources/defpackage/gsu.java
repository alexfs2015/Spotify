package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.connect.ConnectManager;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: gsu reason: default package */
public final class gsu implements wig<Observable<ConnectManager>> {
    private final wzi<Activity> a;
    private final wzi<vvb> b;
    private final wzi<Scheduler> c;

    private gsu(wzi<Activity> wzi, wzi<vvb> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static gsu a(wzi<Activity> wzi, wzi<vvb> wzi2, wzi<Scheduler> wzi3) {
        return new gsu(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(CC.a((Activity) this.a.get(), (vvb) this.b.get(), (Scheduler) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
