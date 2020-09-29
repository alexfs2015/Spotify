package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: egg reason: default package */
public final class egg implements Creator<egf> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                credential = (Credential) SafeParcelReader.a(parcel, readInt, Credential.CREATOR);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new egf(credential);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new egf[i];
    }
}
