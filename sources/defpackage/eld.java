package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: eld reason: default package */
public abstract class eld<T> {
    private static final Object b = new Object();
    private static Context c = null;
    private static final AtomicInteger f = new AtomicInteger();
    public final T a;
    private final elj d;
    private final String e;
    private volatile int g;
    private volatile T h;

    public static void a(Context context) {
        synchronized (b) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (c != context) {
                synchronized (ekt.class) {
                    ekt.a.clear();
                }
                synchronized (elk.class) {
                    elk.a.clear();
                }
                synchronized (ekz.class) {
                    ekz.a = null;
                }
                f.incrementAndGet();
                c = context;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract T a(Object obj);

    static void a() {
        f.incrementAndGet();
    }

    private eld(elj elj, String str, T t) {
        this.g = -1;
        if (elj.a != null) {
            this.d = elj;
            this.e = str;
            this.a = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    private final String a(String str) {
        if (str != null && str.isEmpty()) {
            return this.e;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.e);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final String b() {
        return a(this.d.c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T c() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f
            int r0 = r0.get()
            int r1 = r5.g
            if (r1 >= r0) goto L_0x00ae
            monitor-enter(r5)
            int r1 = r5.g     // Catch:{ all -> 0x00ab }
            if (r1 >= r0) goto L_0x00a9
            android.content.Context r1 = c     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x00a1
            android.content.Context r1 = c     // Catch:{ all -> 0x00ab }
            ekz r1 = defpackage.ekz.a(r1)     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.Object r1 = r1.a(r2)     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x0031
            java.util.regex.Pattern r2 = defpackage.ekq.b     // Catch:{ all -> 0x00ab }
            java.util.regex.Matcher r1 = r2.matcher(r1)     // Catch:{ all -> 0x00ab }
            boolean r1 = r1.matches()     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x0031
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            r2 = 0
            if (r1 != 0) goto L_0x0061
            elj r1 = r5.d     // Catch:{ all -> 0x00ab }
            android.net.Uri r1 = r1.a     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x004a
            android.content.Context r1 = c     // Catch:{ all -> 0x00ab }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x00ab }
            elj r3 = r5.d     // Catch:{ all -> 0x00ab }
            android.net.Uri r3 = r3.a     // Catch:{ all -> 0x00ab }
            ekt r1 = defpackage.ekt.a(r1, r3)     // Catch:{ all -> 0x00ab }
            goto L_0x0050
        L_0x004a:
            android.content.Context r1 = c     // Catch:{ all -> 0x00ab }
            elk r1 = defpackage.elk.a(r1, r2)     // Catch:{ all -> 0x00ab }
        L_0x0050:
            if (r1 == 0) goto L_0x007a
            java.lang.String r3 = r5.b()     // Catch:{ all -> 0x00ab }
            java.lang.Object r1 = r1.a(r3)     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x007a
            java.lang.Object r1 = r5.a(r1)     // Catch:{ all -> 0x00ab }
            goto L_0x007b
        L_0x0061:
            java.lang.String r1 = "Bypass reading Phenotype values for flag: "
            java.lang.String r3 = r5.b()     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00ab }
            int r4 = r3.length()     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x0075
            r1.concat(r3)     // Catch:{ all -> 0x00ab }
            goto L_0x007a
        L_0x0075:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x00ab }
            r3.<init>(r1)     // Catch:{ all -> 0x00ab }
        L_0x007a:
            r1 = r2
        L_0x007b:
            if (r1 == 0) goto L_0x007e
            goto L_0x009c
        L_0x007e:
            android.content.Context r1 = c     // Catch:{ all -> 0x00ab }
            ekz r1 = defpackage.ekz.a(r1)     // Catch:{ all -> 0x00ab }
            elj r3 = r5.d     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = r3.b     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = r5.a(r3)     // Catch:{ all -> 0x00ab }
            java.lang.Object r1 = r1.a(r3)     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x0096
            java.lang.Object r2 = r5.a(r1)     // Catch:{ all -> 0x00ab }
        L_0x0096:
            r1 = r2
            if (r1 == 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            T r1 = r5.a     // Catch:{ all -> 0x00ab }
        L_0x009c:
            r5.h = r1     // Catch:{ all -> 0x00ab }
            r5.g = r0     // Catch:{ all -> 0x00ab }
            goto L_0x00a9
        L_0x00a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = "Must call PhenotypeFlag.init() first"
            r0.<init>(r1)     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00a9:
            monitor-exit(r5)     // Catch:{ all -> 0x00ab }
            goto L_0x00ae
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ab }
            throw r0
        L_0x00ae:
            T r0 = r5.h
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eld.c():java.lang.Object");
    }

    /* synthetic */ eld(elj elj, String str, Object obj, byte b2) {
        this(elj, str, obj);
    }

    public static /* synthetic */ eld a(elj elj, String str, long j) {
        return new ele(elj, str, Long.valueOf(j));
    }

    public static /* synthetic */ eld a(elj elj, String str, boolean z) {
        return new elg(elj, str, Boolean.valueOf(z));
    }

    public static /* synthetic */ eld a(elj elj, String str, int i) {
        return new elf(elj, str, Integer.valueOf(i));
    }

    public static /* synthetic */ eld a(elj elj, String str, double d2) {
        return new elh(elj, str, Double.valueOf(d2));
    }

    public static /* synthetic */ eld a(elj elj, String str, String str2) {
        return new eli(elj, str, str2);
    }
}
