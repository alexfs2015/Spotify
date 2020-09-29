package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: iwd reason: default package */
public final class iwd implements vua<jyo> {
    private final wlc<Context> a;

    private iwd(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static iwd a(wlc<Context> wlc) {
        return new iwd(wlc);
    }

    public final /* synthetic */ Object get() {
        return (jyo) vuf.a(new jyo(new File(((Context) this.a.get()).getCacheDir(), "nowplaying-canvas-cache"), 50000000), "Cannot return null from a non-@Nullable @Provides method");
    }
}
