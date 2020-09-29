package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bwt reason: default package */
public final class bwt implements Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = SafeParcelReader.d(parcel, readInt);
            } else if (i3 == 2) {
                str = SafeParcelReader.h(parcel, readInt);
            } else if (i3 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.a(parcel, readInt, PendingIntent.CREATOR);
            } else if (i3 != 1000) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                i = SafeParcelReader.d(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
