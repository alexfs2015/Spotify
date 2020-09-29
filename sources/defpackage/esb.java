package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: esb reason: default package */
public final class esb {
    final String a;
    final String b;
    final long c;
    final /* synthetic */ ery d;
    private final String e;

    private esb(ery ery, String str, long j) {
        this.d = ery;
        bxo.a(str);
        bxo.b(j > 0);
        this.e = String.valueOf(str).concat(":start");
        this.a = String.valueOf(str).concat(":count");
        this.b = String.valueOf(str).concat(":value");
        this.c = j;
    }

    /* synthetic */ esb(ery ery, String str, long j, byte b2) {
        this(ery, str, j);
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        this.d.c();
        long a2 = this.d.l().a();
        Editor edit = this.d.f().edit();
        edit.remove(this.a);
        edit.remove(this.b);
        edit.putLong(this.e, a2);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    public final long b() {
        return this.d.f().getLong(this.e, 0);
    }
}
