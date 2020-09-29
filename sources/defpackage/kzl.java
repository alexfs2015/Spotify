package defpackage;

import android.app.Activity;
import android.view.Window;

/* renamed from: kzl reason: default package */
public final class kzl implements vua<Window> {
    private final wlc<Activity> a;

    private kzl(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static kzl a(wlc<Activity> wlc) {
        return new kzl(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Window) vuf.a(((Activity) this.a.get()).getWindow(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
