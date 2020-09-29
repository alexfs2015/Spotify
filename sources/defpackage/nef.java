package defpackage;

import android.app.Activity;

/* renamed from: nef reason: default package */
public final class nef implements wig<Boolean> {
    private final wzi<Activity> a;

    private nef(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static nef a(wzi<Activity> wzi) {
        return new nef(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((Activity) this.a.get()).getIntent().getBooleanExtra("and_podcast_onboarding_mvp_rollout_android", false));
    }
}
