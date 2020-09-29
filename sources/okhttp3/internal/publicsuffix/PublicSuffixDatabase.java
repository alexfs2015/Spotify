package okhttp3.internal.publicsuffix;

import java.io.Closeable;
import java.io.InputStream;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PublicSuffixDatabase {
    private static final byte[] a = {42};
    private static final String[] b = new String[0];
    private static final String[] c = {"*"};
    private static final PublicSuffixDatabase d = new PublicSuffixDatabase();
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final CountDownLatch f = new CountDownLatch(1);
    private byte[] g;
    private byte[] h;

    private static String a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        byte b2;
        int i3;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = (i4 + length) / 2;
            while (i5 >= 0 && bArr3[i5] != 10) {
                i5--;
            }
            int i6 = i5 + 1;
            int i7 = 1;
            while (true) {
                i2 = i6 + i7;
                if (bArr3[i2] == 10) {
                    break;
                }
                i7++;
            }
            int i8 = i2 - i6;
            int i9 = i;
            boolean z = false;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (z) {
                    z = false;
                    b2 = 46;
                } else {
                    b2 = bArr4[i9][i10] & 255;
                }
                i3 = b2 - (bArr3[i6 + i11] & 255);
                if (i3 != 0) {
                    break;
                }
                i11++;
                i10++;
                if (i11 != i8) {
                    if (bArr4[i9].length == i10) {
                        if (i9 == bArr4.length - 1) {
                            break;
                        }
                        i9++;
                        z = true;
                        i10 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i12 = i8 - i11;
                    int length2 = bArr4[i9].length - i10;
                    while (true) {
                        i9++;
                        if (i9 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i9].length;
                    }
                    if (length2 >= i12) {
                        if (length2 <= i12) {
                            return new String(bArr, i6, i8, xaq.d);
                        }
                    }
                }
                i4 = i2 + 1;
            }
            length = i6 - 1;
        }
        return null;
    }

    public static PublicSuffixDatabase a() {
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r0 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String[] a(java.lang.String[] r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.e
            boolean r0 = r0.get()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x003f
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.e
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x003f
            r0 = 0
        L_0x0013:
            r7.b()     // Catch:{ InterruptedIOException -> 0x0030, IOException -> 0x0022 }
            if (r0 == 0) goto L_0x004c
        L_0x0018:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x004c
        L_0x0020:
            r8 = move-exception
            goto L_0x0035
        L_0x0022:
            r3 = move-exception
            xch r4 = defpackage.xch.c()     // Catch:{ all -> 0x0020 }
            r5 = 5
            java.lang.String r6 = "Failed to read public suffix list"
            r4.a(r5, r6, r3)     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x004c
            goto L_0x0018
        L_0x0030:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0020 }
            r0 = 1
            goto L_0x0013
        L_0x0035:
            if (r0 == 0) goto L_0x003e
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x003e:
            throw r8
        L_0x003f:
            java.util.concurrent.CountDownLatch r0 = r7.f     // Catch:{ InterruptedException -> 0x0045 }
            r0.await()     // Catch:{ InterruptedException -> 0x0045 }
            goto L_0x004c
        L_0x0045:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x004c:
            monitor-enter(r7)
            byte[] r0 = r7.g     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00e4
            monitor-exit(r7)     // Catch:{ all -> 0x00ec }
            int r0 = r8.length
            byte[][] r0 = new byte[r0][]
            r3 = 0
        L_0x0056:
            int r4 = r8.length
            if (r3 >= r4) goto L_0x0066
            r4 = r8[r3]
            java.nio.charset.Charset r5 = defpackage.xaq.d
            byte[] r4 = r4.getBytes(r5)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L_0x0056
        L_0x0066:
            r8 = 0
        L_0x0067:
            int r3 = r0.length
            r4 = 0
            if (r8 >= r3) goto L_0x0077
            byte[] r3 = r7.g
            java.lang.String r3 = a(r3, r0, r8)
            if (r3 == 0) goto L_0x0074
            goto L_0x0078
        L_0x0074:
            int r8 = r8 + 1
            goto L_0x0067
        L_0x0077:
            r3 = r4
        L_0x0078:
            int r8 = r0.length
            if (r8 <= r2) goto L_0x0096
            java.lang.Object r8 = r0.clone()
            byte[][] r8 = (byte[][]) r8
            r5 = 0
        L_0x0082:
            int r6 = r8.length
            int r6 = r6 - r2
            if (r5 >= r6) goto L_0x0096
            byte[] r6 = a
            r8[r5] = r6
            byte[] r6 = r7.g
            java.lang.String r6 = a(r6, r8, r5)
            if (r6 == 0) goto L_0x0093
            goto L_0x0097
        L_0x0093:
            int r5 = r5 + 1
            goto L_0x0082
        L_0x0096:
            r6 = r4
        L_0x0097:
            if (r6 == 0) goto L_0x00a9
        L_0x0099:
            int r8 = r0.length
            int r8 = r8 - r2
            if (r1 >= r8) goto L_0x00a9
            byte[] r8 = r7.h
            java.lang.String r8 = a(r8, r0, r1)
            if (r8 == 0) goto L_0x00a6
            goto L_0x00aa
        L_0x00a6:
            int r1 = r1 + 1
            goto L_0x0099
        L_0x00a9:
            r8 = r4
        L_0x00aa:
            if (r8 == 0) goto L_0x00c1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "!"
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "\\."
            java.lang.String[] r8 = r8.split(r0)
            return r8
        L_0x00c1:
            if (r3 != 0) goto L_0x00c8
            if (r6 != 0) goto L_0x00c8
            java.lang.String[] r8 = c
            return r8
        L_0x00c8:
            if (r3 == 0) goto L_0x00d1
            java.lang.String r8 = "\\."
            java.lang.String[] r8 = r3.split(r8)
            goto L_0x00d3
        L_0x00d1:
            java.lang.String[] r8 = b
        L_0x00d3:
            if (r6 == 0) goto L_0x00dc
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r6.split(r0)
            goto L_0x00de
        L_0x00dc:
            java.lang.String[] r0 = b
        L_0x00de:
            int r1 = r8.length
            int r2 = r0.length
            if (r1 <= r2) goto L_0x00e3
            return r8
        L_0x00e3:
            return r0
        L_0x00e4:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ec }
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            r8.<init>(r0)     // Catch:{ all -> 0x00ec }
            throw r8     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00ec }
            goto L_0x00f0
        L_0x00ef:
            throw r8
        L_0x00f0:
            goto L_0x00ef
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String[]):java.lang.String[]");
    }

    private void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            xcs a2 = xda.a((xdg) new xcy(xda.a(resourceAsStream)));
            try {
                byte[] bArr = new byte[a2.h()];
                a2.a(bArr);
                byte[] bArr2 = new byte[a2.h()];
                a2.a(bArr2);
                synchronized (this) {
                    this.g = bArr;
                    this.h = bArr2;
                }
                this.f.countDown();
            } finally {
                xaq.a((Closeable) a2);
            }
        }
    }

    public final String a(String str) {
        int i;
        int i2;
        if (str != null) {
            String str2 = "\\.";
            String[] split = IDN.toUnicode(str).split(str2);
            String[] a2 = a(split);
            if (split.length == a2.length && a2[0].charAt(0) != '!') {
                return null;
            }
            if (a2[0].charAt(0) == '!') {
                i2 = split.length;
                i = a2.length;
            } else {
                i2 = split.length;
                i = a2.length + 1;
            }
            StringBuilder sb = new StringBuilder();
            String[] split2 = str.split(str2);
            for (int i3 = i2 - i; i3 < split2.length; i3++) {
                sb.append(split2[i3]);
                sb.append('.');
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        throw new NullPointerException("domain == null");
    }
}
