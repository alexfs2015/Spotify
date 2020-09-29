package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.a;
import com.google.android.gms.common.api.Scope;

/* renamed from: bmg reason: default package */
public final class bmg extends bwl<bmq> {
    final GoogleSignInOptions a;

    public bmg(Context context, Looper looper, bwh bwh, GoogleSignInOptions googleSignInOptions, b bVar, c cVar) {
        super(context, looper, 91, bwh, bVar, cVar);
        if (googleSignInOptions == null) {
            googleSignInOptions = new a().b();
        }
        if (!bwh.c.isEmpty()) {
            a aVar = new a(googleSignInOptions);
            for (Scope a2 : bwh.c) {
                aVar.a(a2, new Scope[0]);
            }
            googleSignInOptions = aVar.b();
        }
        this.a = googleSignInOptions;
    }

    public final String C_() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final String b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final boolean c() {
        return true;
    }

    public final int e() {
        return brz.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof bmq) {
            return (bmq) queryLocalInterface;
        }
        return new bmr(iBinder);
    }

    public final Intent d() {
        return bmh.a(this.d, this.a);
    }
}
