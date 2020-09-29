package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.adjust.sdk.BackoffStrategy;
import java.io.ObjectInputStream.GetField;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.UUID;

/* renamed from: wm reason: default package */
public final class wm {
    public static final DecimalFormat a = new DecimalFormat("0.0", new DecimalFormatSymbols(Locale.US));
    public static final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z", Locale.US);

    public static String a() {
        return UUID.randomUUID().toString();
    }

    public static String a(Context context) {
        return we.a(context);
    }

    public static void a(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            runnable.run();
            return;
        }
        new AsyncTask<Object, Void, Void>() {
            /* access modifiers changed from: protected */
            public final /* synthetic */ Object doInBackground(Object[] objArr) {
                objArr[0].run();
                return null;
            }
        }.execute(new Object[]{runnable});
    }

    public static Boolean b(Context context) {
        return we.b(context);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14, types: [java.io.ObjectInputStream] */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: type inference failed for: r7v21 */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* JADX WARNING: type inference failed for: r7v23 */
    /* JADX WARNING: type inference failed for: r7v24 */
    /* JADX WARNING: type inference failed for: r7v25 */
    /* JADX WARNING: type inference failed for: r7v26 */
    /* JADX WARNING: type inference failed for: r7v27 */
    /* JADX WARNING: type inference failed for: r7v28 */
    /* JADX WARNING: type inference failed for: r7v29 */
    /* JADX WARNING: type inference failed for: r7v30 */
    /* JADX WARNING: type inference failed for: r7v31 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r7 = r7;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        defpackage.vh.a().f("Failed to read %s object (%s)", r9, r8.getMessage());
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        defpackage.vh.a().f("Failed to cast %s object (%s)", r9, r8.getMessage());
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        defpackage.vh.a().f("Failed to find %s class (%s)", r9, r8.getMessage());
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v4
      assigns: []
      uses: []
      mth insns count: 86
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
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), PHI: r0 r7 
      PHI: (r0v4 T) = (r0v0 T), (r0v0 T), (r0v0 T), (r0v8 T), (r0v9 T) binds: [B:3:0x0008, B:4:?, B:7:0x0012, B:10:0x002c, B:8:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r7v9 ?) = (r7v17 ?), (r7v19 ?), (r7v23 ?), (r7v27 ?), (r7v30 ?) binds: [B:3:0x0008, B:4:?, B:7:0x0012, B:10:0x002c, B:8:?] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:3:0x0008] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095 A[SYNTHETIC, Splitter:B:29:0x0095] */
    /* JADX WARNING: Unknown variable types count: 9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T a(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.Class<T> r10) {
        /*
            r0 = 0
            r1 = 2
            r2 = 0
            r3 = 1
            java.io.FileInputStream r7 = r7.openFileInput(r8)     // Catch:{ FileNotFoundException -> 0x0085, Exception -> 0x0073 }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            r8.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            java.io.ObjectInputStream r7 = new java.io.ObjectInputStream     // Catch:{ FileNotFoundException -> 0x006f, Exception -> 0x006a }
            r7.<init>(r8)     // Catch:{ FileNotFoundException -> 0x006f, Exception -> 0x006a }
            java.lang.Object r8 = r7.readObject()     // Catch:{ ClassNotFoundException -> 0x0055, ClassCastException -> 0x0040, Exception -> 0x002b, FileNotFoundException -> 0x0086 }
            java.lang.Object r0 = r10.cast(r8)     // Catch:{ ClassNotFoundException -> 0x0055, ClassCastException -> 0x0040, Exception -> 0x002b, FileNotFoundException -> 0x0086 }
            vr r8 = defpackage.vh.a()     // Catch:{ ClassNotFoundException -> 0x0055, ClassCastException -> 0x0040, Exception -> 0x002b, FileNotFoundException -> 0x0086 }
            java.lang.String r10 = "Read %s: %s"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x0055, ClassCastException -> 0x0040, Exception -> 0x002b, FileNotFoundException -> 0x0086 }
            r4[r2] = r9     // Catch:{ ClassNotFoundException -> 0x0055, ClassCastException -> 0x0040, Exception -> 0x002b, FileNotFoundException -> 0x0086 }
            r4[r3] = r0     // Catch:{ ClassNotFoundException -> 0x0055, ClassCastException -> 0x0040, Exception -> 0x002b, FileNotFoundException -> 0x0086 }
            r8.b(r10, r4)     // Catch:{ ClassNotFoundException -> 0x0055, ClassCastException -> 0x0040, Exception -> 0x002b, FileNotFoundException -> 0x0086 }
            goto L_0x0093
        L_0x002b:
            r8 = move-exception
            vr r10 = defpackage.vh.a()     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            java.lang.String r4 = "Failed to read %s object (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            r5[r2] = r9     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            r5[r3] = r8     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            r10.f(r4, r5)     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            goto L_0x0093
        L_0x0040:
            r8 = move-exception
            vr r10 = defpackage.vh.a()     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            java.lang.String r4 = "Failed to cast %s object (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            r5[r2] = r9     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            r5[r3] = r8     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            r10.f(r4, r5)     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            goto L_0x0093
        L_0x0055:
            r8 = move-exception
            vr r10 = defpackage.vh.a()     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            java.lang.String r4 = "Failed to find %s class (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            r5[r2] = r9     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            r5[r3] = r8     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            r10.f(r4, r5)     // Catch:{ FileNotFoundException -> 0x0086, Exception -> 0x0071 }
            goto L_0x0093
        L_0x006a:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
            goto L_0x0075
        L_0x006f:
            r7 = r8
            goto L_0x0086
        L_0x0071:
            r8 = move-exception
            goto L_0x0075
        L_0x0073:
            r8 = move-exception
            r7 = r0
        L_0x0075:
            vr r10 = defpackage.vh.a()
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r2] = r9
            r4[r3] = r8
            java.lang.String r8 = "Failed to open %s file for reading (%s)"
            r10.f(r8, r4)
            goto L_0x0093
        L_0x0085:
            r7 = r0
        L_0x0086:
            vr r8 = defpackage.vh.a()
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r2] = r9
            java.lang.String r4 = "%s file not found"
            r8.b(r4, r10)
        L_0x0093:
            if (r7 == 0) goto L_0x00a9
            r7.close()     // Catch:{ Exception -> 0x0099 }
            goto L_0x00a9
        L_0x0099:
            r7 = move-exception
            vr r8 = defpackage.vh.a()
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r2] = r9
            r10[r3] = r7
            java.lang.String r7 = "Failed to close %s file for reading (%s)"
            r8.f(r7, r10)
        L_0x00a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm.a(android.content.Context, java.lang.String, java.lang.String, java.lang.Class):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8, types: [java.io.ObjectOutputStream] */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r6v16 */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0024 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v3
      assigns: []
      uses: []
      mth insns count: 48
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
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a A[SYNTHETIC, Splitter:B:18:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> void a(T r5, android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r7, r2)     // Catch:{ Exception -> 0x0037 }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0035 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0035 }
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x0032 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0032 }
            r6.writeObject(r5)     // Catch:{ NotSerializableException -> 0x0024 }
            vr r7 = defpackage.vh.a()     // Catch:{ NotSerializableException -> 0x0024 }
            java.lang.String r3 = "Wrote %s: %s"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ NotSerializableException -> 0x0024 }
            r4[r2] = r8     // Catch:{ NotSerializableException -> 0x0024 }
            r4[r1] = r5     // Catch:{ NotSerializableException -> 0x0024 }
            r7.b(r3, r4)     // Catch:{ NotSerializableException -> 0x0024 }
            goto L_0x0048
        L_0x0024:
            vr r5 = defpackage.vh.a()     // Catch:{ Exception -> 0x0035 }
            java.lang.String r7 = "Failed to serialize %s"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0035 }
            r3[r2] = r8     // Catch:{ Exception -> 0x0035 }
            r5.f(r7, r3)     // Catch:{ Exception -> 0x0035 }
            goto L_0x0048
        L_0x0032:
            r5 = move-exception
            r6 = r7
            goto L_0x0039
        L_0x0035:
            r5 = move-exception
            goto L_0x0039
        L_0x0037:
            r5 = move-exception
            r6 = 0
        L_0x0039:
            vr r7 = defpackage.vh.a()
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r2] = r8
            r3[r1] = r5
            java.lang.String r5 = "Failed to open %s for writing (%s)"
            r7.f(r5, r3)
        L_0x0048:
            if (r6 == 0) goto L_0x005e
            r6.close()     // Catch:{ Exception -> 0x004e }
            goto L_0x005e
        L_0x004e:
            r5 = move-exception
            vr r6 = defpackage.vh.a()
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r7[r2] = r8
            r7[r1] = r5
            java.lang.String r5 = "Failed to close %s file for writing (%s)"
            r6.f(r5, r7)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm.a(java.lang.Object, android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static boolean a(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception e) {
            vh.a().b("Unable to check permission '%s' with message (%s)", str, e.getMessage());
            return false;
        }
    }

    public static String a(GetField getField, String str, String str2) {
        return (String) a(getField, str, (T) null);
    }

    public static <T> T a(GetField getField, String str, T t) {
        try {
            return getField.get(str, t);
        } catch (Exception e) {
            vh.a().b("Unable to read '%s' field in migration device with message (%s)", str, e.getMessage());
            return t;
        }
    }

    public static boolean a(GetField getField, String str, boolean z) {
        try {
            return getField.get(str, z);
        } catch (Exception e) {
            vh.a().b("Unable to read '%s' field in migration device with message (%s)", str, e.getMessage());
            return z;
        }
    }

    public static int a(GetField getField, String str, int i) {
        try {
            return getField.get(str, i);
        } catch (Exception e) {
            vh.a().b("Unable to read '%s' field in migration device with message (%s)", str, e.getMessage());
            return i;
        }
    }

    public static long a(GetField getField, String str, long j) {
        try {
            return getField.get(str, -1);
        } catch (Exception e) {
            vh.a().b("Unable to read '%s' field in migration device with message (%s)", str, e.getMessage());
            return -1;
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean a(String str, String str2) {
        return a((Object) str, (Object) str2);
    }

    public static boolean a(Enum enumR, Enum enumR2) {
        return a((Object) enumR, (Object) enumR2);
    }

    public static boolean a(Long l, Long l2) {
        return a((Object) l, (Object) l2);
    }

    public static boolean a(Integer num, Integer num2) {
        return a((Object) num, (Object) num2);
    }

    public static boolean a(Boolean bool, Boolean bool2) {
        return a((Object) bool, (Object) bool2);
    }

    public static int a(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public static int a(Long l) {
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public static int a(Enum enumR) {
        if (enumR == null) {
            return 0;
        }
        return enumR.hashCode();
    }

    public static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String b(String str) {
        return b(str, "SHA-1");
    }

    public static String c(String str) {
        return b(str, "SHA-256");
    }

    public static String d(String str) {
        return b(str, "MD5");
    }

    private static String b(String str, String str2) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.update(bytes, 0, bytes.length);
            byte[] digest = instance.digest();
            BigInteger bigInteger = new BigInteger(1, digest);
            StringBuilder sb = new StringBuilder("%0");
            sb.append(digest.length << 1);
            sb.append("x");
            return a(sb.toString(), bigInteger);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String[] b() {
        if (VERSION.SDK_INT >= 21) {
            return Build.SUPPORTED_ABIS;
        }
        return null;
    }

    public static String c() {
        if (VERSION.SDK_INT < 21) {
            return Build.CPU_ABI;
        }
        return null;
    }

    public static String a(String str, Throwable th) {
        if (th != null) {
            return a("%s: %s", str, th);
        }
        return a("%s", str);
    }

    public static long a(int i, BackoffStrategy backoffStrategy) {
        if (i < backoffStrategy.minRetries) {
            return 0;
        }
        long min = Math.min(((long) Math.pow(2.0d, (double) (i - backoffStrategy.minRetries))) * backoffStrategy.milliSecondMultiplier, backoffStrategy.maxWait);
        double d = backoffStrategy.minRange;
        double nextDouble = (new Random().nextDouble() * (backoffStrategy.maxRange - d)) + d;
        double d2 = (double) min;
        Double.isNaN(d2);
        return (long) (d2 * nextDouble);
    }

    public static Map<String, String> a(Map<String, String> map, Map<String, String> map2, String str) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        HashMap hashMap = new HashMap(map);
        vr a2 = vh.a();
        for (Entry entry : map2.entrySet()) {
            String str2 = (String) hashMap.put(entry.getKey(), entry.getValue());
            if (str2 != null) {
                a2.d("Key %s with value %s from %s parameter was replaced by value %s", entry.getKey(), str2, str, entry.getValue());
            }
        }
        return hashMap;
    }

    public static Locale a(Configuration configuration) {
        if (VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            if (locales != null && !locales.isEmpty()) {
                return locales.get(0);
            }
        }
        if (VERSION.SDK_INT < 24) {
            return configuration.locale;
        }
        return null;
    }

    public static String a(ContentResolver contentResolver) {
        if (contentResolver == null) {
            return null;
        }
        try {
            return Secure.getString(contentResolver, "advertising_id");
        } catch (Exception unused) {
            return null;
        }
    }

    public static Boolean b(ContentResolver contentResolver) {
        try {
            return Boolean.valueOf(Secure.getInt(contentResolver, "limit_ad_tracking") == 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int e(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().getType();
        } catch (Exception e) {
            vh.a().d("Couldn't read connectivity type (%s)", e.getMessage());
            return -1;
        }
    }

    public static int f(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
        } catch (Exception e) {
            vh.a().d("Couldn't read network type (%s)", e.getMessage());
            return -1;
        }
    }

    public static String g(Context context) {
        try {
            String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                return networkOperator.substring(0, 3);
            }
            vh.a().d("Couldn't receive networkOperator string to read MCC", new Object[0]);
            return null;
        } catch (Exception unused) {
            vh.a().d("Couldn't return mcc", new Object[0]);
            return null;
        }
    }

    public static String h(Context context) {
        try {
            String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                return networkOperator.substring(3);
            }
            vh.a().d("Couldn't receive networkOperator string to read MNC", new Object[0]);
            return null;
        } catch (Exception unused) {
            vh.a().d("Couldn't return mnc", new Object[0]);
            return null;
        }
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static boolean a(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString().contains("Caused by:");
    }

    public static String b(Exception exc) {
        if (!a(exc)) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        int indexOf = stringWriter2.indexOf("Caused by:");
        return stringWriter2.substring(indexOf, stringWriter2.indexOf("\n", indexOf));
    }

    public static boolean a(Uri uri) {
        if (uri == null) {
            return true;
        }
        String uri2 = uri.toString();
        if (uri2 == null || uri2.length() == 0 || uri2.matches("^(fb|vk)[0-9]{5,}[^:]*://authorize.*access_token=.*")) {
            return true;
        }
        return false;
    }

    public static String c(Context context) {
        String a2 = vz.a(context);
        if (a2 == null) {
            return null;
        }
        String upperCase = a2.toUpperCase(Locale.US);
        if (upperCase == null) {
            return null;
        }
        String replaceAll = upperCase.replaceAll("\\s", "");
        if (TextUtils.isEmpty(replaceAll)) {
            return null;
        }
        return replaceAll;
    }

    public static String d(Context context) {
        return Secure.getString(context.getContentResolver(), "android_id");
    }

    public static boolean a(String str, String str2, String str3) {
        if (str == null) {
            vh.a().f("%s parameter %s is missing", str3, str2);
            return false;
        } else if (!str.equals("")) {
            return true;
        } else {
            vh.a().f("%s parameter %s is empty", str3, str2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String e(java.lang.String r5) {
        /*
            r0 = 0
            r1 = 2
            r2 = 0
            if (r5 != 0) goto L_0x0007
        L_0x0005:
            r5 = r2
            goto L_0x001d
        L_0x0007:
            java.lang.String r3 = "@"
            boolean r4 = r5.contains(r3)
            if (r4 != 0) goto L_0x0010
            goto L_0x0005
        L_0x0010:
            java.lang.String[] r5 = r5.split(r3)
            if (r5 != 0) goto L_0x0017
            goto L_0x0005
        L_0x0017:
            int r3 = r5.length
            if (r3 == r1) goto L_0x001b
            goto L_0x0005
        L_0x001b:
            r5 = r5[r0]
        L_0x001d:
            if (r5 != 0) goto L_0x0020
            return r2
        L_0x0020:
            java.lang.String r3 = "\\d+"
            java.lang.String[] r5 = r5.split(r3, r1)
            if (r5 != 0) goto L_0x0029
            return r2
        L_0x0029:
            int r1 = r5.length
            if (r1 != 0) goto L_0x002d
            return r2
        L_0x002d:
            r5 = r5[r0]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm.e(java.lang.String):java.lang.String");
    }
}
