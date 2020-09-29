package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: iir reason: default package */
public final class iir implements wig<AudioManager> {
    private final wzi<Context> a;

    private iir(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static iir a(wzi<Context> wzi) {
        return new iir(wzi);
    }

    public final /* synthetic */ Object get() {
        return (AudioManager) wil.a((AudioManager) ((Context) this.a.get()).getSystemService("audio"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
