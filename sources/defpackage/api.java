package defpackage;

import android.location.Location;
import com.google.ads.AdRequest.Gender;
import java.util.Date;
import java.util.Set;

@Deprecated
/* renamed from: api reason: default package */
public final class api {
    private final Date a;
    private final Gender b;
    private final Set<String> c;
    private final boolean d;
    private final Location e;

    public api(Date date, Gender gender, Set<String> set, boolean z, Location location) {
        this.a = date;
        this.b = gender;
        this.c = set;
        this.d = z;
        this.e = location;
    }
}
