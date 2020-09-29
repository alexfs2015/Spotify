package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: osx reason: default package */
final class osx implements a {
    private final wlc<osz> a;
    private final wlc<Context> b;
    private final wlc<Picasso> c;
    private final wlc<oew> d;
    private final wlc<ofh> e;
    private final wlc<oss> f;

    osx(wlc<osz> wlc, wlc<Context> wlc2, wlc<Picasso> wlc3, wlc<oew> wlc4, wlc<ofh> wlc5, wlc<oss> wlc6) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ osu a() {
        osw osw = new osw((osz) a(this.a.get(), 1), (Context) a(this.b.get(), 2), (Picasso) a(this.c.get(), 3), (oew) a(this.d.get(), 4), (ofh) a(this.e.get(), 5), (oss) a(this.f.get(), 6));
        return osw;
    }
}
