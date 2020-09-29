package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: esc reason: default package */
public final class esc {
    final String a;
    boolean b;
    String c;
    final /* synthetic */ ery d;
    private final String e = null;

    public esc(ery ery, String str) {
        this.d = ery;
        bxo.a(str);
        this.a = str;
    }

    public final void a(String str) {
        if (!ewd.c(str, this.c)) {
            Editor edit = this.d.f().edit();
            edit.putString(this.a, str);
            edit.apply();
            this.c = str;
        }
    }
}
