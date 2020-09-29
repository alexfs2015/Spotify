package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.NotAuthorizedException;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.HelloDetails;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Message;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: iia reason: default package */
public final class iia implements a {
    private static final AtomicInteger j = new AtomicInteger();
    final Map<String, ktb> a;
    final boolean b;
    public final int c = j.incrementAndGet();
    /* access modifiers changed from: 0000 */
    public final iii d;
    final String e;
    final String f;
    final ijd g;
    HelloDetails h;
    public volatile int i = 0;
    private final ihy k;

    public iia(ihy ihy, iii iii, Map<String, ktb> map, boolean z, String str, String str2, ijq ijq) {
        this.a = ImmutableMap.a(map);
        this.k = (ihy) fay.a(ihy);
        this.d = (iii) fay.a(iii);
        this.b = true;
        this.g = new ijd();
        this.e = str;
        this.f = str2;
        int i2 = this.c;
        ijq.a.put(Integer.valueOf(i2), new a(this));
        Logger.b("Session created: %d", Integer.valueOf(i2));
        ijq.b.onNext(ijq.a());
    }

    public final void a() {
        if (this.i != 1) {
            throw new NotAuthorizedException(0, 0);
        }
    }

    public final HelloDetails b() {
        return (HelloDetails) fay.a(this.h);
    }

    public final boolean c() {
        return this.h != null;
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
}
