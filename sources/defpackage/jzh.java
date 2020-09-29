package defpackage;

import androidx.lifecycle.Lifecycle;
import com.spotify.mobile.android.video.ApplicationStateObservableImpl;

/* renamed from: jzh reason: default package */
public final class jzh implements wig<ApplicationStateObservableImpl> {
    private final wzi<Lifecycle> a;

    private jzh(wzi<Lifecycle> wzi) {
        this.a = wzi;
    }

    public static jzh a(wzi<Lifecycle> wzi) {
        return new jzh(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ApplicationStateObservableImpl((Lifecycle) this.a.get());
    }
}
