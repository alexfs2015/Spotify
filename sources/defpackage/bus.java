package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: bus reason: default package */
final class bus implements btd<Status> {
    private final /* synthetic */ bts a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ bsy c;
    private final /* synthetic */ bun d;

    bus(bun bun, bts bts, boolean z, bsy bsy) {
        this.d = bun;
        this.a = bts;
        this.b = z;
        this.c = bsy;
    }

    public final /* synthetic */ void onResult(btc btc) {
        Status status = (Status) btc;
        bms a2 = bms.a(this.d.k);
        String str = "defaultGoogleSignInAccount";
        String a3 = a2.a(str);
        a2.b(str);
        if (!TextUtils.isEmpty(a3)) {
            a2.b(bms.a("googleSignInAccount", a3));
            a2.b(bms.a("googleSignInOptions", a3));
        }
        if (status.c() && this.d.j()) {
            this.d.h();
        }
        this.a.a(status);
        if (this.b) {
            this.c.g();
        }
    }
}
