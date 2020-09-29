package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: eri reason: default package */
public final class eri {
    private final String a;
    private final boolean b = true;
    private boolean c;
    private boolean d;
    private final /* synthetic */ erh e;

    public eri(erh erh, String str) {
        this.e = erh;
        bwx.a(str);
        this.a = str;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.f().getBoolean(this.a, true);
        }
        return this.d;
    }

    public final void a(boolean z) {
        Editor edit = this.e.f().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }
}
