package defpackage;

import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;

/* renamed from: wqq reason: default package */
public abstract class wqq extends wqr {
    private static final wpf g = new wpf(false, 16);
    private static final String h;
    private Runnable i;

    /* renamed from: wqq$a */
    public class a extends defpackage.wqr.a {
        protected a() {
            super();
        }

        private void a(wpl wpl) {
            if (wqq.this.c.isOpen()) {
                if (Boolean.TRUE.equals(wqq.this.B().a(wpg.j))) {
                    wqq.this.F();
                    SelectionKey L = wqq.this.L();
                    L.interestOps(L.interestOps() & (wqq.this.d ^ -1));
                    wpl.c(wqw.a);
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
                wqq r0 = defpackage.wqq.this
                wou r0 = r0.B()
                wqq r1 = defpackage.wqq.this
                wpu r1 = r1.a
                wnc r2 = r0.c()
                wqh$a r3 = r9.a()
                r3.a(r0)
            L_0x0015:
                r4 = 0
                r5 = 0
                wnb r6 = r3.a(r2)     // Catch:{ all -> 0x0066 }
                wqq r7 = defpackage.wqq.this     // Catch:{ all -> 0x0064 }
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
                wqq r7 = defpackage.wqq.this     // Catch:{ all -> 0x0064 }
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
                wqq r1 = defpackage.wqq.this
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
                wqq r4 = defpackage.wqq.this     // Catch:{ all -> 0x009e }
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
                wqq r1 = defpackage.wqq.this
                boolean r1 = r1.f
                if (r1 != 0) goto L_0x009d
                boolean r0 = r0.e()
                if (r0 != 0) goto L_0x009d
                r9.m()
            L_0x009d:
                return
            L_0x009e:
                r1 = move-exception
                wqq r2 = defpackage.wqq.this
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wqq.a.l():void");
        }
    }

    static {
        StringBuilder sb = new StringBuilder(" (expected: ");
        sb.append(wxt.a(wnb.class));
        sb.append(", ");
        sb.append(wxt.a(wqc.class));
        sb.append(')');
        h = sb.toString();
    }

    protected wqq(wot wot, SelectableChannel selectableChannel) {
        super(wot, selectableChannel, 1);
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

    public final wpf E() {
        return g;
    }

    /* access modifiers changed from: protected */
    public abstract wox F();

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public defpackage.wqr.a m() {
        return new a();
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

    /* access modifiers changed from: protected */
    public abstract int a(wnb wnb);

    /* access modifiers changed from: protected */
    public abstract long a(wqc wqc);

    public void a(wph wph) {
        wph wph2 = wph;
        int i2 = -1;
        boolean z = false;
        while (true) {
            Object a2 = wph.a();
            if (a2 == null) {
                H();
                return;
            }
            long j = 0;
            boolean z2 = true;
            if (a2 instanceof wnb) {
                wnb wnb = (wnb) a2;
                if (wnb.g() != 0) {
                    if (i2 == -1) {
                        i2 = B().b();
                    }
                    int i3 = i2 - 1;
                    while (true) {
                        if (i3 < 0) {
                            break;
                        }
                        int b = b(wnb);
                        if (b == 0) {
                            z = true;
                            break;
                        }
                        j += (long) b;
                        if (!wnb.f()) {
                            break;
                        }
                        i3--;
                    }
                    z2 = false;
                    wph2.c(j);
                    if (!z2) {
                        break;
                    }
                    wph.b();
                } else {
                    wph.b();
                }
            } else if (a2 instanceof wqc) {
                wqc wqc = (wqc) a2;
                boolean z3 = wqc.a() >= wqc.b();
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
                        long a3 = a(wqc);
                        if (a3 == 0) {
                            z = true;
                            break;
                        }
                        j2 += a3;
                        if (wqc.a() >= wqc.b()) {
                            z3 = true;
                            break;
                        }
                        i4--;
                    }
                    wph2.c(j2);
                }
                if (!z3) {
                    break;
                }
                wph.b();
            } else {
                throw new Error();
            }
        }
        a(z);
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
                    wqq.this.a.b.o();
                }
            };
            this.i = runnable;
        }
        K().execute(runnable);
    }

    /* access modifiers changed from: protected */
    public abstract int b(wnb wnb);

    public final Object c(Object obj) {
        if (obj instanceof wnb) {
            wnb wnb = (wnb) obj;
            if (wnb.F()) {
                return obj;
            }
            int g2 = wnb.g();
            if (g2 == 0) {
                wvn.b(wnb);
                return woc.a;
            }
            wnc d = d();
            if (d.b()) {
                wnb d2 = d.d(g2);
                d2.a(wnb, wnb.c(), g2);
                wvn.b(wnb);
                return d2;
            }
            wnb a2 = wng.a();
            if (a2 == null) {
                return wnb;
            }
            a2.a(wnb, wnb.c(), g2);
            wvn.b(wnb);
            return a2;
        } else if (obj instanceof wqc) {
            return obj;
        } else {
            StringBuilder sb = new StringBuilder("unsupported message type: ");
            sb.append(wxt.a(obj));
            sb.append(h);
            throw new UnsupportedOperationException(sb.toString());
        }
    }
}
