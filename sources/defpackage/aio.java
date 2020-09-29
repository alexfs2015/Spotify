package defpackage;

import android.content.Context;
import android.content.Intent;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.concurrency.Priority;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@wkj(a = {ait.class})
/* renamed from: aio reason: default package */
public class aio extends wjf<Void> {
    final ConcurrentHashMap<String, String> a;
    aip b;
    public ain c;
    public boolean d;
    public ait e;
    private final long l;
    /* access modifiers changed from: private */
    public aip m;
    private air n;
    private String o;
    private String p;
    private String q;
    private float r;
    private final ajm s;
    private wlh t;
    private aim u;

    /* renamed from: aio$a */
    static final class a implements Callable<Boolean> {
        private final aip a;

        public a(aip aip) {
            this.a = aip;
        }

        public final /* synthetic */ Object call() {
            if (!this.a.b().exists()) {
                return Boolean.FALSE;
            }
            wja.a().a("CrashlyticsCore", "Found previous crash marker.");
            this.a.b().delete();
            return Boolean.TRUE;
        }
    }

    /* renamed from: aio$b */
    static final class b implements air {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    public aio() {
        this(1.0f, null, null, false);
    }

    private aio(float f, air air, ajm ajm, boolean z) {
        String str = "Crashlytics Exception Handler";
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(wjz.a(str));
        wjz.a(str, newSingleThreadExecutor);
        this(1.0f, null, null, false, newSingleThreadExecutor);
    }

