package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: duy reason: default package */
public class duy implements dut {
    final duv a;
    final Context b;
    boolean c;
    boolean d;
    private final Object e = new Object();
    private final due f;
    private final JSONObject g;
    private final ceu h;
    private final duw i;
    private final dio j;
    private final cpp k;
    private String l;
    private clf m;
    private WeakReference<View> n = null;

    public duy(Context context, duv duv, ceu ceu, dio dio, JSONObject jSONObject, duw duw, cpp cpp, String str) {
        this.b = context;
        this.a = duv;
        this.h = ceu;
        this.j = dio;
        this.g = jSONObject;
        this.i = duw;
        this.k = cpp;
        this.l = str;
        this.f = new due(this.h);
    }

    private final int a(int i2) {
        dqe.a();
        return cpc.b(this.b, i2);
    }

    private final JSONObject a(Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", a(rect.right - rect.left));
        jSONObject.put("height", a(rect.bottom - rect.top));
        jSONObject.put("x", a(rect.left));
        jSONObject.put("y", a(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private final JSONObject a(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject2;
        }
        int[] e2 = e(view);
        synchronized (map) {
            for (Entry entry : map.entrySet()) {
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] e3 = e(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("width", a(view2.getMeasuredWidth()));
                        jSONObject4.put("height", a(view2.getMeasuredHeight()));
                        jSONObject4.put("x", a(e3[0] - e2[0]));
                        jSONObject4.put("y", a(e3[1] - e2[1]));
                        jSONObject4.put("relative_to", "ad_view");
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = a(rect);
                        } else {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("width", 0);
                            jSONObject5.put("height", 0);
                            jSONObject5.put("x", a(e3[0] - e2[0]));
                            jSONObject5.put("y", a(e3[1] - e2[1]));
                            jSONObject5.put("relative_to", "ad_view");
                            jSONObject = jSONObject5;
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            jSONObject3.put("font_size", (double) textView.getTextSize());
                            jSONObject3.put("text", textView.getText());
                        }
                        jSONObject2.put((String) entry.getKey(), jSONObject3);
                    } catch (JSONException unused) {
                        cpn.a(5);
                    }
                }
            }
        }
        return jSONObject2;
    }

    private final void a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6) {
        String str2 = "has_custom_click_handler";
        bxo.b("Invalid call from a non-UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put(PlayerProviders.ADS, this.g);
            if (jSONObject2 != null) {
                jSONObject7.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject7.put("ad_view_signal", jSONObject);
            }
            if (jSONObject5 != null) {
                jSONObject7.put("click_signal", jSONObject5);
            }
            if (jSONObject3 != null) {
                jSONObject7.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject7.put("lock_screen_signal", jSONObject4);
            }
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.i.k());
            bkc.g();
            jSONObject8.put("is_privileged_process", cna.e());
            boolean z = true;
            if (((Boolean) dqe.f().a(dtg.ci)).booleanValue() && this.f.b != null && this.g.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", bkc.l().a());
            jSONObject8.put(str2, this.a.b(this.i.l()) != null);
            if (this.a.b(this.i.l()) == null) {
                z = false;
            }
            jSONObject7.put(str2, z);
            try {
                JSONObject optJSONObject = this.g.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                jSONObject8.put("click_signals", this.j.b.a(this.b, optJSONObject.optString("click_string"), view));
            } catch (Exception e2) {
                cml.a("Exception obtaining click signals", e2);
            }
            jSONObject7.put("click", jSONObject8);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.l);
            cpv.a(this.h.b(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (JSONException e3) {
            cml.a("Unable to create click JSON.", e3);
        }
    }

    private final boolean a(String str) {
        JSONObject jSONObject = this.g;
        JSONObject optJSONObject = jSONObject == null ? null : jSONObject.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null) {
            return false;
        }
        return optJSONObject.optBoolean(str, false);
    }

    private final boolean a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        bxo.b("Invalid call from a non-UI thread.");
        if (this.c) {
            return true;
        }
        this.c = true;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(PlayerProviders.ADS, this.g);
            jSONObject6.put("ads_id", this.l);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("lock_screen_signal", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            cpv.a(this.h.c(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.a.a((dut) this);
            this.a.C();
            j();
            return true;
        } catch (JSONException e2) {
            cml.a("Unable to create impression JSON.", e2);
            return false;
        }
    }

    private static boolean d(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    private static int[] e(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    private final JSONObject f(View view) {
        JSONObject jSONObject;
        String str = "window";
        String str2 = "relative_to";
        String str3 = "y";
        String str4 = "x";
        String str5 = "height";
        String str6 = "width";
        JSONObject jSONObject2 = new JSONObject();
        if (view == null) {
            return jSONObject2;
        }
        try {
            int[] e2 = e(view);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(str6, a(view.getMeasuredWidth()));
            jSONObject3.put(str5, a(view.getMeasuredHeight()));
            jSONObject3.put(str4, a(e2[0]));
            jSONObject3.put(str3, a(e2[1]));
            jSONObject3.put(str2, str);
            jSONObject2.put("frame", jSONObject3);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObject = a(rect);
            } else {
                jSONObject = new JSONObject();
                jSONObject.put(str6, 0);
                jSONObject.put(str5, 0);
                jSONObject.put(str4, a(e2[0]));
                jSONObject.put(str3, a(e2[1]));
                jSONObject.put(str2, str);
            }
            jSONObject2.put("visible_bounds", jSONObject);
        } catch (Exception unused) {
            cpn.a(5);
        }
        return jSONObject2;
    }

    private static JSONObject g(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            bkc.e();
            jSONObject.put("contained_in_scroll_view", cmu.d(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private final JSONObject h(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        String str = "can_show_on_lock_screen";
        try {
            bkc.e();
            jSONObject.put(str, cmu.c(view));
            bkc.e();
            jSONObject.put("is_keyguard_locked", cmu.i(this.b));
        } catch (JSONException unused) {
            cpn.a(5);
        }
        return jSONObject;
    }

    public View a(OnClickListener onClickListener, boolean z) {
        dud m2 = this.i.m();
        if (m2 == null) {
            return null;
        }
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        if (!z) {
            int i2 = m2.f;
            if (i2 != 0) {
                if (i2 == 2) {
                    layoutParams.addRule(12);
                } else if (i2 != 3) {
                    layoutParams.addRule(10);
                } else {
                    layoutParams.addRule(12);
                }
                layoutParams.addRule(11);
            } else {
                layoutParams.addRule(10);
            }
            layoutParams.addRule(9);
        }
        dug dug = new dug(this.b, m2, layoutParams);
        dug.setOnClickListener(onClickListener);
        dug.setContentDescription((CharSequence) dqe.f().a(dtg.cc));
        return dug;
    }

    public final void a(MotionEvent motionEvent) {
        this.j.a(motionEvent);
    }

    public void a(View view) {
        if (((Boolean) dqe.f().a(dtg.ci)).booleanValue()) {
            if (!this.g.optBoolean("custom_one_point_five_click_enabled", false)) {
                cpn.a(5);
                return;
            }
            due due = this.f;
            if (view != null) {
                view.setOnClickListener(due);
                view.setClickable(true);
                due.f = new WeakReference<>(view);
            }
        }
    }

    public final void a(View view, dur dur) {
        if (!b(view, dur)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ((FrameLayout) view).removeAllViews();
            duw duw = this.i;
            if (duw instanceof dux) {
                dux dux = (dux) duw;
                if (dux.b() != null && dux.b().size() > 0) {
                    Object obj = dux.b().get(0);
                    dvr a2 = obj instanceof IBinder ? dvs.a((IBinder) obj) : null;
                    if (a2 != null) {
                        try {
                            cbi a3 = a2.a();
                            if (a3 != null) {
                                Drawable drawable = (Drawable) cbj.a(a3);
                                ImageView imageView = new ImageView(this.b);
                                imageView.setImageDrawable(drawable);
                                imageView.setScaleType(ScaleType.CENTER_INSIDE);
                                ((FrameLayout) view).addView(imageView, layoutParams);
                            }
                        } catch (RemoteException unused) {
                            cpn.a(5);
                        }
                    }
                }
            }
        }
    }

    public final void a(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2) {
        JSONObject jSONObject;
        JSONObject a2 = a(map, view2);
        JSONObject f2 = f(view2);
        JSONObject g2 = g(view2);
        JSONObject h2 = h(view2);
        JSONObject jSONObject2 = null;
        try {
            JSONObject a3 = bkc.e().a(bundle);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("click_point", a3);
                jSONObject3.put("asset_id", str);
                jSONObject = jSONObject3;
            } catch (Exception e2) {
                e = e2;
                jSONObject2 = jSONObject3;
                cml.a("Error occurred while grabbing click signals.", e);
                jSONObject = jSONObject2;
                a(view, f2, a2, g2, h2, str, jSONObject, null);
            }
        } catch (Exception e3) {
            e = e3;
            cml.a("Error occurred while grabbing click signals.", e);
            jSONObject = jSONObject2;
            a(view, f2, a2, g2, h2, str, jSONObject, null);
        }
        a(view, f2, a2, g2, h2, str, jSONObject, null);
    }

    public void a(View view, Map<String, WeakReference<View>> map) {
        a(f(view), a(map, view), g(view), h(view), (JSONObject) null);
    }

    public void a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        String str;
        bxo.b("Invalid call from a non-UI thread.");
        if (map != null) {
            synchronized (map) {
                for (Entry entry : map.entrySet()) {
                    if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                        a(view, (String) entry.getKey(), bundle, map, view2);
                        return;
                    }
                }
            }
        }
        if ("6".equals(this.i.k())) {
            str = "3099";
        } else {
            if ("2".equals(this.i.k())) {
                str = "2099";
            } else {
                if ("1".equals(this.i.k())) {
                    a(view, "1099", bundle, map, view2);
                }
                return;
            }
        }
        a(view, str, bundle, map, view2);
    }

    public void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        if (((Boolean) dqe.f().a(dtg.bZ)).booleanValue()) {
            view.setOnTouchListener(onTouchListener);
            view.setClickable(true);
            view.setOnClickListener(onClickListener);
            if (map != null) {
                synchronized (map) {
                    for (Entry value : map.entrySet()) {
                        View view2 = (View) ((WeakReference) value.getValue()).get();
                        if (view2 != null) {
                            view2.setOnTouchListener(onTouchListener);
                            view2.setClickable(true);
                            view2.setOnClickListener(onClickListener);
                        }
                    }
                }
            }
            if (map2 != null) {
                synchronized (map2) {
                    for (Entry value2 : map2.entrySet()) {
                        View view3 = (View) ((WeakReference) value2.getValue()).get();
                        if (view3 != null) {
                            view3.setOnTouchListener(onTouchListener);
                        }
                    }
                }
            }
        }
    }

    public void a(dxj dxj) {
        if (((Boolean) dqe.f().a(dtg.ci)).booleanValue()) {
            if (!this.g.optBoolean("custom_one_point_five_click_enabled", false)) {
                cpn.a(5);
                return;
            }
            due due = this.f;
            due.b = dxj;
            String str = "/unconfirmedClick";
            if (due.c != null) {
                due.a.b(str, due.c);
            }
            due.c = new duf(due);
            due.a.a(str, due.c);
        }
    }

    public final void a(Map<String, WeakReference<View>> map) {
        if (this.i.o() != null) {
            if ("2".equals(this.i.k())) {
                bkc.i().g().a(this.a.D(), this.i.k(), map.containsKey("2011"));
                return;
            }
            if ("1".equals(this.i.k())) {
                bkc.i().g().a(this.a.D(), this.i.k(), map.containsKey("1009"));
            }
        }
    }

    public boolean a() {
        dud m2 = this.i.m();
        return m2 != null && m2.g;
    }

    public final boolean a(Bundle bundle) {
        if (!a("impression_reporting")) {
            cml.a("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return a((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bkc.e().a(bundle));
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            cpn.a(3);
        } else if (!a("click_reporting")) {
            cml.a("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            a(null, null, null, null, null, bundle.getBundle("click_signal").getString("asset_id"), null, bkc.e().a(bundle));
        }
    }

    public final void b(View view) {
        if (((Boolean) dqe.f().a(dtg.bE)).booleanValue()) {
            dio dio = this.j;
            if (dio != null) {
                dik dik = dio.b;
                if (dik != null) {
                    dik.a(view);
                }
            }
        }
    }

    public void b(View view, Map<String, WeakReference<View>> map) {
        if (!((Boolean) dqe.f().a(dtg.bY)).booleanValue()) {
            view.setOnTouchListener(null);
            view.setClickable(false);
            view.setOnClickListener(null);
            if (map != null) {
                synchronized (map) {
                    for (Entry value : map.entrySet()) {
                        View view2 = (View) ((WeakReference) value.getValue()).get();
                        if (view2 != null) {
                            view2.setOnTouchListener(null);
                            view2.setClickable(false);
                            view2.setOnClickListener(null);
                        }
                    }
                }
            }
        }
    }

    public boolean b() {
        JSONObject jSONObject = this.g;
        return jSONObject != null && jSONObject.optBoolean("allow_pub_owned_ad_view", false);
    }

    public final boolean b(View view, dur dur) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        View o = this.i.o();
        if (o == null) {
            return false;
        }
        ViewParent parent = o.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(o);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(o, layoutParams);
        this.a.a(dur);
        return true;
    }

    public void c() {
        if (((Boolean) dqe.f().a(dtg.ci)).booleanValue()) {
            if (!this.g.optBoolean("custom_one_point_five_click_enabled", false)) {
                cpn.a(5);
                return;
            }
            due due = this.f;
            if (!(due.b == null || due.e == null)) {
                due.a();
                try {
                    due.b.a();
                } catch (RemoteException e2) {
                    cpn.b("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            cpn.a(3);
        } else if (!a("touch_reporting")) {
            cml.a("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            this.j.b.a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        }
    }

    public final void c(View view) {
        this.n = new WeakReference<>(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.view.View r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.e
            monitor-enter(r0)
            boolean r1 = r3.c     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0009:
            boolean r1 = d(r4)     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0014
            r3.a(r4, r5)     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0014:
            dsw<java.lang.Boolean> r1 = defpackage.dtg.ch     // Catch:{ all -> 0x005e }
            dte r2 = defpackage.dqe.f()     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x005c
            if (r5 == 0) goto L_0x005c
            monitor-enter(r5)     // Catch:{ all -> 0x005e }
            java.util.Set r1 = r5.entrySet()     // Catch:{ all -> 0x0059 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0059 }
        L_0x0031:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0059 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0059 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0059 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0059 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0059 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0031
            boolean r2 = d(r2)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0031
            r3.a(r4, r5)     // Catch:{ all -> 0x0059 }
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0057:
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            goto L_0x005c
        L_0x0059:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            throw r4     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            goto L_0x0062
        L_0x0061:
            throw r4
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duy.c(android.view.View, java.util.Map):void");
    }

    public void d() {
        bxo.b("Invalid call from a non-UI thread.");
        if (!this.d) {
            this.d = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(PlayerProviders.ADS, this.g);
                jSONObject.put("ads_id", this.l);
                cpv.a(this.h.d(jSONObject), "NativeAdEngineImpl.recordDownloadedImpression");
            } catch (JSONException e2) {
                cpn.a("", e2);
            }
        }
    }

    public cti g() {
        JSONObject jSONObject = this.g;
        if (jSONObject == null || jSONObject.optJSONObject("overlay") == null) {
            return null;
        }
        bkc.f();
        Context context = this.b;
        dpt a2 = dpt.a();
        cti a3 = ctp.a(context, cuv.a(a2), a2.a, false, false, this.j, this.k, null, null, null, new dny());
        if (a3 != null) {
            a3.o().setVisibility(8);
            dva dva = new dva(a3);
            ceu ceu = this.h;
            ceu.a("/loadHtml", (bhc<? super T>) new dvb<Object>(dva, ceu));
            ceu.a("/showOverlay", (bhc<? super T>) new dvd<Object>(dva, ceu));
            ceu.a("/hideOverlay", (bhc<? super T>) new dve<Object>(dva, ceu));
            cti cti = (cti) dva.a.get();
            if (cti != null) {
                cti.a("/sendMessageToSdk", (bhc<? super cti>) new dvf<Object>(dva, ceu));
            }
        }
        return a3;
    }

    public void h() {
        this.h.a();
    }

    public void i() {
        this.a.N();
    }

    public void j() {
        this.a.J();
    }

    public void k() {
        this.a.O();
    }

    public final View l() {
        WeakReference<View> weakReference = this.n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final Context m() {
        return this.b;
    }

    public final clf n() {
        if (!bkc.B().c(this.b)) {
            return null;
        }
        if (this.m == null) {
            this.m = new clf(this.b, this.a.D());
        }
        return this.m;
    }
}
