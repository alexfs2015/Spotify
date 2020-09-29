package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: bub reason: default package */
final class bub implements bsm<Status> {
    private final /* synthetic */ btb a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ bsh c;
    private final /* synthetic */ btw d;

    bub(btw btw, btb btb, boolean z, bsh bsh) {
        this.d = btw;
        this.a = btb;
        this.b = z;
        this.c = bsh;
    }

    public final /* synthetic */ void onResult(bsl bsl) {
        Status status = (Status) bsl;
        bmb a2 = bmb.a(this.d.k);
        String str = "defaultGoogleSignInAccount";
        String a3 = a2.a(str);
        a2.b(str);
        if (!TextUtils.isEmpty(a3)) {
            a2.b(bmb.a("googleSignInAccount", a3));
            a2.b(bmb.a("googleSignInOptions", a3));
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
