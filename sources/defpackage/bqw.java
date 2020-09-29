package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bqw reason: default package */
public final class bqw implements Creator<bqx> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new bqx[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        bqv bqv = null;
        bqv bqv2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                bqv = (bqv) SafeParcelReader.a(parcel, readInt, bqv.CREATOR);
            } else if (i != 3) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                bqv2 = (bqv) SafeParcelReader.a(parcel, readInt, bqv.CREATOR);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bqx(bqv, bqv2);
    }
}
