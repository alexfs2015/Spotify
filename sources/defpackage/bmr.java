package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: bmr reason: default package */
public final class bmr extends efa implements bmq {
    bmr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void a(bmo bmo, GoogleSignInOptions googleSignInOptions) {
        Parcel a = a();
        efc.a(a, (IInterface) bmo);
        efc.a(a, (Parcelable) googleSignInOptions);
        a(103, a);
    }
}
