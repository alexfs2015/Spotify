package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: eqj reason: default package */
public final class eqj implements Creator<eqh> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new eqh[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                bundle = SafeParcelReader.j(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new eqh(bundle);
    }
}