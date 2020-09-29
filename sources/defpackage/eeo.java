package defpackage;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@cfp
/* renamed from: eeo reason: default package */
public final class eeo {
    public static int a(ErrorCode errorCode) {
        int i = eep.a[errorCode.ordinal()];
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public static apz a(dpp dpp, boolean z) {
        Set hashSet = dpp.e != null ? new HashSet(dpp.e) : null;
        Date date = new Date(dpp.b);
        int i = dpp.d;
        Gender gender = i != 1 ? i != 2 ? Gender.UNKNOWN : Gender.FEMALE : Gender.MALE;
        apz apz = new apz(date, gender, hashSet, z, dpp.k);
        return apz;
    }
}
