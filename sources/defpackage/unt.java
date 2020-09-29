package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import com.spotify.android.storage.MovingOrchestrator;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: unt reason: default package */
public final class unt {
    public static final com.spotify.mobile.android.util.prefs.SpSharedPreferences.b<Object, String> g = com.spotify.mobile.android.util.prefs.SpSharedPreferences.b.a("settings_location");
    public static final com.spotify.mobile.android.util.prefs.SpSharedPreferences.b<Object, String> h = com.spotify.mobile.android.util.prefs.SpSharedPreferences.b.a("storage_location");
    private static final Set<String> p = new HashSet(Arrays.asList(new String[]{"SC-02H", "SCV33", "SM-G9300", "SM-G9308", "SM-G9309", "SM-G930A", "SM-G930AZ", "SM-G930F", "SM-G930FD", "SM-G930K", "SM-G930L", "SM-G930P", "SM-G930R4", "SM-G930R6", "SM-G930R7", "SM-G930S", "SM-G930T", "SM-G930T1", "SM-G930U", "SM-G930V", "SM-G930VC", "SM-G930VL", "SM-G930W8", "SM-G9350", "SM-G9358", "SM-G9359", "SM-G935A", "SM-G935F", "SM-G935FD", "SM-G935K", "SM-G935L", "SM-G935P", "SM-G935R4", "SM-G935S", "SM-G935T", "SM-G935U", "SM-G935V", "SM-G935VC", "SM-G935W8"}));
    private static com.spotify.mobile.android.util.prefs.SpSharedPreferences.b<Object, String> q = com.spotify.mobile.android.util.prefs.SpSharedPreferences.b.a("cache_location_v4");
    private static com.spotify.mobile.android.util.prefs.SpSharedPreferences.b<Object, String> r = com.spotify.mobile.android.util.prefs.SpSharedPreferences.b.a("cache_location");
    private static final com.spotify.mobile.android.util.prefs.SpSharedPreferences.b<Object, String> s = com.spotify.mobile.android.util.prefs.SpSharedPreferences.b.a("previous_cache_path");
    private static final com.spotify.mobile.android.util.prefs.SpSharedPreferences.b<Object, Long> t = com.spotify.mobile.android.util.prefs.SpSharedPreferences.b.a("previous_cache_size");
    private static com.spotify.mobile.android.util.prefs.SpSharedPreferences.b<Object, Boolean> u = com.spotify.mobile.android.util.prefs.SpSharedPreferences.b.a("previous_external_storage_failure");
    public String a;
    public boolean b;
    public boolean c;
    public String d;
    public final SpSharedPreferences<Object> e;
    public final b f;
    private final Context i;
    private final MovingOrchestrator j;
    private final a k;
    private final hfx l;
    private List<File> m;
    private final gam n;
    private final jrp o;

    /* renamed from: unt$a */
    public interface a {
        void onPreFinalizeMove();
    }

    /* renamed from: unt$b */
    public static class b {
        private final String a;

        public b(jro jro) {
            this.a = jro.d();
        }

        private String f() {
            StringBuilder sb = new StringBuilder("Android/data/");
            sb.append(this.a);
            return sb.toString();
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            sb.append(f());
            sb.append("/cache");
            return sb.toString();
        }

        public final String b() {
            StringBuilder sb = new StringBuilder();
            sb.append(f());
            sb.append("/files");
            return sb.toString();
        }

        public final String c() {
            StringBuilder sb = new StringBuilder("Android/data/");
            sb.append(this.a);
            sb.append("/cache");
            return sb.toString();
        }

        public final String d() {
            StringBuilder sb = new StringBuilder("Android/data/");
            sb.append(this.a);
            sb.append("/files/spotifycache");
            return sb.toString();
        }

        public static boolean e() {
            return Environment.getExternalStorageState().equals("mounted");
        }
    }

