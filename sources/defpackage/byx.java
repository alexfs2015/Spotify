package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: byx reason: default package */
public final class byx implements Creator<bxq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (i2 == 2) {
                iBinder = SafeParcelReader.i(parcel, readInt);
            } else if (i2 == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.a(parcel, readInt, ConnectionResult.CREATOR);
            } else if (i2 == 4) {
                z = SafeParcelReader.c(parcel, readInt);
            } else if (i2 != 5) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                z2 = SafeParcelReader.c(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        bxq bxq = new bxq(i, iBinder, connectionResult, z, z2);
        return bxq;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new bxq[i];
    }
}
