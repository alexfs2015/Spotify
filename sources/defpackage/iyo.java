package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: iyo reason: default package */
public final class iyo implements wig<kao> {
    private final wzi<Context> a;

    private iyo(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static iyo a(wzi<Context> wzi) {
        return new iyo(wzi);
    }

    public final /* synthetic */ Object get() {
        return (kao) wil.a(new kao(new File(((Context) this.a.get()).getCacheDir(), "nowplaying-canvas-cache"), 50000000), "Cannot return null from a non-@Nullable @Provides method");
    }
}
