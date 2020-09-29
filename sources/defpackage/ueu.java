package defpackage;

import android.app.Activity;

/* renamed from: ueu reason: default package */
public final class ueu implements vua<Boolean> {
    private final wlc<Activity> a;

    private ueu(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static ueu a(wlc<Activity> wlc) {
        return new ueu(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((Activity) this.a.get()).getIntent().getBooleanExtra("update_mode", false));
    }
}
