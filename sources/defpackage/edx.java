package defpackage;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@cey
/* renamed from: edx reason: default package */
public final class edx {
    public static int a(ErrorCode errorCode) {
        int i = edy.a[errorCode.ordinal()];
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public static api a(doy doy, boolean z) {
        Set hashSet = doy.e != null ? new HashSet(doy.e) : null;
        Date date = new Date(doy.b);
        int i = doy.d;
        Gender gender = i != 1 ? i != 2 ? Gender.UNKNOWN : Gender.FEMALE : Gender.MALE;
        api api = new api(date, gender, hashSet, z, doy.k);
        return api;
    }
}
