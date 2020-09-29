package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: eft reason: default package */
public final class eft extends efa implements efs {
    eft(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    public final void a(efq efq, blm blm) {
        Parcel a = a();
        efc.a(a, (IInterface) efq);
        efc.a(a, (Parcelable) blm);
        a(1, a);
    }

    public final void a(efq efq, efu efu) {
        Parcel a = a();
        efc.a(a, (IInterface) efq);
        efc.a(a, (Parcelable) efu);
        a(2, a);
    }

    public final void a(efq efq, efo efo) {
        Parcel a = a();
        efc.a(a, (IInterface) efq);
        efc.a(a, (Parcelable) efo);
        a(3, a);
    }

    public final void a(efq efq) {
        Parcel a = a();
        efc.a(a, (IInterface) efq);
        a(4, a);
    }
}
