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

@vwd(a = {aif.class})
/* renamed from: aia reason: default package */
public class aia extends vuz<Void> {
    final ConcurrentHashMap<String, String> a;
    aib b;
    public ahz c;
    public boolean d;
    public aif e;
    private final long l;
    /* access modifiers changed from: private */
    public aib m;
    private aid n;
    private String o;
    private String p;
    private String q;
    private float r;
    private final aiy s;
    private vxb t;
    private ahy u;

    /* renamed from: aia$a */
    static final class a implements Callable<Boolean> {
        private final aib a;

        public a(aib aib) {
            this.a = aib;
        }

        public final /* synthetic */ Object call() {
            if (!this.a.b().exists()) {
                return Boolean.FALSE;
            }
            vuu.a().a("CrashlyticsCore", "Found previous crash marker.");
            this.a.b().delete();
            return Boolean.TRUE;
        }
    }

    /* renamed from: aia$b */
    static final class b implements aid {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    public final String a() {
        return "2.6.7.30";
    }

    public final String b() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    public aia() {
        this(1.0f, null, null, false);
    }

    private aia(float f, aid aid, aiy aiy, boolean z, ExecutorService executorService) {
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = f;
        if (aid == null) {
            aid = new b(0);
        }
        this.n = aid;
        this.s = aiy;
        this.d = z;
        this.u = new ahy(executorService);
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
            vvw r1 = new vvw
            r1.<init>()
            boolean r1 = defpackage.vvw.b(r19)
            r13 = 1
            java.lang.String r14 = "CrashlyticsCore"
            if (r1 != 0) goto L_0x001d
            vvc r1 = defpackage.vuu.a()
            java.lang.String r2 = "Crashlytics is disabled, because data collection is disabled by Firebase."
            r1.a(r14, r2)
            r12.d = r13
        L_0x001d:
            boolean r1 = r12.d
            r15 = 0
            if (r1 == 0) goto L_0x0023
            return r15
        L_0x0023:
            vvo r1 = new vvo
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
            vvc r1 = defpackage.vuu.a()
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
            vvc r1 = defpackage.vuu.a()     // Catch:{ Exception -> 0x01df }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01df }
            java.lang.String r5 = "Initializing Crashlytics "
            r2.<init>(r5)     // Catch:{ Exception -> 0x01df }
            java.lang.String r5 = "2.6.7.30"
            r2.append(r5)     // Catch:{ Exception -> 0x01df }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01df }
            r1.c(r14, r2)     // Catch:{ Exception -> 0x01df }
            vxg r9 = new vxg     // Catch:{ Exception -> 0x01df }
            r9.<init>(r12)     // Catch:{ Exception -> 0x01df }
            aib r1 = new aib     // Catch:{ Exception -> 0x01df }
            java.lang.String r2 = "crash_marker"
            r1.<init>(r2, r9)     // Catch:{ Exception -> 0x01df }
            r12.b = r1     // Catch:{ Exception -> 0x01df }
            aib r1 = new aib     // Catch:{ Exception -> 0x01df }
            java.lang.String r2 = "initialization_marker"
            r1.<init>(r2, r9)     // Catch:{ Exception -> 0x01df }
            r12.m = r1     // Catch:{ Exception -> 0x01df }
            vxi r1 = new vxi     // Catch:{ Exception -> 0x01df }
            android.content.Context r2 = r12.h     // Catch:{ Exception -> 0x01df }
            java.lang.String r5 = "com.crashlytics.android.core.CrashlyticsCore"
            r1.<init>(r2, r5)     // Catch:{ Exception -> 0x01df }
            aiz r10 = new aiz     // Catch:{ Exception -> 0x01df }
            r10.<init>(r1, r12)     // Catch:{ Exception -> 0x01df }
            aiy r1 = r12.s     // Catch:{ Exception -> 0x01df }
            if (r1 == 0) goto L_0x00ea
            aig r1 = new aig     // Catch:{ Exception -> 0x01df }
            aiy r2 = r12.s     // Catch:{ Exception -> 0x01df }
            r1.<init>(r2)     // Catch:{ Exception -> 0x01df }
            goto L_0x00eb
        L_0x00ea:
            r1 = r11
        L_0x00eb:
            vxa r2 = new vxa     // Catch:{ Exception -> 0x01df }
            vvc r5 = defpackage.vuu.a()     // Catch:{ Exception -> 0x01df }
            r2.<init>(r5)     // Catch:{ Exception -> 0x01df }
            r12.t = r2     // Catch:{ Exception -> 0x01df }
            vxb r2 = r12.t     // Catch:{ Exception -> 0x01df }
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
            ahq r2 = new ahq     // Catch:{ Exception -> 0x01df }
            r16 = r2
            r2 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x01df }
            ajf r8 = new ajf     // Catch:{ Exception -> 0x01df }
            air r2 = new air     // Catch:{ Exception -> 0x01df }
            r7 = r16
            java.lang.String r3 = r7.d     // Catch:{ Exception -> 0x01df }
            r2.<init>(r0, r3)     // Catch:{ Exception -> 0x01df }
            r8.<init>(r0, r2)     // Catch:{ Exception -> 0x01df }
            aik r6 = new aik     // Catch:{ Exception -> 0x01df }
            r6.<init>(r12)     // Catch:{ Exception -> 0x01df }
            agz r16 = defpackage.agu.a(r19)     // Catch:{ Exception -> 0x01df }
            vvc r2 = defpackage.vuu.a()     // Catch:{ Exception -> 0x01df }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01df }
            java.lang.String r4 = "Installer package name is: "
            r3.<init>(r4)     // Catch:{ Exception -> 0x01df }
            java.lang.String r4 = r7.c     // Catch:{ Exception -> 0x01df }
            r3.append(r4)     // Catch:{ Exception -> 0x01df }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01df }
            r2.a(r14, r3)     // Catch:{ Exception -> 0x01df }
            ahz r5 = new ahz     // Catch:{ Exception -> 0x01df }
            ahy r3 = r12.u     // Catch:{ Exception -> 0x01df }
            vxb r4 = r12.t     // Catch:{ Exception -> 0x01df }
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
            aib r1 = r12.m     // Catch:{ Exception -> 0x01df }
            java.io.File r1 = r1.b()     // Catch:{ Exception -> 0x01df }
            boolean r1 = r1.exists()     // Catch:{ Exception -> 0x01df }
            ahy r2 = r12.u     // Catch:{ Exception -> 0x01df }
            aia$a r3 = new aia$a     // Catch:{ Exception -> 0x01df }
            aib r4 = r12.b     // Catch:{ Exception -> 0x01df }
            r3.<init>(r4)     // Catch:{ Exception -> 0x01df }
            java.lang.Object r2 = r2.a(r3)     // Catch:{ Exception -> 0x01df }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x01df }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x01df }
            r3.equals(r2)     // Catch:{ Exception -> 0x01df }
            vvw r2 = new vvw     // Catch:{ Exception -> 0x01df }
            r2.<init>()     // Catch:{ Exception -> 0x01df }
            boolean r2 = r2.a(r0)     // Catch:{ Exception -> 0x01df }
            ahz r3 = r12.c     // Catch:{ Exception -> 0x01df }
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ Exception -> 0x01df }
            ahy r5 = r3.e     // Catch:{ Exception -> 0x01df }
            ahz$4 r6 = new ahz$4     // Catch:{ Exception -> 0x01df }
            r6.<init>()     // Catch:{ Exception -> 0x01df }
            r5.b(r6)     // Catch:{ Exception -> 0x01df }
            ahz$22 r5 = new ahz$22     // Catch:{ Exception -> 0x01df }
            r5.<init>()     // Catch:{ Exception -> 0x01df }
            aih r6 = new aih     // Catch:{ Exception -> 0x01df }
            ahz$c r7 = new ahz$c     // Catch:{ Exception -> 0x01df }
            r7.<init>(r15)     // Catch:{ Exception -> 0x01df }
            r6.<init>(r5, r7, r2, r4)     // Catch:{ Exception -> 0x01df }
            r3.l = r6     // Catch:{ Exception -> 0x01df }
            aih r2 = r3.l     // Catch:{ Exception -> 0x01df }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r2)     // Catch:{ Exception -> 0x01df }
            if (r1 == 0) goto L_0x01d4
            boolean r0 = io.fabric.sdk.android.services.common.CommonUtils.m(r19)     // Catch:{ Exception -> 0x01df }
            if (r0 == 0) goto L_0x01d4
            vvc r0 = defpackage.vuu.a()     // Catch:{ Exception -> 0x01df }
            java.lang.String r1 = "Crashlytics did not finish previous background initialization. Initializing synchronously."
            r0.a(r14, r1)     // Catch:{ Exception -> 0x01df }
            r18.l()     // Catch:{ Exception -> 0x01df }
            return r15
        L_0x01d4:
            vvc r0 = defpackage.vuu.a()
            java.lang.String r1 = "Exception handling initialization successful"
            r0.a(r14, r1)
            r0 = 1
            return r0
        L_0x01df:
            r0 = move-exception
            vvc r1 = defpackage.vuu.a()
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aia.a(android.content.Context):boolean");
    }

    private static aia k() {
        return (aia) vuu.a(aia.class);
    }

    public final void b(String str) {
        if (!this.d && c("prior to setting user data.")) {
            this.o = d(str);
            ahz ahz = this.c;
            ahz.e.b(new Callable<Void>(this.o, null, null) {
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
                    String d2 = ahz.this.i();
                    ais ais = new ais(ahz.this.d());
                    ajm ajm = new ajm(this.a, this.b, this.c);
                    File b2 = ais.b(d2);
                    BufferedWriter bufferedWriter2 = null;
                    try {
                        String a2 = ais.a(ajm);
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b2), ais.a));
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
                            vuu.a().c("CrashlyticsCore", "Error serializing user metadata.", e);
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

    public final void a(String str, String str2) {
        String str3;
        if (!this.d && c("prior to setting keys.")) {
            String str4 = "CrashlyticsCore";
            if (str == null) {
                Context context = this.h;
                if (context == null || !CommonUtils.h(context)) {
                    vuu.a().c(str4, "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String d2 = d(str);
            if (this.a.size() < 64 || this.a.containsKey(d2)) {
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = d(str2);
                }
                this.a.put(d2, str3);
                ahz ahz = this.c;
                ahz.e.b(new Callable<Void>(this.a) {
                    private /* synthetic */ Map a;

                    {
                        this.a = r2;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void call() {
                        BufferedWriter bufferedWriter;
                        String str = "Failed to close key/value metadata file.";
                        String d = ahz.this.i();
                        ais ais = new ais(ahz.this.d());
                        Map map = this.a;
                        File c = ais.c(d);
                        BufferedWriter bufferedWriter2 = null;
                        try {
                            String a2 = ais.a(map);
                            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), ais.a));
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
                                vuu.a().c("CrashlyticsCore", "Error serializing key/value metadata.", e);
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
            vuu.a().a(str4, "Exceeded maximum number of custom attributes (64)");
        }
    }

    private void l() {
        AnonymousClass1 r0 = new vwf<Void>() {
            public final Priority a() {
                return Priority.IMMEDIATE;
            }

            public final /* synthetic */ Object call() {
                return aia.this.e();
            }
        };
        for (vwk a2 : this.g.c()) {
            r0.a(a2);
        }
        Future submit = this.f.a.submit(r0);
        String str = "CrashlyticsCore";
        vuu.a().a(str, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            vuu.a().c(str, "Crashlytics was interrupted during initialization.", e2);
        } catch (ExecutionException e3) {
            vuu.a().c(str, "Problem encountered during Crashlytics initialization.", e3);
        } catch (TimeoutException e4) {
            vuu.a().c(str, "Crashlytics timed out during initialization.", e4);
        }
    }

    private void m() {
        this.u.b(new Callable<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Boolean call() {
                String str = "CrashlyticsCore";
                try {
                    boolean delete = aia.this.m.b().delete();
                    vvc a2 = vuu.a();
                    StringBuilder sb = new StringBuilder("Initialization marker file removed: ");
                    sb.append(delete);
                    a2.a(str, sb.toString());
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    vuu.a().c(str, "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            }
        });
    }

    public static boolean c(String str) {
        aia k = k();
        if (k != null && k.c != null) {
            return true;
        }
        vvc a2 = vuu.a();
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

    private aia(float f, aid aid, aiy aiy, boolean z) {
        String str = "Crashlytics Exception Handler";
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(vvt.a(str));
        vvt.a(str, newSingleThreadExecutor);
        this(1.0f, null, null, false, newSingleThreadExecutor);
    }

    public final boolean g_() {
        return a(this.h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Void e() {
        boolean z;
        String str = "CrashlyticsCore";
        this.u.a((Callable<T>) new Callable<Void>() {
            public final /* synthetic */ Object call() {
                aia.this.m.a();
                vuu.a().a("CrashlyticsCore", "Initialization marker file created.");
                return null;
            }
        });
        ahz ahz = this.c;
        ahz.e.a((Runnable) new Runnable() {
            public final void run() {
                String str;
                File[] a2;
                ahz ahz = ahz.this;
                File[] a3 = ahz.a((FilenameFilter) new f());
                HashSet hashSet = new HashSet();
                int length = a3.length;
                int i = 0;
                while (true) {
                    str = "CrashlyticsCore";
                    if (i >= length) {
                        break;
                    }
                    File file = a3[i];
                    vvc a4 = vuu.a();
                    StringBuilder sb = new StringBuilder("Found invalid session part file: ");
                    sb.append(file);
                    a4.a(str, sb.toString());
                    hashSet.add(ahz.a(file));
                    i++;
                }
                if (!hashSet.isEmpty()) {
                    File g = ahz.g();
                    if (!g.exists()) {
                        g.mkdir();
                    }
                    for (File file2 : ahz.a((FilenameFilter) new FilenameFilter(hashSet) {
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
                        vvc a5 = vuu.a();
                        StringBuilder sb2 = new StringBuilder("Moving session file: ");
                        sb2.append(file2);
                        a5.a(str, sb2.toString());
                        if (!file2.renameTo(new File(g, file2.getName()))) {
                            vvc a6 = vuu.a();
                            StringBuilder sb3 = new StringBuilder("Could not move session file. Deleting ");
                            sb3.append(file2);
                            a6.a(str, sb3.toString());
                            file2.delete();
                        }
                    }
                    ahz.b();
                }
            }
        });
        try {
            aim aim = this.c.j;
            boolean z2 = true;
            if (!aim.d.getAndSet(true)) {
                Intent registerReceiver = aim.e.registerReceiver(null, aim.a);
                int i = -1;
                if (registerReceiver != null) {
                    i = registerReceiver.getIntExtra("status", -1);
                }
                if (i != 2) {
                    if (i != 5) {
                        z = false;
                        aim.h = z;
                        aim.e.registerReceiver(aim.g, aim.b);
                        aim.e.registerReceiver(aim.f, aim.c);
                    }
                }
                z = true;
                aim.h = z;
                aim.e.registerReceiver(aim.g, aim.b);
                aim.e.registerReceiver(aim.f, aim.c);
            }
            vyb a2 = defpackage.vxz.a.a.a();
            if (a2 == null) {
                vuu.a().d(str, "Received null settings, skipping report submission!");
                m();
                return null;
            }
            ahz ahz2 = this.c;
            if (a2.d.d && ahz2.k.a()) {
                vuu.a().a(str, "Registered Firebase Analytics event listener");
            }
            if (!a2.d.b) {
                vuu.a().a(str, "Collection of crash reports disabled in Crashlytics settings.");
                m();
                return null;
            }
            new vvw();
            if (!vvw.b(this.h)) {
                vuu.a().a(str, "Automatic collection of crash reports disabled by Firebase settings.");
                m();
                return null;
            }
            aie d2 = this.e != null ? this.e.d() : null;
            if (d2 != null) {
                ahz ahz3 = this.c;
                if (d2 != null) {
                    z2 = ((Boolean) ahz3.e.a((Callable<T>) new Callable<Boolean>(d2) {
                        private /* synthetic */ aie a;

                        {
                            this.a = r2;
                        }

                        public final /* synthetic */ Object call() {
                            TreeSet<File> treeSet = this.a.a;
                            String e = ahz.e(ahz.this);
                            if (e != null && !treeSet.isEmpty()) {
                                File file = (File) treeSet.first();
                                if (file != null) {
                                    ahz ahz = ahz.this;
                                    ahz.a(ahz, ahz.d.h, file, e);
                                }
                            }
                            ahz.a(ahz.this, (Set) treeSet);
                            return Boolean.TRUE;
                        }
                    })).booleanValue();
                }
                if (!z2) {
                    vuu.a().a(str, "Could not finalize previous NDK sessions.");
                }
            }
            ahz ahz4 = this.c;
            if (!((Boolean) ahz4.e.a((Callable<T>) new Callable<Boolean>(a2.b) {
                private /* synthetic */ vxy a;

                {
                    this.a = r2;
                }

                public final /* synthetic */ Object call() {
                    String str = "CrashlyticsCore";
                    if (ahz.this.c()) {
                        vuu.a().a(str, "Skipping session finalization because a crash has already occurred.");
                        return Boolean.FALSE;
                    }
                    vuu.a().a(str, "Finalizing previously open sessions.");
                    ahz.this.a(this.a, true);
                    vuu.a().a(str, "Closed all previously open sessions");
                    return Boolean.TRUE;
                }
            })).booleanValue()) {
                vuu.a().a(str, "Could not finalize previous sessions.");
            }
            ahz ahz5 = this.c;
            float f = this.r;
            if (a2 == null) {
                vuu.a().d(str, "Could not send reports. Settings are not available.");
            } else {
                new aje(ahz5.g.a, ahz5.a(a2.a.c, a2.a.d), ahz5.h, ahz5.i).a(f, ahz5.a(a2) ? new h(ahz5.d, ahz5.f, a2.c) : new a());
            }
            m();
            return null;
        } catch (Exception e2) {
            vuu.a().c(str, "Crashlytics encountered a problem during asynchronous initialization.", e2);
        } catch (Throwable th) {
            m();
            throw th;
        }
    }

    public final void a(String str) {
        if (!this.d && c("prior to logging messages.")) {
            long currentTimeMillis = System.currentTimeMillis() - this.l;
            ahz ahz = this.c;
            StringBuilder sb = new StringBuilder();
            sb.append(CommonUtils.b(3));
            sb.append("/");
            sb.append("CrashlyticsCore");
            sb.append(" ");
            sb.append(str);
            ahz.e.b(new Callable<Void>(currentTimeMillis, sb.toString()) {
                private /* synthetic */ long a;
                private /* synthetic */ String b;

                {
                    this.a = r2;
                    this.b = r4;
                }

                public final /* synthetic */ Object call() {
                    if (!ahz.this.c()) {
                        aiq c2 = ahz.this.w;
                        c2.a.a(this.a, this.b);
                    }
                    return null;
                }
            });
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

    /* access modifiers changed from: 0000 */
    public final String h() {
        boolean z = this.j.a;
        return null;
    }
}
