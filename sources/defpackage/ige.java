package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: ige reason: default package */
public final class ige implements vua<AudioManager> {
    private final wlc<Context> a;

    private ige(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static ige a(wlc<Context> wlc) {
        return new ige(wlc);
    }

    public final /* synthetic */ Object get() {
        return (AudioManager) vuf.a((AudioManager) ((Context) this.a.get()).getSystemService("audio"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
