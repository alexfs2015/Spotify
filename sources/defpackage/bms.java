package defpackage;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GooglePlayServicesUtil;

/* renamed from: bms reason: default package */
public final class bms extends bmn {
    private final Context a;

    public bms(Context context) {
        this.a = context;
    }

    public final void a() {
        c();
        bmb a2 = bmb.a(this.a);
        GoogleSignInAccount a3 = a2.a();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.e;
        if (a3 != null) {
            googleSignInOptions = a2.b();
        }
        bsh a4 = new a(this.a).a(blj.b, googleSignInOptions).a();
        try {
            if (a4.f().b()) {
                if (a3 != null) {
                    blj.d.a(a4);
                } else {
                    a4.i();
                }
            }
        } finally {
            a4.g();
        }
    }

    public final void b() {
        c();
        bml.a(this.a).a();
    }

    private final void c() {
        if (!GooglePlayServicesUtil.isGooglePlayServicesUid(this.a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }
}
