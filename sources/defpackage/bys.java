package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bys reason: default package */
public final class bys extends eiw implements byq {
    bys(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final car a() {
        Parcel a = a(1, c());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int b() {
        Parcel a = a(2, c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
