package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: ewm reason: default package */
public final class ewm implements Creator<ewl> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        ewa ewa = null;
        String str3 = null;
        erb erb = null;
        erb erb2 = null;
        erb erb3 = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 4:
                    ewa = (ewa) SafeParcelReader.a(parcel2, readInt, ewa.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 6:
                    z = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 8:
                    erb = (erb) SafeParcelReader.a(parcel2, readInt, erb.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 10:
                    erb2 = (erb) SafeParcelReader.a(parcel2, readInt, erb.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 12:
                    erb3 = (erb) SafeParcelReader.a(parcel2, readInt, erb.CREATOR);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        ewl ewl = new ewl(str, str2, ewa, j, z, str3, erb, j2, erb2, j3, erb3);
        return ewl;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ewl[i];
    }
}
