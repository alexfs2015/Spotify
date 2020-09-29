package defpackage;

import com.google.android.gms.internal.ads.zzac;
import com.google.android.gms.internal.ads.zzae;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: cli reason: default package */
public class cli implements dsc {
    private static final boolean a = chg.a;
    @Deprecated
    private final ctm b;
    private final ckh c;
    private final cmj d;

    public cli(ckh ckh) {
        this(ckh, new cmj());
    }

    private cli(ckh ckh, cmj cmj) {
        this.c = ckh;
        this.b = ckh;
        this.d = cmj;
    }

    @Deprecated
    public cli(ctm ctm) {
        this(ctm, new cmj());
    }

    @Deprecated
    private cli(ctm ctm, cmj cmj) {
        this.b = ctm;
        this.c = new cji(ctm);
        this.d = cmj;
    }

    private static void a(String str, dwv<?> dwv, zzae zzae) {
        cdj cdj = dwv.i;
        int c2 = dwv.c();
        try {
            cdj.a(zzae);
            dwv.b(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(c2)}));
        } catch (zzae e) {
            dwv.b(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(c2)}));
            throw e;
        }
    }

    private final byte[] a(InputStream inputStream, int i) {
        cwj cwj = new cwj(this.d, i);
        String str = "Error occurred when closing InputStream";
        byte[] bArr = null;
        if (inputStream != null) {
            try {
                bArr = this.d.a(1024);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    cwj.write(bArr, 0, read);
                }
                byte[] byteArray = cwj.toByteArray();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        chg.a(str, new Object[0]);
                    }
                }
                return byteArray;
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                        chg.a(str, new Object[0]);
                    }
                }
                this.d.a(bArr);
                cwj.close();
            }
        } else {
            throw new zzac();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f0, code lost:
        a(r5, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01fa, code lost:
        throw new com.google.android.gms.internal.ads.zzq(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01fb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01fc, code lost:
        r4 = "Bad URL ";
        r2 = java.lang.String.valueOf(r2.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x020a, code lost:
        if (r2.length() != 0) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x020c, code lost:
        r2 = r4.concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0211, code lost:
        r2 = new java.lang.String(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0219, code lost:
        throw new java.lang.RuntimeException(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x021a, code lost:
        a("socket", r2, new com.google.android.gms.internal.ads.zzad());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0182, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0183, code lost:
        r17 = r5;
        r13 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018c, code lost:
        r17 = r5;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0192, code lost:
        r0 = r10.a;
        defpackage.chg.c("Unexpected response code %d for %s", java.lang.Integer.valueOf(r0), r2.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a5, code lost:
        if (r13 != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a7, code lost:
        r11 = new defpackage.duu(r0, r13, false, android.os.SystemClock.elapsedRealtime() - r3, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b7, code lost:
        if (r0 == 401) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c0, code lost:
        if (r0 < 400) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01cc, code lost:
        throw new com.google.android.gms.internal.ads.zzg(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01cf, code lost:
        if (r0 < 500) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01da, code lost:
        throw new com.google.android.gms.internal.ads.zzac(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e0, code lost:
        throw new com.google.android.gms.internal.ads.zzac(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e1, code lost:
        r0 = new com.google.android.gms.internal.ads.zza(r11);
        r5 = "auth";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e9, code lost:
        r0 = new com.google.android.gms.internal.ads.zzo();
        r5 = "network";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01fb A[ExcHandler: MalformedURLException (r0v1 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01f5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0192  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.duu a(defpackage.dwv<?> r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            long r3 = android.os.SystemClock.elapsedRealtime()
        L_0x0008:
            java.util.List r5 = java.util.Collections.emptyList()
            r6 = 1
            r7 = 2
            r9 = 0
            dif r0 = r2.j     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x018b }
            if (r0 != 0) goto L_0x0018
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x018b }
            goto L_0x0045
        L_0x0018:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x018b }
            r10.<init>()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x018b }
            java.lang.String r11 = r0.b     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x018b }
            if (r11 == 0) goto L_0x0028
            java.lang.String r11 = "If-None-Match"
            java.lang.String r12 = r0.b     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x018b }
            r10.put(r11, r12)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x018b }
        L_0x0028:
            long r11 = r0.d     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x018b }
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0044
            java.lang.String r11 = "If-Modified-Since"
            long r12 = r0.d     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x018b }
            java.text.SimpleDateFormat r0 = defpackage.crk.a()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x018b }
            java.util.Date r14 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x018b }
            r14.<init>(r12)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x018b }
            java.lang.String r0 = r0.format(r14)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x018b }
            r10.put(r11, r0)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x018b }
        L_0x0044:
            r0 = r10
        L_0x0045:
            ckh r10 = r1.c     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x018b }
            csl r10 = r10.a(r2, r0)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x018b }
            int r12 = r10.a     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            java.util.List<drc> r0 = r10.b     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            java.util.List r5 = java.util.Collections.unmodifiableList(r0)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            r0 = 304(0x130, float:4.26E-43)
            if (r12 != r0) goto L_0x0117
            dif r0 = r2.j     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            if (r0 != 0) goto L_0x006f
            duu r0 = new duu     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            r14 = 304(0x130, float:4.26E-43)
            r15 = 0
            r16 = 1
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            long r17 = r11 - r3
            r13 = r0
            r19 = r5
            r13.<init>(r14, r15, r16, r17, r19)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            return r0
        L_0x006f:
            java.util.TreeSet r11 = new java.util.TreeSet     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            java.util.Comparator r12 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            r11.<init>(r12)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            boolean r12 = r5.isEmpty()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            if (r12 != 0) goto L_0x0092
            java.util.Iterator r12 = r5.iterator()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
        L_0x0080:
            boolean r13 = r12.hasNext()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            if (r13 == 0) goto L_0x0092
            java.lang.Object r13 = r12.next()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            drc r13 = (defpackage.drc) r13     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            java.lang.String r13 = r13.a     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            r11.add(r13)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            goto L_0x0080
        L_0x0092:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            r12.<init>(r5)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            java.util.List<drc> r13 = r0.h     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            if (r13 == 0) goto L_0x00c1
            java.util.List<drc> r13 = r0.h     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            boolean r13 = r13.isEmpty()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            if (r13 != 0) goto L_0x0100
            java.util.List<drc> r13 = r0.h     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
        L_0x00a9:
            boolean r14 = r13.hasNext()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            if (r14 == 0) goto L_0x0100
            java.lang.Object r14 = r13.next()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            drc r14 = (defpackage.drc) r14     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            java.lang.String r15 = r14.a     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            boolean r15 = r11.contains(r15)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            if (r15 != 0) goto L_0x00a9
            r12.add(r14)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            goto L_0x00a9
        L_0x00c1:
            java.util.Map<java.lang.String, java.lang.String> r13 = r0.g     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            boolean r13 = r13.isEmpty()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            if (r13 != 0) goto L_0x0100
            java.util.Map<java.lang.String, java.lang.String> r13 = r0.g     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            java.util.Set r13 = r13.entrySet()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
        L_0x00d3:
            boolean r14 = r13.hasNext()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            if (r14 == 0) goto L_0x0100
            java.lang.Object r14 = r13.next()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            java.lang.Object r15 = r14.getKey()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            boolean r15 = r11.contains(r15)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            if (r15 != 0) goto L_0x00d3
            drc r15 = new drc     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            java.lang.Object r16 = r14.getKey()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            r8 = r16
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            r15.<init>(r8, r14)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            r12.add(r15)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            goto L_0x00d3
        L_0x0100:
            duu r8 = new duu     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            r15 = 304(0x130, float:4.26E-43)
            byte[] r0 = r0.a     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            r17 = 1
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            long r18 = r13 - r3
            r14 = r8
            r16 = r0
            r20 = r12
            r14.<init>(r15, r16, r17, r18, r20)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            return r8
        L_0x0117:
            java.io.InputStream r0 = r10.d     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            if (r0 == 0) goto L_0x0122
            int r8 = r10.c     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            byte[] r0 = r1.a(r0, r8)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
            goto L_0x0124
        L_0x0122:
            byte[] r0 = new byte[r9]     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0187 }
        L_0x0124:
            r8 = r0
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            long r13 = r13 - r3
            boolean r0 = a     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            if (r0 != 0) goto L_0x0134
            r15 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0164
        L_0x0134:
            java.lang.String r0 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            r11[r9] = r2     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            r11[r6] = r13     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            if (r8 == 0) goto L_0x0149
            int r13 = r8.length     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            goto L_0x014b
        L_0x0149:
            java.lang.String r13 = "null"
        L_0x014b:
            r11[r7] = r13     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            r13 = 3
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            r11[r13] = r14     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            r13 = 4
            cdj r14 = r2.i     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            int r14 = r14.b()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            r11[r13] = r14     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            defpackage.chg.b(r0, r11)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
        L_0x0164:
            r0 = 200(0xc8, float:2.8E-43)
            if (r12 < r0) goto L_0x017c
            r0 = 299(0x12b, float:4.19E-43)
            if (r12 > r0) goto L_0x017c
            duu r0 = new duu     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            r14 = 0
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            long r15 = r15 - r3
            r11 = r0
            r13 = r8
            r17 = r5
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            return r0
        L_0x017c:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x021a, MalformedURLException -> 0x01fb, IOException -> 0x0182 }
        L_0x0182:
            r0 = move-exception
            r17 = r5
            r13 = r8
            goto L_0x0190
        L_0x0187:
            r0 = move-exception
            r17 = r5
            goto L_0x018f
        L_0x018b:
            r0 = move-exception
            r17 = r5
            r10 = 0
        L_0x018f:
            r13 = 0
        L_0x0190:
            if (r10 == 0) goto L_0x01f5
            int r0 = r10.a
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r5[r9] = r7
            java.lang.String r7 = r2.b
            r5[r6] = r7
            java.lang.String r6 = "Unexpected response code %d for %s"
            defpackage.chg.c(r6, r5)
            if (r13 == 0) goto L_0x01e9
            duu r5 = new duu
            r14 = 0
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r15 = r6 - r3
            r11 = r5
            r12 = r0
            r11.<init>(r12, r13, r14, r15, r17)
            r6 = 401(0x191, float:5.62E-43)
            if (r0 == r6) goto L_0x01e1
            r6 = 403(0x193, float:5.65E-43)
            if (r0 != r6) goto L_0x01be
            goto L_0x01e1
        L_0x01be:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L_0x01cd
            r2 = 499(0x1f3, float:6.99E-43)
            if (r0 <= r2) goto L_0x01c7
            goto L_0x01cd
        L_0x01c7:
            com.google.android.gms.internal.ads.zzg r0 = new com.google.android.gms.internal.ads.zzg
            r0.<init>(r5)
            throw r0
        L_0x01cd:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 < r2) goto L_0x01db
            r2 = 599(0x257, float:8.4E-43)
            if (r0 > r2) goto L_0x01db
            com.google.android.gms.internal.ads.zzac r0 = new com.google.android.gms.internal.ads.zzac
            r0.<init>(r5)
            throw r0
        L_0x01db:
            com.google.android.gms.internal.ads.zzac r0 = new com.google.android.gms.internal.ads.zzac
            r0.<init>(r5)
            throw r0
        L_0x01e1:
            com.google.android.gms.internal.ads.zza r0 = new com.google.android.gms.internal.ads.zza
            r0.<init>(r5)
            java.lang.String r5 = "auth"
            goto L_0x01f0
        L_0x01e9:
            com.google.android.gms.internal.ads.zzo r0 = new com.google.android.gms.internal.ads.zzo
            r0.<init>()
            java.lang.String r5 = "network"
        L_0x01f0:
            a(r5, r2, r0)
            goto L_0x0008
        L_0x01f5:
            com.google.android.gms.internal.ads.zzq r2 = new com.google.android.gms.internal.ads.zzq
            r2.<init>(r0)
            throw r2
        L_0x01fb:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Bad URL "
            java.lang.String r2 = r2.b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = r2.length()
            if (r5 == 0) goto L_0x0211
            java.lang.String r2 = r4.concat(r2)
            goto L_0x0216
        L_0x0211:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
        L_0x0216:
            r3.<init>(r2, r0)
            throw r3
        L_0x021a:
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            java.lang.String r5 = "socket"
            a(r5, r2, r0)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cli.a(dwv):duu");
    }
}
