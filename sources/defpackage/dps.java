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

@cfp
/* renamed from: dps reason: default package */
public final class dps {
    public static final dps a = new dps();

    protected dps() {
    }

    public static dpp a(Context context, dry dry) {
        String str;
        dry dry2 = dry;
        Date date = dry2.a;
        long time = date != null ? date.getTime() : -1;
        String str2 = dry2.b;
        int i = dry2.c;
        Set<String> set = dry2.d;
        List unmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        Set<String> set2 = dry2.m;
        dqe.a();
        boolean contains = set2.contains(cpc.a(context));
        int i2 = dry2.l;
        Location location = dry2.e;
        Bundle bundle = dry2.g.getBundle(AdMobAdapter.class.getName());
        boolean z = dry2.f;
        String str3 = dry2.i;
        bly bly = dry2.k;
        dsl dsl = bly != null ? new dsl(bly) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            dqe.a();
            str = cpc.a(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        dpp dpp = r3;
        dpp dpp2 = new dpp(7, time, bundle, i, unmodifiableList, contains, i2, z, str3, dsl, location, str2, dry2.g, dry2.n, Collections.unmodifiableList(new ArrayList(dry2.o)), dry2.j, str, dry2.p);
        return dpp;
    }
}
