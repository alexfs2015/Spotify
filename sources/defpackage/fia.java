package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.Executor;

/* renamed from: fia reason: default package */
public final /* synthetic */ class fia implements Runnable {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;
    private final eya d;
    private final String e;

    public fia(FirebaseInstanceId firebaseInstanceId, String str, String str2, eya eya, String str3) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
        this.d = eya;
        this.e = str3;
    }

    public final void run() {
        FirebaseInstanceId firebaseInstanceId = this.a;
        String str = this.b;
        String str2 = this.c;
        eya eya = this.d;
        String str3 = this.e;
        String d2 = FirebaseInstanceId.d();
        fhk b2 = FirebaseInstanceId.b(str, str2);
        if (b2 == null || b2.b(firebaseInstanceId.d.b())) {
            String a2 = fhk.a(b2);
            fhd fhd = firebaseInstanceId.f;
            FirebaseInstanceId firebaseInstanceId2 = firebaseInstanceId;
            fib fib = new fib(firebaseInstanceId2, d2, a2, str, str3);
            exz a3 = fhd.a(str, str3, fib);
            Executor executor = firebaseInstanceId.b;
            fic fic = new fic(firebaseInstanceId2, str, str3, eya, d2);
            a3.a(executor, (exw<TResult>) fic);
            return;
        }
        eya.a(new fik(d2, b2.a));
    }
}
