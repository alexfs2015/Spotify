package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: kpf reason: default package */
public final class kpf implements vua<kpe> {
    private final wlc<Context> a;
    private final wlc<Picasso> b;
    private final wlc<rxo> c;

    private kpf(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<rxo> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static kpf a(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<rxo> wlc3) {
        return new kpf(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new kpe((Context) this.a.get(), (Picasso) this.b.get(), (rxo) this.c.get());
    }
}
