package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: jzn reason: default package */
public final class jzn {
    public VideoSurfaceView a;
    public kbd b;
    keu c = new kes();
    public String d;
    public boolean e;
    public kao f;
    public kad g;
    private final Context h;
    private final Looper i;
    private final gcb j;
    private final keh k;
    private final kep l;
    private final Handler m;
    private final xah n;
    private final Picasso o;
    private List<kci> p = new ArrayList();
    private List<kdm> q = new ArrayList(0);
    private final kdt r;

    public jzn(Context context, Looper looper, xah xah, Picasso picasso, kdt kdt, gcb gcb, Handler handler, keh keh, kep kep) {
        this.h = context;
        this.i = looper;
        this.n = xah;
        this.o = picasso;
        this.r = kdt;
        this.j = gcb;
        this.m = handler;
        this.k = keh;
        this.l = kep;
    }

    public final jzm a() {
        boolean z = true;
        fbp.b(!fbo.a(this.d), "Feature identifier must be specified");
        fbp.a(this.g);
        fbp.a(this.n);
        boolean z2 = this.a == null;
        if (this.b != null) {
            z = false;
        }
        fbp.b(z2 ^ z, "Either a VideoSurfaceView or a VideoSurfaceManager must be specified");
        kbd kbd = this.b;
        if (kbd == null) {
            kbd = new kbd();
            kbd.a(this.a);
        }
        kbd kbd2 = kbd;
        ArrayList arrayList = new ArrayList(this.p);
        arrayList.add(this.k);
        arrayList.add(this.l);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        kao kao = this.f;
        jzq jzq = new jzq(this.h, this.i, this.n, new kcg(unmodifiableList, this.m, this.j), kbd2, this.c, this.o, this.d, this.e, kao != null ? kao.a : null, null, this.q, this.r, this.g);
        return jzq;
    }

    public final jzn a(List<kci> list) {
        this.p = new ArrayList(list);
        return this;
    }

    public final jzn b(List<kdm> list) {
        this.q = new ArrayList(list);
        return this;
    }
}
