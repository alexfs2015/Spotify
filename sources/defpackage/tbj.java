package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: tbj reason: default package */
public final class tbj implements vua<tbi> {
    private final wlc<Activity> a;
    private final wlc<a> b;

    private tbj(wlc<Activity> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tbj a(wlc<Activity> wlc, wlc<a> wlc2) {
        return new tbj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tbi((Activity) this.a.get(), (a) this.b.get());
    }
}
