package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.LoggingBehavior;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: alc reason: default package */
public class alc {
    public static final String a = alc.class.getCanonicalName();
    public WeakReference<Activity> b;
    public Timer c;
    /* access modifiers changed from: private */
    public final Handler d = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public String e = null;

    /* renamed from: alc$a */
    static class a implements Callable<String> {
        private WeakReference<View> a;

        a(View view) {
            this.a = new WeakReference<>(view);
        }

        public final /* synthetic */ Object call() {
            View view = (View) this.a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(CompressFormat.JPEG, 10, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }
    }

    public alc(Activity activity) {
        this.b = new WeakReference<>(activity);
    }

    public final void a() {
        final Activity activity = (Activity) this.b.get();
        if (activity != null) {
            final String simpleName = activity.getClass().getSimpleName();
            final AnonymousClass1 r2 = new TimerTask() {
                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0063 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r6 = this;
                        android.app.Activity r0 = r0     // Catch:{ Exception -> 0x0076 }
                        android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x0076 }
                        android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x0076 }
                        android.view.View r0 = r0.getRootView()     // Catch:{ Exception -> 0x0076 }
                        boolean r1 = defpackage.alg.e()     // Catch:{ Exception -> 0x0076 }
                        if (r1 != 0) goto L_0x0015
                        return
                    L_0x0015:
                        java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask     // Catch:{ Exception -> 0x0076 }
                        alc$a r2 = new alc$a     // Catch:{ Exception -> 0x0076 }
                        r2.<init>(r0)     // Catch:{ Exception -> 0x0076 }
                        r1.<init>(r2)     // Catch:{ Exception -> 0x0076 }
                        alc r2 = defpackage.alc.this     // Catch:{ Exception -> 0x0076 }
                        android.os.Handler r2 = r2.d     // Catch:{ Exception -> 0x0076 }
                        r2.post(r1)     // Catch:{ Exception -> 0x0076 }
                        java.lang.String r2 = ""
                        r3 = 1
                        java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0035 }
                        java.lang.Object r1 = r1.get(r3, r5)     // Catch:{ Exception -> 0x0035 }
                        java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0035 }
                        goto L_0x0040
                    L_0x0035:
                        r1 = move-exception
                        java.lang.String r3 = defpackage.alc.a     // Catch:{ Exception -> 0x0076 }
                        java.lang.String r4 = "Failed to take screenshot."
                        android.util.Log.e(r3, r4, r1)     // Catch:{ Exception -> 0x0076 }
                        r1 = r2
                    L_0x0040:
                        org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0076 }
                        r2.<init>()     // Catch:{ Exception -> 0x0076 }
                        java.lang.String r3 = "screenname"
                        java.lang.String r4 = r1     // Catch:{ JSONException -> 0x0063 }
                        r2.put(r3, r4)     // Catch:{ JSONException -> 0x0063 }
                        java.lang.String r3 = "screenshot"
                        r2.put(r3, r1)     // Catch:{ JSONException -> 0x0063 }
                        org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0063 }
                        r1.<init>()     // Catch:{ JSONException -> 0x0063 }
                        org.json.JSONObject r0 = defpackage.alf.a(r0)     // Catch:{ JSONException -> 0x0063 }
                        r1.put(r0)     // Catch:{ JSONException -> 0x0063 }
                        java.lang.String r0 = "view"
                        r2.put(r0, r1)     // Catch:{ JSONException -> 0x0063 }
                        goto L_0x006c
                    L_0x0063:
                        java.lang.String r0 = defpackage.alc.a     // Catch:{ Exception -> 0x0076 }
                        java.lang.String r1 = "Failed to create JSONObject"
                        android.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0076 }
                    L_0x006c:
                        java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0076 }
                        alc r1 = defpackage.alc.this     // Catch:{ Exception -> 0x0076 }
                        defpackage.akc.e().execute(new defpackage.alc.AnonymousClass3(r0))     // Catch:{ Exception -> 0x0076 }
                        return
                    L_0x0076:
                        r0 = move-exception
                        java.lang.String r1 = defpackage.alc.a
                        java.lang.String r2 = "UI Component tree indexing failure!"
                        android.util.Log.e(r1, r2, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.alc.AnonymousClass1.run():void");
                }
            };
            akc.e().execute(new Runnable() {
                public final void run() {
                    try {
                        if (alc.this.c != null) {
                            alc.this.c.cancel();
                        }
                        alc.this.e = null;
                        alc.this.c = new Timer();
                        alc.this.c.scheduleAtFixedRate(r2, 0, 1000);
                    } catch (Exception e) {
                        Log.e(alc.a, "Error scheduling indexing job", e);
                    }
                }
            });
        }
    }

    public static akd a(String str, aju aju, String str2, String str3) {
        if (str == null) {
            return null;
        }
        akd a2 = akd.a(aju, String.format(Locale.US, "%s/app_indexing", new Object[]{str2}), (JSONObject) null, (b) null);
        Bundle bundle = a2.d;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("tree", str);
        bundle.putString("app_version", alh.a());
        bundle.putString("platform", "android");
        bundle.putString("request_type", str3);
        if (str3.equals("app_indexing")) {
            bundle.putString("device_session_id", alg.d());
        }
        a2.d = bundle;
        a2.a((b) new b() {
            public final void a(akg akg) {
                amp.a(LoggingBehavior.APP_EVENTS, alc.a, "App index sent to FB!");
            }
        });
        return a2;
    }
}
