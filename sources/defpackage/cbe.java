package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: cbe reason: default package */
public final class cbe extends eiw implements cbd {
    public cbe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final car a(car car, String str, int i, car car2) {
        Parcel c = c();
        eiy.a(c, (IInterface) car);
        c.writeString(str);
        c.writeInt(i);
        eiy.a(c, (IInterface) car2);
        Parcel a = a(2, c);
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final car b(car car, String str, int i, car car2) {
        Parcel c = c();
        eiy.a(c, (IInterface) car);
        c.writeString(str);
        c.writeInt(i);
        eiy.a(c, (IInterface) car2);
        Parcel a = a(3, c);
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
