package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: erj reason: default package */
public final class erj {
    private final String a;
    private final long b;
    private boolean c;
    private long d;
    private final /* synthetic */ erh e;

    public erj(erh erh, String str, long j) {
        this.e = erh;
        bwx.a(str);
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
