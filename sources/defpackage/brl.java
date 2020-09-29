package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: brl reason: default package */
public final class brl implements Creator<bnf> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new bnf[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                j = SafeParcelReader.e(parcel, readInt);
            } else if (i == 3) {
                j2 = SafeParcelReader.e(parcel, readInt);
            } else if (i == 4) {
                str = SafeParcelReader.h(parcel, readInt);
            } else if (i == 5) {
                str2 = SafeParcelReader.h(parcel, readInt);
            } else if (i != 6) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                j3 = SafeParcelReader.e(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        bnf bnf = new bnf(j, j2, str, str2, j3);
        return bnf;
    }
}
