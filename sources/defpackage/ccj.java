package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ccj reason: default package */
public final class ccj extends eka implements cch {
    ccj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    public final boolean getBooleanFlagValue(String str, boolean z, int i) {
        Parcel a = a();
        a.writeString(str);
        ekc.a(a, z);
        a.writeInt(i);
        Parcel a2 = a(2, a);
        boolean a3 = ekc.a(a2);
        a2.recycle();
        return a3;
    }

    public final int getIntFlagValue(String str, int i, int i2) {
        Parcel a = a();
        a.writeString(str);
        a.writeInt(i);
        a.writeInt(i2);
        Parcel a2 = a(3, a);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    public final long getLongFlagValue(String str, long j, int i) {
        Parcel a = a();
        a.writeString(str);
        a.writeLong(j);
        a.writeInt(i);
        Parcel a2 = a(4, a);
        long readLong = a2.readLong();
        a2.recycle();
        return readLong;
    }

    public final String getStringFlagValue(String str, String str2, int i) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        a.writeInt(i);
        Parcel a2 = a(5, a);
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final void init(cbi cbi) {
        Parcel a = a();
        ekc.a(a, (IInterface) cbi);
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(1, a, obtain, 0);
            obtain.readException();
        } finally {
            a.recycle();
            obtain.recycle();
        }
    }
}
