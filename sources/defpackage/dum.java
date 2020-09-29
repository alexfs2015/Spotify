package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.List;

@cfp
/* renamed from: dum reason: default package */
public final class dum extends dwo implements duw {
    private final dud a;
    private final String b;
    private final dv<String, duh> c;
    private final dv<String, String> d;
    private drq e;
    private View f;
    private final Object g = new Object();
    /* access modifiers changed from: private */
    public dut h;

    public dum(String str, dv<String, duh> dvVar, dv<String, String> dvVar2, dud dud, drq drq, View view) {
        this.b = str;
        this.c = dvVar;
        this.d = dvVar2;
        this.a = dud;
        this.e = drq;
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

    public final void a(dut dut) {
        synchronized (this.g) {
            this.h = dut;
        }
    }

    public final boolean a(cbi cbi) {
        if (this.h == null) {
            cpn.a("Attempt to call renderVideoInMediaView before ad initialized.");
            return false;
        } else if (this.f == null) {
            return false;
        } else {
            FrameLayout frameLayout = (FrameLayout) cbj.a(cbi);
            this.h.a((View) frameLayout, (dur) new dun(this));
            return true;
        }
    }

    public final cbi b() {
        return cbj.a(this.h);
    }

    public final dvr b(String str) {
        return (dvr) this.c.get(str);
    }

    public final drq c() {
        return this.e;
    }

    public final void c(String str) {
        synchronized (this.g) {
            if (this.h == null) {
                cpn.a("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.h.a(null, str, null, null, null);
            }
        }
    }

    public final void d() {
        synchronized (this.g) {
            if (this.h == null) {
                cpn.a("#002 Attempt to record impression before native ad initialized.");
            } else {
                this.h.a((View) null, null);
            }
        }
    }

    public final cbi e() {
        return cbj.a(this.h.m().getApplicationContext());
    }

    public final void f() {
        cmu.a.post(new duo(this));
        this.e = null;
        this.f = null;
    }

    public final String k() {
        return "3";
    }

    public final String l() {
        return this.b;
    }

    public final dud m() {
        return this.a;
    }

    public final View o() {
        return this.f;
    }
}
