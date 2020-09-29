package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: fib reason: default package */
final /* synthetic */ class fib implements fhf {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    fib(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3, String str4) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final exz a() {
        FirebaseInstanceId firebaseInstanceId = this.a;
        String str = this.b;
        String str2 = this.c;
        return firebaseInstanceId.e.a(str, this.d, this.e);
    }
}
