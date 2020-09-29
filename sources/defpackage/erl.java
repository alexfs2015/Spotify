package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: erl reason: default package */
public final class erl {
    final String a;
    boolean b;
    String c;
    final /* synthetic */ erh d;
    private final String e = null;

    public erl(erh erh, String str) {
        this.d = erh;
        bwx.a(str);
        this.a = str;
    }

    public final void a(String str) {
        if (!evm.c(str, this.c)) {
            Editor edit = this.d.f().edit();
            edit.putString(this.a, str);
            edit.apply();
            this.c = str;
        }
    }
}
