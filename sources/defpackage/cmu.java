package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.moat.analytics.mobile.MoatAdEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: cmu reason: default package */
public final class cmu {
    public static final Handler a = new cmm(Looper.getMainLooper());
    public boolean b = false;
    /* access modifiers changed from: private */
    public final Object c = new Object();
    /* access modifiers changed from: private */
    public boolean d = true;
    /* access modifiers changed from: private */
    public String e;
    private boolean f = false;
    private Pattern g;
    private Pattern h;

    public static Bitmap a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public static Bundle a(dmp dmp) {
        String str;
        String str2;
        String str3;
        if (dmp == null) {
            return null;
        }
        if (!((Boolean) dqe.f().a(dtg.W)).booleanValue()) {
            if (!((Boolean) dqe.f().a(dtg.Y)).booleanValue()) {
                return null;
            }
        }
        if (bkc.i().g().d() && bkc.i().g().f()) {
            return null;
        }
        if (dmp.b) {
            synchronized (dmp.c) {
                dmp.b = false;
                dmp.c.notifyAll();
                cpn.a(3);
            }
        }
        dmj a2 = dmp.d.a();
        if (a2 != null) {
            str3 = a2.f;
            str2 = a2.g;
            str = a2.h;
            if (str3 != null) {
                cmn g2 = bkc.i().g();
                g2.a();
                synchronized (g2.a) {
                    if (str3 != null) {
                        if (!str3.equals(g2.g)) {
                            g2.g = str3;
                            if (g2.d != null) {
                                g2.d.putString("content_url_hashes", str3);
                                g2.d.apply();
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString("content_url_hashes", str3);
                            g2.a(bundle);
                        }
                    }
                }
            }
            if (str != null) {
                cmn g3 = bkc.i().g();
                g3.a();
                synchronized (g3.a) {
                    if (str != null) {
                        if (!str.equals(g3.h)) {
                            g3.h = str;
                            if (g3.d != null) {
                                g3.d.putString("content_vertical_hashes", str);
                                g3.d.apply();
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("content_vertical_hashes", str);
                            g3.a(bundle2);
                        }
                    }
                }
            }
        } else {
            str3 = bkc.i().g().e();
            str = bkc.i().g().g();
            str2 = null;
        }
        Bundle bundle3 = new Bundle(1);
        if (str != null) {
            if (((Boolean) dqe.f().a(dtg.Y)).booleanValue() && !bkc.i().g().f()) {
                bundle3.putString("v_fp_vertical", str);
            }
        }
        if (str3 != null) {
            if (((Boolean) dqe.f().a(dtg.W)).booleanValue() && !bkc.i().g().d()) {
                bundle3.putString("fingerprint", str3);
                if (!str3.equals(str2)) {
                    bundle3.putString("v_fp", str2);
                }
            }
        }
        if (!bundle3.isEmpty()) {
            return bundle3;
        }
        return null;
    }

    public static DisplayMetrics a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static WebResourceResponse a(HttpURLConnection httpURLConnection) {
        bkc.e();
        String contentType = httpURLConnection.getContentType();
        String str = "";
        String str2 = ";";
        String trim = TextUtils.isEmpty(contentType) ? str : contentType.split(str2)[0].trim();
        bkc.e();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(str2);
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str3 = str;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).size() <= 0)) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return bkc.g().a(trim, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static PopupWindow a(View view, int i, int i2) {
        return new PopupWindow(view, i, i2, false);
    }

    public static String a() {
        return UUID.randomUUID().toString();
    }

    public static String a(Context context, View view, dpt dpt) {
        if (!((Boolean) dqe.f().a(dtg.ai)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", dpt.e);
            jSONObject2.put("height", dpt.b);
            jSONObject.put("size", jSONObject2);
            jSONObject.put("activity", k(context));
            if (!dpt.d) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int i = -1;
                        if (parent instanceof ViewGroup) {
                            i = ((ViewGroup) parent).indexOfChild(view);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(MoatAdEvent.EVENT_TYPE, parent.getClass().getName());
                        jSONObject3.put("index_of_child", i);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            cpn.a(5);
            return null;
        }
    }

    public static String a(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    public static String a(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    public static Map<String, String> a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : bkc.g().a(uri)) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    private final JSONArray a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object a2 : collection) {
            a(jSONArray, a2);
        }
        return jSONArray;
    }

    public static void a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static void a(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            if (((Boolean) dqe.f().a(dtg.cJ)).booleanValue()) {
                b(context, intent);
            }
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            sb.toString();
            cpn.a(3);
        } catch (ActivityNotFoundException e2) {
            cml.a("No browser is found.", e2);
        }
    }

    public static void a(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        a(context, str, (List<String>) arrayList);
    }

    public static void a(Context context, String str, List<String> list) {
        for (String cor : list) {
            new cor(context, str, cor).c();
        }
    }

    public static void a(Context context, Throwable th) {
        if (context != null) {
            boolean z = false;
            try {
                z = ((Boolean) dqe.f().a(dtg.c)).booleanValue();
            } catch (IllegalStateException unused) {
            }
            if (z) {
                bzz.a(context, th);
            }
        }
    }

    public static void a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            cms.a(runnable);
        }
    }

    private final void a(JSONArray jSONArray, Object obj) {
        Object a2;
        if (obj instanceof Bundle) {
            a2 = b((Bundle) obj);
        } else if (obj instanceof Map) {
            a2 = a((Map) obj);
        } else if (obj instanceof Collection) {
            a2 = a((Collection) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            JSONArray jSONArray2 = new JSONArray();
            for (Object a3 : objArr) {
                a(jSONArray2, a3);
            }
            jSONArray.put(jSONArray2);
            return;
        } else {
            jSONArray.put(obj);
            return;
        }
        jSONArray.put(a2);
    }

    private final void a(JSONObject jSONObject, String str, Object obj) {
        Collection asList;
        Object a2;
        if (obj instanceof Bundle) {
            a2 = b((Bundle) obj);
        } else if (obj instanceof Map) {
            a2 = a((Map) obj);
        } else {
            if (obj instanceof Collection) {
                if (str == null) {
                    str = "null";
                }
                asList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                asList = Arrays.asList((Object[]) obj);
            } else {
                jSONObject.put(str, obj);
                return;
            }
            a2 = a(asList);
        }
        jSONObject.put(str, a2);
    }

    private static boolean a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    public static boolean a(Activity activity, Configuration configuration) {
        dqe.a();
        int a2 = cpc.a((Context) activity, configuration.screenHeightDp);
        int a3 = cpc.a((Context) activity, configuration.screenWidthDp);
        DisplayMetrics a4 = a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = a4.heightPixels;
        int i2 = a4.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        double d2 = (double) activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d2);
        int round = ((int) Math.round(d2 + 0.5d)) * ((Integer) dqe.f().a(dtg.cV)).intValue();
        return a(i, a2 + dimensionPixelSize, round) && a(i2, a3, round);
    }

    public static boolean a(Context context) {
        boolean z;
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        boolean z2 = false;
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity == null || resolveActivity.activityInfo == null) {
                cpn.a(5);
            } else {
                String str = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
                if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
                    String.format(str, new Object[]{"keyboard"});
                    cpn.a(5);
                    z = false;
                } else {
                    z = true;
                }
                if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
                    String.format(str, new Object[]{"keyboardHidden"});
                    cpn.a(5);
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
                    String.format(str, new Object[]{"orientation"});
                    cpn.a(5);
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
                    String.format(str, new Object[]{"screenLayout"});
                    cpn.a(5);
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
                    String.format(str, new Object[]{"uiMode"});
                    cpn.a(5);
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
                    String.format(str, new Object[]{"screenSize"});
                    cpn.a(5);
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 2048) == 0) {
                    String.format(str, new Object[]{"smallestScreenSize"});
                    cpn.a(5);
                } else {
                    z2 = z;
                }
            }
            return z2;
        } catch (Exception e2) {
            cpn.a(5);
            bkc.i().a((Throwable) e2, "AdUtil.hasAdActivity");
            return false;
        }
    }

    public static boolean a(Context context, String str) {
        return cas.a(context).a.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static boolean a(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z;
        if (!bkc.e().d) {
            if (keyguardManager == null ? false : keyguardManager.inKeyguardRestrictedInputMode()) {
                if (!((Boolean) dqe.f().a(dtg.bm)).booleanValue() || !c(view)) {
                    z = false;
                    if (view.getVisibility() == 0 && view.isShown()) {
                        if ((powerManager != null || powerManager.isScreenOn()) && z) {
                            if (((Boolean) dqe.f().a(dtg.bk)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        z = true;
        if (((Boolean) dqe.f().a(dtg.bk)).booleanValue()) {
        }
        return true;
    }

    public static boolean a(ClassLoader classLoader, Class<?> cls, String str) {
        try {
            return cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int[] a(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            View findViewById = window.findViewById(16908290);
            if (findViewById != null) {
                return new int[]{findViewById.getWidth(), findViewById.getHeight()};
            }
        }
        return new int[]{0, 0};
    }

    public static int b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(valueOf);
            sb.toString();
            cpn.a(5);
            return 0;
        }
    }

    public static Bitmap b(View view) {
        if (view == null) {
            return null;
        }
        Bitmap f2 = f(view);
        if (f2 == null) {
            f2 = e(view);
        }
        return f2;
    }

    public static String b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    private final JSONObject b(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public static void b(Context context, Intent intent) {
        if (intent != null && caf.d()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static void b(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Exception e2) {
            cml.a("Error writing to file in internal storage.", e2);
        }
    }

    public static int[] b(Activity activity) {
        int[] a2 = a(activity);
        dqe.a();
        dqe.a();
        return new int[]{cpc.b((Context) activity, a2[0]), cpc.b((Context) activity, a2[1])};
    }

    public static Bundle c() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) dqe.f().a(dtg.C)).booleanValue()) {
                MemoryInfo memoryInfo = new MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            if (((Boolean) dqe.f().a(dtg.D)).booleanValue()) {
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free_memory", runtime.freeMemory());
                bundle.putLong("runtime_max_memory", runtime.maxMemory());
                bundle.putLong("runtime_total_memory", runtime.totalMemory());
            }
            bundle.putInt("web_view_count", bkc.i().h.get());
        } catch (Exception unused) {
            cpn.a(5);
        }
        return bundle;
    }

    public static WebResourceResponse c(Context context, String str, String str2) {
        String str3 = "UTF-8";
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", bkc.e().b(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str4 = (String) new coc(context).a(str2, (Map<String, String>) hashMap).get(60, TimeUnit.SECONDS);
            if (str4 != null) {
                return new WebResourceResponse("application/javascript", str3, new ByteArrayInputStream(str4.getBytes(str3)));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException unused) {
            cpn.a(5);
        }
        return null;
    }

    protected static String c(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return d();
        }
    }

    public static String c(Context context, String str) {
        try {
            FileInputStream openFileInput = context.openFileInput(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            cad.a(openFileInput, byteArrayOutputStream, true, 1024);
            return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
        } catch (IOException unused) {
            cpn.a(3);
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L_0x0012
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0012
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmu.c(android.view.View):boolean");
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public static int[] c(Activity activity) {
        int[] iArr;
        Window window = activity.getWindow();
        if (window != null) {
            View findViewById = window.findViewById(16908290);
            if (findViewById != null) {
                iArr = new int[]{findViewById.getTop(), findViewById.getBottom()};
                dqe.a();
                dqe.a();
                return new int[]{cpc.b((Context) activity, iArr[0]), cpc.b((Context) activity, iArr[1])};
            }
        }
        iArr = new int[]{0, 0};
        dqe.a();
        dqe.a();
        return new int[]{cpc.b((Context) activity, iArr[0]), cpc.b((Context) activity, iArr[1])};
    }

    public static int d(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    public static Builder d(Context context) {
        return new Builder(context);
    }

    private static String d() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(VERSION.RELEASE);
        }
        String str = "; ";
        sb.append(str);
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append(str);
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    private static Bitmap e(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            cpn.a(5);
            return null;
        } catch (RuntimeException e2) {
            cml.a("Fail to capture the webview", e2);
            return null;
        }
    }

    public static dsr e(Context context) {
        return new dsr(context);
    }

    private static Bitmap f(View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e2) {
            cml.a("Fail to capture the web view", e2);
        }
        return bitmap;
    }

    public static boolean f(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                            if (Process.myPid() == runningAppProcessInfo.pid) {
                                if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                                    if (powerManager == null ? false : powerManager.isScreenOn()) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } else {
                        return false;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static Bitmap g(Context context) {
        Bitmap bitmap = null;
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
            if (((Boolean) dqe.f().a(dtg.bQ)).booleanValue()) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    bitmap = f(window.getDecorView().getRootView());
                }
            } else {
                bitmap = e(((Activity) context).getWindow().getDecorView());
            }
        } catch (RuntimeException e2) {
            cml.a("Fail to capture screen shot", e2);
        }
        return bitmap;
    }

    public static int h(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    public static boolean i(Context context) {
        if (context != null && caf.b()) {
            KeyguardManager l = l(context);
            if (l != null && l.isKeyguardLocked()) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            cml.a("Error loading class.", th);
            bkc.i().a(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    private static String k(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            List runningTasks = activityManager.getRunningTasks(1);
            if (runningTasks != null && !runningTasks.isEmpty()) {
                RunningTaskInfo runningTaskInfo = (RunningTaskInfo) runningTasks.get(0);
                if (!(runningTaskInfo == null || runningTaskInfo.topActivity == null)) {
                    return runningTaskInfo.topActivity.getClassName();
                }
            }
            return null;
        } catch (Exception unused) {
        }
    }

    private static KeyguardManager l(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    public final JSONObject a(Bundle bundle) {
        if (bundle != null) {
            try {
                return b(bundle);
            } catch (JSONException e2) {
                cml.a("Error converting Bundle to JSON", e2);
            }
        }
        return null;
    }

    public final JSONObject a(Map<String, ?> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e2) {
            String str2 = "Could not convert map to JSON: ";
            String valueOf = String.valueOf(e2.getMessage());
            throw new JSONException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    public final void a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(b(context, str));
    }

    public final void a(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            bkc.e();
            bundle.putString("device", b());
            bundle.putString("eids", TextUtils.join(",", dtg.a()));
        }
        dqe.a();
        cpc.a(context, str, str2, bundle, z, new cmx(context, str));
    }

    public final void a(Context context, String str, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", b(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public final void a(Context context, List<String> list) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!TextUtils.isEmpty(dhk.a(activity))) {
                if (list == null) {
                    cml.a();
                } else if (!dub.a(context)) {
                    cml.a();
                } else {
                    dub dub = new dub();
                    dub.d = new cmv(list, dub, context);
                    dub.a(activity);
                }
            }
        }
    }

    public final boolean a(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return a(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, l(context));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x003b, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025 A[Catch:{ Exception -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059 A[Catch:{ Exception -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d A[Catch:{ Exception -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6 A[Catch:{ Exception -> 0x00b5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            java.lang.String r1 = r4.e     // Catch:{ all -> 0x00d1 }
            if (r1 == 0) goto L_0x000b
            java.lang.String r5 = r4.e     // Catch:{ all -> 0x00d1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
            return r5
        L_0x000b:
            if (r6 != 0) goto L_0x0013
            java.lang.String r5 = d()     // Catch:{ all -> 0x00d1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
            return r5
        L_0x0013:
            cna r1 = defpackage.bkc.g()     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = r1.a(r5)     // Catch:{ Exception -> 0x001d }
            r4.e = r1     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            java.lang.String r1 = r4.e     // Catch:{ all -> 0x00d1 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00d1 }
            if (r1 == 0) goto L_0x006d
            defpackage.dqe.a()     // Catch:{ all -> 0x00d1 }
            boolean r1 = defpackage.cpc.b()     // Catch:{ all -> 0x00d1 }
            if (r1 != 0) goto L_0x0067
            r1 = 0
            r4.e = r1     // Catch:{ all -> 0x00d1 }
            android.os.Handler r1 = a     // Catch:{ all -> 0x00d1 }
            cmw r2 = new cmw     // Catch:{ all -> 0x00d1 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x00d1 }
            r1.post(r2)     // Catch:{ all -> 0x00d1 }
        L_0x003b:
            java.lang.String r1 = r4.e     // Catch:{ all -> 0x00d1 }
            if (r1 != 0) goto L_0x006d
            java.lang.Object r1 = r4.c     // Catch:{ InterruptedException -> 0x0045 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0045 }
            goto L_0x003b
        L_0x0045:
            java.lang.String r1 = d()     // Catch:{ all -> 0x00d1 }
            r4.e = r1     // Catch:{ all -> 0x00d1 }
            java.lang.String r1 = "Interrupted, use default user agent: "
            java.lang.String r2 = r4.e     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00d1 }
            int r3 = r2.length()     // Catch:{ all -> 0x00d1 }
            if (r3 == 0) goto L_0x005d
            r1.concat(r2)     // Catch:{ all -> 0x00d1 }
            goto L_0x0062
        L_0x005d:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00d1 }
            r2.<init>(r1)     // Catch:{ all -> 0x00d1 }
        L_0x0062:
            r1 = 5
            defpackage.cpn.a(r1)     // Catch:{ all -> 0x00d1 }
            goto L_0x003b
        L_0x0067:
            java.lang.String r1 = c(r5)     // Catch:{ all -> 0x00d1 }
            r4.e = r1     // Catch:{ all -> 0x00d1 }
        L_0x006d:
            java.lang.String r1 = r4.e     // Catch:{ all -> 0x00d1 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d1 }
            int r2 = r2.length()     // Catch:{ all -> 0x00d1 }
            int r2 = r2 + 10
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00d1 }
            int r3 = r3.length()     // Catch:{ all -> 0x00d1 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d1 }
            r3.<init>(r2)     // Catch:{ all -> 0x00d1 }
            r3.append(r1)     // Catch:{ all -> 0x00d1 }
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch:{ all -> 0x00d1 }
            r3.append(r6)     // Catch:{ all -> 0x00d1 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00d1 }
            r4.e = r6     // Catch:{ all -> 0x00d1 }
            car r5 = defpackage.cas.a(r5)     // Catch:{ Exception -> 0x00b5 }
            boolean r5 = r5.a()     // Catch:{ Exception -> 0x00b5 }
            if (r5 == 0) goto L_0x00bf
            java.lang.String r5 = r4.e     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ Exception -> 0x00b5 }
            r4.e = r5     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00bf
        L_0x00b5:
            r5 = move-exception
            clv r6 = defpackage.bkc.i()     // Catch:{ all -> 0x00d1 }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.a(r5, r1)     // Catch:{ all -> 0x00d1 }
        L_0x00bf:
            java.lang.String r5 = r4.e     // Catch:{ all -> 0x00d1 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00d1 }
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x00d1 }
            r4.e = r5     // Catch:{ all -> 0x00d1 }
            java.lang.String r5 = r4.e     // Catch:{ all -> 0x00d1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
            return r5
        L_0x00d1:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
            goto L_0x00d5
        L_0x00d4:
            throw r5
        L_0x00d5:
            goto L_0x00d4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmu.b(android.content.Context, java.lang.String):java.lang.String");
    }

    public final void b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) dqe.f().a(dtg.bp)).booleanValue()) {
            a(context, str, str2, bundle, z);
        }
    }

    public final boolean b(Context context) {
        if (this.f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new cmy(this), intentFilter);
        this.f = true;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (((java.lang.String) defpackage.dqe.f().a(defpackage.dtg.ao)).equals(r3.g.pattern()) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            monitor-enter(r3)     // Catch:{ PatternSyntaxException -> 0x0046 }
            java.util.regex.Pattern r0 = r3.g     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0025
            dsw<java.lang.String> r0 = defpackage.dtg.ao     // Catch:{ all -> 0x0043 }
            dte r2 = defpackage.dqe.f()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r2 = r3.g     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = r2.pattern()     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0037
        L_0x0025:
            dsw<java.lang.String> r0 = defpackage.dtg.ao     // Catch:{ all -> 0x0043 }
            dte r2 = defpackage.dqe.f()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x0043 }
            r3.g = r0     // Catch:{ all -> 0x0043 }
        L_0x0037:
            java.util.regex.Pattern r0 = r3.g     // Catch:{ all -> 0x0043 }
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            throw r4     // Catch:{ PatternSyntaxException -> 0x0046 }
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmu.d(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (((java.lang.String) defpackage.dqe.f().a(defpackage.dtg.ap)).equals(r3.h.pattern()) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            monitor-enter(r3)     // Catch:{ PatternSyntaxException -> 0x0046 }
            java.util.regex.Pattern r0 = r3.h     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0025
            dsw<java.lang.String> r0 = defpackage.dtg.ap     // Catch:{ all -> 0x0043 }
            dte r2 = defpackage.dqe.f()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r2 = r3.h     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = r2.pattern()     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0037
        L_0x0025:
            dsw<java.lang.String> r0 = defpackage.dtg.ap     // Catch:{ all -> 0x0043 }
            dte r2 = defpackage.dqe.f()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x0043 }
            r3.h = r0     // Catch:{ all -> 0x0043 }
        L_0x0037:
            java.util.regex.Pattern r0 = r3.h     // Catch:{ all -> 0x0043 }
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            throw r4     // Catch:{ PatternSyntaxException -> 0x0046 }
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmu.e(java.lang.String):boolean");
    }
}
