package defpackage;

import android.text.TextUtils;

/* renamed from: twd reason: default package */
public final class twd implements twc {
    public int a;
    private final ttv b;
    private String c;
    private boolean d;

    public twd(ttv ttv) {
        this.b = ttv;
    }

    public final void a(String str, boolean z) {
        if (b(str, z)) {
            this.c = str;
            this.d = z;
        }
    }

    public final void a(int i) {
        this.a = i;
    }

    public final boolean a(uys uys) {
        return d(uys);
    }

    public final boolean b(uys uys) {
        return (this.b.a() && uys.i()) || !uys.k();
    }

    public final int a() {
        return this.a;
    }

    public final boolean c(uys uys) {
        return this.d && d(uys);
    }

    public boolean d(uys uys) {
        return TextUtils.equals(this.c, uys.getUri());
    }

    private boolean b(String str, boolean z) {
        return z != this.d || !TextUtils.equals(str, this.c);
    }
}
