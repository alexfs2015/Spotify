package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bxu reason: default package */
public final class bxu extends egb implements bxt {
    bxu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void a(bxr bxr) {
        Parcel a = a();
        egd.a(a, (IInterface) bxr);
        try {
            this.a.transact(1, a, null, 1);
        } finally {
            a.recycle();
        }
    }
}
