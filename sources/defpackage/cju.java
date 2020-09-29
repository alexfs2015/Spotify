package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: cju reason: default package */
public final class cju implements Creator<cjt> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        dpp dpp = null;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                dpp = (dpp) SafeParcelReader.a(parcel, readInt, dpp.CREATOR);
            } else if (i != 3) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                str = SafeParcelReader.h(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new cjt(dpp, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new cjt[i];
    }
}
