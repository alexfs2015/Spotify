package defpackage;

import android.app.Activity;
import android.media.AudioManager;

/* renamed from: kql reason: default package */
public final class kql implements vua<AudioManager> {
    private final wlc<Activity> a;

    private kql(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static kql a(wlc<Activity> wlc) {
        return new kql(wlc);
    }

    public final /* synthetic */ Object get() {
        return (AudioManager) vuf.a((AudioManager) ((Activity) this.a.get()).getSystemService("audio"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
