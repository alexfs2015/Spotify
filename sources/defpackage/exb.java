package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: exb reason: default package */
public final class exb extends equ implements exa {
    exb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.plus.internal.IPlusOneButtonCreator");
    }

    public final cbi a(cbi cbi, int i, int i2, String str, int i3) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.a);
        eqv.a(obtain, cbi);
        obtain.writeInt(i);
        obtain.writeInt(i2);
        obtain.writeString(str);
        obtain.writeInt(i3);
        Parcel a = a(1, obtain);
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
