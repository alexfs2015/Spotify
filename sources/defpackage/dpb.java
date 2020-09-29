package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@cey
/* renamed from: dpb reason: default package */
public final class dpb {
    public static final dpb a = new dpb();

    protected dpb() {
    }

    public static doy a(Context context, drh drh) {
        String str;
        drh drh2 = drh;
        Date date = drh2.a;
        long time = date != null ? date.getTime() : -1;
        String str2 = drh2.b;
        int i = drh2.c;
        Set<String> set = drh2.d;
        List unmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        Set<String> set2 = drh2.m;
        dpn.a();
        boolean contains = set2.contains(col.a(context));
        int i2 = drh2.l;
        Location location = drh2.e;
        Bundle bundle = drh2.g.getBundle(AdMobAdapter.class.getName());
        boolean z = drh2.f;
        String str3 = drh2.i;
        blh blh = drh2.k;
        dru dru = blh != null ? new dru(blh) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            dpn.a();
            str = col.a(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        doy doy = r3;
        doy doy2 = new doy(7, time, bundle, i, unmodifiableList, contains, i2, z, str3, dru, location, str2, drh2.g, drh2.n, Collections.unmodifiableList(new ArrayList(drh2.o)), drh2.j, str, drh2.p);
        return doy;
    }
}
