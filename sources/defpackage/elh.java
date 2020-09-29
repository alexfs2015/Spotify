package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: elh reason: default package */
public class elh {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Pattern b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final Uri d = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    /* access modifiers changed from: private */
    public static final AtomicBoolean e = new AtomicBoolean();
    private static HashMap<String, String> f;
    private static final HashMap<String, Boolean> g = new HashMap<>();
    private static final HashMap<String, Integer> h = new HashMap<>();
    private static final HashMap<String, Long> i = new HashMap<>();
    private static final HashMap<String, Float> j = new HashMap<>();
    private static Object k;
    private static boolean l;
    private static String[] m = new String[0];

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        r12 = r12.query(a, null, null, new java.lang.String[]{r13}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bd, code lost:
        if (r12 != null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bf, code lost:
        if (r12 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c1, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
        if (r12.moveToFirst() != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cb, code lost:
        a(r1, r13, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r0 = r12.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d8, code lost:
        if (r0 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00de, code lost:
        if (r0.equals(null) == false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e0, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e1, code lost:
        a(r1, r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e4, code lost:
        if (r0 == null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e7, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e8, code lost:
        if (r12 == null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ea, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ed, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ee, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ef, code lost:
        if (r12 != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f1, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f4, code lost:
        throw r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.ContentResolver r12, java.lang.String r13) {
        /*
            java.lang.Class<elh> r0 = defpackage.elh.class
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f     // Catch:{ all -> 0x00f5 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0029
            java.util.concurrent.atomic.AtomicBoolean r1 = e     // Catch:{ all -> 0x00f5 }
            r1.set(r3)     // Catch:{ all -> 0x00f5 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x00f5 }
            r1.<init>()     // Catch:{ all -> 0x00f5 }
            f = r1     // Catch:{ all -> 0x00f5 }
            java.lang.Object r1 = new java.lang.Object     // Catch:{ all -> 0x00f5 }
            r1.<init>()     // Catch:{ all -> 0x00f5 }
            k = r1     // Catch:{ all -> 0x00f5 }
            l = r3     // Catch:{ all -> 0x00f5 }
            android.net.Uri r1 = a     // Catch:{ all -> 0x00f5 }
            eli r4 = new eli     // Catch:{ all -> 0x00f5 }
            r4.<init>()     // Catch:{ all -> 0x00f5 }
            r12.registerContentObserver(r1, r2, r4)     // Catch:{ all -> 0x00f5 }
            goto L_0x0053
        L_0x0029:
            java.util.concurrent.atomic.AtomicBoolean r1 = e     // Catch:{ all -> 0x00f5 }
            boolean r1 = r1.getAndSet(r3)     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0053
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f     // Catch:{ all -> 0x00f5 }
            r1.clear()     // Catch:{ all -> 0x00f5 }
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = g     // Catch:{ all -> 0x00f5 }
            r1.clear()     // Catch:{ all -> 0x00f5 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = h     // Catch:{ all -> 0x00f5 }
            r1.clear()     // Catch:{ all -> 0x00f5 }
            java.util.HashMap<java.lang.String, java.lang.Long> r1 = i     // Catch:{ all -> 0x00f5 }
            r1.clear()     // Catch:{ all -> 0x00f5 }
            java.util.HashMap<java.lang.String, java.lang.Float> r1 = j     // Catch:{ all -> 0x00f5 }
            r1.clear()     // Catch:{ all -> 0x00f5 }
            java.lang.Object r1 = new java.lang.Object     // Catch:{ all -> 0x00f5 }
            r1.<init>()     // Catch:{ all -> 0x00f5 }
            k = r1     // Catch:{ all -> 0x00f5 }
            l = r3     // Catch:{ all -> 0x00f5 }
        L_0x0053:
            java.lang.Object r1 = k     // Catch:{ all -> 0x00f5 }
            java.util.HashMap<java.lang.String, java.lang.String> r4 = f     // Catch:{ all -> 0x00f5 }
            boolean r4 = r4.containsKey(r13)     // Catch:{ all -> 0x00f5 }
            r5 = 0
            if (r4 == 0) goto L_0x006c
            java.util.HashMap<java.lang.String, java.lang.String> r12 = f     // Catch:{ all -> 0x00f5 }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x00f5 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x00f5 }
            if (r12 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r12 = r5
        L_0x006a:
            monitor-exit(r0)     // Catch:{ all -> 0x00f5 }
            return r12
        L_0x006c:
            java.lang.String[] r4 = m     // Catch:{ all -> 0x00f5 }
            int r6 = r4.length     // Catch:{ all -> 0x00f5 }
            r7 = 0
        L_0x0070:
            if (r7 >= r6) goto L_0x00ae
            r8 = r4[r7]     // Catch:{ all -> 0x00f5 }
            boolean r8 = r13.startsWith(r8)     // Catch:{ all -> 0x00f5 }
            if (r8 == 0) goto L_0x00ab
            boolean r1 = l     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0086
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f     // Catch:{ all -> 0x00f5 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x00a9
        L_0x0086:
            java.lang.String[] r1 = m     // Catch:{ all -> 0x00f5 }
            java.util.HashMap<java.lang.String, java.lang.String> r3 = f     // Catch:{ all -> 0x00f5 }
            java.util.Map r12 = a(r12, r1)     // Catch:{ all -> 0x00f5 }
            r3.putAll(r12)     // Catch:{ all -> 0x00f5 }
            l = r2     // Catch:{ all -> 0x00f5 }
            java.util.HashMap<java.lang.String, java.lang.String> r12 = f     // Catch:{ all -> 0x00f5 }
            boolean r12 = r12.containsKey(r13)     // Catch:{ all -> 0x00f5 }
            if (r12 == 0) goto L_0x00a9
            java.util.HashMap<java.lang.String, java.lang.String> r12 = f     // Catch:{ all -> 0x00f5 }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x00f5 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x00f5 }
            if (r12 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r12 = r5
        L_0x00a7:
            monitor-exit(r0)     // Catch:{ all -> 0x00f5 }
            return r12
        L_0x00a9:
            monitor-exit(r0)     // Catch:{ all -> 0x00f5 }
            return r5
        L_0x00ab:
            int r7 = r7 + 1
            goto L_0x0070
        L_0x00ae:
            monitor-exit(r0)     // Catch:{ all -> 0x00f5 }
            android.net.Uri r7 = a
            r8 = 0
            r9 = 0
            java.lang.String[] r10 = new java.lang.String[r2]
            r10[r3] = r13
            r11 = 0
            r6 = r12
            android.database.Cursor r12 = r6.query(r7, r8, r9, r10, r11)
            if (r12 != 0) goto L_0x00c5
            if (r12 == 0) goto L_0x00c4
            r12.close()
        L_0x00c4:
            return r5
        L_0x00c5:
            boolean r0 = r12.moveToFirst()     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x00d4
            a(r1, r13, r5)     // Catch:{ all -> 0x00ee }
            if (r12 == 0) goto L_0x00d3
            r12.close()
        L_0x00d3:
            return r5
        L_0x00d4:
            java.lang.String r0 = r12.getString(r2)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00e1
            boolean r2 = r0.equals(r5)     // Catch:{ all -> 0x00ee }
            if (r2 == 0) goto L_0x00e1
            r0 = r5
        L_0x00e1:
            a(r1, r13, r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r0 = r5
        L_0x00e8:
            if (r12 == 0) goto L_0x00ed
            r12.close()
        L_0x00ed:
            return r0
        L_0x00ee:
            r13 = move-exception
            if (r12 == 0) goto L_0x00f4
            r12.close()
        L_0x00f4:
            throw r13
        L_0x00f5:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x00f9
        L_0x00f8:
            throw r12
        L_0x00f9:
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elh.a(android.content.ContentResolver, java.lang.String):java.lang.String");
    }

    private static Map<String, String> a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(d, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    private static void a(Object obj, String str, String str2) {
        synchronized (elh.class) {
            if (obj == k) {
                f.put(str, str2);
            }
        }
    }
}
