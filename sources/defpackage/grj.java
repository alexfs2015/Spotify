package defpackage;

import android.app.Application;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import io.reactivex.Observable;

/* renamed from: grj reason: default package */
public final class grj implements vua<Observable<ConnectionType>> {
    private final wlc<Application> a;

    private grj(wlc<Application> wlc) {
        this.a = wlc;
    }

    public static grj a(wlc<Application> wlc) {
        return new grj(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(jtg.a(new jth((Application) this.a.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
