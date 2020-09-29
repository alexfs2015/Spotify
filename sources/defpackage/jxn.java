package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: jxn reason: default package */
public final class jxn {
    public VideoSurfaceView a;
    public jzd b;
    kct c = new kcr();
    public String d;
    public boolean e;
    public jyo f;
    public jyd g;
    private final Context h;
    private final Looper i;
    private final gbd j;
    private final kcp k;
    private final kcl l;
    private final Handler m;
    private final wmb n;
    private final Picasso o;
    private List<kai> p = new ArrayList();
    private List<kbm> q = new ArrayList(0);
    private final kbt r;

    public jxn(Context context, Looper looper, wmb wmb, Picasso picasso, kbt kbt, gbd gbd, Handler handler, kcp kcp, kcl kcl) {
        this.h = context;
        this.i = looper;
        this.n = wmb;
        this.o = picasso;
        this.r = kbt;
        this.j = gbd;
        this.m = handler;
        this.k = kcp;
        this.l = kcl;
    }

    public final jxn a(List<kai> list) {
        this.p = new ArrayList(list);
        return this;
    }

    public final jxn b(List<kbm> list) {
        this.q = new ArrayList(list);
        return this;
    }

    public final jxm a() {
        Cache cache;
        boolean z = true;
        fay.b(!fax.a(this.d), "Feature identifier must be specified");
        fay.a(this.g);
        fay.a(this.n);
        boolean z2 = this.a == null;
        if (this.b != null) {
            z = false;
        }
        fay.b(z2 ^ z, "Either a VideoSurfaceView or a VideoSurfaceManager must be specified");
        jzd jzd = this.b;
        if (jzd == null) {
            jzd = new jzd();
            jzd.a(this.a);
        }
        jzd jzd2 = jzd;
        ArrayList arrayList = new ArrayList(this.p);
        arrayList.add(this.k);
        arrayList.add(this.l);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        jyo jyo = this.f;
        if (jyo != null) {
            cache = jyo.a;
        } else {
            cache = null;
        }
        jxq jxq = new jxq(this.h, this.i, this.n, new kag(unmodifiableList, this.m, this.j), jzd2, this.c, this.o, this.d, this.e, cache, null, this.q, this.r, this.g);
        return jxq;
    }
}
