package defpackage;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: igg reason: default package */
public final class igg implements vua<igd> {
    private final wlc<Handler> a;
    private final wlc<AudioManager> b;
    private final wlc<iga> c;

    private igg(wlc<Handler> wlc, wlc<AudioManager> wlc2, wlc<iga> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static igg a(wlc<Handler> wlc, wlc<AudioManager> wlc2, wlc<iga> wlc3) {
        return new igg(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new igd((Handler) this.a.get(), (AudioManager) this.b.get(), (iga) this.c.get());
    }
}
