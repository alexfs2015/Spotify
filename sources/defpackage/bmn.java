package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bmn reason: default package */
public final class bmn implements Creator<IdToken> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = SafeParcelReader.h(parcel, readInt);
            } else if (i != 2) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                str2 = SafeParcelReader.h(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new IdToken(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new IdToken[i];
    }
}
