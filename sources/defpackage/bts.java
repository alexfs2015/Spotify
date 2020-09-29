package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: bts reason: default package */
final class bts extends bug {
    private final /* synthetic */ btk a;
    private final /* synthetic */ ewx b;

    bts(bue bue, btk btk, ewx ewx) {
        this.a = btk;
        this.b = ewx;
        super(bue);
    }

    public final void a() {
        btk btk = this.a;
        ewx ewx = this.b;
        if (btk.b(0)) {
            ConnectionResult connectionResult = ewx.a;
            if (connectionResult.b()) {
                bwz bwz = ewx.b;
                ConnectionResult connectionResult2 = bwz.b;
                if (!connectionResult2.b()) {
                    String valueOf = String.valueOf(connectionResult2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    new Exception();
                    btk.b(connectionResult2);
                    return;
                }
                btk.g = true;
                btk.h = a.a(bwz.a);
                btk.i = bwz.c;
                btk.j = bwz.d;
                btk.e();
            } else if (btk.a(connectionResult)) {
                btk.f();
                btk.e();
            } else {
                btk.b(connectionResult);
            }
        }
    }
}
