package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: cgb reason: default package */
public final class cgb implements Creator<cga> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new cga[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                z = SafeParcelReader.c(parcel, readInt);
            } else if (i != 3) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                arrayList = SafeParcelReader.n(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new cga(z, arrayList);
    }
}
