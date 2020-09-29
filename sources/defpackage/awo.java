package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: awo reason: default package */
public final class awo implements awb {
    public static final int a = bdw.g("ID3");
    private final a b;

    /* renamed from: awo$a */
    public interface a {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: awo$b */
    static final class b {
        final int a;
        final boolean b;
        final int c;

        public b(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    private static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static int b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    static {
        $$Lambda$awo$Kq0VOA0T5FbQY8MWrej_Gnz0QU r0 = $$Lambda$awo$Kq0VOA0T5FbQY8MWrej_Gnz0QU.INSTANCE;
    }

    public awo() {
        this(null);
    }

    public awo(a aVar) {
        this.b = aVar;
    }

    public final awa a(awd awd) {
        ByteBuffer byteBuffer = awd.c;
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    public final awa a(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        bdj bdj = new bdj(bArr, i);
        b a2 = a(bdj);
        if (a2 == null) {
            return null;
        }
        int i2 = bdj.b;
        int i3 = a2.a == 2 ? 6 : 10;
        int i4 = a2.c;
        if (a2.b) {
            i4 = a(bdj, a2.c);
        }
        bdj.b(i2 + i4);
        boolean z = false;
        if (!a(bdj, a2.a, i3, false)) {
            if (a2.a != 4 || !a(bdj, 4, i3, true)) {
                StringBuilder sb = new StringBuilder("Failed to validate ID3 tag with majorVersion=");
                sb.append(a2.a);
                bdd.c("Id3Decoder", sb.toString());
                return null;
            }
            z = true;
        }
        while (bdj.b() >= i3) {
            awp a3 = a(a2.a, bdj, z, i3, this.b);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return new awa((List<? extends defpackage.awa.a>) arrayList);
    }

    private static b a(bdj bdj) {
        String str = "Id3Decoder";
        if (bdj.b() < 10) {
            bdd.c(str, "Data too short to be an ID3 tag");
            return null;
        }
        int f = bdj.f();
        if (f != a) {
            StringBuilder sb = new StringBuilder("Unexpected first three bytes of ID3 tag header: ");
            sb.append(f);
            bdd.c(str, sb.toString());
            return null;
        }
        int c = bdj.c();
        boolean z = true;
        bdj.d(1);
        int c2 = bdj.c();
        int m = bdj.m();
        if (c == 2) {
            if ((c2 & 64) != 0) {
                bdd.c(str, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (c == 3) {
            if ((c2 & 64) != 0) {
                int i = bdj.i();
                bdj.d(i);
                m -= i + 4;
            }
        } else if (c == 4) {
            if ((c2 & 64) != 0) {
                int m2 = bdj.m();
                bdj.d(m2 - 4);
                m -= m2;
            }
            if ((c2 & 16) != 0) {
                m -= 10;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Skipped ID3 tag with unsupported majorVersion=");
            sb2.append(c);
            bdd.c(str, sb2.toString());
            return null;
        }
        if (c >= 4 || (c2 & 128) == 0) {
            z = false;
        }
        return new b(c, z, m);
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v1, types: [awp] */
    /* JADX WARNING: type inference failed for: r5v2, types: [awp] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v6, types: [awj] */
    /* JADX WARNING: type inference failed for: r5v8, types: [awl] */
    /* JADX WARNING: type inference failed for: r5v10, types: [awk] */
    /* JADX WARNING: type inference failed for: r2v16, types: [awm] */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v15, types: [awi] */
    /* JADX WARNING: type inference failed for: r5v17, types: [awn] */
    /* JADX WARNING: type inference failed for: r2v23, types: [awr] */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r2v26, types: [awt] */
    /* JADX WARNING: type inference failed for: r5v22, types: [awt] */
    /* JADX WARNING: type inference failed for: r5v24, types: [aws] */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: type inference failed for: r5v28, types: [aws] */
    /* JADX WARNING: type inference failed for: r14v13 */
    /* JADX WARNING: type inference failed for: r14v14 */
    /* JADX WARNING: type inference failed for: r5v36 */
    /* JADX WARNING: type inference failed for: r5v37 */
    /* JADX WARNING: type inference failed for: r5v38 */
    /* JADX WARNING: type inference failed for: r5v39 */
    /* JADX WARNING: type inference failed for: r5v40 */
    /* JADX WARNING: type inference failed for: r5v41 */
    /* JADX WARNING: type inference failed for: r5v42 */
    /* JADX WARNING: type inference failed for: r2v49 */
    /* JADX WARNING: type inference failed for: r2v50 */
    /* JADX WARNING: type inference failed for: r5v43 */
    /* JADX WARNING: type inference failed for: r5v44 */
    /* JADX WARNING: type inference failed for: r5v45 */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0262, code lost:
        if (r13 == 67) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x039a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x039b, code lost:
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x039e, code lost:
        r1 = r16;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v3
      assigns: []
      uses: []
      mth insns count: 383
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
    /* JADX WARNING: Removed duplicated region for block: B:183:0x037a A[Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x039a A[ExcHandler: all (th java.lang.Throwable), PHI: r18 
      PHI: (r18v1 int) = (r18v2 int), (r18v2 int), (r18v5 int) binds: [B:185:0x0396, B:186:?, B:153:0x02d1] A[DONT_GENERATE, DONT_INLINE], Splitter:B:153:0x02d1] */
    /* JADX WARNING: Unknown variable types count: 17 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.awp a(int r19, defpackage.bdj r20, boolean r21, int r22, defpackage.awo.a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.c()
            int r9 = r20.c()
            int r10 = r20.c()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.c()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003a
            int r1 = r20.n()
            if (r21 != 0) goto L_0x0038
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >>> 24
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x0038:
            r15 = r1
            goto L_0x0046
        L_0x003a:
            if (r0 != r11) goto L_0x0041
            int r1 = r20.n()
            goto L_0x0038
        L_0x0041:
            int r1 = r20.f()
            goto L_0x0038
        L_0x0046:
            if (r0 < r11) goto L_0x004e
            int r1 = r20.d()
            r6 = r1
            goto L_0x004f
        L_0x004e:
            r6 = 0
        L_0x004f:
            r5 = 0
            if (r8 != 0) goto L_0x0062
            if (r9 != 0) goto L_0x0062
            if (r10 != 0) goto L_0x0062
            if (r13 != 0) goto L_0x0062
            if (r15 != 0) goto L_0x0062
            if (r6 != 0) goto L_0x0062
            int r0 = r7.c
            r7.c(r0)
            return r5
        L_0x0062:
            int r1 = r7.b
            int r4 = r1 + r15
            int r1 = r7.c
            java.lang.String r3 = "Id3Decoder"
            if (r4 <= r1) goto L_0x0077
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            defpackage.bdd.c(r3, r0)
            int r0 = r7.c
            r7.c(r0)
            return r5
        L_0x0077:
            if (r23 == 0) goto L_0x0091
            r1 = r23
            r2 = r19
            r16 = r3
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r17 = r6
            r6 = r13
            boolean r1 = r1.evaluate(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x0097
            r7.c(r12)
            return r14
        L_0x0091:
            r16 = r3
            r12 = r4
            r14 = r5
            r17 = r6
        L_0x0097:
            r1 = 1
            if (r0 != r11) goto L_0x00b5
            r2 = r17
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a2
            r3 = 1
            goto L_0x00a3
        L_0x00a2:
            r3 = 0
        L_0x00a3:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00a9
            r4 = 1
            goto L_0x00aa
        L_0x00a9:
            r4 = 0
        L_0x00aa:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b0
            r2 = 1
            goto L_0x00b1
        L_0x00b0:
            r2 = 0
        L_0x00b1:
            r5 = r4
            r6 = 0
            r4 = r3
            goto L_0x00e4
        L_0x00b5:
            r2 = r17
            r3 = 4
            if (r0 != r3) goto L_0x00df
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00c0
            r3 = 1
            goto L_0x00c1
        L_0x00c0:
            r3 = 0
        L_0x00c1:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00c7
            r4 = 1
            goto L_0x00c8
        L_0x00c7:
            r4 = 0
        L_0x00c8:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00ce
            r5 = 1
            goto L_0x00cf
        L_0x00ce:
            r5 = 0
        L_0x00cf:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00d5
            r6 = 1
            goto L_0x00d6
        L_0x00d5:
            r6 = 0
        L_0x00d6:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00dc
            r2 = r3
            r3 = 1
            goto L_0x00e4
        L_0x00dc:
            r2 = r3
            r3 = 0
            goto L_0x00e4
        L_0x00df:
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x00e4:
            if (r4 != 0) goto L_0x03b8
            if (r5 == 0) goto L_0x00ea
            goto L_0x03b8
        L_0x00ea:
            if (r2 == 0) goto L_0x00f1
            int r15 = r15 + -1
            r7.d(r1)
        L_0x00f1:
            if (r3 == 0) goto L_0x00f9
            int r15 = r15 + -4
            r2 = 4
            r7.d(r2)
        L_0x00f9:
            if (r6 == 0) goto L_0x0100
            int r2 = a(r7, r15)
            r15 = r2
        L_0x0100:
            r2 = 84
            r3 = 88
            r4 = 2
            if (r8 != r2) goto L_0x0141
            if (r9 != r3) goto L_0x0141
            if (r10 != r3) goto L_0x0141
            if (r0 == r4) goto L_0x010f
            if (r13 != r3) goto L_0x0141
        L_0x010f:
            if (r15 > 0) goto L_0x0113
        L_0x0111:
            r5 = r14
            goto L_0x0168
        L_0x0113:
            int r1 = r20.c()     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r2 = a(r1)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r3 = r15 + -1
            byte[] r4 = new byte[r3]     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r5 = 0
            r7.a(r4, r5, r3)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r3 = a(r4, r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r6 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r6.<init>(r4, r5, r3, r2)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r5 = b(r1)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r3 = r3 + r5
            int r1 = a(r4, r3, r1)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r1 = a(r4, r3, r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            aws r5 = new aws     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r2 = "TXXX"
            r5.<init>(r2, r6, r1)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            goto L_0x0168
        L_0x0141:
            if (r8 != r2) goto L_0x0175
            java.lang.String r1 = a(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            if (r15 > 0) goto L_0x014a
            goto L_0x0111
        L_0x014a:
            int r2 = r20.c()     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r3 = a(r2)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r4 = r15 + -1
            byte[] r5 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r6 = 0
            r7.a(r5, r6, r4)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r2 = a(r5, r6, r2)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r4 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r4.<init>(r5, r6, r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            aws r5 = new aws     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r5.<init>(r1, r14, r4)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
        L_0x0168:
            r18 = r12
            goto L_0x0378
        L_0x016c:
            r0 = move-exception
            r2 = r12
            goto L_0x03b4
        L_0x0170:
            r2 = r12
            r1 = r16
            goto L_0x03a9
        L_0x0175:
            r5 = 87
            java.lang.String r6 = "ISO-8859-1"
            if (r8 != r5) goto L_0x01b4
            if (r9 != r3) goto L_0x01b4
            if (r10 != r3) goto L_0x01b4
            if (r0 == r4) goto L_0x0183
            if (r13 != r3) goto L_0x01b4
        L_0x0183:
            if (r15 > 0) goto L_0x0186
            goto L_0x0111
        L_0x0186:
            int r1 = r20.c()     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r2 = a(r1)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r3 = r15 + -1
            byte[] r4 = new byte[r3]     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r5 = 0
            r7.a(r4, r5, r3)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r3 = a(r4, r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r11.<init>(r4, r5, r3, r2)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r1 = b(r1)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r3 = r3 + r1
            int r1 = b(r4, r3)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r1 = a(r4, r3, r1, r6)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            awt r5 = new awt     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r2 = "WXXX"
            r5.<init>(r2, r11, r1)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            goto L_0x0168
        L_0x01b4:
            r3 = 87
            if (r8 != r3) goto L_0x01d2
            java.lang.String r1 = a(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            byte[] r2 = new byte[r15]     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r3 = 0
            r7.a(r2, r3, r15)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r4 = b(r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r5.<init>(r2, r3, r4, r6)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            awt r2 = new awt     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r2.<init>(r1, r14, r5)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
        L_0x01d0:
            r5 = r2
            goto L_0x0168
        L_0x01d2:
            r3 = 73
            r5 = 80
            if (r8 != r5) goto L_0x01fd
            r14 = 82
            if (r9 != r14) goto L_0x01fd
            if (r10 != r3) goto L_0x01fd
            r14 = 86
            if (r13 != r14) goto L_0x01fd
            byte[] r2 = new byte[r15]     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r3 = 0
            r7.a(r2, r3, r15)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r4 = b(r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r5.<init>(r2, r3, r4, r6)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r4 = r4 + r1
            int r1 = r2.length     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            byte[] r1 = b(r2, r4, r1)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            awr r2 = new awr     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r2.<init>(r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            goto L_0x01d0
        L_0x01fd:
            r14 = 71
            r2 = 79
            if (r8 != r14) goto L_0x024f
            r14 = 69
            if (r9 != r14) goto L_0x024f
            if (r10 != r2) goto L_0x024f
            r14 = 66
            if (r13 == r14) goto L_0x020f
            if (r0 != r4) goto L_0x024f
        L_0x020f:
            int r2 = r20.c()     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r3 = a(r2)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r4 = r15 + -1
            byte[] r5 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r11 = 0
            r7.a(r5, r11, r4)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r4 = b(r5, r11)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r14 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r14.<init>(r5, r11, r4, r6)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r4 = r4 + r1
            int r1 = a(r5, r4, r2)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r4 = a(r5, r4, r1, r3)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r6 = b(r2)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r1 = r1 + r6
            int r6 = a(r5, r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r1 = a(r5, r1, r6, r3)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r2 = b(r2)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r6 = r6 + r2
            int r2 = r5.length     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            byte[] r2 = b(r5, r6, r2)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            awn r5 = new awn     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r5.<init>(r14, r4, r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            goto L_0x0168
        L_0x024f:
            r1 = 67
            if (r0 != r4) goto L_0x025a
            if (r8 != r5) goto L_0x02e5
            if (r9 != r3) goto L_0x02e5
            if (r10 != r1) goto L_0x02e5
            goto L_0x0264
        L_0x025a:
            r14 = 65
            if (r8 != r14) goto L_0x02e5
            if (r9 != r5) goto L_0x02e5
            if (r10 != r3) goto L_0x02e5
            if (r13 != r1) goto L_0x02e5
        L_0x0264:
            int r1 = r20.c()     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r2 = a(r1)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            int r3 = r15 + -1
            byte[] r5 = new byte[r3]     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r14 = 0
            r7.a(r5, r14, r3)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            if (r0 != r4) goto L_0x029a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r14 = "image/"
            r3.<init>(r14)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r14 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r4 = 0
            r14.<init>(r5, r4, r11, r6)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r4 = defpackage.bdw.d(r14)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r3.append(r4)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r3 = r3.toString()     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r4 = "image/jpg"
            boolean r4 = r4.equals(r3)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            if (r4 == 0) goto L_0x0298
            java.lang.String r3 = "image/jpeg"
        L_0x0298:
            r4 = 2
            goto L_0x02bf
        L_0x029a:
            r3 = 0
            int r4 = b(r5, r3)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r11.<init>(r5, r3, r4, r6)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r3 = defpackage.bdw.d(r11)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r6 = 47
            int r6 = r3.indexOf(r6)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r11 = -1
            if (r6 != r11) goto L_0x02bf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r11 = "image/"
            r6.<init>(r11)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r6.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r3 = r6.toString()     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
        L_0x02bf:
            int r6 = r4 + 1
            byte r6 = r5[r6]     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r6 = r6 & 255(0xff, float:3.57E-43)
            r11 = 2
            int r4 = r4 + r11
            int r11 = a(r5, r4, r1)     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            java.lang.String r14 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170, all -> 0x016c }
            r18 = r12
            int r12 = r11 - r4
            r14.<init>(r5, r4, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            int r1 = b(r1)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            int r11 = r11 + r1
            int r1 = r5.length     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            byte[] r1 = b(r5, r11, r1)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            awi r5 = new awi     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            r5.<init>(r3, r14, r6, r1)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            goto L_0x0378
        L_0x02e5:
            r18 = r12
            if (r8 != r1) goto L_0x0333
            if (r9 != r2) goto L_0x0333
            r3 = 77
            if (r10 != r3) goto L_0x0333
            r3 = 77
            if (r13 == r3) goto L_0x02f6
            r3 = 2
            if (r0 != r3) goto L_0x0333
        L_0x02f6:
            r1 = 4
            if (r15 >= r1) goto L_0x02fc
            r5 = 0
            goto L_0x0378
        L_0x02fc:
            int r1 = r20.c()     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            java.lang.String r2 = a(r1)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            byte[] r3 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            r4 = 0
            r7.a(r3, r4, r11)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            r5.<init>(r3, r4, r11)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            int r3 = r15 + -4
            byte[] r6 = new byte[r3]     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            r7.a(r6, r4, r3)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            int r3 = a(r6, r4, r1)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            r11.<init>(r6, r4, r3, r2)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            int r4 = b(r1)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            int r3 = r3 + r4
            int r1 = a(r6, r3, r1)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            java.lang.String r1 = a(r6, r3, r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            awm r2 = new awm     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            r2.<init>(r5, r11, r1)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            r5 = r2
            goto L_0x0378
        L_0x0333:
            if (r8 != r1) goto L_0x034f
            r3 = 72
            if (r9 != r3) goto L_0x034f
            r3 = 65
            if (r10 != r3) goto L_0x034f
            if (r13 != r5) goto L_0x034f
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            awk r5 = a(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            goto L_0x0378
        L_0x034f:
            if (r8 != r1) goto L_0x0369
            r3 = 84
            if (r9 != r3) goto L_0x0369
            if (r10 != r2) goto L_0x0369
            if (r13 != r1) goto L_0x0369
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            awl r5 = b(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            goto L_0x0378
        L_0x0369:
            java.lang.String r1 = a(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            byte[] r2 = new byte[r15]     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            r3 = 0
            r7.a(r2, r3, r15)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            awj r5 = new awj     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            r5.<init>(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
        L_0x0378:
            if (r5 != 0) goto L_0x03a3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            java.lang.String r2 = "Failed to decode frame: id="
            r1.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            java.lang.String r0 = a(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            java.lang.String r0 = ", frameSize="
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            r1.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x039e, all -> 0x039a }
            r1 = r16
            defpackage.bdd.c(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x03a0, all -> 0x039a }
            goto L_0x03a3
        L_0x039a:
            r0 = move-exception
            r2 = r18
            goto L_0x03b4
        L_0x039e:
            r1 = r16
        L_0x03a0:
            r2 = r18
            goto L_0x03a9
        L_0x03a3:
            r2 = r18
            r7.c(r2)
            return r5
        L_0x03a9:
            java.lang.String r0 = "Unsupported character encoding"
            defpackage.bdd.c(r1, r0)     // Catch:{ all -> 0x03b3 }
            r7.c(r2)
            r0 = 0
            return r0
        L_0x03b3:
            r0 = move-exception
        L_0x03b4:
            r7.c(r2)
            throw r0
        L_0x03b8:
            r2 = r12
            r0 = r14
            r1 = r16
            java.lang.String r3 = "Skipping unsupported compressed or encrypted frame"
            defpackage.bdd.c(r1, r3)
            r7.c(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awo.a(int, bdj, boolean, int, awo$a):awp");
    }

    private static int a(bdj bdj, int i) {
        byte[] bArr = bdj.a;
        int i2 = bdj.b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= i) {
                return i;
            }
            if ((bArr[i2] & 255) == 255 && bArr[i3] == 0) {
                System.arraycopy(bArr, i2 + 2, bArr, i3, (i - i2) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static String a(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    private static int a(byte[] bArr, int i, int i2) {
        int b2 = b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return b2;
        }
        while (b2 < bArr.length - 1) {
            if (b2 % 2 == 0 && bArr[b2 + 1] == 0) {
                return b2;
            }
            b2 = b(bArr, b2 + 1);
        }
        return bArr.length;
    }

    private static int b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    private static byte[] b(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return bdw.f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    private static String a(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if ((r10 & 1) != 0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        if ((r10 & 128) != 0) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0099 A[SYNTHETIC, Splitter:B:49:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0095 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(defpackage.bdj r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L_0x0006:
            int r3 = r18.b()     // Catch:{ all -> 0x00b0 }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0020
            int r7 = r18.i()     // Catch:{ all -> 0x00b0 }
            long r8 = r18.g()     // Catch:{ all -> 0x00b0 }
            int r10 = r18.d()     // Catch:{ all -> 0x00b0 }
            goto L_0x002a
        L_0x0020:
            int r7 = r18.f()     // Catch:{ all -> 0x00b0 }
            int r8 = r18.f()     // Catch:{ all -> 0x00b0 }
            long r8 = (long) r8
            r10 = 0
        L_0x002a:
            r11 = 0
            if (r7 != 0) goto L_0x0038
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0038
            if (r10 != 0) goto L_0x0038
            r1.c(r2)
            return r4
        L_0x0038:
            r7 = 4
            if (r0 != r7) goto L_0x0069
            if (r21 != 0) goto L_0x0069
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x0049
            r1.c(r2)
            return r6
        L_0x0049:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x0069:
            if (r0 != r7) goto L_0x0078
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0071
            r3 = 1
            goto L_0x0072
        L_0x0071:
            r3 = 0
        L_0x0072:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0087
        L_0x0076:
            r7 = 1
            goto L_0x0088
        L_0x0078:
            if (r0 != r3) goto L_0x0086
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0080
            r3 = 1
            goto L_0x0081
        L_0x0080:
            r3 = 0
        L_0x0081:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0087
            goto L_0x0076
        L_0x0086:
            r3 = 0
        L_0x0087:
            r7 = 0
        L_0x0088:
            if (r3 == 0) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r4 = 0
        L_0x008c:
            if (r7 == 0) goto L_0x0090
            int r4 = r4 + 4
        L_0x0090:
            long r3 = (long) r4
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0099
            r1.c(r2)
            return r6
        L_0x0099:
            int r3 = r18.b()     // Catch:{ all -> 0x00b0 }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a6
            r1.c(r2)
            return r6
        L_0x00a6:
            int r3 = (int) r8
            r1.d(r3)     // Catch:{ all -> 0x00b0 }
            goto L_0x0006
        L_0x00ac:
            r1.c(r2)
            return r4
        L_0x00b0:
            r0 = move-exception
            r1.c(r2)
            goto L_0x00b6
        L_0x00b5:
            throw r0
        L_0x00b6:
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awo.a(bdj, int, int, boolean):boolean");
    }

    private static awk a(bdj bdj, int i, int i2, boolean z, int i3, a aVar) {
        bdj bdj2 = bdj;
        int i4 = bdj2.b;
        int b2 = b(bdj2.a, i4);
        String str = new String(bdj2.a, i4, b2 - i4, "ISO-8859-1");
        bdj.c(b2 + 1);
        int i5 = bdj.i();
        int i6 = bdj.i();
        long g = bdj.g();
        long j = g == 4294967295L ? -1 : g;
        long g2 = bdj.g();
        long j2 = g2 == 4294967295L ? -1 : g2;
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (bdj2.b < i7) {
            awp a2 = a(i2, bdj, z, i3, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        awp[] awpArr = new awp[arrayList.size()];
        arrayList.toArray(awpArr);
        awk awk = new awk(str, i5, i6, j, j2, awpArr);
        return awk;
    }

    private static awl b(bdj bdj, int i, int i2, boolean z, int i3, a aVar) {
        bdj bdj2 = bdj;
        int i4 = bdj2.b;
        int b2 = b(bdj2.a, i4);
        String str = "ISO-8859-1";
        String str2 = new String(bdj2.a, i4, b2 - i4, str);
        bdj.c(b2 + 1);
        int c = bdj.c();
        boolean z2 = (c & 2) != 0;
        boolean z3 = (c & 1) != 0;
        int c2 = bdj.c();
        String[] strArr = new String[c2];
        for (int i5 = 0; i5 < c2; i5++) {
            int i6 = bdj2.b;
            int b3 = b(bdj2.a, i6);
            strArr[i5] = new String(bdj2.a, i6, b3 - i6, str);
            bdj.c(b3 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (bdj2.b < i7) {
            awp a2 = a(i2, bdj, z, i3, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        awp[] awpArr = new awp[arrayList.size()];
        arrayList.toArray(awpArr);
        awl awl = new awl(str2, z2, z3, strArr, awpArr);
        return awl;
    }
}
