package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.NotAuthorizedException;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.HelloDetails;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Message;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ikn reason: default package */
public final class ikn implements a {
    private static final AtomicInteger j = new AtomicInteger();
    final Map<String, kwk> a;
    final boolean b;
    public final int c = j.incrementAndGet();
    /* access modifiers changed from: 0000 */
    public final ikv d;
    final String e;
    final String f;
    final ilq g;
    HelloDetails h;
    public volatile int i = 0;
    private final ikl k;

    public ikn(ikl ikl, ikv ikv, Map<String, kwk> map, boolean z, String str, String str2, imd imd) {
        this.a = ImmutableMap.a(map);
        this.k = (ikl) fbp.a(ikl);
        this.d = (ikv) fbp.a(ikv);
        this.b = true;
        this.g = new ilq();
        this.e = str;
        this.f = str2;
        int i2 = this.c;
        imd.a.put(Integer.valueOf(i2), new a(this));
        Logger.b("Session created: %d", Integer.valueOf(i2));
        imd.b.onNext(imd.a());
    }

    public final void a() {
        if (this.i != 1) {
            throw new NotAuthorizedException(0, 0);
        }
    }

    public final void a(int i2, int i3, Object obj) {
        if (this.i == 1) {
            this.k.a(i2, i3, obj);
        }
    }

    public final void a(String str) {
        this.i = 2;
        this.d.b();
        this.k.b(new Message("App service stopping"), str);
        this.k.a();
    }

    public final HelloDetails b() {
        return (HelloDetails) fbp.a(this.h);
    }

    public final boolean c() {
        return this.h != null;
    }
}
