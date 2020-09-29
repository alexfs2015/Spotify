package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: eqx reason: default package */
final class eqx implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ Object d;
    private final /* synthetic */ Object e;
    private final /* synthetic */ eqw f;

    eqx(eqw eqw, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f = eqw;
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public final void run() {
        erh b2 = this.f.r.b();
        if (!b2.v()) {
            this.f.a(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f.a == 0) {
            if (this.f.s().e()) {
                this.f.a = 'C';
            } else {
                this.f.a = 'c';
            }
        }
        if (this.f.b < 0) {
            this.f.b = 14700;
        }
        char charAt = "01VDIWEA?".charAt(this.a);
        char c2 = this.f.a;
        long j = this.f.b;
        String a2 = eqw.a(true, this.b, this.c, this.d, this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(c2);
        sb.append(j);
        sb.append(":");
        sb.append(a2);
        String sb2 = sb.toString();
        boolean z = false;
        if (sb2.length() > 1024) {
            sb2 = this.b.substring(0, 1024);
        }
        erk erk = b2.c;
        erk.d.c();
        if (erk.b() == 0) {
            erk.a();
        }
        if (sb2 == null) {
            sb2 = "";
        }
        long j2 = erk.d.f().getLong(erk.a, 0);
        if (j2 <= 0) {
            Editor edit = erk.d.f().edit();
            edit.putString(erk.b, sb2);
            edit.putLong(erk.a, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        if ((erk.d.o().g().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
            z = true;
        }
        Editor edit2 = erk.d.f().edit();
        if (z) {
            edit2.putString(erk.b, sb2);
        }
        edit2.putLong(erk.a, j3);
        edit2.apply();
    }
}