    private aio(float f, air air, ajm ajm, boolean z, ExecutorService executorService) {
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = f;
        if (air == null) {
            air = new b(0);
        }
        this.n = air;
        this.s = ajm;
        this.d = z;
        this.u = new aim(executorService);
        this.a = new ConcurrentHashMap<>();
        this.l = System.currentTimeMillis();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.content.Context r19) {
        /*
            r18 = this;
            r12 = r18
            r0 = r19
            wkc r1 = new wkc
            r1.<init>()
            boolean r1 = defpackage.wkc.b(r19)
            r13 = 1
            java.lang.String r14 = "CrashlyticsCore"
            if (r1 != 0) goto L_0x001d
            wji r1 = defpackage.wja.a()
            java.lang.String r2 = "Crashlytics is disabled, because data collection is disabled by Firebase."
            r1.a(r14, r2)
            r12.d = r13
        L_0x001d:
            boolean r1 = r12.d
            r15 = 0
            if (r1 == 0) goto L_0x0023
            return r15
        L_0x0023:
            wju r1 = new wju
            r1.<init>()
            java.lang.String r3 = r1.a(r0)
            if (r3 != 0) goto L_0x002f
            return r15
        L_0x002f:
            java.lang.String r4 = io.fabric.sdk.android.services.common.CommonUtils.k(r19)
            java.lang.String r1 = "com.crashlytics.RequireBuildId"
            boolean r1 = io.fabric.sdk.android.services.common.CommonUtils.a(r0, r1, r13)
            java.lang.String r2 = "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization."
            if (r1 != 0) goto L_0x0048
            wji r1 = defpackage.wja.a()
            java.lang.String r5 = "Configured not to require a build ID."
            r1.a(r14, r5)
        L_0x0046:
            r1 = 1
            goto L_0x009f
        L_0x0048:
            boolean r1 = io.fabric.sdk.android.services.common.CommonUtils.d(r4)
            if (r1 != 0) goto L_0x004f
            goto L_0x0046
        L_0x004f:
            java.lang.String r1 = "."
            android.util.Log.e(r14, r1)
            java.lang.String r5 = ".     |  | "
            android.util.Log.e(r14, r5)
            java.lang.String r5 = ".     |  |"
            android.util.Log.e(r14, r5)
            android.util.Log.e(r14, r5)
            java.lang.String r6 = ".   \\ |  | /"
            android.util.Log.e(r14, r6)
            java.lang.String r6 = ".    \\    /"
            android.util.Log.e(r14, r6)
            java.lang.String r6 = ".     \\  /"
            android.util.Log.e(r14, r6)
            java.lang.String r6 = ".      \\/"
            android.util.Log.e(r14, r6)
            android.util.Log.e(r14, r1)
            android.util.Log.e(r14, r2)
            android.util.Log.e(r14, r1)
            java.lang.String r6 = ".      /\\"
            android.util.Log.e(r14, r6)
            java.lang.String r6 = ".     /  \\"
            android.util.Log.e(r14, r6)
            java.lang.String r6 = ".    /    \\"
            android.util.Log.e(r14, r6)
            java.lang.String r6 = ".   / |  | \\"
            android.util.Log.e(r14, r6)
            android.util.Log.e(r14, r5)
            android.util.Log.e(r14, r5)
            android.util.Log.e(r14, r5)
            android.util.Log.e(r14, r1)
            r1 = 0
        L_0x009f:
            if (r1 == 0) goto L_0x01ed
            r11 = 0
            wji r1 = defpackage.wja.a()     // Catch:{ Exception -> 0x01df }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01df }
            java.lang.String r5 = "Initializing Crashlytics "
            r2.<init>(r5)     // Catch:{ Exception -> 0x01df }
            java.lang.String r5 = "2.6.7.30"
            r2.append(r5)     // Catch:{ Exception -> 0x01df }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01df }
            r1.c(r14, r2)     // Catch:{ Exception -> 0x01df }
            wlm r9 = new wlm     // Catch:{ Exception -> 0x01df }
            r9.<init>(r12)     // Catch:{ Exception -> 0x01df }
            aip r1 = new aip     // Catch:{ Exception -> 0x01df }
            java.lang.String r2 = "crash_marker"
            r1.<init>(r2, r9)     // Catch:{ Exception -> 0x01df }
            r12.b = r1     // Catch:{ Exception -> 0x01df }
            aip r1 = new aip     // Catch:{ Exception -> 0x01df }
            java.lang.String r2 = "initialization_marker"
            r1.<init>(r2, r9)     // Catch:{ Exception -> 0x01df }
            r12.m = r1     // Catch:{ Exception -> 0x01df }
            wlo r1 = new wlo     // Catch:{ Exception -> 0x01df }
            android.content.Context r2 = r12.h     // Catch:{ Exception -> 0x01df }
            java.lang.String r5 = "com.crashlytics.android.core.CrashlyticsCore"
            r1.<init>(r2, r5)     // Catch:{ Exception -> 0x01df }
            ajn r10 = new ajn     // Catch:{ Exception -> 0x01df }
            r10.<init>(r1, r12)     // Catch:{ Exception -> 0x01df }
            ajm r1 = r12.s     // Catch:{ Exception -> 0x01df }
            if (r1 == 0) goto L_0x00ea
            aiu r1 = new aiu     // Catch:{ Exception -> 0x01df }
            ajm r2 = r12.s     // Catch:{ Exception -> 0x01df }
            r1.<init>(r2)     // Catch:{ Exception -> 0x01df }
            goto L_0x00eb
        L_0x00ea:
            r1 = r11
        L_0x00eb:
            wlg r2 = new wlg     // Catch:{ Exception -> 0x01df }
            wji r5 = defpackage.wja.a()     // Catch:{ Exception -> 0x01df }
            r2.<init>(r5)     // Catch:{ Exception -> 0x01df }
            r12.t = r2     // Catch:{ Exception -> 0x01df }
            wlh r2 = r12.t     // Catch:{ Exception -> 0x01df }
            r2.a(r1)     // Catch:{ Exception -> 0x01df }
            io.fabric.sdk.android.services.common.IdManager r1 = r12.j     // Catch:{ Exception -> 0x01df }
            java.lang.String r6 = r19.getPackageName()     // Catch:{ Exception -> 0x01df }
            java.lang.String r5 = r1.d()     // Catch:{ Exception -> 0x01df }
            android.content.pm.PackageManager r2 = r19.getPackageManager()     // Catch:{ Exception -> 0x01df }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r6, r15)     // Catch:{ Exception -> 0x01df }
            int r7 = r2.versionCode     // Catch:{ Exception -> 0x01df }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ Exception -> 0x01df }
            java.lang.String r8 = r2.versionName     // Catch:{ Exception -> 0x01df }
            if (r8 != 0) goto L_0x011a
            java.lang.String r2 = "0.0"
            goto L_0x011c
        L_0x011a:
            java.lang.String r2 = r2.versionName     // Catch:{ Exception -> 0x01df }
        L_0x011c:
            r8 = r2
            aie r2 = new aie     // Catch:{ Exception -> 0x01df }
            r16 = r2
            r2 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x01df }
            ajt r8 = new ajt     // Catch:{ Exception -> 0x01df }
            ajf r2 = new ajf     // Catch:{ Exception -> 0x01df }
            r7 = r16
            java.lang.String r3 = r7.d     // Catch:{ Exception -> 0x01df }
            r2.<init>(r0, r3)     // Catch:{ Exception -> 0x01df }
            r8.<init>(r0, r2)     // Catch:{ Exception -> 0x01df }
            aiy r6 = new aiy     // Catch:{ Exception -> 0x01df }
            r6.<init>(r12)     // Catch:{ Exception -> 0x01df }
            ahn r16 = defpackage.ahi.a(r19)     // Catch:{ Exception -> 0x01df }
            wji r2 = defpackage.wja.a()     // Catch:{ Exception -> 0x01df }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01df }
            java.lang.String r4 = "Installer package name is: "
            r3.<init>(r4)     // Catch:{ Exception -> 0x01df }
            java.lang.String r4 = r7.c     // Catch:{ Exception -> 0x01df }
            r3.append(r4)     // Catch:{ Exception -> 0x01df }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01df }
            r2.a(r14, r3)     // Catch:{ Exception -> 0x01df }
            ain r5 = new ain     // Catch:{ Exception -> 0x01df }
            aim r3 = r12.u     // Catch:{ Exception -> 0x01df }
            wlh r4 = r12.t     // Catch:{ Exception -> 0x01df }
            r17 = r1
            r1 = r5
            r2 = r18
            r13 = r5
            r5 = r17
            r17 = r6
            r6 = r10
            r10 = r7
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r17
            r11 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x01df }
            r12.c = r13     // Catch:{ Exception -> 0x01df }
            aip r1 = r12.m     // Catch:{ Exception -> 0x01df }
            java.io.File r1 = r1.b()     // Catch:{ Exception -> 0x01df }
            boolean r1 = r1.exists()     // Catch:{ Exception -> 0x01df }
            aim r2 = r12.u     // Catch:{ Exception -> 0x01df }
            aio$a r3 = new aio$a     // Catch:{ Exception -> 0x01df }
            aip r4 = r12.b     // Catch:{ Exception -> 0x01df }
            r3.<init>(r4)     // Catch:{ Exception -> 0x01df }
            java.lang.Object r2 = r2.a(r3)     // Catch:{ Exception -> 0x01df }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x01df }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x01df }
            r3.equals(r2)     // Catch:{ Exception -> 0x01df }
            wkc r2 = new wkc     // Catch:{ Exception -> 0x01df }
            r2.<init>()     // Catch:{ Exception -> 0x01df }
            boolean r2 = r2.a(r0)     // Catch:{ Exception -> 0x01df }
            ain r3 = r12.c     // Catch:{ Exception -> 0x01df }
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ Exception -> 0x01df }
            aim r5 = r3.e     // Catch:{ Exception -> 0x01df }
            ain$4 r6 = new ain$4     // Catch:{ Exception -> 0x01df }
            r6.<init>()     // Catch:{ Exception -> 0x01df }
            r5.b(r6)     // Catch:{ Exception -> 0x01df }
            ain$22 r5 = new ain$22     // Catch:{ Exception -> 0x01df }
            r5.<init>()     // Catch:{ Exception -> 0x01df }
            aiv r6 = new aiv     // Catch:{ Exception -> 0x01df }
            ain$c r7 = new ain$c     // Catch:{ Exception -> 0x01df }
            r7.<init>(r15)     // Catch:{ Exception -> 0x01df }
            r6.<init>(r5, r7, r2, r4)     // Catch:{ Exception -> 0x01df }
            r3.l = r6     // Catch:{ Exception -> 0x01df }
            aiv r2 = r3.l     // Catch:{ Exception -> 0x01df }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r2)     // Catch:{ Exception -> 0x01df }
            if (r1 == 0) goto L_0x01d4
            boolean r0 = io.fabric.sdk.android.services.common.CommonUtils.m(r19)     // Catch:{ Exception -> 0x01df }
            if (r0 == 0) goto L_0x01d4
            wji r0 = defpackage.wja.a()     // Catch:{ Exception -> 0x01df }
            java.lang.String r1 = "Crashlytics did not finish previous background initialization. Initializing synchronously."
            r0.a(r14, r1)     // Catch:{ Exception -> 0x01df }
            r18.l()     // Catch:{ Exception -> 0x01df }
            return r15
        L_0x01d4:
            wji r0 = defpackage.wja.a()
            java.lang.String r1 = "Exception handling initialization successful"
            r0.a(r14, r1)
            r0 = 1
            return r0
        L_0x01df:
            r0 = move-exception
            wji r1 = defpackage.wja.a()
            java.lang.String r2 = "Crashlytics was not started due to an exception during initialization"
            r1.c(r14, r2, r0)
            r1 = 0
            r12.c = r1
            return r15
        L_0x01ed:
            io.fabric.sdk.android.services.concurrency.UnmetDependencyException r0 = new io.fabric.sdk.android.services.concurrency.UnmetDependencyException
            r0.<init>(r2)
            goto L_0x01f4
        L_0x01f3:
            throw r0
        L_0x01f4:
            goto L_0x01f3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aio.a(android.content.Context):boolean");
    }

    public static boolean c(String str) {
        aio k = k();
        if (k != null && k.c != null) {
            return true;
        }
        wji a2 = wja.a();
        StringBuilder sb = new StringBuilder("Crashlytics must be initialized by calling Fabric.with(Context) ");
        sb.append(str);
        a2.c("CrashlyticsCore", sb.toString(), null);
        return false;
    }

    private static String d(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > 1024 ? trim.substring(0, 1024) : trim;
    }

    private static aio k() {
        return (aio) wja.a(aio.class);
    }

    private void l() {
        AnonymousClass1 r0 = new wkl<Void>() {
            public final Priority a() {
                return Priority.IMMEDIATE;
            }

            public final /* synthetic */ Object call() {
                return aio.this.e();
            }
        };
        for (wkq a2 : this.g.c()) {
            r0.a(a2);
        }
        Future submit = this.f.a.submit(r0);
        String str = "CrashlyticsCore";
        wja.a().a(str, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            wja.a().c(str, "Crashlytics was interrupted during initialization.", e2);
        } catch (ExecutionException e3) {
            wja.a().c(str, "Problem encountered during Crashlytics initialization.", e3);
        } catch (TimeoutException e4) {
            wja.a().c(str, "Crashlytics timed out during initialization.", e4);
        }
    }

