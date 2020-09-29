package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: byl reason: default package */
public final class byl extends egs implements byk {
    byl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void a(byi byi) {
        Parcel a = a();
        egu.a(a, (IInterface) byi);
        try {
            this.a.transact(1, a, null, 1);
        } finally {
            a.recycle();
        }
    }
}
