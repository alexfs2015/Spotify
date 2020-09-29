package defpackage;

import java.net.SocketAddress;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: wmp reason: default package */
public class wmp extends wmn<wmp, wot> {
    private static final wyc j = wyd.a(wmp.class);
    private static final wut<?> k = wuu.a;
    public final wmq g = new wmq(this);
    volatile wut<SocketAddress> h = k;
    volatile SocketAddress i;

    public wmp() {
    }

    private wmp(wmp wmp) {
        super(wmp);
        this.h = wmp.h;
        this.i = wmp.i;
    }

    /* access modifiers changed from: private */
    public static void b(final SocketAddress socketAddress, final SocketAddress socketAddress2, final wpo wpo) {
        final wot e = wpo.e();
        e.e().execute(new Runnable() {
            public final void run() {
                SocketAddress socketAddress = socketAddress2;
                if (socketAddress == null) {
                    e.a(socketAddress, wpo);
                } else {
                    e.a(socketAddress, socketAddress, wpo);
                }
                wpo.b(woy.b);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public wmp clone() {
        return new wmp(this);
    }

    public wox a(final wot wot, SocketAddress socketAddress, final SocketAddress socketAddress2, final wpo wpo) {
        try {
            wus a = this.h.a((wwc) wot.e());
            if (a.a(socketAddress)) {
                if (!a.b(socketAddress)) {
                    wwi d = a.d(socketAddress);
                    if (d.isDone()) {
                        Throwable f = d.f();
                        if (f != null) {
                            wot.i();
                            wpo.a(f);
                        } else {
                            b((SocketAddress) d.d(), socketAddress2, wpo);
                        }
                        return wpo;
                    }
                    d.b(new wwj<SocketAddress>() {
                        public final void operationComplete(wwi<SocketAddress> wwi) {
                            if (wwi.f() != null) {
                                wot.i();
                                wpo.a(wwi.f());
                                return;
                            }
                            wmp.b((SocketAddress) wwi.d(), socketAddress2, wpo);
                        }
                    });
                    return wpo;
                }
            }
            b(socketAddress, socketAddress2, wpo);
            return wpo;
        } catch (Throwable th) {
            wpo.b(th);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(wot wot) {
        wot.c().b(this.g.b());
        Map<wpg<?>, Object> map = this.d;
        synchronized (map) {
            for (Entry entry : map.entrySet()) {
                try {
                    if (!wot.B().a((wpg) entry.getKey(), entry.getValue())) {
                        wyc wyc = j;
                        StringBuilder sb = new StringBuilder("Unknown channel option: ");
                        sb.append(entry);
                        wyc.d(sb.toString());
                    }
                } catch (Throwable th) {
                    wyc wyc2 = j;
                    StringBuilder sb2 = new StringBuilder("Failed to set a channel option: ");
                    sb2.append(wot);
                    wyc2.d(sb2.toString(), th);
                }
            }
        }
        Map<wve<?>, Object> map2 = this.e;
        synchronized (map2) {
            for (Entry entry2 : map2.entrySet()) {
                wot.a((wve) entry2.getKey()).set(entry2.getValue());
            }
        }
    }

    public final /* bridge */ /* synthetic */ wmo d() {
        return this.g;
    }

    /* renamed from: e */
    public final wmp a() {
        super.a();
        if (this.g.b() != null) {
            return this;
        }
        throw new IllegalStateException("handler not set");
    }
}
