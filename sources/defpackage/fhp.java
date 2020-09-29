package defpackage;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;

/* renamed from: fhp reason: default package */
public final class fhp implements fho {
    private final IBinder a;

    fhp(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(Message message) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.a;
    }
}
