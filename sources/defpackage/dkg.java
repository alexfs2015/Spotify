package defpackage;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: dkg reason: default package */
public final class dkg implements OnGlobalLayoutListener, OnScrollChangedListener {
    protected final dke a;
    private final Object b = new Object();
    private final WeakReference<ckz> c;
    private WeakReference<ViewTreeObserver> d;
    private final dlr e;
    private final Context f;
    private final WindowManager g;
    private final PowerManager h;
    private final KeyguardManager i;
    private final DisplayMetrics j;
    private dko k;
    private boolean l;
    private boolean m = false;
    private boolean n = false;
    private boolean o;
    private boolean p;
    private boolean q;
    private BroadcastReceiver r;
    private final HashSet<Object> s = new HashSet<>();
    private cob t;
    private final HashSet<dlc> u = new HashSet<>();
    private final Rect v = new Rect();
    private final dkj w;
    private float x;

    public dkg(Context context, dpc dpc, ckz ckz, coy coy, dlr dlr) {
        this.c = new WeakReference<>(ckz);
        this.e = dlr;
        this.d = new WeakReference<>(null);
        this.o = true;
        this.q = false;
        this.t = new cob(200);
        dke dke = new dke(UUID.randomUUID().toString(), coy, dpc.a, ckz.k, ckz.a(), dpc.h);
        this.a = dke;
        this.g = (WindowManager) context.getSystemService("window");
        this.h = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.i = (KeyguardManager) context.getSystemService("keyguard");
        this.f = context;
        this.w = new dkj(this, new Handler());
        this.f.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this.w);
        this.j = context.getResources().getDisplayMetrics();
        Display defaultDisplay = this.g.getDefaultDisplay();
        this.v.right = defaultDisplay.getWidth();
        this.v.bottom = defaultDisplay.getHeight();
        a();
    }

    private static int a(int i2, DisplayMetrics displayMetrics) {
        return (int) (((float) i2) / displayMetrics.density);
    }

    private final JSONObject a(View view, Boolean bool) {
        Boolean bool2;
        View view2 = view;
        String str = "isVisible";
        String str2 = "isAttachedToWindow";
        if (view2 == null) {
            return j().put(str2, false).put("isScreenOn", k()).put(str, false);
        }
        boolean a2 = bjl.g().a(view2);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view2.getLocationOnScreen(iArr);
            view2.getLocationInWindow(iArr2);
        } catch (Exception e2) {
            clu.a("Failure getting view location.", e2);
        }
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view2.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view2.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view2.getHitRect(rect4);
        JSONObject j2 = j();
        JSONObject put = j2.put("windowVisibility", view.getWindowVisibility()).put(str2, a2);
        String str3 = "top";
        String str4 = "bottom";
        String str5 = "left";
        String str6 = str;
        String str7 = "right";
        JSONObject jSONObject = j2;
        String str8 = "screenDensity";
        put.put("viewBox", new JSONObject().put(str3, a(this.v.top, this.j)).put(str4, a(this.v.bottom, this.j)).put(str5, a(this.v.left, this.j)).put(str7, a(this.v.right, this.j))).put("adBox", new JSONObject().put(str3, a(rect.top, this.j)).put(str4, a(rect.bottom, this.j)).put(str5, a(rect.left, this.j)).put(str7, a(rect.right, this.j))).put("globalVisibleBox", new JSONObject().put(str3, a(rect2.top, this.j)).put(str4, a(rect2.bottom, this.j)).put(str5, a(rect2.left, this.j)).put(str7, a(rect2.right, this.j))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put(str3, a(rect3.top, this.j)).put(str4, a(rect3.bottom, this.j)).put(str5, a(rect3.left, this.j)).put(str7, a(rect3.right, this.j))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put(str3, a(rect4.top, this.j)).put(str4, a(rect4.bottom, this.j)).put(str5, a(rect4.left, this.j)).put(str7, a(rect4.right, this.j))).put(str8, (double) this.j.density);
        if (bool == null) {
            bjl.e();
            bool2 = Boolean.valueOf(cmd.a(view2, this.h, this.i));
        } else {
            bool2 = bool;
        }
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put(str6, bool2.booleanValue());
        return jSONObject2;
    }

    private static JSONObject a(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    private final void a(JSONObject jSONObject, boolean z) {
        try {
            JSONObject a2 = a(jSONObject);
            ArrayList arrayList = new ArrayList(this.u);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((dlc) obj).a(a2, z);
            }
        } catch (Throwable th) {
            clu.a("Skipping active view message.", th);
        }
    }

    private final void h() {
        dko dko = this.k;
        if (dko != null) {
            dko.a(this);
        }
    }

    private final void i() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    private final boolean k() {
        return VERSION.SDK_INT >= 20 ? this.h.isInteractive() : this.h.isScreenOn();
    }

    public final void a() {
        this.x = cmu.a(this.f);
    }

    public final void a(dko dko) {
        synchronized (this.b) {
            this.k = dko;
        }
    }

    public final void b(dlc dlc) {
        if (this.u.isEmpty()) {
            synchronized (this.b) {
                if (this.r == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.r = new dkh(this);
                    bjl.E().a(this.f, this.r, intentFilter);
                }
            }
            a(3);
        }
        this.u.add(dlc);
        try {
            dlc.a(a(a(this.e.a(), (Boolean) null)), false);
        } catch (JSONException e2) {
            clu.a("Skipping measurement update for new client.", e2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(Map<String, String> map) {
        String str = "isVisible";
        if (map.containsKey(str)) {
            if (!"1".equals(map.get(str))) {
                "true".equals(map.get(str));
            }
            Iterator it = this.s.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void c(dlc dlc) {
        this.u.remove(dlc);
        dlc.b();
        if (this.u.isEmpty()) {
            synchronized (this.b) {
                i();
                synchronized (this.b) {
                    if (this.r != null) {
                        try {
                            bjl.E().a(this.f, this.r);
                        } catch (IllegalStateException e2) {
                            clu.a("Failed trying to unregister the receiver", e2);
                        } catch (Exception e3) {
                            bjl.i().a((Throwable) e3, "ActiveViewUnit.stopScreenStatusMonitoring");
                        }
                        this.r = null;
                    }
                }
                this.f.getContentResolver().unregisterContentObserver(this.w);
                int i2 = 0;
                this.o = false;
                h();
                ArrayList arrayList = new ArrayList(this.u);
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    c((dlc) obj);
                }
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.o;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        a(3);
    }

    public final void e() {
        synchronized (this.b) {
            this.n = true;
            a(3);
        }
    }

    public final void f() {
        synchronized (this.b) {
            this.m = true;
            a(3);
        }
    }

    public final void g() {
        synchronized (this.b) {
            this.m = false;
            a(3);
        }
    }

    public final void onGlobalLayout() {
        a(2);
    }

    public final void onScrollChanged() {
        a(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034 A[Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038 A[Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            monitor-enter(r0)
            boolean r1 = r5.o     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0041
            r1 = 1
            r5.p = r1     // Catch:{ all -> 0x0043 }
            org.json.JSONObject r2 = r5.j()     // Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
            java.lang.String r3 = "doneReasonCode"
            java.lang.String r4 = "u"
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
            r5.a(r2, r1)     // Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
            goto L_0x0024
        L_0x0019:
            r1 = move-exception
            java.lang.String r2 = "Failure while processing active view data."
        L_0x001c:
            defpackage.clu.a(r2, r1)     // Catch:{ all -> 0x0043 }
            goto L_0x0024
        L_0x0020:
            r1 = move-exception
            java.lang.String r2 = "JSON failure while processing active view data."
            goto L_0x001c
        L_0x0024:
            java.lang.String r1 = "Untracking ad unit: "
            dke r2 = r5.a     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = r2.c     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0043 }
            int r3 = r2.length()     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x0038
            r1.concat(r2)     // Catch:{ all -> 0x0043 }
            goto L_0x003d
        L_0x0038:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0043 }
            r2.<init>(r1)     // Catch:{ all -> 0x0043 }
        L_0x003d:
            r1 = 3
            defpackage.cow.a(r1)     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            return
        L_0x0043:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            goto L_0x0047
        L_0x0046:
            throw r1
        L_0x0047:
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkg.b():void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ca, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b A[Catch:{ RuntimeException | JSONException -> 0x0088 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0060 A[Catch:{ RuntimeException | JSONException -> 0x0088 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            monitor-enter(r0)
            java.util.HashSet<dlc> r1 = r7.u     // Catch:{ all -> 0x00cb }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00cb }
        L_0x0009:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00cb }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00cb }
            dlc r2 = (defpackage.dlc) r2     // Catch:{ all -> 0x00cb }
            boolean r2 = r2.a()     // Catch:{ all -> 0x00cb }
            if (r2 == 0) goto L_0x0009
            r1 = 1
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r7.o     // Catch:{ all -> 0x00cb }
            if (r1 != 0) goto L_0x0028
            goto L_0x00c9
        L_0x0028:
            dlr r1 = r7.e     // Catch:{ all -> 0x00cb }
            android.view.View r1 = r1.a()     // Catch:{ all -> 0x00cb }
            if (r1 == 0) goto L_0x003f
            defpackage.bjl.e()     // Catch:{ all -> 0x00cb }
            android.os.PowerManager r2 = r7.h     // Catch:{ all -> 0x00cb }
            android.app.KeyguardManager r5 = r7.i     // Catch:{ all -> 0x00cb }
            boolean r2 = defpackage.cmd.a(r1, r2, r5)     // Catch:{ all -> 0x00cb }
            if (r2 == 0) goto L_0x003f
            r2 = 1
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            if (r1 == 0) goto L_0x0052
            if (r2 == 0) goto L_0x0052
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ all -> 0x00cb }
            r5.<init>()     // Catch:{ all -> 0x00cb }
            r6 = 0
            boolean r5 = r1.getGlobalVisibleRect(r5, r6)     // Catch:{ all -> 0x00cb }
            if (r5 == 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            dlr r6 = r7.e     // Catch:{ all -> 0x00cb }
            boolean r6 = r6.b()     // Catch:{ all -> 0x00cb }
            if (r6 == 0) goto L_0x0060
            r7.b()     // Catch:{ all -> 0x00cb }
            monitor-exit(r0)     // Catch:{ all -> 0x00cb }
            return
        L_0x0060:
            if (r8 != r4) goto L_0x0070
            cob r6 = r7.t     // Catch:{ all -> 0x00cb }
            boolean r6 = r6.a()     // Catch:{ all -> 0x00cb }
            if (r6 != 0) goto L_0x0070
            boolean r6 = r7.q     // Catch:{ all -> 0x00cb }
            if (r5 != r6) goto L_0x0070
            monitor-exit(r0)     // Catch:{ all -> 0x00cb }
            return
        L_0x0070:
            if (r5 != 0) goto L_0x007a
            boolean r6 = r7.q     // Catch:{ all -> 0x00cb }
            if (r6 != 0) goto L_0x007a
            if (r8 != r4) goto L_0x007a
            monitor-exit(r0)     // Catch:{ all -> 0x00cb }
            return
        L_0x007a:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)     // Catch:{ RuntimeException | JSONException -> 0x0088 }
            org.json.JSONObject r8 = r7.a(r1, r8)     // Catch:{ RuntimeException | JSONException -> 0x0088 }
            r7.a(r8, r3)     // Catch:{ RuntimeException | JSONException -> 0x0088 }
            r7.q = r5     // Catch:{ RuntimeException | JSONException -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r8 = 3
            defpackage.cow.a(r8)     // Catch:{ all -> 0x00cb }
        L_0x008c:
            dlr r8 = r7.e     // Catch:{ all -> 0x00cb }
            dlr r8 = r8.c()     // Catch:{ all -> 0x00cb }
            android.view.View r8 = r8.a()     // Catch:{ all -> 0x00cb }
            if (r8 == 0) goto L_0x00c4
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r7.d     // Catch:{ all -> 0x00cb }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00cb }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ all -> 0x00cb }
            android.view.ViewTreeObserver r8 = r8.getViewTreeObserver()     // Catch:{ all -> 0x00cb }
            if (r8 == r1) goto L_0x00c4
            r7.i()     // Catch:{ all -> 0x00cb }
            boolean r2 = r7.l     // Catch:{ all -> 0x00cb }
            if (r2 == 0) goto L_0x00b5
            if (r1 == 0) goto L_0x00bd
            boolean r1 = r1.isAlive()     // Catch:{ all -> 0x00cb }
            if (r1 == 0) goto L_0x00bd
        L_0x00b5:
            r7.l = r4     // Catch:{ all -> 0x00cb }
            r8.addOnScrollChangedListener(r7)     // Catch:{ all -> 0x00cb }
            r8.addOnGlobalLayoutListener(r7)     // Catch:{ all -> 0x00cb }
        L_0x00bd:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00cb }
            r1.<init>(r8)     // Catch:{ all -> 0x00cb }
            r7.d = r1     // Catch:{ all -> 0x00cb }
        L_0x00c4:
            r7.h()     // Catch:{ all -> 0x00cb }
            monitor-exit(r0)     // Catch:{ all -> 0x00cb }
            return
        L_0x00c9:
            monitor-exit(r0)     // Catch:{ all -> 0x00cb }
            return
        L_0x00cb:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00cb }
            goto L_0x00cf
        L_0x00ce:
            throw r8
        L_0x00cf:
            goto L_0x00ce
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkg.a(int):void");
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.a.c);
    }

    /* access modifiers changed from: 0000 */
    public final void a(dlc dlc) {
        String valueOf = String.valueOf(this.a.c);
        String str = "Received request to untrack: ";
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        cow.a(3);
        c(dlc);
    }

    private final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        String str = "activeViewJSON";
        String str2 = "timestamp";
        String str3 = "adFormat";
        String str4 = "hashCode";
        String str5 = "isMraid";
        String str6 = "isStopped";
        String str7 = "isPaused";
        String str8 = "isNative";
        String str9 = "isScreenOn";
        String str10 = "appMuted";
        String str11 = "appVolume";
        String str12 = "deviceVolume";
        jSONObject.put("afmaVersion", this.a.d).put(str, this.a.b).put(str2, bjl.l().b()).put(str3, this.a.a).put(str4, this.a.c).put(str5, this.a.e).put(str6, this.n).put(str7, this.m).put(str8, this.a.f).put(str9, k()).put(str10, bjl.D().b()).put(str11, (double) bjl.D().a()).put(str12, (double) this.x);
        return jSONObject;
    }
}
