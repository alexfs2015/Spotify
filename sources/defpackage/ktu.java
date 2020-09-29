package defpackage;

import android.app.Activity;
import android.media.AudioManager;

/* renamed from: ktu reason: default package */
public final class ktu implements wig<AudioManager> {
    private final wzi<Activity> a;

    private ktu(wzi<Activity> wzi) {
        this.a = wzi;
    }

    public static ktu a(wzi<Activity> wzi) {
        return new ktu(wzi);
    }

    public final /* synthetic */ Object get() {
        return (AudioManager) wil.a((AudioManager) ((Activity) this.a.get()).getSystemService("audio"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
