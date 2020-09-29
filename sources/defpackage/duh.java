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
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: duh reason: default package */
public class duh implements duc {
    final due a;
    final Context b;
    boolean c;
    boolean d;
    private final Object e = new Object();
    private final dtn f;
    private final JSONObject g;
    private final ced h;
    private final duf i;
    private final dhx j;
    private final coy k;
    private String l;
    private cko m;
    private WeakReference<View> n = null;

    public duh(Context context, due due, ced ced, dhx dhx, JSONObject jSONObject, duf duf, coy coy, String str) {
        this.b = context;
        this.a = due;
        this.h = ced;
        this.j = dhx;
        this.g = jSONObject;
        this.i = duf;
        this.k = coy;
        this.l = str;
        this.f = new dtn(this.h);
    }

    private final int a(int i2) {
        dpn.a();
        return col.b(this.b, i2);
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

    private final boolean a(String str) {
        JSONObject jSONObject = this.g;
        JSONObject optJSONObject = jSONObject == null ? null : jSONObject.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null) {
            return false;
        }
        return optJSONObject.optBoolean(str, false);
    }

    private final boolean a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        bwx.b("Invalid call from a non-UI thread.");
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
            cpe.a(this.h.c(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.a.a((duc) this);
            this.a.C();
            j();
            return true;
        } catch (JSONException e2) {
            clu.a("Unable to create impression JSON.", e2);
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

    private static JSONObject g(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            bjl.e();
            jSONObject.put("contained_in_scroll_view", cmd.d(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final void a(MotionEvent motionEvent) {
        this.j.a(motionEvent);
    }

    public final void a(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2) {
        JSONObject jSONObject;
        JSONObject a2 = a(map, view2);
        JSONObject f2 = f(view2);
        JSONObject g2 = g(view2);
        JSONObject h2 = h(view2);
        JSONObject jSONObject2 = null;
        try {
            JSONObject a3 = bjl.e().a(bundle);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("click_point", a3);
                jSONObject3.put("asset_id", str);
                jSONObject = jSONObject3;
            } catch (Exception e2) {
                e = e2;
                jSONObject2 = jSONObject3;
                clu.a("Error occurred while grabbing click signals.", e);
                jSONObject = jSONObject2;
                a(view, f2, a2, g2, h2, str, jSONObject, null);
            }
        } catch (Exception e3) {
            e = e3;
            clu.a("Error occurred while grabbing click signals.", e);
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
        bwx.b("Invalid call from a non-UI thread.");
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
        if (((Boolean) dpn.f().a(dsp.bZ)).booleanValue()) {
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

    public final void a(Map<String, WeakReference<View>> map) {
        if (this.i.o() != null) {
            if ("2".equals(this.i.k())) {
                bjl.i().g().a(this.a.D(), this.i.k(), map.containsKey("2011"));
                return;
            }
            if ("1".equals(this.i.k())) {
                bjl.i().g().a(this.a.D(), this.i.k(), map.containsKey("1009"));
            }
        }
    }

    public final boolean a(Bundle bundle) {
        if (!a("impression_reporting")) {
            clu.a("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return a((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bjl.e().a(bundle));
    }

    public void b(View view, Map<String, WeakReference<View>> map) {
        if (!((Boolean) dpn.f().a(dsp.bY)).booleanValue()) {
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

    public final boolean b(View view, dua dua) {
        LayoutParams layoutParams = new LayoutParams(-2, -2, 17);
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
        this.a.a(dua);
        return true;
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
            dsf<java.lang.Boolean> r1 = defpackage.dsp.ch     // Catch:{ all -> 0x005e }
            dsn r2 = defpackage.dpn.f()     // Catch:{ all -> 0x005e }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duh.c(android.view.View, java.util.Map):void");
    }

    public void d() {
        bwx.b("Invalid call from a non-UI thread.");
        if (!this.d) {
            this.d = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(PlayerProviders.ADS, this.g);
                jSONObject.put("ads_id", this.l);
                cpe.a(this.h.d(jSONObject), "NativeAdEngineImpl.recordDownloadedImpression");
            } catch (JSONException e2) {
                cow.a("", e2);
            }
        }
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

    public final cko n() {
        if (!bjl.B().c(this.b)) {
            return null;
        }
        if (this.m == null) {
            this.m = new cko(this.b, this.a.D());
        }
        return this.m;
    }

    public View a(OnClickListener onClickListener, boolean z) {
        dtm m2 = this.i.m();
        if (m2 == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
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
        dtp dtp = new dtp(this.b, m2, layoutParams);
        dtp.setOnClickListener(onClickListener);
        dtp.setContentDescription((CharSequence) dpn.f().a(dsp.cc));
        return dtp;
    }

    public boolean a() {
        dtm m2 = this.i.m();
        return m2 != null && m2.g;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            cow.a(3);
        } else if (!a("click_reporting")) {
            clu.a("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            a(null, null, null, null, null, bundle.getBundle("click_signal").getString("asset_id"), null, bjl.e().a(bundle));
        }
    }

    private final void a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6) {
        String str2 = "has_custom_click_handler";
        bwx.b("Invalid call from a non-UI thread.");
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
            bjl.g();
            jSONObject8.put("is_privileged_process", cmj.e());
            boolean z = true;
            if (((Boolean) dpn.f().a(dsp.ci)).booleanValue() && this.f.b != null && this.g.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", bjl.l().a());
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
                clu.a("Exception obtaining click signals", e2);
            }
            jSONObject7.put("click", jSONObject8);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.l);
            cpe.a(this.h.b(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (JSONException e3) {
            clu.a("Unable to create click JSON.", e3);
        }
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            cow.a(3);
        } else if (!a("touch_reporting")) {
            clu.a("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            this.j.b.a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        }
    }

    public final void b(View view) {
        if (((Boolean) dpn.f().a(dsp.bE)).booleanValue()) {
            dhx dhx = this.j;
            if (dhx != null) {
                dht dht = dhx.b;
                if (dht != null) {
                    dht.a(view);
                }
            }
        }
    }

    public csr g() {
        JSONObject jSONObject = this.g;
        if (jSONObject == null || jSONObject.optJSONObject("overlay") == null) {
            return null;
        }
        bjl.f();
        Context context = this.b;
        dpc a2 = dpc.a();
        csr a3 = csy.a(context, cue.a(a2), a2.a, false, false, this.j, this.k, null, null, null, new dnh());
        if (a3 != null) {
            a3.o().setVisibility(8);
            duj duj = new duj(a3);
            ced ced = this.h;
            ced.a("/loadHtml", (bgl<? super T>) new duk<Object>(duj, ced));
            ced.a("/showOverlay", (bgl<? super T>) new dum<Object>(duj, ced));
            ced.a("/hideOverlay", (bgl<? super T>) new dun<Object>(duj, ced));
            csr csr = (csr) duj.a.get();
            if (csr != null) {
                csr.a("/sendMessageToSdk", (bgl<? super csr>) new duo<Object>(duj, ced));
            }
        }
        return a3;
    }

    public final void a(View view, dua dua) {
        if (!b(view, dua)) {
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            ((FrameLayout) view).removeAllViews();
            duf duf = this.i;
            if (duf instanceof dug) {
                dug dug = (dug) duf;
                if (dug.b() != null && dug.b().size() > 0) {
                    Object obj = dug.b().get(0);
                    dva a2 = obj instanceof IBinder ? dvb.a((IBinder) obj) : null;
                    if (a2 != null) {
                        try {
                            car a3 = a2.a();
                            if (a3 != null) {
                                Drawable drawable = (Drawable) cas.a(a3);
                                ImageView imageView = new ImageView(this.b);
                                imageView.setImageDrawable(drawable);
                                imageView.setScaleType(ScaleType.CENTER_INSIDE);
                                ((FrameLayout) view).addView(imageView, layoutParams);
                            }
                        } catch (RemoteException unused) {
                            cow.a(5);
                        }
                    }
                }
            }
        }
    }

    public void a(dws dws) {
        if (((Boolean) dpn.f().a(dsp.ci)).booleanValue()) {
            if (!this.g.optBoolean("custom_one_point_five_click_enabled", false)) {
                cow.a(5);
                return;
            }
            dtn dtn = this.f;
            dtn.b = dws;
            String str = "/unconfirmedClick";
            if (dtn.c != null) {
                dtn.a.b(str, dtn.c);
            }
            dtn.c = new dto(dtn);
            dtn.a.a(str, dtn.c);
        }
    }

    public void c() {
        if (((Boolean) dpn.f().a(dsp.ci)).booleanValue()) {
            if (!this.g.optBoolean("custom_one_point_five_click_enabled", false)) {
                cow.a(5);
                return;
            }
            dtn dtn = this.f;
            if (!(dtn.b == null || dtn.e == null)) {
                dtn.a();
                try {
                    dtn.b.a();
                } catch (RemoteException e2) {
                    cow.b("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public void a(View view) {
        if (((Boolean) dpn.f().a(dsp.ci)).booleanValue()) {
            if (!this.g.optBoolean("custom_one_point_five_click_enabled", false)) {
                cow.a(5);
                return;
            }
            dtn dtn = this.f;
            if (view != null) {
                view.setOnClickListener(dtn);
                view.setClickable(true);
                dtn.f = new WeakReference<>(view);
            }
        }
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
            cow.a(5);
        }
        return jSONObject2;
    }

    private final JSONObject h(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        String str = "can_show_on_lock_screen";
        try {
            bjl.e();
            jSONObject.put(str, cmd.c(view));
            bjl.e();
            jSONObject.put("is_keyguard_locked", cmd.i(this.b));
        } catch (JSONException unused) {
            cow.a(5);
        }
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
                        cow.a(5);
                    }
                }
            }
        }
        return jSONObject2;
    }
}
