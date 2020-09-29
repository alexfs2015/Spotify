package defpackage;

import android.app.Activity;

/* renamed from: neg reason: default package */
public final class neg implements wig<Boolean> {
    private final wzi<Activity> a;

    private neg(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static neg a(wzi<Activity> wzi) {
        return new neg(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((Activity) this.a.get()).getIntent().getBooleanExtra("update_mode", false));
    }
}
