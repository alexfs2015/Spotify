package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: chd reason: default package */
public final class chd implements Creator<chb> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.a(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new chb(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new chb[i];
    }
}
