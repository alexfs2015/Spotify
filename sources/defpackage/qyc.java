package defpackage;

import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: qyc reason: default package */
public final class qyc implements wig<qyb> {
    private final wzi<Context> a;
    private final wzi<MediaSessionCompat> b;
    private final wzi<sdr> c;

    private qyc(wzi<Context> wzi, wzi<MediaSessionCompat> wzi2, wzi<sdr> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qyc a(wzi<Context> wzi, wzi<MediaSessionCompat> wzi2, wzi<sdr> wzi3) {
        return new qyc(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new qyb((Context) this.a.get(), (MediaSessionCompat) this.b.get(), (sdr) this.c.get());
    }
}
