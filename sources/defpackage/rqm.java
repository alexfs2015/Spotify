package defpackage;

import android.media.AudioManager;

/* renamed from: rqm reason: default package */
public final class rqm implements vua<rql> {
    private final wlc<AudioManager> a;

    private rqm(wlc<AudioManager> wlc) {
        this.a = wlc;
    }

    public static rqm a(wlc<AudioManager> wlc) {
        return new rqm(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rql(vtz.b(this.a));
    }
}
