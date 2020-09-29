package defpackage;

import android.media.AudioManager;

/* renamed from: igb reason: default package */
public final class igb implements vua<iga> {
    private final wlc<hxf> a;
    private final wlc<AudioManager> b;

    private igb(wlc<hxf> wlc, wlc<AudioManager> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static igb a(wlc<hxf> wlc, wlc<AudioManager> wlc2) {
        return new igb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new iga((hxf) this.a.get(), (AudioManager) this.b.get());
    }
}
