package defpackage;

import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;

/* renamed from: wck reason: default package */
public abstract class wck extends wcl {
    private static final waz g = new waz(false, 16);
    private static final String h;
    private Runnable i;

    /* renamed from: wck$a */
    public class a extends defpackage.wcl.a {
        protected a() {
            super();
        }

        private void a(wbf wbf) {
            if (wck.this.c.isOpen()) {
                if (Boolean.TRUE.equals(wck.this.B().a(wba.j))) {
                    wck.this.F();
                    SelectionKey L = wck.this.L();
                    L.interestOps(L.interestOps() & (wck.this.d ^ -1));
                    wbf.c(wcq.a);
                    return;
                }
                b(i());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
            if (r3.c() >= 0) goto L_0x0045;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
            r8 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
            r6.B();
         */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x006b A[SYNTHETIC, Splitter:B:34:0x006b] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void l() {
            /*
                r9 = this;
                wck r0 = defpackage.wck.this
                wao r0 = r0.B()
                wck r1 = defpackage.wck.this
                wbo r1 = r1.a
                vyw r2 = r0.c()
                wcb$a r3 = r9.a()
                r3.a(r0)
            L_0x0015:
                r4 = 0
                r5 = 0
                vyv r6 = r3.a(r2)     // Catch:{ all -> 0x0066 }
                wck r7 = defpackage.wck.this     // Catch:{ all -> 0x0064 }
                int r7 = r7.a(r6)     // Catch:{ all -> 0x0064 }
                r3.b(r7)     // Catch:{ all -> 0x0064 }
                int r7 = r3.c()     // Catch:{ all -> 0x0064 }
                r8 = 1
                if (r7 > 0) goto L_0x0035
                r6.B()     // Catch:{ all -> 0x0064 }
                int r2 = r3.c()     // Catch:{ all -> 0x0066 }
                if (r2 >= 0) goto L_0x0045
                goto L_0x0046
            L_0x0035:
                r3.a(r8)     // Catch:{ all -> 0x0064 }
                wck r7 = defpackage.wck.this     // Catch:{ all -> 0x0064 }
                r7.f = r5     // Catch:{ all -> 0x0064 }
                r1.d(r6)     // Catch:{ all -> 0x0064 }
                boolean r6 = r3.d()     // Catch:{ all -> 0x0066 }
                if (r6 != 0) goto L_0x0015
            L_0x0045:
                r8 = 0
            L_0x0046:
                r3.b()     // Catch:{ all -> 0x0061 }
                r1.c()     // Catch:{ all -> 0x0061 }
                if (r8 == 0) goto L_0x0051
                r9.a(r1)     // Catch:{ all -> 0x0061 }
            L_0x0051:
                wck r1 = defpackage.wck.this
                boolean r1 = r1.f
                if (r1 != 0) goto L_0x009d
                boolean r0 = r0.e()
                if (r0 != 0) goto L_0x009d
                r9.m()
                return
            L_0x0061:
                r2 = move-exception
                r6 = r4
                goto L_0x0069
            L_0x0064:
                r2 = move-exception
                goto L_0x0068
            L_0x0066:
                r2 = move-exception
                r6 = r4
            L_0x0068:
                r8 = 0
            L_0x0069:
                if (r6 == 0) goto L_0x007c
                boolean r4 = r6.f()     // Catch:{ all -> 0x009e }
                if (r4 == 0) goto L_0x0079
                wck r4 = defpackage.wck.this     // Catch:{ all -> 0x009e }
                r4.f = r5     // Catch:{ all -> 0x009e }
                r1.d(r6)     // Catch:{ all -> 0x009e }
                goto L_0x007c
            L_0x0079:
                r6.B()     // Catch:{ all -> 0x009e }
            L_0x007c:
                r3.b()     // Catch:{ all -> 0x009e }
                r1.c()     // Catch:{ all -> 0x009e }
                r1.a(r2)     // Catch:{ all -> 0x009e }
                if (r8 != 0) goto L_0x008b
                boolean r2 = r2 instanceof java.io.IOException     // Catch:{ all -> 0x009e }
                if (r2 == 0) goto L_0x008e
            L_0x008b:
                r9.a(r1)     // Catch:{ all -> 0x009e }
            L_0x008e:
                wck r1 = defpackage.wck.this
                boolean r1 = r1.f
                if (r1 != 0) goto L_0x009d
                boolean r0 = r0.e()
                if (r0 != 0) goto L_0x009d
                r9.m()
            L_0x009d:
                return
            L_0x009e:
                r1 = move-exception
                wck r2 = defpackage.wck.this
                boolean r2 = r2.f
                if (r2 != 0) goto L_0x00ae
                boolean r0 = r0.e()
                if (r0 != 0) goto L_0x00ae
                r9.m()
            L_0x00ae:
                goto L_0x00b0
            L_0x00af:
                throw r1
            L_0x00b0:
                goto L_0x00af
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wck.a.l():void");
        }
    }

    /* access modifiers changed from: protected */
    public abstract war F();

    /* access modifiers changed from: protected */
    public abstract int a(vyv vyv);

    /* access modifiers changed from: protected */
    public abstract long a(wbw wbw);

    /* access modifiers changed from: protected */
    public abstract int b(vyv vyv);

    static {
        StringBuilder sb = new StringBuilder(" (expected: ");
        sb.append(wjn.a(vyv.class));
        sb.append(", ");
        sb.append(wjn.a(wbw.class));
        sb.append(')');
        h = sb.toString();
    }

    protected wck(wan wan, SelectableChannel selectableChannel) {
        super(wan, selectableChannel, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public defpackage.wcl.a m() {
        return new a();
    }

    public final waz E() {
        return g;
    }

    public void a(wbb wbb) {
        wbb wbb2 = wbb;
        int i2 = -1;
        boolean z = false;
        while (true) {
            Object a2 = wbb.a();
            if (a2 == null) {
                H();
                return;
            }
            long j = 0;
            boolean z2 = true;
            if (a2 instanceof vyv) {
                vyv vyv = (vyv) a2;
                if (vyv.g() != 0) {
                    if (i2 == -1) {
                        i2 = B().b();
                    }
                    int i3 = i2 - 1;
                    while (true) {
                        if (i3 < 0) {
                            break;
                        }
                        int b = b(vyv);
                        if (b == 0) {
                            z = true;
                            break;
                        }
                        j += (long) b;
                        if (!vyv.f()) {
                            break;
                        }
                        i3--;
                    }
                    z2 = false;
                    wbb2.c(j);
                    if (!z2) {
                        break;
                    }
                    wbb.b();
                } else {
                    wbb.b();
                }
            } else if (a2 instanceof wbw) {
                wbw wbw = (wbw) a2;
                boolean z3 = wbw.a() >= wbw.b();
                if (!z3) {
                    if (i2 == -1) {
                        i2 = B().b();
                    }
                    int i4 = i2 - 1;
                    long j2 = 0;
                    while (true) {
                        if (i4 < 0) {
                            break;
                        }
                        long a3 = a(wbw);
                        if (a3 == 0) {
                            z = true;
                            break;
                        }
                        j2 += a3;
                        if (wbw.a() >= wbw.b()) {
                            z3 = true;
                            break;
                        }
                        i4--;
                    }
                    wbb2.c(j2);
                }
                if (!z3) {
                    break;
                }
                wbb.b();
            } else {
                throw new Error();
            }
        }
        a(z);
    }

    public final Object c(Object obj) {
        if (obj instanceof vyv) {
            vyv vyv = (vyv) obj;
            if (vyv.F()) {
                return obj;
            }
            int g2 = vyv.g();
            if (g2 == 0) {
                whh.b(vyv);
                return vzw.a;
            }
            vyw d = d();
            if (d.b()) {
                vyv d2 = d.d(g2);
                d2.a(vyv, vyv.c(), g2);
                whh.b(vyv);
                return d2;
            }
            vyv a2 = vza.a();
            if (a2 == null) {
                return vyv;
            }
            a2.a(vyv, vyv.c(), g2);
            whh.b(vyv);
            return a2;
        } else if (obj instanceof wbw) {
            return obj;
        } else {
            StringBuilder sb = new StringBuilder("unsupported message type: ");
            sb.append(wjn.a(obj));
            sb.append(h);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        if (z) {
            O();
            return;
        }
        Runnable runnable = this.i;
        if (runnable == null) {
            runnable = new Runnable() {
                public final void run() {
                    wck.this.a.b.o();
                }
            };
            this.i = runnable;
        }
        K().execute(runnable);
    }

    private void O() {
        SelectionKey L = L();
        if (L.isValid()) {
            int interestOps = L.interestOps();
            if ((interestOps & 4) == 0) {
                L.interestOps(interestOps | 4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void H() {
        SelectionKey L = L();
        if (L.isValid()) {
            int interestOps = L.interestOps();
            if ((interestOps & 4) != 0) {
                L.interestOps(interestOps & -5);
            }
        }
    }
}
