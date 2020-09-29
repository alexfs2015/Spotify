package defpackage;

import android.app.Activity;
import android.view.Display;

/* renamed from: suj reason: default package */
public final class suj implements vua<Display> {
    private final wlc<Activity> a;

    private suj(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static suj a(wlc<Activity> wlc) {
        return new suj(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Display) vuf.a(((Activity) this.a.get()).getWindowManager().getDefaultDisplay(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
