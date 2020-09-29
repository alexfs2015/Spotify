package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: byk reason: default package */
public final class byk implements Creator<byj> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new byj[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        Bundle bundle = null;
        brw[] brwArr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                bundle = SafeParcelReader.j(parcel, readInt);
            } else if (i != 2) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                brwArr = (brw[]) SafeParcelReader.b(parcel, readInt, brw.CREATOR);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new byj(bundle, brwArr);
    }
}
