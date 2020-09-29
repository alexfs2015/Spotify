package defpackage;

import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: sdf reason: default package */
public final class sdf implements wig<sde> {
    private final wzi<MediaSessionCompat> a;
    private final wzi<Context> b;
    private final wzi<scj> c;

    private sdf(wzi<MediaSessionCompat> wzi, wzi<Context> wzi2, wzi<scj> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static sdf a(wzi<MediaSessionCompat> wzi, wzi<Context> wzi2, wzi<scj> wzi3) {
        return new sdf(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new sde((MediaSessionCompat) this.a.get(), (Context) this.b.get(), (scj) this.c.get());
    }
}
