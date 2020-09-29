package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.FacebookException;
import com.facebook.HttpMethod;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: ank reason: default package */
public final class ank {
    private static int a = 0;
    private static long b = -1;
    private static long c = -1;
    private static long d = -1;
    private static String e = "";
    private static String f = "";
    private static String g = "NoCarrier";

    /* renamed from: ank$a */
    public interface a {
        void a(FacebookException facebookException);

        void a(JSONObject jSONObject);
    }

    /* renamed from: ank$b */
    public interface b<T, K> {
        K a(T t);
    }

    /* renamed from: ank$c */
    public static class c {
        public List<String> a;
        public List<String> b;
        public List<String> c;

        public c(List<String> list, List<String> list2, List<String> list3) {
            this.a = list;
            this.b = list2;
            this.c = list3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.io.InputStream r6, java.io.OutputStream r7) {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0023 }
            r1.<init>(r6)     // Catch:{ all -> 0x0023 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0021 }
            r2 = 0
            r3 = 0
        L_0x000c:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0021 }
            r5 = -1
            if (r4 == r5) goto L_0x0018
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0021 }
            int r3 = r3 + r4
            goto L_0x000c
        L_0x0018:
            r1.close()
            if (r6 == 0) goto L_0x0020
            r6.close()
        L_0x0020:
            return r3
        L_0x0021:
            r7 = move-exception
            goto L_0x0025
        L_0x0023:
            r7 = move-exception
            r1 = r0
        L_0x0025:
            if (r1 == 0) goto L_0x002a
            r1.close()
        L_0x002a:
            if (r6 == 0) goto L_0x002f
            r6.close()
        L_0x002f:
            goto L_0x0031
        L_0x0030:
            throw r7
        L_0x0031:
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ank.a(java.io.InputStream, java.io.OutputStream):int");
    }

    private static long a(double d2) {
        return Math.round(d2 / 1.073741824E9d);
    }

    public static Uri a(String str, String str2, Bundle bundle) {
        Builder builder = new Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    public static c a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("permission");
            if (optString != null && !optString.equals("installed")) {
                String optString2 = optJSONObject.optString("status");
                if (optString2 != null) {
                    if (optString2.equals("granted")) {
                        arrayList.add(optString);
                    } else if (optString2.equals("declined")) {
                        arrayList2.add(optString);
                    } else if (optString2.equals("expired")) {
                        arrayList3.add(optString);
                    }
                }
            }
        }
        return new c(arrayList, arrayList2, arrayList3);
    }

    public static Object a(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Object a(JSONObject jSONObject, String str, String str2) {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
    }

    public static String a(int i) {
        return new BigInteger(100, new Random()).toString(32);
    }

    public static String a(Context context) {
        anl.a((Object) context, "context");
        akq.a(context);
        return akq.k();
    }

    public static String a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    public static String a(InputStream inputStream) {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            a((Closeable) bufferedInputStream);
                            a((Closeable) inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    a((Closeable) bufferedInputStream);
                    a((Closeable) inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                a((Closeable) bufferedInputStream);
                a((Closeable) inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
            a((Closeable) bufferedInputStream);
            a((Closeable) inputStreamReader);
            throw th;
        }
    }

    public static String a(String str, String str2) {
        return a(str) ? str2 : str;
    }

    private static String a(String str, byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append(Integer.toHexString((b2 >> 4) & 15));
                sb.append(Integer.toHexString(b2 & 15));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String a(JSONObject jSONObject, String str) {
        String str2 = "";
        return jSONObject != null ? jSONObject.optString(str, str2) : str2;
    }

    public static String a(byte[] bArr) {
        return a("SHA-1", bArr);
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method a(String str, String str2, Class<?>... clsArr) {
        try {
            return a(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static <T> Collection<T> a(T... tArr) {
        return Collections.unmodifiableCollection(Arrays.asList(tArr));
    }

    public static Date a(Bundle bundle, String str, Date date) {
        long j;
        Date date2 = null;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j = ((Long) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    j = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return date2;
        }
        if (j == 0) {
            return new Date(Long.MAX_VALUE);
        }
        date2 = new Date(date.getTime() + (j * 1000));
        return date2;
    }

    public static <T, K> List<K> a(List<T> list, b<T, K> bVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T a2 : list) {
            Object a3 = bVar.a(a2);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    public static List<String> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public static Locale a() {
        try {
            return akq.g().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return Locale.getDefault();
        }
    }

    public static Map<String, String> a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    private static void a(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(split2[0].trim());
                    sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    instance.setCookie(str, sb.toString());
                }
            }
            instance.removeExpiredCookie();
        }
    }

    public static void a(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            a(bundle, str, uri.toString());
        }
    }

    public static void a(Bundle bundle, String str, String str2) {
        if (!a(str2)) {
            bundle.putString(str, str2);
        }
    }

    public static void a(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File a2 : listFiles) {
                        a(a2);
                    }
                }
            }
            file.delete();
        }
    }

    public static void a(final String str, final a aVar) {
        JSONObject a2 = anh.a(str);
        if (a2 != null) {
            aVar.a(a2);
            return;
        }
        AnonymousClass1 r0 = new defpackage.akr.b() {
            public final void a(aku aku) {
                if (aku.b != null) {
                    aVar.a(aku.b.f);
                    return;
                }
                anh.a(str, aku.a);
                aVar.a(aku.a);
            }
        };
        akr f2 = f(str);
        f2.a((defpackage.akr.b) r0);
        f2.a();
    }

    public static void a(String str, Exception exc) {
        if (akq.c() && str != null && exc != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(exc.getClass().getSimpleName());
            sb.append(": ");
            sb.append(exc.getMessage());
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (akq.c()) {
            a(str);
        }
    }

    public static void a(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static void a(JSONObject jSONObject, ami ami, String str, boolean z) {
        if (!(ami == null || ami.a == null)) {
            jSONObject.put("attribution", ami.a);
        }
        if (!(ami == null || ami.a() == null)) {
            jSONObject.put(Ad.METADATA_ADVERTISER_ID, ami.a());
            jSONObject.put("advertiser_tracking_enabled", !ami.c);
        }
        if (!(ami == null || ami.b == null)) {
            jSONObject.put("installer_package", ami.b);
        }
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
    }

    public static void a(JSONObject jSONObject, Context context) {
        String str;
        Locale locale;
        int i;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        if (b == -1 || System.currentTimeMillis() - b >= 1800000) {
            b = System.currentTimeMillis();
            c();
            g(context);
            f();
            e();
        }
        String packageName = context.getPackageName();
        int i2 = -1;
        int i3 = 0;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            i2 = packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (NameNotFoundException unused) {
            str = "";
        }
        jSONArray.put(packageName);
        jSONArray.put(i2);
        jSONArray.put(str);
        jSONArray.put(VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        sb.append("_");
        sb.append(locale.getCountry());
        jSONArray.put(sb.toString());
        jSONArray.put(e);
        jSONArray.put(g);
        double d2 = 0.0d;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i = displayMetrics.widthPixels;
                try {
                    i3 = displayMetrics.heightPixels;
                    d2 = (double) displayMetrics.density;
                } catch (Exception unused3) {
                }
                jSONArray.put(i);
                jSONArray.put(i3);
                jSONArray.put(new DecimalFormat("#.##").format(d2));
                jSONArray.put(b());
                jSONArray.put(c);
                jSONArray.put(d);
                jSONArray.put(f);
                jSONObject.put("extinfo", jSONArray.toString());
            }
        } catch (Exception unused4) {
        }
        i = 0;
        jSONArray.put(i);
        jSONArray.put(i3);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        jSONArray.put(b());
        jSONArray.put(c);
        jSONArray.put(d);
        jSONArray.put(f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static boolean a(aki aki) {
        return aki != null && aki.equals(aki.a());
    }

    public static boolean a(Bundle bundle, String str, Object obj) {
        if (obj == null) {
            bundle.remove(str);
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
        } else if (!(obj instanceof JSONObject)) {
            return false;
        } else {
            bundle.putString(str, obj.toString());
        }
        return true;
    }

    public static <T> boolean a(T t, T t2) {
        return t == null ? t2 == null : t.equals(t2);
    }

    public static boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public static <T> boolean a(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }

    private static int b() {
        int i = a;
        if (i > 0) {
            return i;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() {
                public final boolean accept(File file, String str) {
                    return Pattern.matches("cpu[0-9]+", str);
                }
            });
            if (listFiles != null) {
                a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (a <= 0) {
            a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return a;
    }

    public static String b(String str) {
        return c("MD5", str);
    }

    public static <T> List<T> b(T... tArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            T t = tArr[i];
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static Set<String> b(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    public static JSONObject b(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    public static void b(Context context) {
        a(context, "facebook.com");
        a(context, ".facebook.com");
        a(context, "https://facebook.com");
        a(context, "https://.facebook.com");
    }

    public static void b(String str, String str2) {
        akq.c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if ("fbstaging".equalsIgnoreCase(r2.getScheme()) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(android.net.Uri r2) {
        /*
            if (r2 == 0) goto L_0x0028
            java.lang.String r0 = r2.getScheme()
            java.lang.String r1 = "http"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = r2.getScheme()
            java.lang.String r1 = "https"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0026
            java.lang.String r2 = r2.getScheme()
            java.lang.String r0 = "fbstaging"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0028
        L_0x0026:
            r2 = 1
            return r2
        L_0x0028:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ank.b(android.net.Uri):boolean");
    }

    public static String c(Context context) {
        return context == null ? "null" : context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        return c("SHA-256", str);
    }

    private static String c(String str, String str2) {
        return a(str, str2.getBytes());
    }

    public static JSONArray c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    private static void c() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            f = timeZone.getID();
        } catch (AssertionError | Exception unused) {
        }
    }

    public static boolean c(Uri uri) {
        if (uri != null) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    public static Bundle d(String str) {
        Bundle bundle = new Bundle();
        if (!a(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                try {
                    String str2 = "UTF-8";
                    if (split2.length == 2) {
                        bundle.putString(URLDecoder.decode(split2[0], str2), URLDecoder.decode(split2[1], str2));
                    } else if (split2.length == 1) {
                        bundle.putString(URLDecoder.decode(split2[0], str2), "");
                    }
                } catch (UnsupportedEncodingException e2) {
                    a("FacebookSDK", (Exception) e2);
                }
            }
        }
        return bundle;
    }

    private static boolean d() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static boolean d(Context context) {
        return e(context);
    }

    public static boolean d(Uri uri) {
        if (uri != null) {
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    public static long e(Uri uri) {
        Cursor cursor = null;
        try {
            cursor = akq.g().getContentResolver().query(uri, null, null, null, null);
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            return cursor.getLong(columnIndex);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static JSONObject e(String str) {
        JSONObject a2 = anh.a(str);
        if (a2 != null) {
            return a2;
        }
        aku a3 = akr.a(f(str));
        if (a3.b != null) {
            return null;
        }
        return a3.a;
    }

    private static void e() {
        try {
            if (d()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                d = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            d = a((double) d);
        } catch (Exception unused) {
        }
    }

    public static boolean e(Context context) {
        if (VERSION.SDK_INT < 26) {
            return false;
        }
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        return autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled();
    }

    private static akr f(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", str);
        akr akr = new akr(null, "me", bundle, HttpMethod.GET, null);
        return akr;
    }

    private static void f() {
        try {
            if (d()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            c = a((double) c);
        } catch (Exception unused) {
        }
    }

    public static boolean f(Context context) {
        return VERSION.SDK_INT >= 27 ? context.getPackageManager().hasSystemFeature("android.hardware.type.pc") : Build.DEVICE != null && Build.DEVICE.matches(".+_cheets|cheets_.+");
    }

    private static void g(Context context) {
        if (g.equals("NoCarrier")) {
            try {
                g = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
    }
}
