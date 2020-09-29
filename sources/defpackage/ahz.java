package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.crashlytics.android.core.CodedOutputStream;
import com.crashlytics.android.core.CrashlyticsController$18$1;
import com.crashlytics.android.core.CrashlyticsController$20$1;
import com.crashlytics.android.core.CrashlyticsController$22$1;
import com.crashlytics.android.core.CrashlyticsController$24$1;
import com.crashlytics.android.core.Report;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* renamed from: ahz reason: default package */
public final class ahz {
    static final FilenameFilter a = new FilenameFilter() {
        public final boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(".cls");
        }
    };
    static final FileFilter b = new FileFilter() {
        public final boolean accept(File file) {
            return file.isDirectory() && file.getName().length() == 35;
        }
    };
    static final Comparator<File> c = new Comparator<File>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((File) obj).getName().compareTo(((File) obj2).getName());
        }
    };
    private static FilenameFilter m = new d("BeginSession") {
        public final boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(".cls");
        }
    };
    private static Comparator<File> n = new Comparator<File>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };
    /* access modifiers changed from: private */
    public static final Pattern o = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map<String, String> p = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    private static final String[] q = {"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};
    /* access modifiers changed from: 0000 */
    public final aia d;
    public final ahy e;
    final aiz f;
    /* access modifiers changed from: 0000 */
    public final ahq g;
    final c h;
    final b i;
    final aim j;
    final ahr k;
    aih l;
    private final AtomicInteger r = new AtomicInteger(0);
    private final vxb s;
    private final IdManager t;
    private final vxf u;
    private final g v;
    /* access modifiers changed from: private */
    public final aiq w;
    private final ajj x;
    /* access modifiers changed from: private */
    public final String y;
    private final agz z;

    /* renamed from: ahz$a */
    static class a implements FilenameFilter {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final boolean accept(File file, String str) {
            return !ahz.a.accept(file, str) && ahz.o.matcher(str).matches();
        }
    }

    /* renamed from: ahz$b */
    interface b {
        void a(CodedOutputStream codedOutputStream);
    }

    /* renamed from: ahz$c */
    static final class c implements b {
        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public final vyb a() {
            return defpackage.vxz.a.a.a();
        }
    }

    /* renamed from: ahz$d */
    static class d implements FilenameFilter {
        private final String a;

        public d(String str) {
            this.a = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.a) && !str.endsWith(".cls_temp");
        }
    }

    /* renamed from: ahz$e */
    interface e {
        void a(FileOutputStream fileOutputStream);
    }

    /* renamed from: ahz$f */
    static class f implements FilenameFilter {
        f() {
        }

        public final boolean accept(File file, String str) {
            return ahv.a.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    /* renamed from: ahz$g */
    static final class g implements defpackage.aiq.a {
        private final vxf a;

        public g(vxf vxf) {
            this.a = vxf;
        }

        public final File a() {
            File file = new File(this.a.a(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* renamed from: ahz$h */
    static final class h implements d {
        final aiz a;
        private final vuz b;
        private final vxx c;

        public h(vuz vuz, aiz aiz, vxx vxx) {
            this.b = vuz;
            this.a = aiz;
            this.c = vxx;
        }

        public final boolean a() {
            vuu vuu = this.b.f;
            Activity activity = vuu.b != null ? (Activity) vuu.b.get() : null;
            if (activity == null || activity.isFinishing()) {
                return true;
            }
            final ahx a2 = ahx.a(activity, this.c, new a() {
                public final void a(boolean z) {
                    aiz aiz = h.this.a;
                    aiz.a.a(aiz.a.b().putBoolean("always_send_reports_opt_in", true));
                }
            });
            activity.runOnUiThread(new Runnable() {
                public final void run() {
                    a2.b.show();
                }
            });
            vuu.a().a("CrashlyticsCore", "Waiting for user opt-in.");
            try {
                a2.a.b.await();
            } catch (InterruptedException unused) {
            }
            return a2.a.a;
        }
    }

    /* renamed from: ahz$i */
    final class i implements c {
        private i() {
        }

        /* synthetic */ i(ahz ahz, byte b) {
            this();
        }

        public final File[] a() {
            return ahz.this.a();
        }

        public final File[] b() {
            return ahz.this.g().listFiles();
        }

        public final File[] c() {
            ahz ahz = ahz.this;
            return ahz.a(ahz.d().listFiles(ahz.b));
        }
    }

    /* renamed from: ahz$j */
    final class j implements b {
        private j() {
        }

        /* synthetic */ j(ahz ahz, byte b) {
            this();
        }

        public final boolean a() {
            return ahz.this.c();
        }
    }

    /* renamed from: ahz$k */
    static final class k implements Runnable {
        private final Context a;
        private final Report b;
        private final aje c;

        public k(Context context, Report report, aje aje) {
            this.a = context;
            this.b = report;
            this.c = aje;
        }

        public final void run() {
            if (CommonUtils.m(this.a)) {
                vuu.a().a("CrashlyticsCore", "Attempting to send crash report at time of crash...");
                this.c.a(this.b);
            }
        }
    }

    /* renamed from: ahz$l */
    static class l implements FilenameFilter {
        private final String a;

        public l(String str) {
            this.a = str;
        }

        public final boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(".cls");
            if (!str.equals(sb.toString()) && str.contains(this.a) && !str.endsWith(".cls_temp")) {
                return true;
            }
            return false;
        }
    }

    static File[] a(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    ahz(aia aia, ahy ahy, vxb vxb, IdManager idManager, aiz aiz, vxf vxf, ahq ahq, ajl ajl, ahr ahr, agz agz) {
        this.d = aia;
        this.e = ahy;
        this.s = vxb;
        this.t = idManager;
        this.f = aiz;
        this.u = vxf;
        this.g = ahq;
        this.y = ajl.a();
        this.k = ahr;
        this.z = agz;
        Context context = aia.h;
        this.v = new g(vxf);
        this.w = new aiq(context, this.v);
        this.h = new i(this, 0);
        this.i = new j(this, 0);
        this.j = new aim(context);
        this.x = new ait(1024, new ajd(10));
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a(b bVar, Thread thread, Throwable th, boolean z2) {
        StringBuilder sb = new StringBuilder("Crashlytics is handling uncaught exception \"");
        sb.append(th);
        sb.append("\" from thread ");
        sb.append(thread.getName());
        vuu.a().a("CrashlyticsCore", sb.toString());
        aim aim = this.j;
        if (aim.d.getAndSet(false)) {
            aim.e.unregisterReceiver(aim.g);
            aim.e.unregisterReceiver(aim.f);
        }
        final Date date = new Date();
        ahy ahy = this.e;
        final Thread thread2 = thread;
        final Throwable th2 = th;
        final b bVar2 = bVar;
        final boolean z3 = z2;
        AnonymousClass23 r0 = new Callable<Void>() {
            public final /* synthetic */ Object call() {
                vxv vxv;
                vxy vxy;
                ahz.this.d.b.a();
                ahz.a(ahz.this, date, thread2, th2);
                vyb a2 = bVar2.a();
                if (a2 != null) {
                    vxy = a2.b;
                    vxv = a2.d;
                } else {
                    vxy = null;
                    vxv = null;
                }
                boolean z = true;
                if ((vxv == null || vxv.d) || z3) {
                    ahz.a(ahz.this, date.getTime());
                }
                ahz.this.a(vxy, false);
                ahz.b(ahz.this);
                if (vxy != null) {
                    ahz ahz = ahz.this;
                    int i = vxy.b;
                    int a3 = i - ajn.a(ahz.e(), i, ahz.c);
                    ajn.a(ahz.d(), ahz.a, a3 - ajn.a(ahz.f(), a3, ahz.c), ahz.c);
                }
                new vvw();
                if (!vvw.b(ahz.this.d.h) || ahz.this.a(a2)) {
                    z = false;
                }
                if (z) {
                    ahz.b(ahz.this, a2);
                }
                return null;
            }
        };
        ahy.a((Callable<T>) r0);
    }

    /* access modifiers changed from: private */
    public String i() {
        File[] j2 = j();
        if (j2.length > 0) {
            return a(j2[0]);
        }
        return null;
    }

    static String a(File file) {
        return file.getName().substring(0, 35);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=int, for r5v0, types: [int, boolean] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.vxy r4, int r5) {
        /*
            r3 = this;
            int r0 = r5 + 8
            r3.a(r0)
            java.io.File[] r0 = r3.j()
            int r1 = r0.length
            java.lang.String r2 = "CrashlyticsCore"
            if (r1 > r5) goto L_0x0018
            vvc r4 = defpackage.vuu.a()
            java.lang.String r5 = "No open sessions to be closed."
            r4.a(r2, r5)
            return
        L_0x0018:
            r1 = r0[r5]
            java.lang.String r1 = a(r1)
            r3.b(r1)
            if (r4 != 0) goto L_0x002d
            vvc r4 = defpackage.vuu.a()
            java.lang.String r5 = "Unable to close session. Settings are not loaded."
            r4.a(r2, r5)
            return
        L_0x002d:
            int r4 = r4.a
            r3.a(r0, r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahz.a(vxy, boolean):void");
    }

    private void a(File[] fileArr, int i2, int i3) {
        String str = "CrashlyticsCore";
        vuu.a().a(str, "Closing open sessions.");
        while (i2 < fileArr.length) {
            File file = fileArr[i2];
            String a2 = a(file);
            vvc a3 = vuu.a();
            StringBuilder sb = new StringBuilder("Closing session: ");
            sb.append(a2);
            a3.a(str, sb.toString());
            a(file, a2, i3);
            i2++;
        }
    }

    private static void a(ahv ahv) {
        if (ahv != null) {
            try {
                ahv.a();
            } catch (IOException e2) {
                vuu.a().c("CrashlyticsCore", "Error closing session file stream in the presence of an exception", e2);
            }
        }
    }

    private void b(File file) {
        if (file.isDirectory()) {
            for (File b2 : file.listFiles()) {
                b(b2);
            }
        }
        file.delete();
    }

    /* access modifiers changed from: 0000 */
    public final File[] a() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, a(e(), a));
        Collections.addAll(linkedList, a(f(), a));
        Collections.addAll(linkedList, a(d(), a));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* access modifiers changed from: 0000 */
    public File[] a(FilenameFilter filenameFilter) {
        return a(d(), filenameFilter);
    }

    private File[] a(File file, FilenameFilter filenameFilter) {
        return a(file.listFiles(filenameFilter));
    }

    private void a(String str, int i2) {
        File d2 = d();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("SessionEvent");
        ajn.a(d2, new d(sb.toString()), i2, c);
    }

    private void a(int i2) {
        HashSet hashSet = new HashSet();
        File[] j2 = j();
        int min = Math.min(i2, j2.length);
        for (int i3 = 0; i3 < min; i3++) {
            hashSet.add(a(j2[i3]));
        }
        this.w.a((Set<String>) hashSet);
        a(a((FilenameFilter) new a(0)), (Set<String>) hashSet);
    }

    private static void a(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = o.matcher(name);
            String str = "CrashlyticsCore";
            if (!matcher.matches()) {
                vvc a2 = vuu.a();
                StringBuilder sb = new StringBuilder("Deleting unknown file: ");
                sb.append(name);
                a2.a(str, sb.toString());
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                vvc a3 = vuu.a();
                StringBuilder sb2 = new StringBuilder("Trimming session file: ");
                sb2.append(name);
                a3.a(str, sb2.toString());
                file.delete();
            }
        }
    }

    private File[] a(String str, File[] fileArr, int i2) {
        if (fileArr.length <= i2) {
            return fileArr;
        }
        vuu.a().a("CrashlyticsCore", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i2)}));
        a(str, i2);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("SessionEvent");
        return a((FilenameFilter) new d(sb.toString()));
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        File g2 = g();
        if (g2.exists()) {
            File[] a2 = a(g2, (FilenameFilter) new f());
            Arrays.sort(a2, Collections.reverseOrder());
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < a2.length && hashSet.size() < 4; i2++) {
                hashSet.add(a(a2[i2]));
            }
            a(a(g2.listFiles()), (Set<String>) hashSet);
        }
    }

    private void a(byte[] bArr, File file) {
        if (bArr != null && bArr.length > 0) {
            b(bArr, file);
        }
    }

    private static void b(byte[] bArr, File file) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.finish();
                CommonUtils.a((Closeable) gZIPOutputStream2);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                CommonUtils.a((Closeable) gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.a((Closeable) gZIPOutputStream);
            throw th;
        }
    }

    private void a(String str, String str2, b bVar) {
        ahv ahv;
        String str3 = "Failed to close session ";
        String str4 = "Failed to flush to session ";
        String str5 = " file.";
        CodedOutputStream codedOutputStream = null;
        try {
            File d2 = d();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            ahv = new ahv(d2, sb.toString());
            try {
                codedOutputStream = CodedOutputStream.a((OutputStream) ahv);
                bVar.a(codedOutputStream);
                StringBuilder sb2 = new StringBuilder(str4);
                sb2.append(str2);
                sb2.append(str5);
                CommonUtils.a((Flushable) codedOutputStream, sb2.toString());
                StringBuilder sb3 = new StringBuilder(str3);
                sb3.append(str2);
                sb3.append(str5);
                CommonUtils.a((Closeable) ahv, sb3.toString());
            } catch (Throwable th) {
                th = th;
                StringBuilder sb4 = new StringBuilder(str4);
                sb4.append(str2);
                sb4.append(str5);
                CommonUtils.a((Flushable) codedOutputStream, sb4.toString());
                StringBuilder sb5 = new StringBuilder(str3);
                sb5.append(str2);
                sb5.append(str5);
                CommonUtils.a((Closeable) ahv, sb5.toString());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ahv = null;
            StringBuilder sb42 = new StringBuilder(str4);
            sb42.append(str2);
            sb42.append(str5);
            CommonUtils.a((Flushable) codedOutputStream, sb42.toString());
            StringBuilder sb52 = new StringBuilder(str3);
            sb52.append(str2);
            sb52.append(str5);
            CommonUtils.a((Closeable) ahv, sb52.toString());
            throw th;
        }
    }

    private void a(String str, String str2, e eVar) {
        String str3 = " file.";
        String str4 = "Failed to close ";
        FileOutputStream fileOutputStream = null;
        try {
            File d2 = d();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(d2, sb.toString()));
            try {
                eVar.a(fileOutputStream2);
                StringBuilder sb2 = new StringBuilder(str4);
                sb2.append(str2);
                sb2.append(str3);
                CommonUtils.a((Closeable) fileOutputStream2, sb2.toString());
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                StringBuilder sb3 = new StringBuilder(str4);
                sb3.append(str2);
                sb3.append(str3);
                CommonUtils.a((Closeable) fileOutputStream, sb3.toString());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            StringBuilder sb32 = new StringBuilder(str4);
            sb32.append(str2);
            sb32.append(str3);
            CommonUtils.a((Closeable) fileOutputStream, sb32.toString());
            throw th;
        }
    }

    private byte[] b(String str, String str2) {
        File d2 = d();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return aiw.a(new File(d2, sb.toString()));
    }

    private void b(String str) {
        final ajm c2 = c(str);
        a(str, "SessionUser", (b) new b() {
            public final void a(CodedOutputStream codedOutputStream) {
                ajg.a(codedOutputStream, c2.b, c2.c, c2.d);
            }
        });
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v2, types: [boolean]
      assigns: []
      uses: [boolean, ?[int, byte, short, char]]
      mth insns count: 76
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
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.crashlytics.android.core.CodedOutputStream r25, java.util.Date r26, java.lang.Thread r27, java.lang.Throwable r28, java.lang.String r29, boolean r30) {
        /*
            r24 = this;
            r0 = r24
            ajk r5 = new ajk
            ajj r1 = r0.x
            r2 = r28
            r5.<init>(r2, r1)
            aia r1 = r0.d
            android.content.Context r1 = r1.h
            long r2 = r26.getTime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r6
            java.lang.Float r16 = io.fabric.sdk.android.services.common.CommonUtils.c(r1)
            aim r4 = r0.j
            boolean r4 = r4.h
            int r17 = io.fabric.sdk.android.services.common.CommonUtils.a(r1, r4)
            boolean r18 = io.fabric.sdk.android.services.common.CommonUtils.d(r1)
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r13 = r4.orientation
            long r6 = io.fabric.sdk.android.services.common.CommonUtils.b()
            long r8 = io.fabric.sdk.android.services.common.CommonUtils.b(r1)
            long r19 = r6 - r8
            java.io.File r4 = android.os.Environment.getDataDirectory()
            java.lang.String r4 = r4.getPath()
            long r21 = io.fabric.sdk.android.services.common.CommonUtils.c(r4)
            java.lang.String r4 = r1.getPackageName()
            android.app.ActivityManager$RunningAppProcessInfo r12 = io.fabric.sdk.android.services.common.CommonUtils.a(r4, r1)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.lang.StackTraceElement[] r7 = r5.c
            ahq r4 = r0.g
            java.lang.String r15 = r4.b
            io.fabric.sdk.android.services.common.IdManager r4 = r0.t
            java.lang.String r14 = r4.b
            r4 = 0
            if (r30 == 0) goto L_0x009b
            java.util.Map r8 = java.lang.Thread.getAllStackTraces()
            int r10 = r8.size()
            java.lang.Thread[] r10 = new java.lang.Thread[r10]
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0072:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x0098
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r23 = r11.getKey()
            java.lang.Thread r23 = (java.lang.Thread) r23
            r10[r4] = r23
            ajj r6 = r0.x
            java.lang.Object r11 = r11.getValue()
            java.lang.StackTraceElement[] r11 = (java.lang.StackTraceElement[]) r11
            java.lang.StackTraceElement[] r6 = r6.a(r11)
            r9.add(r6)
            r6 = 1
            int r4 = r4 + r6
            goto L_0x0072
        L_0x0098:
            r6 = 1
            r8 = r10
            goto L_0x009f
        L_0x009b:
            r6 = 1
            java.lang.Thread[] r4 = new java.lang.Thread[r4]
            r8 = r4
        L_0x009f:
            java.lang.String r4 = "com.crashlytics.CollectCustomKeys"
            boolean r1 = io.fabric.sdk.android.services.common.CommonUtils.a(r1, r4, r6)
            if (r1 != 0) goto L_0x00ad
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            goto L_0x00c4
        L_0x00ad:
            aia r1 = r0.d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = r1.a
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            if (r1 == 0) goto L_0x00c4
            int r4 = r1.size()
            if (r4 <= r6) goto L_0x00c4
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>(r1)
            r10 = r4
            goto L_0x00c5
        L_0x00c4:
            r10 = r1
        L_0x00c5:
            aiq r11 = r0.w
            r1 = r25
            r4 = r29
            r6 = r27
            defpackage.ajg.a(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahz.a(com.crashlytics.android.core.CodedOutputStream, java.util.Date, java.lang.Thread, java.lang.Throwable, java.lang.String, boolean):void");
    }

    private void a(File file, String str, int i2) {
        vvc a2 = vuu.a();
        StringBuilder sb = new StringBuilder("Collecting session parts for ID ");
        sb.append(str);
        String str2 = "CrashlyticsCore";
        a2.a(str2, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("SessionCrash");
        File[] a3 = a((FilenameFilter) new d(sb2.toString()));
        boolean z2 = a3 != null && a3.length > 0;
        vuu.a().a(str2, String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z2)}));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("SessionEvent");
        File[] a4 = a((FilenameFilter) new d(sb3.toString()));
        boolean z3 = a4 != null && a4.length > 0;
        vuu.a().a(str2, String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z3)}));
        if (z2 || z3) {
            a(file, str, a(str, a4, i2), z2 ? a3[0] : null);
        } else {
            vvc a5 = vuu.a();
            StringBuilder sb4 = new StringBuilder("No events present for session ID ");
            sb4.append(str);
            a5.a(str2, sb4.toString());
        }
        vvc a6 = vuu.a();
        StringBuilder sb5 = new StringBuilder("Removing session part files for ID ");
        sb5.append(str);
        a6.a(str2, sb5.toString());
        a(str);
    }

    private void a(File file, String str, File[] fileArr, File file2) {
        ahv ahv;
        String str2 = str;
        File file3 = file2;
        String str3 = "CrashlyticsCore";
        String str4 = "Failed to close CLS file";
        String str5 = "Error flushing session file stream";
        boolean z2 = file3 != null;
        File e2 = z2 ? e() : f();
        if (!e2.exists()) {
            e2.mkdirs();
        }
        CodedOutputStream codedOutputStream = null;
        try {
            ahv = new ahv(e2, str2);
            try {
                codedOutputStream = CodedOutputStream.a((OutputStream) ahv);
                vvc a2 = vuu.a();
                StringBuilder sb = new StringBuilder("Collecting SessionStart data for session ID ");
                sb.append(str2);
                a2.a(str3, sb.toString());
                File file4 = file;
                a(codedOutputStream, file);
                codedOutputStream.a(4, new Date().getTime() / 1000);
                codedOutputStream.a(5, z2);
                codedOutputStream.a(11, 1);
                codedOutputStream.b(12, 3);
                try {
                    a(codedOutputStream, str2);
                    a(codedOutputStream, fileArr, str2);
                    if (z2) {
                        a(codedOutputStream, file3);
                    }
                    CommonUtils.a((Flushable) codedOutputStream, str5);
                    CommonUtils.a((Closeable) ahv, str4);
                } catch (Exception e3) {
                    e = e3;
                    try {
                        vvc a3 = vuu.a();
                        StringBuilder sb2 = new StringBuilder("Failed to write session file for session ID: ");
                        sb2.append(str2);
                        a3.c(str3, sb2.toString(), e);
                        CommonUtils.a((Flushable) codedOutputStream, str5);
                        a(ahv);
                    } catch (Throwable th) {
                        th = th;
                        CommonUtils.a((Flushable) codedOutputStream, str5);
                        CommonUtils.a((Closeable) ahv, str4);
                        throw th;
                    }
                }
            } catch (Exception e4) {
                e = e4;
                vvc a32 = vuu.a();
                StringBuilder sb22 = new StringBuilder("Failed to write session file for session ID: ");
                sb22.append(str2);
                a32.c(str3, sb22.toString(), e);
                CommonUtils.a((Flushable) codedOutputStream, str5);
                a(ahv);
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.a((Flushable) codedOutputStream, str5);
                CommonUtils.a((Closeable) ahv, str4);
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            ahv = null;
            vvc a322 = vuu.a();
            StringBuilder sb222 = new StringBuilder("Failed to write session file for session ID: ");
            sb222.append(str2);
            a322.c(str3, sb222.toString(), e);
            CommonUtils.a((Flushable) codedOutputStream, str5);
            a(ahv);
        } catch (Throwable th3) {
            th = th3;
            ahv = null;
            CommonUtils.a((Flushable) codedOutputStream, str5);
            CommonUtils.a((Closeable) ahv, str4);
            throw th;
        }
    }

    private static void a(CodedOutputStream codedOutputStream, File[] fileArr, String str) {
        String str2 = "CrashlyticsCore";
        Arrays.sort(fileArr, CommonUtils.a);
        for (File file : fileArr) {
            try {
                vuu.a().a(str2, String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, file.getName()}));
                a(codedOutputStream, file);
            } catch (Exception e2) {
                vuu.a().c(str2, "Error writting non-fatal to session.", e2);
            }
        }
    }

    private void a(CodedOutputStream codedOutputStream, String str) {
        String[] strArr = q;
        for (int i2 = 0; i2 < 4; i2++) {
            String str2 = strArr[i2];
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(".cls");
            File[] a2 = a((FilenameFilter) new d(sb.toString()));
            String str3 = " data for session ID ";
            String str4 = "CrashlyticsCore";
            if (a2.length == 0) {
                vvc a3 = vuu.a();
                StringBuilder sb2 = new StringBuilder("Can't find ");
                sb2.append(str2);
                sb2.append(str3);
                sb2.append(str);
                a3.c(str4, sb2.toString(), null);
            } else {
                vvc a4 = vuu.a();
                StringBuilder sb3 = new StringBuilder("Collecting ");
                sb3.append(str2);
                sb3.append(str3);
                sb3.append(str);
                a4.a(str4, sb3.toString());
                a(codedOutputStream, a2[0]);
            }
        }
    }

    private static void a(CodedOutputStream codedOutputStream, File file) {
        FileInputStream fileInputStream;
        String str = "Failed to close file input stream.";
        if (!file.exists()) {
            vvc a2 = vuu.a();
            StringBuilder sb = new StringBuilder("Tried to include a file that doesn't exist: ");
            sb.append(file.getName());
            a2.c("CrashlyticsCore", sb.toString(), null);
            return;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                a((InputStream) fileInputStream, codedOutputStream, (int) file.length());
                CommonUtils.a((Closeable) fileInputStream, str);
            } catch (Throwable th) {
                th = th;
                CommonUtils.a((Closeable) fileInputStream, str);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            CommonUtils.a((Closeable) fileInputStream, str);
            throw th;
        }
    }

    private static void a(InputStream inputStream, CodedOutputStream codedOutputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < bArr.length) {
            int read = inputStream.read(bArr, i3, bArr.length - i3);
            if (read < 0) {
                break;
            }
            i3 += read;
        }
        int length = bArr.length;
        if (codedOutputStream.b - codedOutputStream.c >= length) {
            System.arraycopy(bArr, 0, codedOutputStream.a, codedOutputStream.c, length);
            codedOutputStream.c += length;
            return;
        }
        int i4 = codedOutputStream.b - codedOutputStream.c;
        System.arraycopy(bArr, 0, codedOutputStream.a, codedOutputStream.c, i4);
        int i5 = i4 + 0;
        int i6 = length - i4;
        codedOutputStream.c = codedOutputStream.b;
        codedOutputStream.a();
        if (i6 <= codedOutputStream.b) {
            System.arraycopy(bArr, i5, codedOutputStream.a, 0, i6);
            codedOutputStream.c = i6;
            return;
        }
        codedOutputStream.d.write(bArr, i5, i6);
    }

    private ajm c(String str) {
        if (c()) {
            return new ajm(this.d.f(), this.d.h(), this.d.g());
        }
        return new ais(d()).a(str);
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        aih aih = this.l;
        return aih != null && aih.a.get();
    }

    /* access modifiers changed from: 0000 */
    public final File d() {
        return this.u.a();
    }

    /* access modifiers changed from: 0000 */
    public final File e() {
        return new File(d(), "fatal-sessions");
    }

    /* access modifiers changed from: 0000 */
    public final File f() {
        return new File(d(), "nonfatal-sessions");
    }

    /* access modifiers changed from: 0000 */
    public final File g() {
        return new File(d(), "invalidClsFiles");
    }

    /* access modifiers changed from: 0000 */
    public boolean a(vyb vyb) {
        if (vyb != null && vyb.d.a && !this.f.a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public aij a(String str, String str2) {
        String c2 = CommonUtils.c(this.d.h, "com.crashlytics.ApiEndpoint");
        return new ahw(new ail(this.d, c2, str, this.s), new aiv(this.d, c2, str2, this.s));
    }

    private static void c(String str, String str2) {
        agm agm = (agm) vuu.a(agm.class);
        if (agm == null) {
            vuu.a().a("CrashlyticsCore", "Answers is not available");
        } else {
            agm.a(new defpackage.vvq.a(str, str2));
        }
    }

    private static boolean k() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private void a(String str) {
        for (File delete : a((FilenameFilter) new l(str))) {
            delete.delete();
        }
    }

    private File[] j() {
        File[] a2 = a(m);
        Arrays.sort(a2, n);
        return a2;
    }

    static /* synthetic */ void a(ahz ahz, Date date, Thread thread, Throwable th) {
        ahv ahv;
        String str = "CrashlyticsCore";
        String str2 = "Failed to close fatal exception file output stream.";
        String str3 = "Failed to flush to session begin file.";
        CodedOutputStream codedOutputStream = null;
        try {
            String i2 = ahz.i();
            if (i2 == null) {
                vuu.a().c(str, "Tried to write a fatal exception while no session was open.", null);
                CommonUtils.a((Flushable) null, str3);
                CommonUtils.a((Closeable) null, str2);
                return;
            }
            c(i2, th.getClass().getName());
            File d2 = ahz.d();
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append("SessionCrash");
            ahv = new ahv(d2, sb.toString());
            try {
                codedOutputStream = CodedOutputStream.a((OutputStream) ahv);
                ahz.a(codedOutputStream, date, thread, th, "crash", true);
                CommonUtils.a((Flushable) codedOutputStream, str3);
                CommonUtils.a((Closeable) ahv, str2);
            } catch (Exception e2) {
                e = e2;
                try {
                    vuu.a().c(str, "An error occurred in the fatal exception logger", e);
                    CommonUtils.a((Flushable) codedOutputStream, str3);
                    CommonUtils.a((Closeable) ahv, str2);
                } catch (Throwable th2) {
                    th = th2;
                    CommonUtils.a((Flushable) codedOutputStream, str3);
                    CommonUtils.a((Closeable) ahv, str2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            ahv = null;
            vuu.a().c(str, "An error occurred in the fatal exception logger", e);
            CommonUtils.a((Flushable) codedOutputStream, str3);
            CommonUtils.a((Closeable) ahv, str2);
        } catch (Throwable th3) {
            th = th3;
            ahv = null;
            CommonUtils.a((Flushable) codedOutputStream, str3);
            CommonUtils.a((Closeable) ahv, str2);
            throw th;
        }
    }

    static /* synthetic */ void a(ahz ahz, long j2) {
        String str = "CrashlyticsCore";
        if (k()) {
            vuu.a().a(str, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
        } else if (ahz.z != null) {
            vuu.a().a(str, "Logging Crashlytics event to Firebase");
            Bundle bundle = new Bundle();
            bundle.putInt("_r", 1);
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", j2);
            ahz.z.a("clx", "_ae", bundle);
        } else {
            vuu.a().a(str, "Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
        }
    }

    static /* synthetic */ void b(ahz ahz) {
        ahz ahz2 = ahz;
        Date date = new Date();
        String ahu = new ahu(ahz2.t).toString();
        vvc a2 = vuu.a();
        StringBuilder sb = new StringBuilder("Opening a new session with ID ");
        sb.append(ahu);
        a2.a("CrashlyticsCore", sb.toString());
        Locale locale = Locale.US;
        aia aia = ahz2.d;
        String format = String.format(locale, "Crashlytics Android SDK/%s", new Object[]{"2.6.7.30"});
        ahz ahz3 = ahz;
        final String str = ahu;
        final String str2 = format;
        final long time = date.getTime() / 1000;
        AnonymousClass9 r0 = new b() {
            public final void a(CodedOutputStream codedOutputStream) {
                ajg.a(codedOutputStream, str, str2, time);
            }
        };
        ahz2.a(ahu, "BeginSession", (b) r0);
        AnonymousClass10 r02 = new e() {
            public final void a(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new CrashlyticsController$18$1(this)).toString().getBytes());
            }
        };
        ahz2.a(ahu, "BeginSession.json", (e) r02);
        String str3 = ahz2.t.b;
        String str4 = ahz2.g.e;
        String str5 = ahz2.g.f;
        final String str6 = str3;
        final String str7 = str4;
        final String str8 = str5;
        final String a3 = ahz2.t.a();
        final int i2 = DeliveryMechanism.a(ahz2.g.c).id;
        AnonymousClass11 r03 = new b() {
            public final void a(CodedOutputStream codedOutputStream) {
                ajg.a(codedOutputStream, str6, ahz.this.g.a, str7, str8, a3, i2, ahz.this.y);
            }
        };
        ahz2.a(ahu, "SessionApp", (b) r03);
        AnonymousClass13 r04 = new e() {
            public final void a(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new CrashlyticsController$20$1(this)).toString().getBytes());
            }
        };
        ahz2.a(ahu, "SessionApp.json", (e) r04);
        final boolean f2 = CommonUtils.f(ahz2.d.h);
        ahz2.a(ahu, "SessionOS", (b) new b() {
            public final void a(CodedOutputStream codedOutputStream) {
                ajg.a(codedOutputStream, VERSION.RELEASE, VERSION.CODENAME, f2);
            }
        });
        ahz2.a(ahu, "SessionOS.json", (e) new e() {
            public final void a(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new CrashlyticsController$22$1(this)).toString().getBytes());
            }
        });
        Context context = ahz2.d.h;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int a4 = CommonUtils.a();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b2 = CommonUtils.b();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean e2 = CommonUtils.e(context);
        ahz ahz4 = ahz;
        final int i3 = a4;
        final int i4 = availableProcessors;
        final long j2 = b2;
        final long j3 = blockCount;
        final boolean z2 = e2;
        final Map c2 = ahz2.t.c();
        long j4 = b2;
        AnonymousClass16 r15 = r0;
        final int g2 = CommonUtils.g(context);
        AnonymousClass16 r05 = new b() {
            public final void a(CodedOutputStream codedOutputStream) {
                ajg.a(codedOutputStream, i3, Build.MODEL, i4, j2, j3, z2, c2, g2, Build.MANUFACTURER, Build.PRODUCT);
            }
        };
        ahz2.a(ahu, "SessionDevice", (b) r15);
        final long j5 = j4;
        AnonymousClass17 r06 = new e() {
            public final void a(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new CrashlyticsController$24$1(this)).toString().getBytes());
            }
        };
        ahz2.a(ahu, "SessionDevice.json", (e) r06);
        ahz2.w.a(ahu);
    }

    static /* synthetic */ void b(ahz ahz, vyb vyb) {
        if (vyb == null) {
            vuu.a().d("CrashlyticsCore", "Cannot send reports. Settings are unavailable.");
            return;
        }
        Context context = ahz.d.h;
        aje aje = new aje(ahz.g.a, ahz.a(vyb.a.c, vyb.a.d), ahz.h, ahz.i);
        for (File ajh : ahz.a()) {
            ahz.e.a((Runnable) new k(context, new ajh(ajh, p), aje));
        }
    }

    static /* synthetic */ void b(ahz ahz, Date date, Thread thread, Throwable th) {
        ahv ahv;
        CodedOutputStream a2;
        ahz ahz2 = ahz;
        String str = "Failed to close non-fatal file output stream.";
        String str2 = "Failed to flush to non-fatal file.";
        String i2 = ahz.i();
        CodedOutputStream codedOutputStream = null;
        String str3 = "CrashlyticsCore";
        if (i2 == null) {
            vuu.a().c(str3, "Tried to write a non-fatal exception while no session was open.", null);
            return;
        }
        String name = th.getClass().getName();
        if (((agm) vuu.a(agm.class)) == null) {
            vuu.a().a(str3, "Answers is not available");
        } else {
            new defpackage.vvq.b(i2, name);
        }
        try {
            vvc a3 = vuu.a();
            StringBuilder sb = new StringBuilder("Crashlytics is logging non-fatal exception \"");
            sb.append(th);
            sb.append("\" from thread ");
            sb.append(thread.getName());
            a3.a(str3, sb.toString());
            String a4 = CommonUtils.a(ahz2.r.getAndIncrement());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i2);
            sb2.append("SessionEvent");
            sb2.append(a4);
            ahv = new ahv(ahz.d(), sb2.toString());
            try {
                a2 = CodedOutputStream.a((OutputStream) ahv);
            } catch (Exception e2) {
                e = e2;
                try {
                    vuu.a().c(str3, "An error occurred in the non-fatal exception logger", e);
                    CommonUtils.a((Flushable) codedOutputStream, str2);
                    CommonUtils.a((Closeable) ahv, str);
                    ahz.a(i2, 64);
                } catch (Throwable th2) {
                    th = th2;
                    CommonUtils.a((Flushable) codedOutputStream, str2);
                    CommonUtils.a((Closeable) ahv, str);
                    throw th;
                }
            }
            try {
                ahz.a(a2, date, thread, th, LogMessage.SEVERITY_ERROR, false);
                CommonUtils.a((Flushable) a2, str2);
            } catch (Exception e3) {
                e = e3;
                codedOutputStream = a2;
                vuu.a().c(str3, "An error occurred in the non-fatal exception logger", e);
                CommonUtils.a((Flushable) codedOutputStream, str2);
                CommonUtils.a((Closeable) ahv, str);
                ahz.a(i2, 64);
            } catch (Throwable th3) {
                th = th3;
                codedOutputStream = a2;
                CommonUtils.a((Flushable) codedOutputStream, str2);
                CommonUtils.a((Closeable) ahv, str);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            ahv = null;
            vuu.a().c(str3, "An error occurred in the non-fatal exception logger", e);
            CommonUtils.a((Flushable) codedOutputStream, str2);
            CommonUtils.a((Closeable) ahv, str);
            ahz.a(i2, 64);
        } catch (Throwable th4) {
            th = th4;
            ahv = null;
            CommonUtils.a((Flushable) codedOutputStream, str2);
            CommonUtils.a((Closeable) ahv, str);
            throw th;
        }
        CommonUtils.a((Closeable) ahv, str);
        try {
            ahz.a(i2, 64);
        } catch (Exception e5) {
            vuu.a().c(str3, "An error occurred when trimming non-fatal files.", e5);
        }
    }

    static /* synthetic */ String e(ahz ahz) {
        File[] j2 = ahz.j();
        if (j2.length > 1) {
            return a(j2[1]);
        }
        return null;
    }

    static /* synthetic */ void a(ahz ahz, Context context, File file, String str) {
        byte[] bArr;
        byte[] bArr2;
        File a2 = aiw.a(file, ".dmp");
        if (a2 == null) {
            bArr = new byte[0];
        } else {
            bArr = aiw.a(a2);
        }
        File a3 = aiw.a(file, ".device_info");
        byte[] bArr3 = null;
        if (a3 == null) {
            bArr2 = null;
        } else {
            bArr2 = aiw.a(a3);
        }
        File a4 = aiw.a(file, ".maps");
        if (a4 != null) {
            bArr3 = aiw.a(a4, context);
        } else {
            File a5 = aiw.a(file, ".binary_libs");
            if (a5 != null) {
                byte[] a6 = aiw.a(a5);
                if (!(a6 == null || a6.length == 0)) {
                    bArr3 = ahs.a(new ahs(context, new aji()).a(new String(a6)));
                }
            }
        }
        String str2 = "CrashlyticsCore";
        if (bArr == null || bArr.length == 0) {
            vvc a7 = vuu.a();
            StringBuilder sb = new StringBuilder("No minidump data found in directory ");
            sb.append(file);
            a7.d(str2, sb.toString());
            return;
        }
        c(str, "<native-crash: minidump>");
        byte[] b2 = ahz.b(str, "BeginSession.json");
        byte[] b3 = ahz.b(str, "SessionApp.json");
        byte[] b4 = ahz.b(str, "SessionDevice.json");
        byte[] b5 = ahz.b(str, "SessionOS.json");
        byte[] a8 = aiw.a(new ais(ahz.d()).b(str));
        aiq aiq = new aiq(ahz.d.h, ahz.v, str);
        byte[] b6 = aiq.a.b();
        aiq.a();
        byte[] a9 = aiw.a(new ais(ahz.d()).c(str));
        File file2 = new File(ahz.u.a(), str);
        if (!file2.mkdir()) {
            vuu.a().a(str2, "Couldn't create native sessions directory");
            return;
        }
        ahz.a(bArr, new File(file2, "minidump"));
        ahz.a(bArr2, new File(file2, "metadata"));
        ahz.a(bArr3, new File(file2, "binaryImages"));
        ahz.a(b2, new File(file2, "session"));
        ahz.a(b3, new File(file2, "app"));
        ahz.a(b4, new File(file2, "device"));
        ahz.a(b5, new File(file2, "os"));
        ahz.a(a8, new File(file2, "user"));
        ahz.a(b6, new File(file2, "logs"));
        ahz.a(a9, new File(file2, "keys"));
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Set, code=java.util.Set<java.io.File>, for r2v0, types: [java.util.Set, java.util.Set<java.io.File>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(defpackage.ahz r1, java.util.Set<java.io.File> r2) {
        /*
            java.util.Iterator r2 = r2.iterator()
        L_0x0004:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r2.next()
            java.io.File r0 = (java.io.File) r0
            r1.b(r0)
            goto L_0x0004
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahz.a(ahz, java.util.Set):void");
    }
}
