package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ewk reason: default package */
public final class ewk extends eqd implements ewj {
    ewk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.plus.internal.IPlusOneButtonCreator");
    }

    public final car a(car car, int i, int i2, String str, int i3) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.a);
        eqe.a(obtain, car);
        obtain.writeInt(i);
        obtain.writeInt(i2);
        obtain.writeString(str);
        obtain.writeInt(i3);
        Parcel a = a(1, obtain);
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
