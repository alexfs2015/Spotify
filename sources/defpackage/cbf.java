package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: cbf reason: default package */
public final class cbf implements Creator<cbe> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = SafeParcelReader.h(parcel, readInt);
            } else if (i == 2) {
                iBinder = SafeParcelReader.i(parcel, readInt);
            } else if (i != 3) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                z = SafeParcelReader.c(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new cbe(str, iBinder, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new cbe[i];
    }
}
