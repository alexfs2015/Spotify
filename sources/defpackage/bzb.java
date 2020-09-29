package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bzb reason: default package */
public final class bzb implements Creator<bza> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        Bundle bundle = null;
        bsn[] bsnArr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                bundle = SafeParcelReader.j(parcel, readInt);
            } else if (i != 2) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                bsnArr = (bsn[]) SafeParcelReader.b(parcel, readInt, bsn.CREATOR);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bza(bundle, bsnArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new bza[i];
    }
}
