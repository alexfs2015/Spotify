package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: erz reason: default package */
public final class erz {
    private final String a;
    private final boolean b = true;
    private boolean c;
    private boolean d;
    private final /* synthetic */ ery e;

    public erz(ery ery, String str) {
        this.e = ery;
        bxo.a(str);
        this.a = str;
    }

    public final void a(boolean z) {
        Editor edit = this.e.f().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.f().getBoolean(this.a, true);
        }
        return this.d;
    }
}
