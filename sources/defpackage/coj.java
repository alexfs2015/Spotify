package defpackage;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: coj reason: default package */
public final class coj implements dch {
    private final Map<String, cpi> a;
    private long b;
    private final File c;
    private final int d;

    private coj(File file) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0;
        this.c = file;
        this.d = 5242880;
    }

    public coj(File file, byte b2) {
        this(file);
    }

    static int a(InputStream inputStream) {
        return (c(inputStream) << 24) | c(inputStream) | 0 | (c(inputStream) << 8) | (c(inputStream) << 16);
    }

    private static InputStream a(File file) {
        return new FileInputStream(file);
    }

    static String a(cqj cqj) {
        return new String(a(cqj, b((InputStream) cqj)), "UTF-8");
    }

    static void a(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    static void a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private final void a(String str, cpi cpi) {
        if (!this.a.containsKey(str)) {
            this.b += cpi.a;
        } else {
            this.b += cpi.a - ((cpi) this.a.get(str)).a;
        }
        this.a.put(str, cpi);
    }

    private static byte[] a(cqj cqj, long j) {
        long a2 = cqj.a();
        if (j >= 0 && j <= a2) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(cqj).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(a2);
        throw new IOException(sb.toString());
    }

    static long b(InputStream inputStream) {
        return (((long) c(inputStream)) & 255) | 0 | ((((long) c(inputStream)) & 255) << 8) | ((((long) c(inputStream)) & 255) << 16) | ((((long) c(inputStream)) & 255) << 24) | ((((long) c(inputStream)) & 255) << 32) | ((((long) c(inputStream)) & 255) << 40) | ((((long) c(inputStream)) & 255) << 48) | ((255 & ((long) c(inputStream))) << 56);
    }

    static List<drc> b(cqj cqj) {
        int a2 = a((InputStream) cqj);
        List<drc> emptyList = a2 == 0 ? Collections.emptyList() : new ArrayList<>(a2);
        for (int i = 0; i < a2; i++) {
            emptyList.add(new drc(a(cqj).intern(), a(cqj).intern()));
        }
        return emptyList;
    }

    private final synchronized void b(String str) {
        boolean delete = d(str).delete();
        e(str);
        if (!delete) {
            chg.b("Could not delete cache entry for key=%s, filename=%s", str, c(str));
        }
    }

    private static int c(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static String c(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final File d(String str) {
        return new File(this.c, c(str));
    }

    private final void e(String str) {
        cpi cpi = (cpi) this.a.remove(str);
        if (cpi != null) {
            this.b -= cpi.a;
        }
    }

    public final synchronized dif a(String str) {
        cqj cqj;
        cpi cpi = (cpi) this.a.get(str);
        if (cpi == null) {
            return null;
        }
        File d2 = d(str);
        try {
            cqj = new cqj(new BufferedInputStream(a(d2)), d2.length());
            cpi a2 = cpi.a(cqj);
            if (!TextUtils.equals(str, a2.b)) {
                chg.b("%s: key=%s, found=%s", d2.getAbsolutePath(), str, a2.b);
                e(str);
                cqj.close();
                return null;
            }
            byte[] a3 = a(cqj, cqj.a());
            dif dif = new dif();
            dif.a = a3;
            dif.b = cpi.c;
            dif.c = cpi.d;
            dif.d = cpi.e;
            dif.e = cpi.f;
            dif.f = cpi.g;
            List<drc> list = cpi.h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (drc drc : list) {
                treeMap.put(drc.a, drc.b);
            }
            dif.g = treeMap;
            dif.h = Collections.unmodifiableList(cpi.h);
            cqj.close();
            return dif;
        } catch (IOException e) {
            chg.b("%s: %s", d2.getAbsolutePath(), e.toString());
            b(str);
            return null;
        } catch (Throwable th) {
            cqj.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.io.File r0 = r9.c     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0061 }
            r1 = 0
            if (r0 != 0) goto L_0x0024
            java.io.File r0 = r9.c     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.mkdirs()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "Unable to create cache dir %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0061 }
            java.io.File r3 = r9.c     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0061 }
            r2[r1] = r3     // Catch:{ all -> 0x0061 }
            defpackage.chg.c(r0, r2)     // Catch:{ all -> 0x0061 }
        L_0x0022:
            monitor-exit(r9)
            return
        L_0x0024:
            java.io.File r0 = r9.c     // Catch:{ all -> 0x0061 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            int r2 = r0.length     // Catch:{ all -> 0x0061 }
        L_0x002f:
            if (r1 >= r2) goto L_0x005f
            r3 = r0[r1]     // Catch:{ all -> 0x0061 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0059 }
            cqj r6 = new cqj     // Catch:{ IOException -> 0x0059 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0059 }
            java.io.InputStream r8 = a(r3)     // Catch:{ IOException -> 0x0059 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0059 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0059 }
            cpi r7 = defpackage.cpi.a(r6)     // Catch:{ all -> 0x0054 }
            r7.a = r4     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r7.b     // Catch:{ all -> 0x0054 }
            r9.a(r4, r7)     // Catch:{ all -> 0x0054 }
            r6.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005c
        L_0x0054:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0059 }
            throw r4     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            r3.delete()     // Catch:{ all -> 0x0061 }
        L_0x005c:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x005f:
            monitor-exit(r9)
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r9)
            goto L_0x0065
        L_0x0064:
            throw r0
        L_0x0065:
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coj.a():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:33|34|(1:36)|37|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f7, code lost:
        if (r3.delete() == false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f9, code lost:
        defpackage.chg.b("Could not clean up file %s", r3.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0109, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r20, defpackage.dif r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            monitor-enter(r19)
            byte[] r3 = r2.a     // Catch:{ all -> 0x010a }
            int r3 = r3.length     // Catch:{ all -> 0x010a }
            long r4 = r1.b     // Catch:{ all -> 0x010a }
            long r6 = (long) r3     // Catch:{ all -> 0x010a }
            long r4 = r4 + r6
            r8 = 5242880(0x500000, double:2.590327E-317)
            r10 = 0
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 < 0) goto L_0x00b5
            boolean r4 = defpackage.chg.a     // Catch:{ all -> 0x010a }
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = "Pruning old cache entries."
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ all -> 0x010a }
            defpackage.chg.a(r4, r5)     // Catch:{ all -> 0x010a }
        L_0x0021:
            long r4 = r1.b     // Catch:{ all -> 0x010a }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x010a }
            java.util.Map<java.lang.String, cpi> r11 = r1.a     // Catch:{ all -> 0x010a }
            java.util.Set r11 = r11.entrySet()     // Catch:{ all -> 0x010a }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x010a }
            r12 = 0
        L_0x0032:
            boolean r13 = r11.hasNext()     // Catch:{ all -> 0x010a }
            r14 = 2
            if (r13 == 0) goto L_0x008a
            java.lang.Object r13 = r11.next()     // Catch:{ all -> 0x010a }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ all -> 0x010a }
            java.lang.Object r13 = r13.getValue()     // Catch:{ all -> 0x010a }
            cpi r13 = (defpackage.cpi) r13     // Catch:{ all -> 0x010a }
            java.lang.String r15 = r13.b     // Catch:{ all -> 0x010a }
            java.io.File r15 = r1.d(r15)     // Catch:{ all -> 0x010a }
            boolean r15 = r15.delete()     // Catch:{ all -> 0x010a }
            r16 = r4
            if (r15 == 0) goto L_0x005d
            long r3 = r1.b     // Catch:{ all -> 0x010a }
            r18 = r11
            long r10 = r13.a     // Catch:{ all -> 0x010a }
            long r3 = r3 - r10
            r1.b = r3     // Catch:{ all -> 0x010a }
            goto L_0x0074
        L_0x005d:
            r18 = r11
            java.lang.String r3 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ all -> 0x010a }
            java.lang.String r10 = r13.b     // Catch:{ all -> 0x010a }
            r5 = 0
            r4[r5] = r10     // Catch:{ all -> 0x010a }
            java.lang.String r10 = r13.b     // Catch:{ all -> 0x010a }
            java.lang.String r10 = c(r10)     // Catch:{ all -> 0x010a }
            r11 = 1
            r4[r11] = r10     // Catch:{ all -> 0x010a }
            defpackage.chg.b(r3, r4)     // Catch:{ all -> 0x010a }
        L_0x0074:
            r18.remove()     // Catch:{ all -> 0x010a }
            int r12 = r12 + 1
            long r3 = r1.b     // Catch:{ all -> 0x010a }
            long r3 = r3 + r6
            float r3 = (float) r3     // Catch:{ all -> 0x010a }
            r4 = 1250951168(0x4a900000, float:4718592.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0084
            goto L_0x008c
        L_0x0084:
            r4 = r16
            r11 = r18
            r10 = 0
            goto L_0x0032
        L_0x008a:
            r16 = r4
        L_0x008c:
            boolean r3 = defpackage.chg.a     // Catch:{ all -> 0x010a }
            if (r3 == 0) goto L_0x00b5
            java.lang.String r3 = "pruned %d files, %d bytes, %d ms"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x010a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x010a }
            r5 = 0
            r4[r5] = r6     // Catch:{ all -> 0x010a }
            long r6 = r1.b     // Catch:{ all -> 0x010a }
            long r6 = r6 - r16
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x010a }
            r7 = 1
            r4[r7] = r6     // Catch:{ all -> 0x010a }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x010a }
            long r6 = r6 - r8
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x010a }
            r4[r14] = r6     // Catch:{ all -> 0x010a }
            defpackage.chg.a(r3, r4)     // Catch:{ all -> 0x010a }
        L_0x00b5:
            java.io.File r3 = r19.d(r20)     // Catch:{ all -> 0x010a }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00f3 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00f3 }
            r6.<init>(r3)     // Catch:{ IOException -> 0x00f3 }
            r4.<init>(r6)     // Catch:{ IOException -> 0x00f3 }
            cpi r6 = new cpi     // Catch:{ IOException -> 0x00f3 }
            r6.<init>(r0, r2)     // Catch:{ IOException -> 0x00f3 }
            boolean r7 = r6.a(r4)     // Catch:{ IOException -> 0x00f3 }
            if (r7 == 0) goto L_0x00db
            byte[] r2 = r2.a     // Catch:{ IOException -> 0x00f3 }
            r4.write(r2)     // Catch:{ IOException -> 0x00f3 }
            r4.close()     // Catch:{ IOException -> 0x00f3 }
            r1.a(r0, r6)     // Catch:{ IOException -> 0x00f3 }
            monitor-exit(r19)
            return
        L_0x00db:
            r4.close()     // Catch:{ IOException -> 0x00f3 }
            java.lang.String r0 = "Failed to write header for %s"
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x00f3 }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x00f3 }
            r5 = 0
            r4[r5] = r2     // Catch:{ IOException -> 0x00f3 }
            defpackage.chg.b(r0, r4)     // Catch:{ IOException -> 0x00f3 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00f3 }
            r0.<init>()     // Catch:{ IOException -> 0x00f3 }
            throw r0     // Catch:{ IOException -> 0x00f3 }
        L_0x00f3:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x010a }
            if (r0 != 0) goto L_0x0108
            java.lang.String r0 = "Could not clean up file %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x010a }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x010a }
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x010a }
            defpackage.chg.b(r0, r2)     // Catch:{ all -> 0x010a }
        L_0x0108:
            monitor-exit(r19)
            return
        L_0x010a:
            r0 = move-exception
            monitor-exit(r19)
            goto L_0x010e
        L_0x010d:
            throw r0
        L_0x010e:
            goto L_0x010d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coj.a(java.lang.String, dif):void");
    }
}
