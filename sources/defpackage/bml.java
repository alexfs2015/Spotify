package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bml reason: default package */
public final class bml implements Creator<bmd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 != 1000) {
                switch (i2) {
                    case 1:
                        z = SafeParcelReader.c(parcel, readInt);
                        break;
                    case 2:
                        strArr = SafeParcelReader.m(parcel, readInt);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.a(parcel, readInt, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) SafeParcelReader.a(parcel, readInt, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z2 = SafeParcelReader.c(parcel, readInt);
                        break;
                    case 6:
                        str = SafeParcelReader.h(parcel, readInt);
                        break;
                    case 7:
                        str2 = SafeParcelReader.h(parcel, readInt);
                        break;
                    case 8:
                        z3 = SafeParcelReader.c(parcel, readInt);
                        break;
                    default:
                        SafeParcelReader.b(parcel, readInt);
                        break;
                }
            } else {
                i = SafeParcelReader.d(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        bmd bmd = new bmd(i, z, strArr, credentialPickerConfig, credentialPickerConfig2, z2, str, str2, z3);
        return bmd;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new bmd[i];
    }
}
