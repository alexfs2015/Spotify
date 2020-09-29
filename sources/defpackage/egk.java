package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: egk reason: default package */
public final class egk extends efr implements egj {
    egk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    public final void a(egh egh) {
        Parcel a = a();
        eft.a(a, (IInterface) egh);
        a(4, a);
    }

    public final void a(egh egh, bmd bmd) {
        Parcel a = a();
        eft.a(a, (IInterface) egh);
        eft.a(a, (Parcelable) bmd);
        a(1, a);
    }

    public final void a(egh egh, egf egf) {
        Parcel a = a();
        eft.a(a, (IInterface) egh);
        eft.a(a, (Parcelable) egf);
        a(3, a);
    }

    public final void a(egh egh, egl egl) {
        Parcel a = a();
        eft.a(a, (IInterface) egh);
        eft.a(a, (Parcelable) egl);
        a(2, a);
    }
}
