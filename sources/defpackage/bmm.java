package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bmm reason: default package */
public final class bmm implements Creator<HintRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
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
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.a(parcel, readInt, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z = SafeParcelReader.c(parcel, readInt);
                        break;
                    case 3:
                        z2 = SafeParcelReader.c(parcel, readInt);
                        break;
                    case 4:
                        strArr = SafeParcelReader.m(parcel, readInt);
                        break;
                    case 5:
                        z3 = SafeParcelReader.c(parcel, readInt);
                        break;
                    case 6:
                        str = SafeParcelReader.h(parcel, readInt);
                        break;
                    case 7:
                        str2 = SafeParcelReader.h(parcel, readInt);
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
        HintRequest hintRequest = new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
        return hintRequest;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HintRequest[i];
    }
}