    private void m() {
        this.u.b(new Callable<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Boolean call() {
                String str = "CrashlyticsCore";
                try {
                    boolean delete = aio.this.m.b().delete();
                    wji a2 = wja.a();
                    StringBuilder sb = new StringBuilder("Initialization marker file removed: ");
                    sb.append(delete);
                    a2.a(str, sb.toString());
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    wja.a().c(str, "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            }
        });
    }

    public final String a() {
        return "2.6.7.30";
    }

    public final void a(String str) {
        if (!this.d && c("prior to logging messages.")) {
            long currentTimeMillis = System.currentTimeMillis() - this.l;
            ain ain = this.c;
            StringBuilder sb = new StringBuilder();
            sb.append(CommonUtils.b(3));
            sb.append("/");
            sb.append("CrashlyticsCore");
            sb.append(" ");
            sb.append(str);
            ain.e.b(new Callable<Void>(currentTimeMillis, sb.toString()) {
                private /* synthetic */ long a;
                private /* synthetic */ String b;

                {
                    this.a = r2;
                    this.b = r4;
                }

                public final /* synthetic */ Object call() {
                    if (!ain.this.c()) {
                        aje c2 = ain.this.w;
                        c2.a.a(this.a, this.b);
                    }
                    return null;
                }
            });
        }
    }

    public final void a(String str, String str2) {
        if (!this.d && c("prior to setting keys.")) {
            String str3 = "CrashlyticsCore";
            if (str == null) {
                Context context = this.h;
                if (context == null || !CommonUtils.h(context)) {
                    wja.a().c(str3, "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String d2 = d(str);
            if (this.a.size() < 64 || this.a.containsKey(d2)) {
                this.a.put(d2, str2 == null ? "" : d(str2));
                ain ain = this.c;
                ain.e.b(new Callable<Void>(this.a) {
                    private /* synthetic */ Map a;

                    {
                        this.a = r2;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void call() {
                        BufferedWriter bufferedWriter;
                        String str = "Failed to close key/value metadata file.";
                        String d = ain.this.i();
                        ajg ajg = new ajg(ain.this.d());
                        Map map = this.a;
                        File c = ajg.c(d);
                        BufferedWriter bufferedWriter2 = null;
                        try {
                            String a2 = ajg.a(map);
                            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), ajg.a));
                            try {
                                bufferedWriter.write(a2);
                                bufferedWriter.flush();
                            } catch (Exception e) {
                                e = e;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            bufferedWriter = null;
                            try {
                                wja.a().c("CrashlyticsCore", "Error serializing key/value metadata.", e);
                                CommonUtils.a((Closeable) bufferedWriter, str);
                                return null;
                            } catch (Throwable th) {
                                th = th;
                                bufferedWriter2 = bufferedWriter;
                                CommonUtils.a((Closeable) bufferedWriter2, str);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            CommonUtils.a((Closeable) bufferedWriter2, str);
                            throw th;
                        }
                        CommonUtils.a((Closeable) bufferedWriter, str);
                        return null;
                    }
                });
                return;
            }
            wja.a().a(str3, "Exceeded maximum number of custom attributes (64)");
        }
    }

    public final String b() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    public final void b(String str) {
        if (!this.d && c("prior to setting user data.")) {
            this.o = d(str);
            ain ain = this.c;
            ain.e.b(new Callable<Void>(this.o, null, null) {
                private /* synthetic */ String a;
                private /* synthetic */ String b;
                private /* synthetic */ String c;

                {
                    this.a = r2;
                    this.b = r3;
                    this.c = r4;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    BufferedWriter bufferedWriter;
                    String str = "Failed to close user metadata file.";
                    String d2 = ain.this.i();
                    ajg ajg = new ajg(ain.this.d());
                    aka aka = new aka(this.a, this.b, this.c);
                    File b2 = ajg.b(d2);
                    BufferedWriter bufferedWriter2 = null;
                    try {
                        String a2 = ajg.a(aka);
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b2), ajg.a));
                        try {
                            bufferedWriter.write(a2);
                            bufferedWriter.flush();
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bufferedWriter = null;
                        try {
                            wja.a().c("CrashlyticsCore", "Error serializing user metadata.", e);
                            CommonUtils.a((Closeable) bufferedWriter, str);
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter2 = bufferedWriter;
                            CommonUtils.a((Closeable) bufferedWriter2, str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        CommonUtils.a((Closeable) bufferedWriter2, str);
                        throw th;
                    }
                    CommonUtils.a((Closeable) bufferedWriter, str);
                    return null;
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Void e() {
        boolean z;
        String str = "CrashlyticsCore";
        this.u.a((Callable<T>) new Callable<Void>() {
            public final /* synthetic */ Object call() {
                aio.this.m.a();
                wja.a().a("CrashlyticsCore", "Initialization marker file created.");
                return null;
            }
        });
        ain ain = this.c;
        ain.e.a((Runnable) new Runnable() {
            public final void run() {
                String str;
                File[] a2;
                ain ain = ain.this;
                File[] a3 = ain.a((FilenameFilter) new f());
                HashSet hashSet = new HashSet();
                int length = a3.length;
                int i = 0;
                while (true) {
                    str = "CrashlyticsCore";
                    if (i >= length) {
                        break;
                    }
                    File file = a3[i];
                    wji a4 = wja.a();
                    StringBuilder sb = new StringBuilder("Found invalid session part file: ");
                    sb.append(file);
                    a4.a(str, sb.toString());
                    hashSet.add(ain.a(file));
                    i++;
                }
                if (!hashSet.isEmpty()) {
                    File g = ain.g();
                    if (!g.exists()) {
                        g.mkdir();
                    }
                    for (File file2 : ain.a((FilenameFilter) new FilenameFilter(hashSet) {
                        private /* synthetic */ Set a;

                        {
                            this.a = r2;
                        }

                        public final boolean accept(File file, String str) {
                            if (str.length() < 35) {
                                return false;
                            }
                            return this.a.contains(str.substring(0, 35));
                        }
                    })) {
                        wji a5 = wja.a();
                        StringBuilder sb2 = new StringBuilder("Moving session file: ");
                        sb2.append(file2);
                        a5.a(str, sb2.toString());
                        if (!file2.renameTo(new File(g, file2.getName()))) {
                            wji a6 = wja.a();
                            StringBuilder sb3 = new StringBuilder("Could not move session file. Deleting ");
                            sb3.append(file2);
                            a6.a(str, sb3.toString());
                            file2.delete();
                        }
                    }
                    ain.b();
                }
            }
        });
        try {
            aja aja = this.c.j;
            boolean z2 = true;
            if (!aja.d.getAndSet(true)) {
                Intent registerReceiver = aja.e.registerReceiver(null, aja.a);
                int i = -1;
                if (registerReceiver != null) {
                    i = registerReceiver.getIntExtra("status", -1);
                }
                if (i != 2) {
                    if (i != 5) {
                        z = false;
                        aja.h = z;
                        aja.e.registerReceiver(aja.g, aja.b);
                        aja.e.registerReceiver(aja.f, aja.c);
                    }
                }
                z = true;
                aja.h = z;
                aja.e.registerReceiver(aja.g, aja.b);
                aja.e.registerReceiver(aja.f, aja.c);
            }
            wmh a2 = defpackage.wmf.a.a.a();
            if (a2 == null) {
                wja.a().d(str, "Received null settings, skipping report submission!");
                m();
                return null;
            }
            ain ain2 = this.c;
            if (a2.d.d && ain2.k.a()) {
                wja.a().a(str, "Registered Firebase Analytics event listener");
            }
            if (!a2.d.b) {
                wja.a().a(str, "Collection of crash reports disabled in Crashlytics settings.");
                m();
                return null;
            }
            new wkc();
            if (!wkc.b(this.h)) {
                wja.a().a(str, "Automatic collection of crash reports disabled by Firebase settings.");
                m();
                return null;
            }
            ais d2 = this.e != null ? this.e.d() : null;
            if (d2 != null) {
                ain ain3 = this.c;
                if (d2 != null) {
                    z2 = ((Boolean) ain3.e.a((Callable<T>) new Callable<Boolean>(d2) {
                        private /* synthetic */ ais a;

                        {
                            this.a = r2;
                        }

                        public final /* synthetic */ Object call() {
                            TreeSet<File> treeSet = this.a.a;
                            String e = ain.e(ain.this);
                            if (e != null && !treeSet.isEmpty()) {
                                File file = (File) treeSet.first();
                                if (file != null) {
                                    ain ain = ain.this;
                                    ain.a(ain, ain.d.h, file, e);
                                }
                            }
                            ain.a(ain.this, (Set) treeSet);
                            return Boolean.TRUE;
                        }
                    })).booleanValue();
                }
                if (!z2) {
                    wja.a().a(str, "Could not finalize previous NDK sessions.");
                }
            }
            ain ain4 = this.c;
            if (!((Boolean) ain4.e.a((Callable<T>) new Callable<Boolean>(a2.b) {
                private /* synthetic */ wme a;

                {
                    this.a = r2;
                }

                public final /* synthetic */ Object call() {
                    String str = "CrashlyticsCore";
                    if (ain.this.c()) {
                        wja.a().a(str, "Skipping session finalization because a crash has already occurred.");
                        return Boolean.FALSE;
                    }
                    wja.a().a(str, "Finalizing previously open sessions.");
                    ain.this.a(this.a, true);
                    wja.a().a(str, "Closed all previously open sessions");
                    return Boolean.TRUE;
                }
            })).booleanValue()) {
                wja.a().a(str, "Could not finalize previous sessions.");
            }
            ain ain5 = this.c;
            float f = this.r;
            if (a2 == null) {
                wja.a().d(str, "Could not send reports. Settings are not available.");
            } else {
                new ajs(ain5.g.a, ain5.a(a2.a.c, a2.a.d), ain5.h, ain5.i).a(f, ain5.a(a2) ? new h(ain5.d, ain5.f, a2.c) : new a());
            }
            m();
            return null;
        } catch (Exception e2) {
            wja.a().c(str, "Crashlytics encountered a problem during asynchronous initialization.", e2);
        } catch (Throwable th) {
            m();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    public final String f() {
        if (this.j.a) {
            return this.o;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final String g() {
        boolean z = this.j.a;
        return null;
    }

    public final boolean g_() {
        return a(this.h);
    }

    /* access modifiers changed from: 0000 */
    public final String h() {
        boolean z = this.j.a;
        return null;
    }
}
