package defpackage;

import android.content.Context;

@cfp
/* renamed from: eay reason: default package */
public final class eay {
    final Object a;
    final Context b;
    final String c;
    final cpp d;
    cny<eam> e;
    ebp f;
    int g;
    private cny<eam> h;

    public eay(Context context, cpp cpp, String str) {
        this.a = new Object();
        this.g = 1;
        this.c = str;
        this.b = context.getApplicationContext();
        this.d = cpp;
        this.e = new ebk();
        this.h = new ebk();
    }

    public eay(Context context, cpp cpp, String str, cny<eam> cny, cny<eam> cny2) {
        this(context, cpp, str);
        this.e = cny;
        this.h = cny2;
    }

    public final ebl a() {
        synchronized (this.a) {
            if (this.f != null) {
                if (this.f.a != -1) {
                    if (this.g == 0) {
                        ebl b2 = this.f.b();
                        return b2;
                    } else if (this.g == 1) {
                        this.g = 2;
                        a(null);
                        ebl b3 = this.f.b();
                        return b3;
                    } else if (this.g == 2) {
                        ebl b4 = this.f.b();
                        return b4;
                    } else {
                        ebl b5 = this.f.b();
                        return b5;
                    }
                }
            }
            this.g = 2;
            this.f = a(null);
            ebl b6 = this.f.b();
            return b6;
        }
    }

    /* access modifiers changed from: protected */
    public final ebp a(dio dio) {
        ebp ebp = new ebp(this.h);
        cqo.a.execute(new eaz(this, dio, ebp));
        ebp.a(new ebh(this, ebp), new ebi(this, ebp));
        return ebp;
    }
}
