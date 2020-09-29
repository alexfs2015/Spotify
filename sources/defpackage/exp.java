package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: exp reason: default package */
public final class exp implements Creator<exo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        bxq bxq = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (i2 == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.a(parcel, readInt, ConnectionResult.CREATOR);
            } else if (i2 != 3) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                bxq = (bxq) SafeParcelReader.a(parcel, readInt, bxq.CREATOR);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new exo(i, connectionResult, bxq);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new exo[i];
    }
}
