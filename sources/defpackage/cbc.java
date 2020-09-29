package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: cbc reason: default package */
public final class cbc extends eiw implements cbb {
    public cbc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final car a(car car, String str, int i) {
        Parcel c = c();
        eiy.a(c, (IInterface) car);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = a(2, c);
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int a(car car, String str, boolean z) {
        Parcel c = c();
        eiy.a(c, (IInterface) car);
        c.writeString(str);
        eiy.a(c, z);
        Parcel a = a(3, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final car b(car car, String str, int i) {
        Parcel c = c();
        eiy.a(c, (IInterface) car);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = a(4, c);
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int b(car car, String str, boolean z) {
        Parcel c = c();
        eiy.a(c, (IInterface) car);
        c.writeString(str);
        eiy.a(c, z);
        Parcel a = a(5, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final int a() {
        Parcel a = a(6, c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
