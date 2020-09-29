package defpackage;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GooglePlayServicesUtil;

/* renamed from: bnj reason: default package */
public final class bnj extends bne {
    private final Context a;

    public bnj(Context context) {
        this.a = context;
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

    public final void a() {
        c();
        bms a2 = bms.a(this.a);
        GoogleSignInAccount a3 = a2.a();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.e;
        if (a3 != null) {
            googleSignInOptions = a2.b();
        }
        bsy a4 = new a(this.a).a(bma.b, googleSignInOptions).a();
        try {
            if (a4.f().b()) {
                if (a3 != null) {
                    bma.d.a(a4);
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
        bnc.a(this.a).a();
    }
}
