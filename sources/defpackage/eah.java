package defpackage;

import android.content.Context;

@cey
/* renamed from: eah reason: default package */
public final class eah {
    final Object a;
    final Context b;
    final String c;
    final coy d;
    cnh<dzv> e;
    eay f;
    int g;
    private cnh<dzv> h;

    public eah(Context context, coy coy, String str) {
        this.a = new Object();
        this.g = 1;
        this.c = str;
        this.b = context.getApplicationContext();
        this.d = coy;
        this.e = new eat();
        this.h = new eat();
    }

    public eah(Context context, coy coy, String str, cnh<dzv> cnh, cnh<dzv> cnh2) {
        this(context, coy, str);
        this.e = cnh;
        this.h = cnh2;
    }

    /* access modifiers changed from: protected */
    public final eay a(dhx dhx) {
        eay eay = new eay(this.h);
        cpx.a.execute(new eai(this, dhx, eay));
        eay.a(new eaq(this, eay), new ear(this, eay));
        return eay;
    }

    public final eau a() {
        synchronized (this.a) {
            if (this.f != null) {
                if (this.f.a != -1) {
                    if (this.g == 0) {
                        eau b2 = this.f.b();
                        return b2;
                    } else if (this.g == 1) {
                        this.g = 2;
                        a(null);
                        eau b3 = this.f.b();
                        return b3;
                    } else if (this.g == 2) {
                        eau b4 = this.f.b();
                        return b4;
                    } else {
                        eau b5 = this.f.b();
                        return b5;
                    }
                }
            }
            this.g = 2;
            this.f = a(null);
            eau b6 = this.f.b();
            return b6;
        }
    }
}
