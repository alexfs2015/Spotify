package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bfx reason: default package */
public final class bfx implements Creator<bfv> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        boolean z = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                z = SafeParcelReader.c(parcel, readInt);
            } else if (i != 2) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                iBinder = SafeParcelReader.i(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bfv(z, iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new bfv[i];
    }
}
