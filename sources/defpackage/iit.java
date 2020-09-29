package defpackage;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: iit reason: default package */
public final class iit implements wig<iiq> {
    private final wzi<Handler> a;
    private final wzi<AudioManager> b;
    private final wzi<iin> c;

    private iit(wzi<Handler> wzi, wzi<AudioManager> wzi2, wzi<iin> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static iit a(wzi<Handler> wzi, wzi<AudioManager> wzi2, wzi<iin> wzi3) {
        return new iit(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new iiq((Handler) this.a.get(), (AudioManager) this.b.get(), (iin) this.c.get());
    }
}
