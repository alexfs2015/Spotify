package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.a;
import com.google.android.gms.common.api.Scope;

/* renamed from: bmx reason: default package */
public final class bmx extends bxc<bnh> {
    final GoogleSignInOptions a;

    public bmx(Context context, Looper looper, bwy bwy, GoogleSignInOptions googleSignInOptions, b bVar, c cVar) {
        super(context, looper, 91, bwy, bVar, cVar);
        if (googleSignInOptions == null) {
            googleSignInOptions = new a().b();
        }
        if (!bwy.c.isEmpty()) {
            a aVar = new a(googleSignInOptions);
            for (Scope a2 : bwy.c) {
                aVar.a(a2, new Scope[0]);
            }
            googleSignInOptions = aVar.b();
        }
        this.a = googleSignInOptions;
    }

    public final String C_() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof bnh ? (bnh) queryLocalInterface : new bni(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final boolean c() {
        return true;
    }

    public final Intent d() {
        return bmy.a(this.d, this.a);
    }

    public final int e() {
        return bsq.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
