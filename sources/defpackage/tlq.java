package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: tlq reason: default package */
public final class tlq implements wig<tlp> {
    private final wzi<Activity> a;
    private final wzi<a> b;

    private tlq(wzi<Activity> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tlq a(wzi<Activity> wzi, wzi<a> wzi2) {
        return new tlq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tlp((Activity) this.a.get(), (a) this.b.get());
    }
}
