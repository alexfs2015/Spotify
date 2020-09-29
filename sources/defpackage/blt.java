package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: blt reason: default package */
public final class blt implements Creator<CredentialPickerConfig> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                z = SafeParcelReader.c(parcel, readInt);
            } else if (i3 == 2) {
                z2 = SafeParcelReader.c(parcel, readInt);
            } else if (i3 == 3) {
                z3 = SafeParcelReader.c(parcel, readInt);
            } else if (i3 == 4) {
                i2 = SafeParcelReader.d(parcel, readInt);
            } else if (i3 != 1000) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                i = SafeParcelReader.d(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        CredentialPickerConfig credentialPickerConfig = new CredentialPickerConfig(i, z, z2, z3, i2);
        return credentialPickerConfig;
    }
}
