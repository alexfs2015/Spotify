package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: chf reason: default package */
public final class chf implements Creator<che> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        Bundle bundle = null;
        cpp cpp = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        List list = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    bundle = SafeParcelReader.j(parcel, readInt);
                    break;
                case 2:
                    cpp = (cpp) SafeParcelReader.a(parcel, readInt, cpp.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.a(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.h(parcel, readInt);
                    break;
                case 5:
                    list = SafeParcelReader.n(parcel, readInt);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.a(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = SafeParcelReader.h(parcel, readInt);
                    break;
                case 8:
                    z = SafeParcelReader.c(parcel, readInt);
                    break;
                case 9:
                    str3 = SafeParcelReader.h(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        che che = new che(bundle, cpp, applicationInfo, str, list, packageInfo, str2, z, str3);
        return che;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new che[i];
    }
}
