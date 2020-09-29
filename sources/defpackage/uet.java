package defpackage;

import android.app.Activity;

/* renamed from: uet reason: default package */
public final class uet implements vua<Boolean> {
    private final wlc<Activity> a;

    private uet(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static uet a(wlc<Activity> wlc) {
        return new uet(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((Activity) this.a.get()).getIntent().getBooleanExtra("and_podcast_onboarding_mvp_rollout_android", false));
    }
}
