package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: ehm reason: default package */
public final class ehm implements Creator<ehk> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ehk[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        bng bng = null;
        bqx bqx = null;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    d = SafeParcelReader.g(parcel2, readInt);
                    break;
                case 3:
                    z = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 4:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 5:
                    bng = (bng) SafeParcelReader.a(parcel2, readInt, bng.CREATOR);
                    break;
                case 6:
                    i2 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 7:
                    bqx = (bqx) SafeParcelReader.a(parcel2, readInt, bqx.CREATOR);
                    break;
                case 8:
                    d2 = SafeParcelReader.g(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        ehk ehk = new ehk(d, z, i, bng, i2, bqx, d2);
        return ehk;
    }
}
