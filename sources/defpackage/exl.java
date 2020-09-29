package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: exl reason: default package */
public final class exl extends egs implements exk {
    exl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void a(int i) {
        Parcel a = a();
        a.writeInt(i);
        b(7, a);
    }

    public final void a(bxh bxh, int i, boolean z) {
        Parcel a = a();
        egu.a(a, (IInterface) bxh);
        a.writeInt(i);
        egu.a(a, z);
        b(9, a);
    }

    public final void a(exm exm, exi exi) {
        Parcel a = a();
        egu.a(a, (Parcelable) exm);
        egu.a(a, (IInterface) exi);
        b(12, a);
    }
}
