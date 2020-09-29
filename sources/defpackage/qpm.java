package defpackage;

import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: qpm reason: default package */
public final class qpm implements vua<qpl> {
    private final wlc<Context> a;
    private final wlc<MediaSessionCompat> b;
    private final wlc<rue> c;

    private qpm(wlc<Context> wlc, wlc<MediaSessionCompat> wlc2, wlc<rue> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static qpm a(wlc<Context> wlc, wlc<MediaSessionCompat> wlc2, wlc<rue> wlc3) {
        return new qpm(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new qpl((Context) this.a.get(), (MediaSessionCompat) this.b.get(), (rue) this.c.get());
    }
}
