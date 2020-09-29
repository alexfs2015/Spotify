package defpackage;

import java.io.Closeable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;

/* renamed from: xbv reason: default package */
final class xbv implements Closeable {
    static final Logger a = Logger.getLogger(xbs.class.getName());
    final xcs b;
    final boolean c;
    private final a d = new a(this.b);
    private a e = new a(4096, this.d);

    /* renamed from: xbv$a */
    static final class a implements xdg {
        int a;
        byte b;
        int c;
        int d;
        short e;
        private final xcs f;

        a(xcs xcs) {
            this.f = xcs;
        }

        public final long a(xcq xcq, long j) {
            int i;
            do {
                int i2 = this.d;
                if (i2 == 0) {
                    this.f.i((long) this.e);
                    this.e = 0;
                    if ((this.b & 4) != 0) {
                        return -1;
                    }
                    i = this.c;
                    int a2 = xbv.a(this.f);
                    this.d = a2;
                    this.a = a2;
                    byte f2 = (byte) this.f.f();
                    this.b = (byte) this.f.f();
                    if (xbv.a.isLoggable(Level.FINE)) {
                        xbv.a.fine(xbs.a(true, this.c, this.a, f2, this.b));
                    }
                    this.c = this.f.h() & Integer.MAX_VALUE;
                    if (f2 != 9) {
                        throw xbs.b("%s != TYPE_CONTINUATION", Byte.valueOf(f2));
                    }
                } else {
                    long a3 = this.f.a(xcq, Math.min(j, (long) i2));
                    if (a3 == -1) {
                        return -1;
                    }
                    this.d = (int) (((long) this.d) - a3);
                    return a3;
                }
            } while (this.c == i);
            throw xbs.b("TYPE_CONTINUATION streamId changed", new Object[0]);
        }

        public final xdh a() {
            return this.f.a();
        }

        public final void close() {
        }
    }

    /* renamed from: xbv$b */
    interface b {
        void a(int i, long j);

        void a(int i, List<xbq> list);

        void a(int i, ErrorCode errorCode);

        void a(int i, ByteString byteString);

        void a(boolean z, int i, int i2);

        void a(boolean z, int i, List<xbq> list);

        void a(boolean z, int i, xcs xcs, int i2);

        void a(boolean z, xca xca);
    }

    xbv(xcs xcs, boolean z) {
        this.b = xcs;
        this.c = z;
    }

