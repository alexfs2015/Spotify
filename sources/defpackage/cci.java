package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: cci reason: default package */
public abstract class cci extends ekb implements cch {
    public cci() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static cch asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return queryLocalInterface instanceof cch ? (cch) queryLocalInterface : new ccj(iBinder);
    }

    public final boolean dispatchTransaction$3d31fa39(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            init(a.a(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i == 2) {
            boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), ekc.a(parcel), parcel.readInt());
            parcel2.writeNoException();
            ekc.a(parcel2, booleanFlagValue);
        } else if (i == 3) {
            int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
        } else if (i == 4) {
            long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
        } else if (i != 5) {
            return false;
        } else {
            String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
        }
        return true;
    }
}
