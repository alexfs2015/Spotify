package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: bni reason: default package */
public final class bni extends efr implements bnh {
    bni(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void a(bnf bnf, GoogleSignInOptions googleSignInOptions) {
        Parcel a = a();
        eft.a(a, (IInterface) bnf);
        eft.a(a, (Parcelable) googleSignInOptions);
        a(103, a);
    }
}
