package defpackage;

import android.graphics.Bitmap;
import com.squareup.picasso.Downloader.ResponseException;
import com.squareup.picasso.NetworkRequestHandler.ContentLengthException;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import com.squareup.picasso.Picasso.Priority;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wfx reason: default package */
public final class wfx implements Runnable {
    private static final Object p = new Object();
    private static final ThreadLocal<StringBuilder> q = new ThreadLocal<StringBuilder>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new StringBuilder("Picasso-");
        }
    };
    private static final AtomicInteger r = new AtomicInteger();
    private static final wgs s = new wgs() {
        public final a a(wgq wgq, int i) {
            StringBuilder sb = new StringBuilder("Unrecognized type of request: ");
            sb.append(wgq);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean a(wgq wgq) {
            return true;
        }
    };
    final int a = r.incrementAndGet();
    public final Picasso b;
    final String c;
    public final wgq d;
    final int e;
    int f;
    final wgs g;
    public wfv h;
    public List<wfv> i;
    public Bitmap j;
    Future<?> k;
    public LoadedFrom l;
    public Exception m;
    int n;
    Priority o;
    private wgd t;
    private wfy u;
    private wgv v;
    private int w;

    private wfx(Picasso picasso, wgd wgd, wfy wfy, wgv wgv, wfv wfv, wgs wgs) {
        this.b = picasso;
        this.t = wgd;
        this.u = wfy;
        this.v = wgv;
        this.h = wfv;
        this.c = wfv.i;
        this.d = wfv.b;
        this.o = wfv.b.r;
        this.e = wfv.e;
        this.f = wfv.f;
        this.g = wgs;
        this.n = wgs.a();
    }

    private static Bitmap a(List<wgz> list, Bitmap bitmap) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            final wgz wgz = (wgz) list.get(i2);
            try {
                Bitmap a2 = wgz.a(bitmap);
                if (a2 == null) {
                    final StringBuilder sb = new StringBuilder("Transformation ");
                    sb.append(wgz.a());
                    sb.append(" returned null after ");
                    sb.append(i2);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (wgz a3 : list) {
                        sb.append(a3.a());
                        sb.append(10);
                    }
                    Picasso.a.post(new Runnable() {
                        public final void run() {
                            throw new NullPointerException(sb.toString());
                        }
                    });
                    return null;
                } else if (a2 == bitmap && bitmap.isRecycled()) {
                    Picasso.a.post(new Runnable() {
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Transformation ");
                            sb.append(wgz.a());
                            sb.append(" returned input Bitmap but recycled it.");
                            throw new IllegalStateException(sb.toString());
                        }
                    });
                    return null;
                } else if (a2 == bitmap || bitmap.isRecycled()) {
                    i2++;
                    bitmap = a2;
                } else {
                    Picasso.a.post(new Runnable() {
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Transformation ");
                            sb.append(wgz.a());
                            sb.append(" mutated input Bitmap but failed to recycle the original.");
                            throw new IllegalStateException(sb.toString());
                        }
                    });
                    return null;
                }
            } catch (RuntimeException e2) {
                Picasso.a.post(new Runnable() {
                    public final void run() {
                        StringBuilder sb = new StringBuilder("Transformation ");
                        sb.append(wgz.a());
                        sb.append(" crashed with exception.");
                        throw new RuntimeException(sb.toString(), e2);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    static wfx a(Picasso picasso, wgd wgd, wfy wfy, wgv wgv, wfv wfv) {
        wgq wgq = wfv.b;
        List<wgs> list = picasso.c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            wgs wgs = (wgs) list.get(i2);
            if (wgs.a(wgq)) {
                wfx wfx = new wfx(picasso, wgd, wfy, wgv, wfv, wgs);
                return wfx;
            }
        }
        wfx wfx2 = new wfx(picasso, wgd, wfy, wgv, wfv, s);
        return wfx2;
    }

    private static boolean a(boolean z, int i2, int i3, int i4, int i5) {
        return !z || i2 > i4 || i3 > i5;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap a() {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.e
            boolean r0 = com.squareup.picasso.MemoryPolicy.a(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0034
            wfy r0 = r1.u
            java.lang.String r3 = r1.c
            android.graphics.Bitmap r0 = r0.a(r3)
            if (r0 == 0) goto L_0x0035
            wgv r2 = r1.v
            r2.a()
            com.squareup.picasso.Picasso$LoadedFrom r2 = com.squareup.picasso.Picasso.LoadedFrom.MEMORY
            r1.l = r2
            com.squareup.picasso.Picasso r2 = r1.b
            boolean r2 = r2.l
            if (r2 == 0) goto L_0x0033
            wgq r2 = r1.d
            java.lang.String r2 = r2.a()
            java.lang.String r3 = "Hunter"
            java.lang.String r4 = "decoded"
            java.lang.String r5 = "from cache"
            defpackage.whb.a(r3, r4, r2, r5)
        L_0x0033:
            return r0
        L_0x0034:
            r0 = r2
        L_0x0035:
            wgq r3 = r1.d
            int r4 = r1.n
            if (r4 != 0) goto L_0x0040
            com.squareup.picasso.NetworkPolicy r4 = com.squareup.picasso.NetworkPolicy.OFFLINE
            int r4 = r4.index
            goto L_0x0042
        L_0x0040:
            int r4 = r1.f
        L_0x0042:
            r3.c = r4
            wgs r3 = r1.g
            wgq r4 = r1.d
            int r5 = r1.f
            wgs$a r3 = r3.a(r4, r5)
            r4 = 0
            if (r3 == 0) goto L_0x00ba
            com.squareup.picasso.Picasso$LoadedFrom r0 = r3.a
            r1.l = r0
            int r0 = r3.d
            r1.w = r0
            android.graphics.Bitmap r0 = r3.b
            if (r0 != 0) goto L_0x00ba
            java.io.InputStream r3 = r3.c
            wgq r0 = r1.d     // Catch:{ all -> 0x00b5 }
            wgm r5 = new wgm     // Catch:{ all -> 0x00b5 }
            r5.<init>(r3)     // Catch:{ all -> 0x00b5 }
            r6 = 65536(0x10000, float:9.18355E-41)
            long r6 = r5.a(r6)     // Catch:{ all -> 0x00b5 }
            android.graphics.BitmapFactory$Options r8 = defpackage.wgs.c(r0)     // Catch:{ all -> 0x00b5 }
            boolean r9 = defpackage.wgs.a(r8)     // Catch:{ all -> 0x00b5 }
            boolean r10 = defpackage.whb.c(r5)     // Catch:{ all -> 0x00b5 }
            r5.a(r6)     // Catch:{ all -> 0x00b5 }
            if (r10 == 0) goto L_0x0094
            byte[] r2 = defpackage.whb.b(r5)     // Catch:{ all -> 0x00b5 }
            if (r9 == 0) goto L_0x008e
            int r5 = r2.length     // Catch:{ all -> 0x00b5 }
            android.graphics.BitmapFactory.decodeByteArray(r2, r4, r5, r8)     // Catch:{ all -> 0x00b5 }
            int r5 = r0.h     // Catch:{ all -> 0x00b5 }
            int r6 = r0.i     // Catch:{ all -> 0x00b5 }
            defpackage.wgs.a(r5, r6, r8, r0)     // Catch:{ all -> 0x00b5 }
        L_0x008e:
            int r0 = r2.length     // Catch:{ all -> 0x00b5 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r2, r4, r0, r8)     // Catch:{ all -> 0x00b5 }
            goto L_0x00a9
        L_0x0094:
            if (r9 == 0) goto L_0x00a3
            android.graphics.BitmapFactory.decodeStream(r5, r2, r8)     // Catch:{ all -> 0x00b5 }
            int r9 = r0.h     // Catch:{ all -> 0x00b5 }
            int r10 = r0.i     // Catch:{ all -> 0x00b5 }
            defpackage.wgs.a(r9, r10, r8, r0)     // Catch:{ all -> 0x00b5 }
            r5.a(r6)     // Catch:{ all -> 0x00b5 }
        L_0x00a3:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r5, r2, r8)     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x00ad
        L_0x00a9:
            defpackage.whb.a(r3)
            goto L_0x00ba
        L_0x00ad:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "Failed to decode stream."
            r0.<init>(r2)     // Catch:{ all -> 0x00b5 }
            throw r0     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r0 = move-exception
            defpackage.whb.a(r3)
            throw r0
        L_0x00ba:
            if (r0 == 0) goto L_0x0217
            com.squareup.picasso.Picasso r2 = r1.b
            boolean r2 = r2.l
            if (r2 == 0) goto L_0x00cf
            wgq r2 = r1.d
            java.lang.String r2 = r2.a()
            java.lang.String r3 = "Hunter"
            java.lang.String r5 = "decoded"
            defpackage.whb.a(r3, r5, r2)
        L_0x00cf:
            wgv r2 = r1.v
            r3 = 2
            r2.a(r0, r3)
            wgq r2 = r1.d
            boolean r5 = r2.d()
            if (r5 != 0) goto L_0x00e6
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            r2 = 0
            goto L_0x00e7
        L_0x00e6:
            r2 = 1
        L_0x00e7:
            if (r2 != 0) goto L_0x00ed
            int r2 = r1.w
            if (r2 == 0) goto L_0x0217
        L_0x00ed:
            java.lang.Object r2 = p
            monitor-enter(r2)
            wgq r5 = r1.d     // Catch:{ all -> 0x0214 }
            boolean r5 = r5.d()     // Catch:{ all -> 0x0214 }
            if (r5 != 0) goto L_0x00fc
            int r5 = r1.w     // Catch:{ all -> 0x0214 }
            if (r5 == 0) goto L_0x01e5
        L_0x00fc:
            wgq r5 = r1.d     // Catch:{ all -> 0x0214 }
            int r6 = r1.w     // Catch:{ all -> 0x0214 }
            int r7 = r0.getWidth()     // Catch:{ all -> 0x0214 }
            int r8 = r0.getHeight()     // Catch:{ all -> 0x0214 }
            boolean r9 = r5.l     // Catch:{ all -> 0x0214 }
            android.graphics.Matrix r10 = new android.graphics.Matrix     // Catch:{ all -> 0x0214 }
            r10.<init>()     // Catch:{ all -> 0x0214 }
            boolean r11 = r5.d()     // Catch:{ all -> 0x0214 }
            if (r11 == 0) goto L_0x01b9
            int r11 = r5.h     // Catch:{ all -> 0x0214 }
            int r12 = r5.i     // Catch:{ all -> 0x0214 }
            float r13 = r5.m     // Catch:{ all -> 0x0214 }
            r14 = 0
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r14 == 0) goto L_0x012f
            boolean r14 = r5.p     // Catch:{ all -> 0x0214 }
            if (r14 == 0) goto L_0x012c
            float r14 = r5.n     // Catch:{ all -> 0x0214 }
            float r15 = r5.o     // Catch:{ all -> 0x0214 }
            r10.setRotate(r13, r14, r15)     // Catch:{ all -> 0x0214 }
            goto L_0x012f
        L_0x012c:
            r10.setRotate(r13)     // Catch:{ all -> 0x0214 }
        L_0x012f:
            boolean r13 = r5.j     // Catch:{ all -> 0x0214 }
            if (r13 == 0) goto L_0x017d
            float r5 = (float) r11     // Catch:{ all -> 0x0214 }
            float r13 = (float) r7     // Catch:{ all -> 0x0214 }
            float r14 = r5 / r13
            float r15 = (float) r12     // Catch:{ all -> 0x0214 }
            float r4 = (float) r8     // Catch:{ all -> 0x0214 }
            float r17 = r15 / r4
            int r18 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r18 <= 0) goto L_0x0158
            float r17 = r17 / r14
            float r4 = r4 * r17
            double r4 = (double) r4     // Catch:{ all -> 0x0214 }
            double r4 = java.lang.Math.ceil(r4)     // Catch:{ all -> 0x0214 }
            int r4 = (int) r4     // Catch:{ all -> 0x0214 }
            int r5 = r8 - r4
            int r3 = r5 / 2
            float r5 = (float) r4     // Catch:{ all -> 0x0214 }
            float r17 = r15 / r5
            r16 = r3
            r13 = r4
            r5 = r7
            r3 = r17
            r4 = 0
            goto L_0x0170
        L_0x0158:
            float r14 = r14 / r17
            float r13 = r13 * r14
            double r13 = (double) r13     // Catch:{ all -> 0x0214 }
            double r13 = java.lang.Math.ceil(r13)     // Catch:{ all -> 0x0214 }
            int r4 = (int) r13     // Catch:{ all -> 0x0214 }
            int r13 = r7 - r4
            int r3 = r13 / 2
            float r13 = (float) r4     // Catch:{ all -> 0x0214 }
            float r14 = r5 / r13
            r5 = r4
            r13 = r8
            r16 = 0
            r4 = r3
            r3 = r17
        L_0x0170:
            boolean r7 = a(r9, r7, r8, r11, r12)     // Catch:{ all -> 0x0214 }
            if (r7 == 0) goto L_0x0179
            r10.preScale(r14, r3)     // Catch:{ all -> 0x0214 }
        L_0x0179:
            r7 = r5
            r8 = r13
            r5 = r4
            goto L_0x01bc
        L_0x017d:
            boolean r3 = r5.k     // Catch:{ all -> 0x0214 }
            if (r3 == 0) goto L_0x0197
            float r3 = (float) r11     // Catch:{ all -> 0x0214 }
            float r4 = (float) r7     // Catch:{ all -> 0x0214 }
            float r3 = r3 / r4
            float r4 = (float) r12     // Catch:{ all -> 0x0214 }
            float r5 = (float) r8     // Catch:{ all -> 0x0214 }
            float r4 = r4 / r5
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x018c
            goto L_0x018d
        L_0x018c:
            r3 = r4
        L_0x018d:
            boolean r4 = a(r9, r7, r8, r11, r12)     // Catch:{ all -> 0x0214 }
            if (r4 == 0) goto L_0x01b9
            r10.preScale(r3, r3)     // Catch:{ all -> 0x0214 }
            goto L_0x01b9
        L_0x0197:
            if (r11 != 0) goto L_0x019b
            if (r12 == 0) goto L_0x01b9
        L_0x019b:
            if (r11 != r7) goto L_0x019f
            if (r12 == r8) goto L_0x01b9
        L_0x019f:
            if (r11 == 0) goto L_0x01a4
            float r3 = (float) r11     // Catch:{ all -> 0x0214 }
            float r4 = (float) r7     // Catch:{ all -> 0x0214 }
            goto L_0x01a6
        L_0x01a4:
            float r3 = (float) r12     // Catch:{ all -> 0x0214 }
            float r4 = (float) r8     // Catch:{ all -> 0x0214 }
        L_0x01a6:
            float r3 = r3 / r4
            if (r12 == 0) goto L_0x01ad
            float r4 = (float) r12     // Catch:{ all -> 0x0214 }
            float r5 = (float) r8     // Catch:{ all -> 0x0214 }
        L_0x01ab:
            float r4 = r4 / r5
            goto L_0x01b0
        L_0x01ad:
            float r4 = (float) r11     // Catch:{ all -> 0x0214 }
            float r5 = (float) r7     // Catch:{ all -> 0x0214 }
            goto L_0x01ab
        L_0x01b0:
            boolean r5 = a(r9, r7, r8, r11, r12)     // Catch:{ all -> 0x0214 }
            if (r5 == 0) goto L_0x01b9
            r10.preScale(r3, r4)     // Catch:{ all -> 0x0214 }
        L_0x01b9:
            r5 = 0
            r16 = 0
        L_0x01bc:
            if (r6 == 0) goto L_0x01c2
            float r3 = (float) r6     // Catch:{ all -> 0x0214 }
            r10.preRotate(r3)     // Catch:{ all -> 0x0214 }
        L_0x01c2:
            r3 = 1
            r4 = r0
            r6 = r16
            r9 = r10
            r10 = r3
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0214 }
            if (r3 == r0) goto L_0x01d2
            r0.recycle()     // Catch:{ all -> 0x0214 }
            r0 = r3
        L_0x01d2:
            com.squareup.picasso.Picasso r3 = r1.b     // Catch:{ all -> 0x0214 }
            boolean r3 = r3.l     // Catch:{ all -> 0x0214 }
            if (r3 == 0) goto L_0x01e5
            java.lang.String r3 = "Hunter"
            java.lang.String r4 = "transformed"
            wgq r5 = r1.d     // Catch:{ all -> 0x0214 }
            java.lang.String r5 = r5.a()     // Catch:{ all -> 0x0214 }
            defpackage.whb.a(r3, r4, r5)     // Catch:{ all -> 0x0214 }
        L_0x01e5:
            wgq r3 = r1.d     // Catch:{ all -> 0x0214 }
            boolean r3 = r3.e()     // Catch:{ all -> 0x0214 }
            if (r3 == 0) goto L_0x020a
            wgq r3 = r1.d     // Catch:{ all -> 0x0214 }
            java.util.List<wgz> r3 = r3.g     // Catch:{ all -> 0x0214 }
            android.graphics.Bitmap r0 = a(r3, r0)     // Catch:{ all -> 0x0214 }
            com.squareup.picasso.Picasso r3 = r1.b     // Catch:{ all -> 0x0214 }
            boolean r3 = r3.l     // Catch:{ all -> 0x0214 }
            if (r3 == 0) goto L_0x020a
            java.lang.String r3 = "Hunter"
            java.lang.String r4 = "transformed"
            wgq r5 = r1.d     // Catch:{ all -> 0x0214 }
            java.lang.String r5 = r5.a()     // Catch:{ all -> 0x0214 }
            java.lang.String r6 = "from custom transformations"
            defpackage.whb.a(r3, r4, r5, r6)     // Catch:{ all -> 0x0214 }
        L_0x020a:
            monitor-exit(r2)     // Catch:{ all -> 0x0214 }
            if (r0 == 0) goto L_0x0217
            wgv r2 = r1.v
            r3 = 3
            r2.a(r0, r3)
            goto L_0x0217
        L_0x0214:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0214 }
            throw r0
        L_0x0217:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wfx.a():android.graphics.Bitmap");
    }

    /* access modifiers changed from: 0000 */
    public final void a(wfv wfv) {
        boolean z = this.b.l;
        wgq wgq = wfv.b;
        String str = "to ";
        String str2 = "joined";
        String str3 = "Hunter";
        if (this.h == null) {
            this.h = wfv;
            if (z) {
                List<wfv> list = this.i;
                if (list == null || list.isEmpty()) {
                    whb.a(str3, str2, wgq.a(), "to empty hunter");
                } else {
                    whb.a(str3, str2, wgq.a(), whb.a(this, str));
                }
            }
            return;
        }
        if (this.i == null) {
            this.i = new ArrayList(3);
        }
        this.i.add(wfv);
        if (z) {
            whb.a(str3, str2, wgq.a(), whb.a(this, str));
        }
        Priority priority = wfv.b.r;
        if (priority.ordinal() > this.o.ordinal()) {
            this.o = priority;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(wfv wfv) {
        boolean z;
        boolean z2 = true;
        if (this.h == wfv) {
            this.h = null;
            z = true;
        } else {
            List<wfv> list = this.i;
            z = list != null ? list.remove(wfv) : false;
        }
        if (z && wfv.b.r == this.o) {
            Priority priority = Priority.LOW;
            List<wfv> list2 = this.i;
            boolean z3 = list2 != null && !list2.isEmpty();
            if (this.h == null && !z3) {
                z2 = false;
            }
            if (z2) {
                wfv wfv2 = this.h;
                if (wfv2 != null) {
                    priority = wfv2.b.r;
                }
                if (z3) {
                    int size = this.i.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Priority priority2 = ((wfv) this.i.get(i2)).b.r;
                        if (priority2.ordinal() > priority.ordinal()) {
                            priority = priority2;
                        }
                    }
                }
            }
            this.o = priority;
        }
        if (this.b.l) {
            whb.a("Hunter", "removed", wfv.b.a(), whb.a(this, "from "));
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        if (this.h == null) {
            List<wfv> list = this.i;
            if (list == null || list.isEmpty()) {
                Future<?> future = this.k;
                if (future != null && future.cancel(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        Future<?> future = this.k;
        return future != null && future.isCancelled();
    }

    public final void run() {
        String str;
        Thread currentThread;
        String str2 = "Picasso-Idle";
        try {
            wgq wgq = this.d;
            String valueOf = wgq.d != null ? String.valueOf(wgq.d.getPath()) : Integer.toHexString(wgq.e);
            StringBuilder sb = (StringBuilder) q.get();
            sb.ensureCapacity(valueOf.length() + 8);
            sb.replace(8, sb.length(), valueOf);
            Thread.currentThread().setName(sb.toString());
            if (this.b.l) {
                whb.a("Hunter", "executing", whb.a(this));
            }
            this.j = a();
            if (this.j == null) {
                this.t.b(this);
            } else {
                wgd wgd = this.t;
                wgd.g.sendMessage(wgd.g.obtainMessage(4, this));
            }
        } catch (ResponseException e2) {
            if (!e2.localCacheOnly || e2.responseCode != 504) {
                this.m = e2;
            }
            this.t.b(this);
        } catch (ContentLengthException e3) {
            this.m = e3;
            this.t.a(this);
        } catch (IOException e4) {
            this.m = e4;
            this.t.a(this);
        } catch (OutOfMemoryError e5) {
            StringWriter stringWriter = new StringWriter();
            wgv wgv = this.v;
            int b2 = wgv.a.b();
            int a2 = wgv.a.a();
            long j2 = wgv.c;
            long j3 = wgv.d;
            long j4 = wgv.e;
            str = str2;
            OutOfMemoryError outOfMemoryError = e5;
            long j5 = wgv.f;
            long j6 = wgv.g;
            StringWriter stringWriter2 = stringWriter;
            long j7 = wgv.h;
            long j8 = wgv.i;
            long j9 = wgv.j;
            long j10 = j9;
            wgw wgw = r5;
            wgw wgw2 = new wgw(b2, a2, j2, j3, j4, j5, j6, j7, j8, j10, wgv.k, wgv.l, wgv.m, System.currentTimeMillis());
            StringWriter stringWriter3 = stringWriter2;
            PrintWriter printWriter = new PrintWriter(stringWriter3);
            printWriter.println("===============BEGIN PICASSO STATS ===============");
            printWriter.println("Memory Cache Stats");
            printWriter.print("  Max Cache Size: ");
            wgw wgw3 = wgw;
            printWriter.println(wgw3.a);
            printWriter.print("  Cache Size: ");
            printWriter.println(wgw3.b);
            printWriter.print("  Cache % Full: ");
            printWriter.println((int) Math.ceil((double) ((((float) wgw3.b) / ((float) wgw3.a)) * 100.0f)));
            printWriter.print("  Cache Hits: ");
            printWriter.println(wgw3.c);
            printWriter.print("  Cache Misses: ");
            printWriter.println(wgw3.d);
            printWriter.println("Network Stats");
            printWriter.print("  Download Count: ");
            printWriter.println(wgw3.k);
            printWriter.print("  Total Download Size: ");
            printWriter.println(wgw3.e);
            printWriter.print("  Average Download Size: ");
            printWriter.println(wgw3.h);
            printWriter.println("Bitmap Stats");
            printWriter.print("  Total Bitmaps Decoded: ");
            printWriter.println(wgw3.l);
            printWriter.print("  Total Bitmap Size: ");
            printWriter.println(wgw3.f);
            printWriter.print("  Total Transformed Bitmaps: ");
            printWriter.println(wgw3.m);
            printWriter.print("  Total Transformed Bitmap Size: ");
            printWriter.println(wgw3.g);
            printWriter.print("  Average Bitmap Size: ");
            printWriter.println(wgw3.i);
            printWriter.print("  Average Transformed Bitmap Size: ");
            printWriter.println(wgw3.j);
            printWriter.println("===============END PICASSO STATS ===============");
            printWriter.flush();
            RuntimeException runtimeException = new RuntimeException(stringWriter3.toString(), outOfMemoryError);
            this.m = runtimeException;
            this.t.b(this);
            currentThread = Thread.currentThread();
            str2 = str;
        } catch (Exception e6) {
            this.m = e6;
            this.t.b(this);
        } catch (Throwable th) {
            th = th;
            str2 = str;
            Thread.currentThread().setName(str2);
            throw th;
        }
        currentThread = Thread.currentThread();
        currentThread.setName(str2);
    }
}
