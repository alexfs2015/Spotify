package defpackage;

import java.net.SocketAddress;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: vyj reason: default package */
public class vyj extends vyh<vyj, wan> {
    private static final wjw j = wjx.a(vyj.class);
    private static final wgn<?> k = wgo.a;
    public final vyk g = new vyk(this);
    volatile wgn<SocketAddress> h = k;
    volatile SocketAddress i;

    public vyj() {
    }

    private vyj(vyj vyj) {
        super(vyj);
        this.h = vyj.h;
        this.i = vyj.i;
    }

    public war a(final wan wan, SocketAddress socketAddress, final SocketAddress socketAddress2, final wbi wbi) {
        try {
            wgm a = this.h.a((whw) wan.e());
            if (a.a(socketAddress)) {
                if (!a.b(socketAddress)) {
                    wic d = a.d(socketAddress);
                    if (d.isDone()) {
                        Throwable f = d.f();
                        if (f != null) {
                            wan.i();
                            wbi.a(f);
                        } else {
                            b((SocketAddress) d.d(), socketAddress2, wbi);
                        }
                        return wbi;
                    }
                    d.b(new wid<SocketAddress>() {
                        public final void operationComplete(wic<SocketAddress> wic) {
                            if (wic.f() != null) {
                                wan.i();
                                wbi.a(wic.f());
                                return;
                            }
                            vyj.b((SocketAddress) wic.d(), socketAddress2, wbi);
                        }
                    });
                    return wbi;
                }
            }
            b(socketAddress, socketAddress2, wbi);
            return wbi;
        } catch (Throwable th) {
            wbi.b(th);
        }
    }

    /* access modifiers changed from: private */
    public static void b(final SocketAddress socketAddress, final SocketAddress socketAddress2, final wbi wbi) {
        final wan e = wbi.e();
        e.e().execute(new Runnable() {
            public final void run() {
                SocketAddress socketAddress = socketAddress2;
                if (socketAddress == null) {
                    e.a(socketAddress, wbi);
                } else {
                    e.a(socketAddress, socketAddress, wbi);
                }
                wbi.b(was.b);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public final void a(wan wan) {
        wan.c().b(this.g.b());
        Map<wba<?>, Object> map = this.d;
        synchronized (map) {
            for (Entry entry : map.entrySet()) {
                try {
                    if (!wan.B().a((wba) entry.getKey(), entry.getValue())) {
                        wjw wjw = j;
                        StringBuilder sb = new StringBuilder("Unknown channel option: ");
                        sb.append(entry);
                        wjw.d(sb.toString());
                    }
                } catch (Throwable th) {
                    wjw wjw2 = j;
                    StringBuilder sb2 = new StringBuilder("Failed to set a channel option: ");
                    sb2.append(wan);
                    wjw2.d(sb2.toString(), th);
                }
            }
        }
        Map<wgy<?>, Object> map2 = this.e;
        synchronized (map2) {
            for (Entry entry2 : map2.entrySet()) {
                wan.a((wgy) entry2.getKey()).set(entry2.getValue());
            }
        }
    }

    /* renamed from: e */
    public final vyj a() {
        super.a();
        if (this.g.b() != null) {
            return this;
        }
        throw new IllegalStateException("handler not set");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public vyj clone() {
        return new vyj(this);
    }

    public final /* bridge */ /* synthetic */ vyi d() {
        return this.g;
    }
}
