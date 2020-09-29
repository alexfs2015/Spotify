package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: esa reason: default package */
public final class esa {
    private final String a;
    private final long b;
    private boolean c;
    private long d;
    private final /* synthetic */ ery e;

    public esa(ery ery, String str, long j) {
        this.e = ery;
        bxo.a(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.f().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void a(long j) {
        Editor edit = this.e.f().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
