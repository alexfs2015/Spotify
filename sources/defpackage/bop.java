package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bop reason: default package */
public final class bop implements Creator<boh> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new boh[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        bon bon = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = SafeParcelReader.h(parcel, readInt);
            } else if (i == 3) {
                str2 = SafeParcelReader.h(parcel, readInt);
            } else if (i == 4) {
                iBinder = SafeParcelReader.i(parcel, readInt);
            } else if (i == 5) {
                bon = (bon) SafeParcelReader.a(parcel, readInt, bon.CREATOR);
            } else if (i != 6) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                z = SafeParcelReader.c(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        boh boh = new boh(str, str2, iBinder, bon, z);
        return boh;
    }
}
