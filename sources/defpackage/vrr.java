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

/* renamed from: vrr reason: default package */
public final class vrr implements Runnable {
    private static final Object p = new Object();
    private static final ThreadLocal<StringBuilder> q = new ThreadLocal<StringBuilder>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new StringBuilder("Picasso-");
        }
    };
    private static final AtomicInteger r = new AtomicInteger();
    private static final vsm s = new vsm() {
        public final boolean a(vsk vsk) {
            return true;
        }

        public final a a(vsk vsk, int i) {
            StringBuilder sb = new StringBuilder("Unrecognized type of request: ");
            sb.append(vsk);
            throw new IllegalStateException(sb.toString());
        }
    };
    final int a = r.incrementAndGet();
    public final Picasso b;
    final String c;
    public final vsk d;
    final int e;
    int f;
    final vsm g;
    public vrp h;
    public List<vrp> i;
    public Bitmap j;
    Future<?> k;
    public LoadedFrom l;
    public Exception m;
    int n;
    Priority o;
    private vrx t;
    private vrs u;
    private vsp v;
    private int w;

    private static boolean a(boolean z, int i2, int i3, int i4, int i5) {
        return !z || i2 > i4 || i3 > i5;
    }

    private vrr(Picasso picasso, vrx vrx, vrs vrs, vsp vsp, vrp vrp, vsm vsm) {
        this.b = picasso;
        this.t = vrx;
        this.u = vrs;
        this.v = vsp;
        this.h = vrp;
        this.c = vrp.i;
        this.d = vrp.b;
        this.o = vrp.b.r;
        this.e = vrp.e;
        this.f = vrp.f;
        this.g = vsm;
        this.n = vsm.a();
    }

    public final void run() {
        String str;
        Thread currentThread;
        String str2;
        String str3 = "Picasso-Idle";
        try {
            vsk vsk = this.d;
            if (vsk.d != null) {
                str2 = String.valueOf(vsk.d.getPath());
            } else {
                str2 = Integer.toHexString(vsk.e);
            }
            StringBuilder sb = (StringBuilder) q.get();
            sb.ensureCapacity(str2.length() + 8);
            sb.replace(8, sb.length(), str2);
            Thread.currentThread().setName(sb.toString());
            if (this.b.l) {
                vsv.a("Hunter", "executing", vsv.a(this));
            }
            this.j = a();
            if (this.j == null) {
                this.t.b(this);
            } else {
                vrx vrx = this.t;
                vrx.g.sendMessage(vrx.g.obtainMessage(4, this));
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
            vsp vsp = this.v;
            int b2 = vsp.a.b();
            int a2 = vsp.a.a();
            long j2 = vsp.c;
            long j3 = vsp.d;
            long j4 = vsp.e;
            str = str3;
            OutOfMemoryError outOfMemoryError = e5;
            long j5 = vsp.f;
            long j6 = vsp.g;
            StringWriter stringWriter2 = stringWriter;
            long j7 = vsp.h;
            long j8 = vsp.i;
            long j9 = vsp.j;
            int i2 = vsp.k;
            long j10 = j9;
            int i3 = vsp.l;
            vsq vsq = r5;
            vsq vsq2 = new vsq(b2, a2, j2, j3, j4, j5, j6, j7, j8, j10, i2, i3, vsp.m, System.currentTimeMillis());
            StringWriter stringWriter3 = stringWriter2;
            PrintWriter printWriter = new PrintWriter(stringWriter3);
            printWriter.println("===============BEGIN PICASSO STATS ===============");
            printWriter.println("Memory Cache Stats");
            printWriter.print("  Max Cache Size: ");
            vsq vsq3 = vsq;
            printWriter.println(vsq3.a);
            printWriter.print("  Cache Size: ");
            printWriter.println(vsq3.b);
            printWriter.print("  Cache % Full: ");
            printWriter.println((int) Math.ceil((double) ((((float) vsq3.b) / ((float) vsq3.a)) * 100.0f)));
            printWriter.print("  Cache Hits: ");
            printWriter.println(vsq3.c);
            printWriter.print("  Cache Misses: ");
            printWriter.println(vsq3.d);
            printWriter.println("Network Stats");
            printWriter.print("  Download Count: ");
            printWriter.println(vsq3.k);
            printWriter.print("  Total Download Size: ");
            printWriter.println(vsq3.e);
            printWriter.print("  Average Download Size: ");
            printWriter.println(vsq3.h);
            printWriter.println("Bitmap Stats");
            printWriter.print("  Total Bitmaps Decoded: ");
            printWriter.println(vsq3.l);
            printWriter.print("  Total Bitmap Size: ");
            printWriter.println(vsq3.f);
            printWriter.print("  Total Transformed Bitmaps: ");
            printWriter.println(vsq3.m);
            printWriter.print("  Total Transformed Bitmap Size: ");
            printWriter.println(vsq3.g);
            printWriter.print("  Average Bitmap Size: ");
            printWriter.println(vsq3.i);
            printWriter.print("  Average Transformed Bitmap Size: ");
            printWriter.println(vsq3.j);
            printWriter.println("===============END PICASSO STATS ===============");
            printWriter.flush();
            RuntimeException runtimeException = new RuntimeException(stringWriter3.toString(), outOfMemoryError);
            this.m = runtimeException;
            this.t.b(this);
            currentThread = Thread.currentThread();
            str3 = str;
        } catch (Exception e6) {
            this.m = e6;
            this.t.b(this);
        } catch (Throwable th) {
            th = th;
            str3 = str;
            Thread.currentThread().setName(str3);
            throw th;
        }
        currentThread = Thread.currentThread();
        currentThread.setName(str3);
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
            vrs r0 = r1.u
            java.lang.String r3 = r1.c
            android.graphics.Bitmap r0 = r0.a(r3)
            if (r0 == 0) goto L_0x0035
            vsp r2 = r1.v
            r2.a()
            com.squareup.picasso.Picasso$LoadedFrom r2 = com.squareup.picasso.Picasso.LoadedFrom.MEMORY
            r1.l = r2
            com.squareup.picasso.Picasso r2 = r1.b
            boolean r2 = r2.l
            if (r2 == 0) goto L_0x0033
            vsk r2 = r1.d
            java.lang.String r2 = r2.a()
            java.lang.String r3 = "Hunter"
            java.lang.String r4 = "decoded"
            java.lang.String r5 = "from cache"
            defpackage.vsv.a(r3, r4, r2, r5)
        L_0x0033:
            return r0
        L_0x0034:
            r0 = r2
        L_0x0035:
            vsk r3 = r1.d
            int r4 = r1.n
            if (r4 != 0) goto L_0x0040
            com.squareup.picasso.NetworkPolicy r4 = com.squareup.picasso.NetworkPolicy.OFFLINE
            int r4 = r4.index
            goto L_0x0042
        L_0x0040:
            int r4 = r1.f
        L_0x0042:
            r3.c = r4
            vsm r3 = r1.g
            vsk r4 = r1.d
            int r5 = r1.f
            vsm$a r3 = r3.a(r4, r5)
            r4 = 0
            if (r3 == 0) goto L_0x00ba
            com.squareup.picasso.Picasso$LoadedFrom r0 = r3.a
            r1.l = r0
            int r0 = r3.d
            r1.w = r0
            android.graphics.Bitmap r0 = r3.b
            if (r0 != 0) goto L_0x00ba
            java.io.InputStream r3 = r3.c
            vsk r0 = r1.d     // Catch:{ all -> 0x00b5 }
            vsg r5 = new vsg     // Catch:{ all -> 0x00b5 }
            r5.<init>(r3)     // Catch:{ all -> 0x00b5 }
            r6 = 65536(0x10000, float:9.18355E-41)
            long r6 = r5.a(r6)     // Catch:{ all -> 0x00b5 }
            android.graphics.BitmapFactory$Options r8 = defpackage.vsm.c(r0)     // Catch:{ all -> 0x00b5 }
            boolean r9 = defpackage.vsm.a(r8)     // Catch:{ all -> 0x00b5 }
            boolean r10 = defpackage.vsv.c(r5)     // Catch:{ all -> 0x00b5 }
            r5.a(r6)     // Catch:{ all -> 0x00b5 }
            if (r10 == 0) goto L_0x0094
            byte[] r2 = defpackage.vsv.b(r5)     // Catch:{ all -> 0x00b5 }
            if (r9 == 0) goto L_0x008e
            int r5 = r2.length     // Catch:{ all -> 0x00b5 }
            android.graphics.BitmapFactory.decodeByteArray(r2, r4, r5, r8)     // Catch:{ all -> 0x00b5 }
            int r5 = r0.h     // Catch:{ all -> 0x00b5 }
            int r6 = r0.i     // Catch:{ all -> 0x00b5 }
            defpackage.vsm.a(r5, r6, r8, r0)     // Catch:{ all -> 0x00b5 }
        L_0x008e:
            int r0 = r2.length     // Catch:{ all -> 0x00b5 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r2, r4, r0, r8)     // Catch:{ all -> 0x00b5 }
            goto L_0x00a9
        L_0x0094:
            if (r9 == 0) goto L_0x00a3
            android.graphics.BitmapFactory.decodeStream(r5, r2, r8)     // Catch:{ all -> 0x00b5 }
            int r9 = r0.h     // Catch:{ all -> 0x00b5 }
            int r10 = r0.i     // Catch:{ all -> 0x00b5 }
            defpackage.vsm.a(r9, r10, r8, r0)     // Catch:{ all -> 0x00b5 }
            r5.a(r6)     // Catch:{ all -> 0x00b5 }
        L_0x00a3:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r5, r2, r8)     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x00ad
        L_0x00a9:
            defpackage.vsv.a(r3)
            goto L_0x00ba
        L_0x00ad:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "Failed to decode stream."
            r0.<init>(r2)     // Catch:{ all -> 0x00b5 }
            throw r0     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r0 = move-exception
            defpackage.vsv.a(r3)
            throw r0
        L_0x00ba:
            if (r0 == 0) goto L_0x0217
            com.squareup.picasso.Picasso r2 = r1.b
            boolean r2 = r2.l
            if (r2 == 0) goto L_0x00cf
            vsk r2 = r1.d
            java.lang.String r2 = r2.a()
            java.lang.String r3 = "Hunter"
            java.lang.String r5 = "decoded"
            defpackage.vsv.a(r3, r5, r2)
        L_0x00cf:
            vsp r2 = r1.v
            r3 = 2
            r2.a(r0, r3)
            vsk r2 = r1.d
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
            vsk r5 = r1.d     // Catch:{ all -> 0x0214 }
            boolean r5 = r5.d()     // Catch:{ all -> 0x0214 }
            if (r5 != 0) goto L_0x00fc
            int r5 = r1.w     // Catch:{ all -> 0x0214 }
            if (r5 == 0) goto L_0x01e5
        L_0x00fc:
            vsk r5 = r1.d     // Catch:{ all -> 0x0214 }
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
            vsk r5 = r1.d     // Catch:{ all -> 0x0214 }
            java.lang.String r5 = r5.a()     // Catch:{ all -> 0x0214 }
            defpackage.vsv.a(r3, r4, r5)     // Catch:{ all -> 0x0214 }
        L_0x01e5:
            vsk r3 = r1.d     // Catch:{ all -> 0x0214 }
            boolean r3 = r3.e()     // Catch:{ all -> 0x0214 }
            if (r3 == 0) goto L_0x020a
            vsk r3 = r1.d     // Catch:{ all -> 0x0214 }
            java.util.List<vst> r3 = r3.g     // Catch:{ all -> 0x0214 }
            android.graphics.Bitmap r0 = a(r3, r0)     // Catch:{ all -> 0x0214 }
            com.squareup.picasso.Picasso r3 = r1.b     // Catch:{ all -> 0x0214 }
            boolean r3 = r3.l     // Catch:{ all -> 0x0214 }
            if (r3 == 0) goto L_0x020a
            java.lang.String r3 = "Hunter"
            java.lang.String r4 = "transformed"
            vsk r5 = r1.d     // Catch:{ all -> 0x0214 }
            java.lang.String r5 = r5.a()     // Catch:{ all -> 0x0214 }
            java.lang.String r6 = "from custom transformations"
            defpackage.vsv.a(r3, r4, r5, r6)     // Catch:{ all -> 0x0214 }
        L_0x020a:
            monitor-exit(r2)     // Catch:{ all -> 0x0214 }
            if (r0 == 0) goto L_0x0217
            vsp r2 = r1.v
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vrr.a():android.graphics.Bitmap");
    }

    /* access modifiers changed from: 0000 */
    public final void a(vrp vrp) {
        boolean z = this.b.l;
        vsk vsk = vrp.b;
        String str = "to ";
        String str2 = "joined";
        String str3 = "Hunter";
        if (this.h == null) {
            this.h = vrp;
            if (z) {
                List<vrp> list = this.i;
                if (list == null || list.isEmpty()) {
                    vsv.a(str3, str2, vsk.a(), "to empty hunter");
                } else {
                    vsv.a(str3, str2, vsk.a(), vsv.a(this, str));
                }
            }
            return;
        }
        if (this.i == null) {
            this.i = new ArrayList(3);
        }
        this.i.add(vrp);
        if (z) {
            vsv.a(str3, str2, vsk.a(), vsv.a(this, str));
        }
        Priority priority = vrp.b.r;
        if (priority.ordinal() > this.o.ordinal()) {
            this.o = priority;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(vrp vrp) {
        boolean z;
        boolean z2 = true;
        if (this.h == vrp) {
            this.h = null;
            z = true;
        } else {
            List<vrp> list = this.i;
            if (list != null) {
                z = list.remove(vrp);
            } else {
                z = false;
            }
        }
        if (z && vrp.b.r == this.o) {
            Priority priority = Priority.LOW;
            List<vrp> list2 = this.i;
            boolean z3 = list2 != null && !list2.isEmpty();
            if (this.h == null && !z3) {
                z2 = false;
            }
            if (z2) {
                vrp vrp2 = this.h;
                if (vrp2 != null) {
                    priority = vrp2.b.r;
                }
                if (z3) {
                    int size = this.i.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Priority priority2 = ((vrp) this.i.get(i2)).b.r;
                        if (priority2.ordinal() > priority.ordinal()) {
                            priority = priority2;
                        }
                    }
                }
            }
            this.o = priority;
        }
        if (this.b.l) {
            vsv.a("Hunter", "removed", vrp.b.a(), vsv.a(this, "from "));
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        if (this.h == null) {
            List<vrp> list = this.i;
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

    private static Bitmap a(List<vst> list, Bitmap bitmap) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            final vst vst = (vst) list.get(i2);
            try {
                Bitmap a2 = vst.a(bitmap);
                if (a2 == null) {
                    final StringBuilder sb = new StringBuilder("Transformation ");
                    sb.append(vst.a());
                    sb.append(" returned null after ");
                    sb.append(i2);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (vst a3 : list) {
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
                            sb.append(vst.a());
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
                            sb.append(vst.a());
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
                        sb.append(vst.a());
                        sb.append(" crashed with exception.");
                        throw new RuntimeException(sb.toString(), e2);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    static vrr a(Picasso picasso, vrx vrx, vrs vrs, vsp vsp, vrp vrp) {
        vsk vsk = vrp.b;
        List<vsm> list = picasso.c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            vsm vsm = (vsm) list.get(i2);
            if (vsm.a(vsk)) {
                vrr vrr = new vrr(picasso, vrx, vrs, vsp, vrp, vsm);
                return vrr;
            }
        }
        vrr vrr2 = new vrr(picasso, vrx, vrs, vsp, vrp, s);
        return vrr2;
    }
}
