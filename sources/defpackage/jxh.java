package defpackage;

import androidx.lifecycle.Lifecycle;
import com.spotify.mobile.android.video.ApplicationStateObservableImpl;

/* renamed from: jxh reason: default package */
public final class jxh implements vua<ApplicationStateObservableImpl> {
    private final wlc<Lifecycle> a;

    private jxh(wlc<Lifecycle> wlc) {
        this.a = wlc;
    }

    public static jxh a(wlc<Lifecycle> wlc) {
        return new jxh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ApplicationStateObservableImpl((Lifecycle) this.a.get());
    }
}