    private static int a(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw xbs.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    static int a(xcs xcs) {
        return (xcs.f() & 255) | ((xcs.f() & 255) << 16) | ((xcs.f() & 255) << 8);
    }

    private List<xbq> a(int i, short s, byte b2, int i2) {
        a aVar = this.d;
        aVar.d = i;
        aVar.a = i;
        aVar.e = s;
        aVar.b = b2;
        aVar.c = i2;
        this.e.a();
        return this.e.b();
    }

    private void a(b bVar, int i) {
        this.b.h();
        this.b.f();
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [short, int] */
    /* JADX WARNING: type inference failed for: r0v6, types: [short] */
    /* JADX WARNING: type inference failed for: r0v7, types: [short] */
    /* JADX WARNING: type inference failed for: r0v11, types: [short] */
    /* JADX WARNING: type inference failed for: r0v12, types: [short] */
    /* JADX WARNING: type inference failed for: r0v16, types: [short] */
    /* JADX WARNING: type inference failed for: r0v17, types: [boolean] */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v24
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], short, ?[boolean, int, float, short, byte, char]]
      uses: [short, int, boolean]
      mth insns count: 281
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(boolean r11, defpackage.xbv.b r12) {
        /*
            r10 = this;
            r0 = 0
            xcs r1 = r10.b     // Catch:{ IOException -> 0x02ba }
            r2 = 9
            r1.a(r2)     // Catch:{ IOException -> 0x02ba }
            xcs r1 = r10.b
            int r1 = a(r1)
            r2 = 1
            if (r1 < 0) goto L_0x02ab
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r1 > r3) goto L_0x02ab
            xcs r4 = r10.b
            byte r4 = r4.f()
            byte r4 = (byte) r4
            r5 = 4
            if (r11 == 0) goto L_0x0031
            if (r4 != r5) goto L_0x0022
            goto L_0x0031
        L_0x0022:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Byte r12 = java.lang.Byte.valueOf(r4)
            r11[r0] = r12
            java.lang.String r12 = "Expected a SETTINGS frame but was %s"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x0031:
            xcs r11 = r10.b
            byte r11 = r11.f()
            byte r11 = (byte) r11
            xcs r6 = r10.b
            int r6 = r6.h()
            r7 = 2147483647(0x7fffffff, float:NaN)
            r6 = r6 & r7
            java.util.logging.Logger r8 = a
            java.util.logging.Level r9 = java.util.logging.Level.FINE
            boolean r8 = r8.isLoggable(r9)
            if (r8 == 0) goto L_0x0055
            java.util.logging.Logger r8 = a
            java.lang.String r9 = defpackage.xbs.a(r2, r6, r1, r4, r11)
            r8.fine(r9)
        L_0x0055:
            r8 = 5
            r9 = 8
            switch(r4) {
                case 0: goto L_0x0269;
                case 1: goto L_0x0235;
                case 2: goto L_0x0214;
                case 3: goto L_0x01d8;
                case 4: goto L_0x0146;
                case 5: goto L_0x0118;
                case 6: goto L_0x00e7;
                case 7: goto L_0x0099;
                case 8: goto L_0x0063;
                default: goto L_0x005b;
            }
        L_0x005b:
            xcs r11 = r10.b
            long r0 = (long) r1
            r11.i(r0)
            goto L_0x02aa
        L_0x0063:
            if (r1 != r5) goto L_0x008a
            xcs r11 = r10.b
            int r11 = r11.h()
            long r3 = (long) r11
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r3 = r3 & r7
            r7 = 0
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x007b
            r12.a(r6, r3)
            goto L_0x02aa
        L_0x007b:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            r11[r0] = r12
            java.lang.String r12 = "windowSizeIncrement was 0"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x008a:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_WINDOW_UPDATE length !=4: %s"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x0099:
            if (r1 < r9) goto L_0x00d8
            if (r6 != 0) goto L_0x00cf
            xcs r11 = r10.b
            int r11 = r11.h()
            xcs r3 = r10.b
            int r3 = r3.h()
            int r1 = r1 - r9
            okhttp3.internal.http2.ErrorCode r4 = okhttp3.internal.http2.ErrorCode.a(r3)
            if (r4 == 0) goto L_0x00c0
            okio.ByteString r0 = okio.ByteString.a
            if (r1 <= 0) goto L_0x00bb
            xcs r0 = r10.b
            long r3 = (long) r1
            okio.ByteString r0 = r0.d(r3)
        L_0x00bb:
            r12.a(r11, r0)
            goto L_0x02aa
        L_0x00c0:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_GOAWAY unexpected error code: %d"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x00cf:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "TYPE_GOAWAY streamId != 0"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x00d8:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_GOAWAY length < 8: %s"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x00e7:
            if (r1 != r9) goto L_0x0109
            if (r6 != 0) goto L_0x0100
            xcs r1 = r10.b
            int r1 = r1.h()
            xcs r3 = r10.b
            int r3 = r3.h()
            r11 = r11 & r2
            if (r11 == 0) goto L_0x00fb
            r0 = 1
        L_0x00fb:
            r12.a(r0, r1, r3)
            goto L_0x02aa
        L_0x0100:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "TYPE_PING streamId != 0"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x0109:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_PING length != 8: %s"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x0118:
            if (r6 == 0) goto L_0x013d
            r3 = r11 & 8
            if (r3 == 0) goto L_0x0127
            xcs r0 = r10.b
            byte r0 = r0.f()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x0127:
            xcs r3 = r10.b
            int r3 = r3.h()
            r3 = r3 & r7
            int r1 = r1 + -4
            int r1 = a(r1, r11, r0)
            java.util.List r11 = r10.a(r1, r0, r11, r6)
            r12.a(r3, r11)
            goto L_0x02aa
        L_0x013d:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x0146:
            if (r6 != 0) goto L_0x01cf
            r11 = r11 & r2
            if (r11 == 0) goto L_0x0158
            if (r1 != 0) goto L_0x014f
            goto L_0x02aa
        L_0x014f:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "FRAME_SIZE_ERROR ack frame should be empty!"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x0158:
            int r11 = r1 % 6
            if (r11 != 0) goto L_0x01c0
            xca r11 = new xca
            r11.<init>()
            r4 = 0
        L_0x0162:
            if (r4 >= r1) goto L_0x01bb
            xcs r6 = r10.b
            short r6 = r6.g()
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            xcs r7 = r10.b
            int r7 = r7.h()
            if (r6 == r2) goto L_0x01b5
            r9 = 2
            if (r6 == r9) goto L_0x01a7
            r9 = 3
            if (r6 == r9) goto L_0x01a5
            if (r6 == r5) goto L_0x0198
            if (r6 == r8) goto L_0x0181
            goto L_0x01b5
        L_0x0181:
            if (r7 < r3) goto L_0x0189
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            if (r7 > r9) goto L_0x0189
            goto L_0x01b5
        L_0x0189:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r11[r0] = r12
            java.lang.String r12 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x0198:
            r6 = 7
            if (r7 < 0) goto L_0x019c
            goto L_0x01b5
        L_0x019c:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x01a5:
            r6 = 4
            goto L_0x01b5
        L_0x01a7:
            if (r7 == 0) goto L_0x01b5
            if (r7 != r2) goto L_0x01ac
            goto L_0x01b5
        L_0x01ac:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x01b5:
            r11.a(r6, r7)
            int r4 = r4 + 6
            goto L_0x0162
        L_0x01bb:
            r12.a(r0, r11)
            goto L_0x02aa
        L_0x01c0:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_SETTINGS length %% 6 != 0: %s"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x01cf:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "TYPE_SETTINGS streamId != 0"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x01d8:
            if (r1 != r5) goto L_0x0205
            if (r6 == 0) goto L_0x01fc
            xcs r11 = r10.b
            int r11 = r11.h()
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.a(r11)
            if (r1 == 0) goto L_0x01ed
            r12.a(r6, r1)
            goto L_0x02aa
        L_0x01ed:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12[r0] = r11
            java.lang.String r11 = "TYPE_RST_STREAM unexpected error code: %d"
            java.io.IOException r11 = defpackage.xbs.b(r11, r12)
            throw r11
        L_0x01fc:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "TYPE_RST_STREAM streamId == 0"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x0205:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_RST_STREAM length: %d != 4"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x0214:
            if (r1 != r8) goto L_0x0226
            if (r6 == 0) goto L_0x021d
            r10.a(r12, r6)
            goto L_0x02aa
        L_0x021d:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "TYPE_PRIORITY streamId == 0"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x0226:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_PRIORITY length: %d != 5"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x0235:
            if (r6 == 0) goto L_0x0260
            r3 = r11 & 1
            if (r3 == 0) goto L_0x023d
            r3 = 1
            goto L_0x023e
        L_0x023d:
            r3 = 0
        L_0x023e:
            r4 = r11 & 8
            if (r4 == 0) goto L_0x024b
            xcs r0 = r10.b
            byte r0 = r0.f()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x024b:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x0254
            r10.a(r12, r6)
            int r1 = r1 + -5
        L_0x0254:
            int r1 = a(r1, r11, r0)
            java.util.List r11 = r10.a(r1, r0, r11, r6)
            r12.a(r3, r6, r11)
            goto L_0x02aa
        L_0x0260:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x0269:
            if (r6 == 0) goto L_0x02a1
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0271
            r3 = 1
            goto L_0x0272
        L_0x0271:
            r3 = 0
        L_0x0272:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x0278
            r4 = 1
            goto L_0x0279
        L_0x0278:
            r4 = 0
        L_0x0279:
            if (r4 != 0) goto L_0x0298
            r4 = r11 & 8
            if (r4 == 0) goto L_0x0288
            xcs r0 = r10.b
            byte r0 = r0.f()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x0288:
            int r11 = a(r1, r11, r0)
            xcs r1 = r10.b
            r12.a(r3, r6, r1, r11)
            xcs r11 = r10.b
            long r0 = (long) r0
            r11.i(r0)
            goto L_0x02aa
        L_0x0298:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x02a1:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x02aa:
            return r2
        L_0x02ab:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "FRAME_SIZE_ERROR: %s"
            java.io.IOException r11 = defpackage.xbs.b(r12, r11)
            throw r11
        L_0x02ba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbv.a(boolean, xbv$b):boolean");
    }

    public final void close() {
        this.b.close();
    }
}
