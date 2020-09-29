package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: fhi reason: default package */
final /* synthetic */ class fhi implements exf {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;
    private final exj d;
    private final String e;

    fhi(FirebaseInstanceId firebaseInstanceId, String str, String str2, exj exj, String str3) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
        this.d = exj;
        this.e = str3;
    }

    public final void onComplete(exi exi) {
        FirebaseInstanceId firebaseInstanceId = this.a;
        String str = this.b;
        String str2 = this.c;
        exj exj = this.d;
        String str3 = this.e;
        if (exi.b()) {
            String str4 = (String) exi.d();
            FirebaseInstanceId.a.a("", str, str2, str4, firebaseInstanceId.d.b());
            exj.a(new fhq(str3, str4));
            return;
        }
        exj.a(exi.e());
    }
}
