package defpackage;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager.BadTokenException;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.ArrayList;
import java.util.List;

@cey
/* renamed from: cmw reason: default package */
public final class cmw {
    final Context a;
    public String b;
    public String c;
    public String d;
    public String e;
    int f;
    private final float g;
    private float h;
    private float i;
    private float j;
    private int k;
    private float l;
    private float m;
    private float n;
    private float o;
    private Handler p;
    private Runnable q;

    public cmw(Context context, String str) {
        this(context);
        this.b = str;
    }

    private static int a(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    private final void a(int i2, float f2, float f3) {
        if (i2 == 0) {
            this.f = 0;
            this.h = f2;
            this.i = f3;
            this.j = f3;
            return;
        }
        int i3 = this.f;
        if (i3 != -1) {
            if (i2 == 2) {
                if (f3 > this.i) {
                    this.i = f3;
                } else if (f3 < this.j) {
                    this.j = f3;
                }
                if (this.i - this.j > this.g * 30.0f) {
                    this.f = -1;
                    return;
                }
                int i4 = this.f;
                if (i4 == 0 || i4 == 2 ? f2 - this.h >= this.g * 50.0f : !(!(i4 == 1 || i4 == 3) || f2 - this.h > this.g * -50.0f)) {
                    this.h = f2;
                    this.f++;
                }
                int i5 = this.f;
                if (i5 == 1 || i5 == 3) {
                    if (f2 > this.h) {
                        this.h = f2;
                    }
                } else if (i5 == 2 && f2 < this.h) {
                    this.h = f2;
                }
            } else if (i2 == 1 && i3 == 4) {
                a();
            }
        }
    }

    private final boolean a(float f2, float f3, float f4, float f5) {
        return Math.abs(this.l - f2) < ((float) this.k) && Math.abs(this.m - f3) < ((float) this.k) && Math.abs(this.n - f4) < ((float) this.k) && Math.abs(this.o - f5) < ((float) this.k);
    }

    public final void a(MotionEvent motionEvent) {
        if (((Boolean) dpn.f().a(dsp.cO)).booleanValue()) {
            int actionMasked = motionEvent.getActionMasked();
            int historySize = motionEvent.getHistorySize();
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked == 0) {
                this.f = 0;
                this.l = motionEvent.getX();
                this.m = motionEvent.getY();
                return;
            }
            int i2 = this.f;
            if (i2 != -1) {
                boolean z = true;
                if (i2 == 0 && actionMasked == 5) {
                    this.f = 5;
                    this.n = motionEvent.getX(1);
                    this.o = motionEvent.getY(1);
                    this.p.postDelayed(this.q, ((Long) dpn.f().a(dsp.cP)).longValue());
                    return;
                } else if (this.f == 5) {
                    if (pointerCount == 2) {
                        if (actionMasked == 2) {
                            boolean z2 = false;
                            for (int i3 = 0; i3 < historySize; i3++) {
                                if (!a(motionEvent.getHistoricalX(0, i3), motionEvent.getHistoricalY(0, i3), motionEvent.getHistoricalX(1, i3), motionEvent.getHistoricalY(1, i3))) {
                                    z2 = true;
                                }
                            }
                            if (a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1))) {
                                z = z2;
                            }
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f = -1;
                        this.p.removeCallbacks(this.q);
                    }
                }
            }
            return;
        }
        int historySize2 = motionEvent.getHistorySize();
        for (int i4 = 0; i4 < historySize2; i4++) {
            a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i4), motionEvent.getHistoricalY(0, i4));
        }
        a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }

    public cmw(Context context) {
        this.f = 0;
        this.q = new cmx(this);
        this.a = context;
        this.g = context.getResources().getDisplayMetrics().density;
        this.k = ViewConfiguration.get(this.a).getScaledTouchSlop();
        bjl.t().a();
        this.p = bjl.t().a;
    }

    public final void a() {
        try {
            if (!((Boolean) dpn.f().a(dsp.cN)).booleanValue()) {
                if (!((Boolean) dpn.f().a(dsp.cM)).booleanValue()) {
                    b();
                    return;
                }
            }
            if (!(this.a instanceof Activity)) {
                cow.a(4);
                return;
            }
            String str = !TextUtils.isEmpty(bjl.o().a()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = bjl.o().b() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            int a2 = a((List<String>) arrayList, "Ad Information", true);
            int a3 = a((List<String>) arrayList, str, ((Boolean) dpn.f().a(dsp.cM)).booleanValue());
            int a4 = a((List<String>) arrayList, str2, ((Boolean) dpn.f().a(dsp.cN)).booleanValue());
            Builder builder = new Builder(this.a, bjl.g().f());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new cmy(this, a2, a3, a4));
            builder.create().show();
        } catch (BadTokenException unused) {
            clu.a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006b, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r5 = this;
            android.content.Context r0 = r5.a
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 != 0) goto L_0x000b
            r0 = 4
            defpackage.cow.a(r0)
            return
        L_0x000b:
            java.lang.String r0 = r5.b
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = "\\+"
            java.lang.String r2 = "%20"
            java.lang.String r0 = r0.replaceAll(r1, r2)
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            android.net.Uri$Builder r0 = r1.encodedQuery(r0)
            android.net.Uri r0 = r0.build()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            defpackage.bjl.e()
            java.util.Map r0 = defpackage.cmd.a(r0)
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x003c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            java.lang.String r4 = " = "
            r1.append(r4)
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            java.lang.String r3 = "\n\n"
            r1.append(r3)
            goto L_0x003c
        L_0x005f:
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            java.lang.String r0 = "No debug information"
        L_0x0070:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            android.content.Context r2 = r5.a
            r1.<init>(r2)
            r1.setMessage(r0)
            java.lang.String r2 = "Ad Information"
            r1.setTitle(r2)
            cmz r2 = new cmz
            r2.<init>(r5, r0)
            java.lang.String r0 = "Share"
            r1.setPositiveButton(r0, r2)
            android.content.DialogInterface$OnClickListener r0 = defpackage.cna.a
            java.lang.String r2 = "Close"
            r1.setNegativeButton(r2, r0)
            android.app.AlertDialog r0 = r1.create()
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmw.b():void");
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void c() {
        cnd o2 = bjl.o();
        Context context = this.a;
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        boolean b2 = o2.b();
        if (o2.b(context, str, str2)) {
            if (!b2 && !TextUtils.isEmpty(str3)) {
                o2.a(context, str2, str3, str);
            }
            cow.a(3);
            o2.a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        o2.c(context, str, str2);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void d() {
        cnd o2 = bjl.o();
        Context context = this.a;
        String str = this.c;
        String str2 = this.d;
        if (!o2.a(context, str, str2)) {
            o2.a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(o2.a)) {
            cow.a(3);
            o2.a(context, "There was no creative pushed from DFP to the device.", false, false);
            return;
        }
        if ("1".equals(o2.a)) {
            cow.a(3);
            o2.c(context, str, str2);
            return;
        }
        if (Ad.DEFAULT_SKIPPABLE_AD_DELAY.equals(o2.a)) {
            cow.a(3);
            o2.a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }
}
