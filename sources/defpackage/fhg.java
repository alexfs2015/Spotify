package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.Executor;

/* renamed from: fhg reason: default package */
public final /* synthetic */ class fhg implements Runnable {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;
    private final exj d;
    private final String e;

    public fhg(FirebaseInstanceId firebaseInstanceId, String str, String str2, exj exj, String str3) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
        this.d = exj;
        this.e = str3;
    }

    public final void run() {
        FirebaseInstanceId firebaseInstanceId = this.a;
        String str = this.b;
        String str2 = this.c;
        exj exj = this.d;
        String str3 = this.e;
        String d2 = FirebaseInstanceId.d();
        fgq b2 = FirebaseInstanceId.b(str, str2);
        if (b2 == null || b2.b(firebaseInstanceId.d.b())) {
            String a2 = fgq.a(b2);
            fgj fgj = firebaseInstanceId.f;
            FirebaseInstanceId firebaseInstanceId2 = firebaseInstanceId;
            fhh fhh = new fhh(firebaseInstanceId2, d2, a2, str, str3);
            exi a3 = fgj.a(str, str3, fhh);
            Executor executor = firebaseInstanceId.b;
            fhi fhi = new fhi(firebaseInstanceId2, str, str3, exj, d2);
            a3.a(executor, (exf<TResult>) fhi);
            return;
        }
        exj.a(new fhq(d2, b2.a));
    }
}