    public unt(Context context, jrp jrp, b bVar, SpSharedPreferences<Object> spSharedPreferences, gam gam, MovingOrchestrator movingOrchestrator, a aVar, hfx hfx) {
        this.i = context;
        this.e = spSharedPreferences;
        this.o = jrp;
        this.f = bVar;
        this.n = gam;
        this.j = movingOrchestrator;
        this.k = aVar;
        this.l = hfx;
        if (VERSION.SDK_INT >= 19) {
            a(context);
            b(context);
        }
    }

    private static void a(Context context) {
        File[] externalCacheDirs;
        for (File file : context.getExternalCacheDirs()) {
            if (file != null) {
                Logger.c("Cache dir=%s", file.getAbsolutePath());
            }
        }
    }

    private static void b(Context context) {
        File[] externalFilesDirs;
        for (File file : context.getExternalFilesDirs(null)) {
            if (file != null) {
                Logger.c("Files dir=%s", file.getAbsolutePath());
            }
        }
    }

    public final String b() {
        return this.e.a(q, (String) null);
    }

    private static boolean g() {
        return Build.MANUFACTURER.toLowerCase(Locale.US).equals("samsung") && p.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    private static boolean a(File file) {
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        return "unknown".equals(Environment.getExternalStorageState(file));
    }

    private void d(String str) {
        if (str != null && g() && VERSION.SDK_INT >= 21) {
            File file = new File(str);
            int i2 = 0;
            while (i2 < 15 && a(file)) {
                i2++;
                this.o.a(100);
            }
        }
    }

    private static boolean e(String str) {
        return gbi.a(new File(str));
    }

    private static String a(String str, String str2, String str3) {
        boolean z;
        File file = new File(str);
        File file2 = new File(str.substring(0, str.length() - str2.length()), str3);
        File parentFile = file2.getParentFile();
        if (parentFile.exists()) {
            z = true;
        } else {
            z = parentFile.mkdirs();
        }
        if (z) {
            if (file.renameTo(file2)) {
                return file2.toString();
            }
            StringBuilder sb = new StringBuilder("Could not move cache location from ");
            sb.append(str);
            sb.append(" to ");
            sb.append(file2);
            Assertion.b(sb.toString());
        }
        return str;
    }

    public boolean a(String str) {
        File c2 = c();
        List<String> k2 = k();
        ArrayList<File> arrayList = new ArrayList<>(Arrays.asList(new File(str).listFiles()));
        for (String file : k2) {
            File file2 = new File(str, file);
            if (arrayList.contains(file2)) {
                arrayList.remove(file2);
            }
        }
        for (File file3 : arrayList) {
            try {
                File file4 = new File(c2, file3.getName());
                if (file3.isDirectory()) {
                    wpd.b(file3, file4);
                } else {
                    wpd.a(file3, file4);
                }
                file3.setWritable(true);
                if (file3.canWrite() && !file3.delete()) {
                    Logger.e("Failed to delete settings file: %s", file3);
                }
            } catch (IOException unused) {
                Logger.e("Exception thrown while migrating settings file: %s ", file3);
                return false;
            }
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(c2.listFiles()));
        for (File file5 : arrayList) {
            if (arrayList2.contains(file5)) {
                Logger.e("Did not manage to migrate settings file: %s", file5);
                return false;
            }
        }
        return true;
    }

    public final File c() {
        return new File(this.i.getFilesDir(), "settings");
    }

    private static String b(File file) {
        if (file.isDirectory() || file.mkdirs()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public boolean d() {
        return new File("/sdcard/spotify2/").isDirectory();
    }

    private boolean h() {
        if (this.m == null) {
            this.m = a(this.n.a("/proc/mounts"));
        }
        Logger.c("Found %d volume(s) containing a pre-existing cache", Integer.valueOf(this.m.size()));
        if (!this.m.isEmpty()) {
            return true;
        }
        return false;
    }

    private String i() {
        File file = (File) this.m.get(0);
        Logger.c("Using orphan cache stored on %s", file);
        return b(file);
    }

    private boolean j() {
        return this.e.e(q);
    }

    public String f() {
        return this.e.a(h, Environment.getExternalStorageDirectory().getAbsolutePath());
    }

    private List<File> a(Set<String> set) {
        ArrayList arrayList = new ArrayList();
        a(set, this.f.d(), (List<File>) arrayList);
        return arrayList;
    }

    private static void a(Set<String> set, String str, List<File> list) {
        if (set != null) {
            for (String file : set) {
                File file2 = new File(file, str);
                if (file2.isDirectory()) {
                    list.add(file2);
                }
            }
        }
    }

    public final boolean b(String str) {
        if (str.isEmpty()) {
            return false;
        }
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            Logger.c("Settingsdir not a valid directory, or is inaccessible", new Object[0]);
            return false;
        }
        List k2 = k();
        for (File name : listFiles) {
            if (!k2.contains(name.getName())) {
                return true;
            }
        }
        return false;
    }

    private static List<String> k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("spotifycache");
        return arrayList;
    }

    public static boolean c(String str) {
        return str.contains(Environment.getExternalStorageDirectory().toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a() {
        /*
            r16 = this;
            r0 = r16
        L_0x0002:
            boolean r1 = defpackage.unt.b.e()
            boolean r2 = r16.j()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0026
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r2 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r5 = q
            java.lang.String r2 = r2.c(r5)
            if (r2 == 0) goto L_0x0026
            unt$b r5 = r0.f
            java.lang.String r5 = r5.a()
            boolean r2 = r2.endsWith(r5)
            if (r2 == 0) goto L_0x0026
            r2 = 1
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            java.lang.String r5 = "spotifycache"
            r6 = 0
            if (r2 == 0) goto L_0x0062
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r2 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r7 = q
            java.lang.String r2 = r2.c(r7)
            java.lang.Object r2 = defpackage.fay.a(r2)
            java.lang.String r2 = (java.lang.String) r2
            unt$b r7 = r0.f
            java.lang.String r7 = r7.a()
            unt$b r8 = r0.f
            java.lang.String r8 = r8.d()
            java.lang.String r7 = a(r2, r7, r8)
            boolean r2 = r7.equals(r2)
            if (r2 != 0) goto L_0x005f
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r2 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r2 = r2.a()
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r8 = q
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r2 = r2.a(r8, r7)
            r2.b()
        L_0x005f:
            r2 = r7
            goto L_0x01a1
        L_0x0062:
            boolean r2 = r16.j()
            if (r2 == 0) goto L_0x0072
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r2 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r7 = q
            java.lang.String r2 = r2.c(r7)
            goto L_0x01a1
        L_0x0072:
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r2 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r7 = r
            java.lang.String r2 = r2.a(r7, r6)
            if (r2 != 0) goto L_0x007e
            r2 = 0
            goto L_0x0087
        L_0x007e:
            java.io.File r7 = new java.io.File
            r7.<init>(r2)
            boolean r2 = r7.isDirectory()
        L_0x0087:
            if (r2 == 0) goto L_0x00e6
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r2 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r7 = r
            java.lang.String r2 = r2.c(r7)
            java.lang.Object r2 = defpackage.fay.a(r2)
            java.lang.String r2 = (java.lang.String) r2
            unt$b r7 = r0.f
            java.lang.String r7 = r7.c()
            boolean r7 = r2.endsWith(r7)
            if (r7 == 0) goto L_0x00cf
            unt$b r7 = r0.f
            java.lang.String r7 = r7.c()
            unt$b r8 = r0.f
            java.lang.String r8 = r8.d()
            java.lang.String r7 = a(r2, r7, r8)
            boolean r8 = r7.equals(r2)
            if (r8 != 0) goto L_0x01a1
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r2 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r2 = r2.a()
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r8 = r
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r2 = r2.a(r8, r6)
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r8 = q
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r2 = r2.a(r8, r7)
            r2.b()
            goto L_0x005f
        L_0x00cf:
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r7 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r7 = r7.a()
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r8 = r
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r7 = r7.a(r8, r6)
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r8 = q
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r7 = r7.a(r8, r2)
            r7.b()
            goto L_0x01a1
        L_0x00e6:
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r2 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r7 = r
            java.lang.String r2 = r2.a(r7, r6)
            if (r2 != 0) goto L_0x00f2
        L_0x00f0:
            r2 = 0
            goto L_0x0125
        L_0x00f2:
            java.io.File r7 = new java.io.File
            r7.<init>(r2)
            boolean r2 = r7.isDirectory()
            if (r2 != 0) goto L_0x0124
            boolean r2 = r7.mkdirs()
            if (r2 == 0) goto L_0x0124
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r2 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r2 = r2.a()
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r8 = r
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r2 = r2.a(r8, r6)
            r2.b()
            boolean r2 = r7.delete()
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r7[r4] = r2
            java.lang.String r2 = "Deleted temporary cache dir: %b"
            com.spotify.base.java.logging.Logger.c(r2, r7)
            goto L_0x00f0
        L_0x0124:
            r2 = 1
        L_0x0125:
            if (r2 == 0) goto L_0x0131
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r2 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r7 = r
            java.lang.String r2 = r2.c(r7)
            goto L_0x01a1
        L_0x0131:
            boolean r2 = r16.h()
            if (r2 == 0) goto L_0x013c
            java.lang.String r2 = r16.i()
            goto L_0x01a1
        L_0x013c:
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r2 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r7 = h
            boolean r2 = r2.e(r7)
            if (r2 == 0) goto L_0x014b
            boolean r2 = r16.e()
            goto L_0x0181
        L_0x014b:
            java.io.File r2 = new java.io.File
            java.lang.String r7 = r16.f()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            unt$b r9 = r0.f
            java.lang.String r9 = r9.a()
            r8.append(r9)
            r9 = 47
            r8.append(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            r2.<init>(r7, r8)
            boolean r7 = r2.isDirectory()
            if (r7 == 0) goto L_0x0180
            java.lang.String r2 = r2.getAbsolutePath()
            boolean r2 = e(r2)
            if (r2 == 0) goto L_0x0180
            r2 = 1
            goto L_0x0181
        L_0x0180:
            r2 = 0
        L_0x0181:
            if (r2 == 0) goto L_0x0197
            java.io.File r2 = new java.io.File
            java.lang.String r7 = r16.f()
            unt$b r8 = r0.f
            java.lang.String r8 = r8.a()
            r2.<init>(r7, r8)
            java.lang.String r2 = r2.getAbsolutePath()
            goto L_0x01a1
        L_0x0197:
            boolean r2 = r16.d()
            if (r2 == 0) goto L_0x01a0
            java.lang.String r2 = "/sdcard/spotify2/"
            goto L_0x01a1
        L_0x01a0:
            r2 = r6
        L_0x01a1:
            boolean r7 = defpackage.unt.b.e()
            if (r1 != r7) goto L_0x0002
            r0.d(r2)
            if (r2 == 0) goto L_0x021c
            boolean r1 = e(r2)
            if (r1 != 0) goto L_0x021c
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r2
            java.lang.String r7 = "Found inaccessible cache directory: %s"
            com.spotify.base.java.logging.Logger.e(r7, r1)
            boolean r1 = g()
            if (r1 == 0) goto L_0x021a
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            boolean r1 = a(r1)
            if (r1 == 0) goto L_0x021a
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r1 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.Boolean> r7 = u
            boolean r1 = r1.a(r7, r4)
            if (r1 == 0) goto L_0x01ef
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r2
            java.lang.String r2 = "Cache directory: %s, was previously inaccessible. Need to choose new directory"
            com.spotify.base.java.logging.Logger.e(r2, r1)
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r1 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r1 = r1.a()
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.Boolean> r2 = u
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r1 = r1.a(r2, r4)
            r1.b()
            goto L_0x021a
        L_0x01ef:
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r1 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r1 = r1.a()
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.Boolean> r7 = u
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r1 = r1.a(r7, r3)
            r1.a()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r7 = "Shutting down due to inaccessible storage location. Will reset if problem persists on next startup"
            com.spotify.base.java.logging.Logger.e(r7, r1)
            java.lang.String r1 = "Failed to start client due to inaccessible cache location"
            com.spotify.mobile.android.util.Assertion.b(r1)
            hfx r1 = r0.l
            android.content.Context r7 = r0.i
            java.lang.String r8 = "com.spotify.mobile.android.service.action.client.WANTS_SERVICE_TO_DIE"
            android.content.Intent r1 = r1.a(r7, r8)
            android.content.Context r7 = r0.i
            r7.startService(r1)
            goto L_0x022b
        L_0x021a:
            r2 = r6
            goto L_0x022b
        L_0x021c:
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r1 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r1 = r1.a()
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.Boolean> r7 = u
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r1 = r1.a(r7, r4)
            r1.b()
        L_0x022b:
            r1 = 2
            if (r2 != 0) goto L_0x0308
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r9 = "No cache location set"
            com.spotify.base.java.logging.Logger.c(r9, r2)
            gam r2 = r0.n
            java.lang.String r9 = "/proc/mounts"
            java.util.Set r2 = r2.a(r9)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            int r10 = r2.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r4] = r10
            java.lang.String r10 = "Choosing cache volume between %d candidate(s): "
            com.spotify.base.java.logging.Logger.c(r10, r9)
            gai r9 = new gai
            r9.<init>()
            java.util.Iterator r10 = r2.iterator()
        L_0x0257:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x028f
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            r9.a(r11)     // Catch:{ IOException -> 0x0285 }
            long r12 = r9.b()     // Catch:{ IOException -> 0x0285 }
            long r14 = r9.a()     // Catch:{ IOException -> 0x0285 }
            java.lang.String r7 = "%s (%d/%d bytes free/total)"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ IOException -> 0x0285 }
            r8[r4] = r11     // Catch:{ IOException -> 0x0285 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ IOException -> 0x0285 }
            r8[r3] = r12     // Catch:{ IOException -> 0x0285 }
            java.lang.Long r12 = java.lang.Long.valueOf(r14)     // Catch:{ IOException -> 0x0285 }
            r8[r1] = r12     // Catch:{ IOException -> 0x0285 }
            com.spotify.base.java.logging.Logger.c(r7, r8)     // Catch:{ IOException -> 0x0285 }
            goto L_0x0257
        L_0x0285:
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r4] = r11
            java.lang.String r8 = "cannot stat %s"
            com.spotify.base.java.logging.Logger.d(r8, r7)
            goto L_0x0257
        L_0x028f:
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r1 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r7 = s
            java.lang.String r1 = r1.a(r7, r6)
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r7 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.Long> r8 = t
            r9 = 0
            long r7 = r7.a(r8, r9)
            java.lang.String r1 = defpackage.gal.a(r2, r1, r7)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r4] = r1
            java.lang.String r7 = "Chose cache volume: %s"
            com.spotify.base.java.logging.Logger.c(r7, r2)
            if (r1 != 0) goto L_0x02c1
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r4] = r1
            java.lang.String r7 = "Falling back to volume: %s"
            com.spotify.base.java.logging.Logger.c(r7, r2)
        L_0x02c1:
            java.io.File r2 = new java.io.File
            unt$b r7 = r0.f
            java.lang.String r7 = r7.d()
            r2.<init>(r1, r7)
            java.lang.String r1 = b(r2)
            if (r1 != 0) goto L_0x038f
            java.io.File r1 = new java.io.File
            android.content.Context r2 = r0.i
            java.io.File r2 = r2.getFilesDir()
            r1.<init>(r2, r5)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r5 = r1.getAbsolutePath()
            r2[r4] = r5
            java.lang.String r5 = "Falling back to internal storage: %s"
            com.spotify.base.java.logging.Logger.c(r5, r2)
            boolean r2 = r1.isDirectory()
            if (r2 != 0) goto L_0x02fc
            boolean r2 = r1.mkdirs()
            if (r2 == 0) goto L_0x02fc
            java.lang.String r1 = r1.getAbsolutePath()
            goto L_0x038f
        L_0x02fc:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r4] = r1
            java.lang.String r1 = "Could not create cache location %s"
            com.spotify.base.java.logging.Logger.e(r1, r2)
            r1 = r6
            goto L_0x038f
        L_0x0308:
            java.io.File r5 = new java.io.File
            r5.<init>(r2)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L_0x0319
            boolean r6 = r5.isDirectory()
            if (r6 != 0) goto L_0x0352
        L_0x0319:
            boolean r6 = r5.mkdirs()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r5
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r1[r3] = r7
            java.lang.String r3 = "Recreating cache directory %s, success: %b"
            com.spotify.base.java.logging.Logger.c(r3, r1)
            if (r6 != 0) goto L_0x0352
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 != r3) goto L_0x0352
            java.lang.String r1 = "/storage/sdcard1"
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x0352
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r3 = "Reassigning SD card path for Marshmallow devices"
            com.spotify.base.java.logging.Logger.d(r3, r1)
            boolean r1 = r16.h()
            if (r1 == 0) goto L_0x0352
            java.lang.String r2 = r16.i()
            java.io.File r5 = new java.io.File
            r5.<init>(r2)
        L_0x0352:
            r1 = r2
            boolean r2 = r5.exists()
            if (r2 == 0) goto L_0x038f
            boolean r2 = r5.isDirectory()
            if (r2 == 0) goto L_0x038f
            java.lang.String r2 = "/sdcard/spotify2"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x0376
            jrp r2 = r0.o
            long r2 = r2.a()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 & r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x038f
        L_0x0376:
            java.lang.String r2 = "/cache"
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto L_0x038f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Using legacy path "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.spotify.mobile.android.util.Assertion.b(r2)
        L_0x038f:
            boolean r2 = defpackage.fax.a(r1)
            if (r2 != 0) goto L_0x03b9
            com.spotify.android.storage.MovingOrchestrator r2 = r0.j
            r2.a(r1)
            com.spotify.android.storage.MovingOrchestrator r2 = r0.j
            com.spotify.android.storage.MovingOrchestrator$State r2 = r2.a()
            com.spotify.android.storage.MovingOrchestrator$State r3 = com.spotify.android.storage.MovingOrchestrator.State.CANCELLED
            if (r2 != r3) goto L_0x03aa
            com.spotify.android.storage.MovingOrchestrator r2 = r0.j
            r2.c()
            goto L_0x03b9
        L_0x03aa:
            com.spotify.android.storage.MovingOrchestrator$State r3 = com.spotify.android.storage.MovingOrchestrator.State.IDLE
            if (r2 == r3) goto L_0x03b9
            unt$a r1 = r0.k
            r1.onPreFinalizeMove()
            com.spotify.android.storage.MovingOrchestrator r1 = r0.j
            java.lang.String r1 = r1.b()
        L_0x03b9:
            if (r1 != 0) goto L_0x03bc
            goto L_0x03dd
        L_0x03bc:
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r3 = r2.exists()
            if (r3 == 0) goto L_0x03dd
            boolean r2 = r2.isDirectory()
            if (r2 != 0) goto L_0x03ce
            goto L_0x03dd
        L_0x03ce:
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r2 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r2 = r2.a()
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r3 = q
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r2 = r2.a(r3, r1)
            r2.b()
        L_0x03dd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unt.a():java.lang.String");
    }

    public boolean e() {
        return !b.e() || new File(this.e.c(h)).isDirectory();
    }
}
