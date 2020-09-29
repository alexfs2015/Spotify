package defpackage;

import com.crashlytics.android.core.Report;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: ajs reason: default package */
final class ajs {
    static final Map<String, String> a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    /* access modifiers changed from: private */
    public static final short[] b = {10, 20, 30, 60, 120, 300};
    private final Object c = new Object();
    private final aix d;
    private final String e;
    private final c f;
    /* access modifiers changed from: private */
    public final b g;
    /* access modifiers changed from: private */
    public Thread h;

    /* renamed from: ajs$a */
    static final class a implements d {
        a() {
        }

        public final boolean a() {
            return true;
        }
    }

    /* renamed from: ajs$b */
    interface b {
        boolean a();
    }

    /* renamed from: ajs$c */
    interface c {
        File[] a();

        File[] b();

        File[] c();
    }

    /* renamed from: ajs$d */
    interface d {
        boolean a();
    }

    /* renamed from: ajs$e */
    class e extends wjv {
        private final float a;
        private final d b;

        e(float f, d dVar) {
            this.a = f;
            this.b = dVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:35|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|39|40) */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0116 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0030 */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:7:0x0030=Splitter:B:7:0x0030, B:35:0x0116=Splitter:B:35:0x0116} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r8 = this;
                java.lang.String r0 = "CrashlyticsCore"
                wji r1 = defpackage.wja.a()     // Catch:{ Exception -> 0x011e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011e }
                java.lang.String r3 = "Starting report processing in "
                r2.<init>(r3)     // Catch:{ Exception -> 0x011e }
                float r3 = r8.a     // Catch:{ Exception -> 0x011e }
                r2.append(r3)     // Catch:{ Exception -> 0x011e }
                java.lang.String r3 = " second(s)..."
                r2.append(r3)     // Catch:{ Exception -> 0x011e }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x011e }
                r1.a(r0, r2)     // Catch:{ Exception -> 0x011e }
                float r1 = r8.a     // Catch:{ Exception -> 0x011e }
                r2 = 0
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 <= 0) goto L_0x0039
                float r1 = r8.a     // Catch:{ InterruptedException -> 0x0030 }
                r2 = 1148846080(0x447a0000, float:1000.0)
                float r1 = r1 * r2
                long r1 = (long) r1     // Catch:{ InterruptedException -> 0x0030 }
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0030 }
                goto L_0x0039
            L_0x0030:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x011e }
                r1.interrupt()     // Catch:{ Exception -> 0x011e }
                goto L_0x0128
            L_0x0039:
                ajs r1 = defpackage.ajs.this     // Catch:{ Exception -> 0x011e }
                java.util.List r1 = r1.a()     // Catch:{ Exception -> 0x011e }
                ajs r2 = defpackage.ajs.this     // Catch:{ Exception -> 0x011e }
                ajs$b r2 = r2.g     // Catch:{ Exception -> 0x011e }
                boolean r2 = r2.a()     // Catch:{ Exception -> 0x011e }
                if (r2 != 0) goto L_0x0128
                boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x011e }
                if (r2 != 0) goto L_0x008b
                ajs$d r2 = r8.b     // Catch:{ Exception -> 0x011e }
                boolean r2 = r2.a()     // Catch:{ Exception -> 0x011e }
                if (r2 != 0) goto L_0x008b
                wji r2 = defpackage.wja.a()     // Catch:{ Exception -> 0x011e }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011e }
                java.lang.String r4 = "User declined to send. Removing "
                r3.<init>(r4)     // Catch:{ Exception -> 0x011e }
                int r4 = r1.size()     // Catch:{ Exception -> 0x011e }
                r3.append(r4)     // Catch:{ Exception -> 0x011e }
                java.lang.String r4 = " Report(s)."
                r3.append(r4)     // Catch:{ Exception -> 0x011e }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x011e }
                r2.a(r0, r3)     // Catch:{ Exception -> 0x011e }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x011e }
            L_0x007b:
                boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x011e }
                if (r2 == 0) goto L_0x0128
                java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x011e }
                com.crashlytics.android.core.Report r2 = (com.crashlytics.android.core.Report) r2     // Catch:{ Exception -> 0x011e }
                r2.f()     // Catch:{ Exception -> 0x011e }
                goto L_0x007b
            L_0x008b:
                r2 = 0
            L_0x008c:
                boolean r3 = r1.isEmpty()     // Catch:{ Exception -> 0x011e }
                if (r3 != 0) goto L_0x0128
                ajs r3 = defpackage.ajs.this     // Catch:{ Exception -> 0x011e }
                ajs$b r3 = r3.g     // Catch:{ Exception -> 0x011e }
                boolean r3 = r3.a()     // Catch:{ Exception -> 0x011e }
                if (r3 != 0) goto L_0x0128
                wji r3 = defpackage.wja.a()     // Catch:{ Exception -> 0x011e }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011e }
                java.lang.String r5 = "Attempting to send "
                r4.<init>(r5)     // Catch:{ Exception -> 0x011e }
                int r5 = r1.size()     // Catch:{ Exception -> 0x011e }
                r4.append(r5)     // Catch:{ Exception -> 0x011e }
                java.lang.String r5 = " report(s)"
                r4.append(r5)     // Catch:{ Exception -> 0x011e }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x011e }
                r3.a(r0, r4)     // Catch:{ Exception -> 0x011e }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x011e }
            L_0x00c0:
                boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x011e }
                if (r3 == 0) goto L_0x00d2
                java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x011e }
                com.crashlytics.android.core.Report r3 = (com.crashlytics.android.core.Report) r3     // Catch:{ Exception -> 0x011e }
                ajs r4 = defpackage.ajs.this     // Catch:{ Exception -> 0x011e }
                r4.a(r3)     // Catch:{ Exception -> 0x011e }
                goto L_0x00c0
            L_0x00d2:
                ajs r1 = defpackage.ajs.this     // Catch:{ Exception -> 0x011e }
                java.util.List r1 = r1.a()     // Catch:{ Exception -> 0x011e }
                boolean r3 = r1.isEmpty()     // Catch:{ Exception -> 0x011e }
                if (r3 != 0) goto L_0x008c
                short[] r3 = defpackage.ajs.b     // Catch:{ Exception -> 0x011e }
                int r4 = r2 + 1
                short[] r5 = defpackage.ajs.b     // Catch:{ Exception -> 0x011e }
                int r5 = r5.length     // Catch:{ Exception -> 0x011e }
                int r5 = r5 + -1
                int r2 = java.lang.Math.min(r2, r5)     // Catch:{ Exception -> 0x011e }
                short r2 = r3[r2]     // Catch:{ Exception -> 0x011e }
                long r2 = (long) r2     // Catch:{ Exception -> 0x011e }
                wji r5 = defpackage.wja.a()     // Catch:{ Exception -> 0x011e }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011e }
                java.lang.String r7 = "Report submisson: scheduling delayed retry in "
                r6.<init>(r7)     // Catch:{ Exception -> 0x011e }
                r6.append(r2)     // Catch:{ Exception -> 0x011e }
                java.lang.String r7 = " seconds"
                r6.append(r7)     // Catch:{ Exception -> 0x011e }
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x011e }
                r5.a(r0, r6)     // Catch:{ Exception -> 0x011e }
                r5 = 1000(0x3e8, double:4.94E-321)
                long r2 = r2 * r5
                java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x0116 }
                r2 = r4
                goto L_0x008c
            L_0x0116:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x011e }
                r1.interrupt()     // Catch:{ Exception -> 0x011e }
                goto L_0x0128
            L_0x011e:
                r1 = move-exception
                wji r2 = defpackage.wja.a()
                java.lang.String r3 = "An unexpected error occurred while attempting to upload crash reports."
                r2.c(r0, r3, r1)
            L_0x0128:
                ajs r0 = defpackage.ajs.this
                r1 = 0
                r0.h = null
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajs.e.a():void");
        }
    }

    public ajs(String str, aix aix, c cVar, b bVar) {
        if (aix != null) {
            this.d = aix;
            this.e = str;
            this.f = cVar;
            this.g = bVar;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    /* access modifiers changed from: 0000 */
    public final List<Report> a() {
        File[] a2;
        File[] b2;
        File[] c2;
        wja.a().a("CrashlyticsCore", "Checking for crash reports...");
        synchronized (this.c) {
            a2 = this.f.a();
            b2 = this.f.b();
            c2 = this.f.c();
        }
        LinkedList linkedList = new LinkedList();
        if (a2 != null) {
            for (File file : a2) {
                wji a3 = wja.a();
                StringBuilder sb = new StringBuilder("Found crash report ");
                sb.append(file.getPath());
                a3.a("CrashlyticsCore", sb.toString());
                linkedList.add(new ajv(file));
            }
        }
        HashMap hashMap = new HashMap();
        if (b2 != null) {
            for (File file2 : b2) {
                String a4 = ain.a(file2);
                if (!hashMap.containsKey(a4)) {
                    hashMap.put(a4, new LinkedList());
                }
                ((List) hashMap.get(a4)).add(file2);
            }
        }
        for (String str : hashMap.keySet()) {
            wji a5 = wja.a();
            StringBuilder sb2 = new StringBuilder("Found invalid session: ");
            sb2.append(str);
            a5.a("CrashlyticsCore", sb2.toString());
            List list = (List) hashMap.get(str);
            linkedList.add(new ajd(str, (File[]) list.toArray(new File[list.size()])));
        }
        if (c2 != null) {
            for (File ajl : c2) {
                linkedList.add(new ajl(ajl));
            }
        }
        if (linkedList.isEmpty()) {
            wja.a().a("CrashlyticsCore", "No reports found.");
        }
        return linkedList;
    }

    public final synchronized void a(float f2, d dVar) {
        if (this.h != null) {
            wja.a().a("CrashlyticsCore", "Report upload has already been started.");
            return;
        }
        this.h = new Thread(new e(f2, dVar), "Crashlytics Report Uploader");
        this.h.start();
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(Report report) {
        boolean z;
        synchronized (this.c) {
            z = false;
            try {
                boolean a2 = this.d.a(new aiw(this.e, report));
                wji a3 = wja.a();
                String str = "CrashlyticsCore";
                StringBuilder sb = new StringBuilder("Crashlytics report upload ");
                sb.append(a2 ? "complete: " : "FAILED: ");
                sb.append(report.b());
                a3.c(str, sb.toString());
                if (a2) {
                    report.f();
                    z = true;
                }
            } catch (Exception e2) {
                StringBuilder sb2 = new StringBuilder("Error occurred sending report ");
                sb2.append(report);
                wja.a().c("CrashlyticsCore", sb2.toString(), e2);
            }
        }
        return z;
    }
}
