package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: brd reason: default package */
public final class brd implements Creator<bnl> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new bnl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                arrayList = SafeParcelReader.c(parcel, readInt, bwd.CREATOR);
            } else if (i2 == 3) {
                bundle = SafeParcelReader.j(parcel, readInt);
            } else if (i2 != 4) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                i = SafeParcelReader.d(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bnl(arrayList, bundle, i);
    }
}
