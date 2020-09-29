package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: buj reason: default package */
final class buj extends bux {
    private final /* synthetic */ bub a;
    private final /* synthetic */ exo b;

    buj(buv buv, bub bub, exo exo) {
        this.a = bub;
        this.b = exo;
        super(buv);
    }

    public final void a() {
        bub bub = this.a;
        exo exo = this.b;
        if (bub.b(0)) {
            ConnectionResult connectionResult = exo.a;
            if (connectionResult.b()) {
                bxq bxq = exo.b;
                ConnectionResult connectionResult2 = bxq.b;
                if (!connectionResult2.b()) {
                    String valueOf = String.valueOf(connectionResult2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    new Exception();
                    bub.b(connectionResult2);
                    return;
                }
                bub.g = true;
                bub.h = a.a(bxq.a);
                bub.i = bxq.c;
                bub.j = bxq.d;
                bub.e();
            } else if (bub.a(connectionResult)) {
                bub.f();
                bub.e();
            } else {
                bub.b(connectionResult);
            }
        }
    }
}
