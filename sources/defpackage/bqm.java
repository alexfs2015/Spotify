package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: bqm reason: default package */
public final class bqm implements Creator<bon> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        String str = null;
        List list = null;
        boa boa = null;
        boy boy = null;
        double d = 0.0d;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 3:
                    list = SafeParcelReader.n(parcel2, readInt);
                    break;
                case 4:
                    z = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 5:
                    boa = (boa) SafeParcelReader.a(parcel2, readInt, boa.CREATOR);
                    break;
                case 6:
                    z2 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 7:
                    boy = (boy) SafeParcelReader.a(parcel2, readInt, boy.CREATOR);
                    break;
                case 8:
                    z3 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 9:
                    d = SafeParcelReader.g(parcel2, readInt);
                    break;
                case 10:
                    z4 = SafeParcelReader.c(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        bon bon = new bon(str, list, z, boa, z2, boy, z3, d, z4);
        return bon;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new bon[i];
    }
}
