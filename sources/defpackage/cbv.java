package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: cbv reason: default package */
public final class cbv extends ejn implements cbu {
    public cbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final cbi a(cbi cbi, String str, int i, cbi cbi2) {
        Parcel c = c();
        ejp.a(c, (IInterface) cbi);
        c.writeString(str);
        c.writeInt(i);
        ejp.a(c, (IInterface) cbi2);
        Parcel a = a(2, c);
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final cbi b(cbi cbi, String str, int i, cbi cbi2) {
        Parcel c = c();
        ejp.a(c, (IInterface) cbi);
        c.writeString(str);
        c.writeInt(i);
        ejp.a(c, (IInterface) cbi2);
        Parcel a = a(3, c);
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
