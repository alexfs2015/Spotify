package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: fic reason: default package */
final /* synthetic */ class fic implements exw {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;
    private final eya d;
    private final String e;

    fic(FirebaseInstanceId firebaseInstanceId, String str, String str2, eya eya, String str3) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
        this.d = eya;
        this.e = str3;
    }

    public final void onComplete(exz exz) {
        FirebaseInstanceId firebaseInstanceId = this.a;
        String str = this.b;
        String str2 = this.c;
        eya eya = this.d;
        String str3 = this.e;
        if (exz.b()) {
            String str4 = (String) exz.d();
            FirebaseInstanceId.a.a("", str, str2, str4, firebaseInstanceId.d.b());
            eya.a(new fik(str3, str4));
            return;
        }
        eya.a(exz.e());
    }
}
