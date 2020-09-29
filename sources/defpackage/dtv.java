package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.List;

@cey
/* renamed from: dtv reason: default package */
public final class dtv extends dvx implements duf {
    private final dtm a;
    private final String b;
    private final dv<String, dtq> c;
    private final dv<String, String> d;
    private dqz e;
    private View f;
    private final Object g = new Object();
    /* access modifiers changed from: private */
    public duc h;

    public dtv(String str, dv<String, dtq> dvVar, dv<String, String> dvVar2, dtm dtm, dqz dqz, View view) {
        this.b = str;
        this.c = dvVar;
        this.d = dvVar2;
        this.a = dtm;
        this.e = dqz;
        this.f = view;
    }

    public final String a(String str) {
        return (String) this.d.get(str);
    }

    public final List<String> a() {
        String[] strArr = new String[(this.c.size() + this.d.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.c.size()) {
            strArr[i3] = (String) this.c.b(i2);
            i2++;
            i3++;
        }
        while (i < this.d.size()) {
            strArr[i3] = (String) this.d.b(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    public final void a(duc duc) {
        synchronized (this.g) {
            this.h = duc;
        }
    }

    public final boolean a(car car) {
        if (this.h == null) {
            cow.a("Attempt to call renderVideoInMediaView before ad initialized.");
            return false;
        } else if (this.f == null) {
            return false;
        } else {
            FrameLayout frameLayout = (FrameLayout) cas.a(car);
            this.h.a((View) frameLayout, (dua) new dtw(this));
            return true;
        }
    }

    public final car b() {
        return cas.a(this.h);
    }

    public final dva b(String str) {
        return (dva) this.c.get(str);
    }

    public final dqz c() {
        return this.e;
    }

    public final void c(String str) {
        synchronized (this.g) {
            if (this.h == null) {
                cow.a("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.h.a(null, str, null, null, null);
            }
        }
    }

    public final void d() {
        synchronized (this.g) {
            if (this.h == null) {
                cow.a("#002 Attempt to record impression before native ad initialized.");
            } else {
                this.h.a((View) null, null);
            }
        }
    }

    public final car e() {
        return cas.a(this.h.m().getApplicationContext());
    }

    public final void f() {
        cmd.a.post(new dtx(this));
        this.e = null;
        this.f = null;
    }

    public final String k() {
        return "3";
    }

    public final String l() {
        return this.b;
    }

    public final dtm m() {
        return this.a;
    }

    public final View o() {
        return this.f;
    }
}
