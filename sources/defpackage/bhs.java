package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bhs reason: default package */
public final class bhs implements Creator<AdOverlayInfoParcel> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        bhj bhj = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        cpp cpp = null;
        String str4 = null;
        biw biw = null;
        IBinder iBinder6 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    bhj = (bhj) SafeParcelReader.a(parcel2, readInt, bhj.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.i(parcel2, readInt);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.i(parcel2, readInt);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.i(parcel2, readInt);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.i(parcel2, readInt);
                    break;
                case 7:
                    str = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 8:
                    z = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 9:
                    str2 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 10:
                    iBinder5 = SafeParcelReader.i(parcel2, readInt);
                    break;
                case 11:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 12:
                    i2 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 13:
                    str3 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 14:
                    cpp = (cpp) SafeParcelReader.a(parcel2, readInt, cpp.CREATOR);
                    break;
                case 16:
                    str4 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 17:
                    biw = (biw) SafeParcelReader.a(parcel2, readInt, biw.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.i(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(bhj, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, cpp, str4, biw, iBinder6);
        return adOverlayInfoParcel;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
