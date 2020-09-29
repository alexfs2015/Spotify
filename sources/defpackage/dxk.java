package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: dxk reason: default package */
public final class dxk implements Creator<dxj> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new dxj[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    z = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 2:
                    str = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 3:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 4:
                    bArr = SafeParcelReader.k(parcel2, readInt);
                    break;
                case 5:
                    strArr = SafeParcelReader.m(parcel2, readInt);
                    break;
                case 6:
                    strArr2 = SafeParcelReader.m(parcel2, readInt);
                    break;
                case 7:
                    z2 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 8:
                    j = SafeParcelReader.e(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        dxj dxj = new dxj(z, str, i, bArr, strArr, strArr2, z2, j);
        return dxj;
    }
}
