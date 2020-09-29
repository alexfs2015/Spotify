package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: cbt reason: default package */
public final class cbt extends ejn implements cbs {
    public cbt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int a() {
        Parcel a = a(6, c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final int a(cbi cbi, String str, boolean z) {
        Parcel c = c();
        ejp.a(c, (IInterface) cbi);
        c.writeString(str);
        ejp.a(c, z);
        Parcel a = a(3, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final cbi a(cbi cbi, String str, int i) {
        Parcel c = c();
        ejp.a(c, (IInterface) cbi);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = a(2, c);
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int b(cbi cbi, String str, boolean z) {
        Parcel c = c();
        ejp.a(c, (IInterface) cbi);
        c.writeString(str);
        ejp.a(c, z);
        Parcel a = a(5, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final cbi b(cbi cbi, String str, int i) {
        Parcel c = c();
        ejp.a(c, (IInterface) cbi);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = a(4, c);
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
