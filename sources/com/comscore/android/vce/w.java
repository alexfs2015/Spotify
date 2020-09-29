package com.comscore.android.vce;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.comscore.android.CommonUtils;
import com.comscore.android.id.IdHelperAndroid;

class w {
    s a;
    TelephonyManager b;
    WindowManager c;
    ae d;
    Integer e;
    ae f;
    ae g;
    ae h;
    ae i;
    Integer j;
    String k;
    String l;
    String m;
    Integer n;
    Float o;

    w(s sVar) {
        this.a = sVar;
        b();
    }

    /* access modifiers changed from: 0000 */
    public ae a(Rect rect) {
        return new ae(rect.left, rect.top, rect.width(), rect.height());
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.b = null;
        this.c = null;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.b = this.a.c().checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? (TelephonyManager) this.a.c().getSystemService("phone") : null;
        this.c = (WindowManager) this.a.c().getSystemService("window");
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.c != null;
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        return this.b != null;
    }

    /* access modifiers changed from: 0000 */
    public int e() {
        if (this.j == null) {
            t();
        }
        return this.j.intValue();
    }

    /* access modifiers changed from: 0000 */
    public ae f() {
        if (this.f == null) {
            t();
        }
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public ae g() {
        if (this.g == null) {
            t();
        }
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public ae h() {
        if (this.h == null) {
            t();
        }
        return this.h;
    }

    /* access modifiers changed from: 0000 */
    public float i() {
        if (this.o == null) {
            t();
        }
        return this.o.floatValue();
    }

    /* access modifiers changed from: 0000 */
    public ae j() {
        if (this.d == null) {
            u();
        }
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public void k() {
        this.e = Integer.valueOf(this.a.c().getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* access modifiers changed from: 0000 */
    public ae l() {
        if (this.i == null) {
            v();
        }
        return this.i;
    }

    /* access modifiers changed from: 0000 */
    public String m() {
        if (this.k == null) {
            s();
        }
        return this.k;
    }

    /* access modifiers changed from: 0000 */
    public String n() {
        if (this.l == null) {
            s();
        }
        return this.l;
    }

    /* access modifiers changed from: 0000 */
    public String o() {
        if (this.m == null) {
            s();
        }
        return this.m;
    }

    /* access modifiers changed from: 0000 */
    public int p() {
        if (this.n == null) {
            s();
        }
        return this.n.intValue();
    }

    /* access modifiers changed from: 0000 */
    public void q() {
        s();
    }

    /* access modifiers changed from: 0000 */
    public void r() {
        t();
        u();
        v();
    }

    /* access modifiers changed from: 0000 */
    public void s() {
        String simOperator = this.b.getSimOperator();
        String str = IdHelperAndroid.NO_ID_AVAILABLE;
        if (simOperator == null || simOperator.length() <= 3) {
            this.l = str;
            this.k = str;
        } else {
            this.l = simOperator.substring(0, 3);
            this.k = simOperator.substring(3);
        }
        String networkOperatorName = this.b.getNetworkOperatorName();
        if (networkOperatorName != null && networkOperatorName.length() > 0) {
            this.m = networkOperatorName;
        }
        this.m = str;
        this.n = Integer.valueOf(this.b.getNetworkType());
    }

    /* access modifiers changed from: 0000 */
    public void t() {
        Display defaultDisplay = this.c.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        this.j = Integer.valueOf(defaultDisplay.getRotation());
        Point applicationSize = CommonUtils.getApplicationSize(this.a.c());
        this.f = a(new Rect(0, 0, applicationSize.x, applicationSize.y));
        Point displaySize = CommonUtils.getDisplaySize(this.a.c());
        Rect rect = new Rect();
        rect.set(0, 0, displaySize.x, displaySize.y);
        this.g = a(rect);
        this.o = Float.valueOf(displayMetrics.density > 0.0f ? displayMetrics.density : 1.0f);
        this.h = new ae(0, 0, Math.round(((float) this.g.a()) / this.o.floatValue()), Math.round(((float) this.g.b()) / this.o.floatValue()));
    }

    /* access modifiers changed from: 0000 */
    public void u() {
        Rect rect = new Rect();
        if (this.e == null) {
            k();
        }
        if (this.e.intValue() > 0) {
            int dimensionPixelSize = this.a.c().getResources().getDimensionPixelSize(this.e.intValue());
            if (dimensionPixelSize > 0) {
                rect.set(0, 0, g().a(), dimensionPixelSize);
            }
        }
        this.d = a(rect);
    }

    /* access modifiers changed from: 0000 */
    public void v() {
        int i2;
        Rect rect = new Rect();
        boolean hasPermanentMenuKey = ViewConfiguration.get(this.a.c()).hasPermanentMenuKey();
        boolean deviceHasKey = KeyCharacterMap.deviceHasKey(4);
        if (!hasPermanentMenuKey && !deviceHasKey) {
            Resources resources = this.a.c().getResources();
            int i3 = resources.getConfiguration().orientation;
            String str = "android";
            String str2 = "dimen";
            String str3 = "navigation_bar_height";
            if ((this.a.c().getResources().getConfiguration().screenLayout & 15) >= 3) {
                if (i3 != 1) {
                    str3 = "navigation_bar_height_landscape";
                }
            } else if (i3 != 1) {
                str3 = "navigation_bar_width";
            }
            int identifier = resources.getIdentifier(str3, str2, str);
            if (identifier > 0) {
                i2 = this.a.c().getResources().getDimensionPixelSize(identifier);
                rect.set(0, 0, g().a(), i2);
                this.i = a(rect);
            }
        }
        i2 = 0;
        rect.set(0, 0, g().a(), i2);
        this.i = a(rect);
    }
}
