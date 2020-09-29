package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ewu reason: default package */
public final class ewu extends egb implements ewt {
    ewu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void a(int i) {
        Parcel a = a();
        a.writeInt(i);
        b(7, a);
    }

    public final void a(bwq bwq, int i, boolean z) {
        Parcel a = a();
        egd.a(a, (IInterface) bwq);
        a.writeInt(i);
        egd.a(a, z);
        b(9, a);
    }

    public final void a(ewv ewv, ewr ewr) {
        Parcel a = a();
        egd.a(a, (Parcelable) ewv);
        egd.a(a, (IInterface) ewr);
        b(12, a);
    }
}
