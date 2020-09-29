package defpackage;

import android.location.Location;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@cfp
/* renamed from: eei reason: default package */
public final class eei implements bll {
    private final Date a;
    private final int b;
    private final Set<String> c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final dvg g;
    private final List<String> h = new ArrayList();
    private final boolean i;
    private final Map<String, Boolean> j = new HashMap();

    public eei(Date date, int i2, Set<String> set, Location location, boolean z, int i3, dvg dvg, List<String> list, boolean z2) {
        Map<String, Boolean> map;
        String str;
        Boolean bool;
        this.a = date;
        this.b = i2;
        this.c = set;
        this.e = location;
        this.d = z;
        this.f = i3;
        this.g = dvg;
        this.i = z2;
        if (list != null) {
            for (String str2 : list) {
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            map = this.j;
                            str = split[1];
                            bool = Boolean.TRUE;
                        } else {
                            if ("false".equals(split[2])) {
                                map = this.j;
                                str = split[1];
                                bool = Boolean.FALSE;
                            }
                        }
                        map.put(str, bool);
                    }
                } else {
                    this.h.add(str2);
                }
            }
        }
    }

    public final Date a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final Set<String> c() {
        return this.c;
    }

    public final Location d() {
        return this.e;
    }

    public final int e() {
        return this.f;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.i;
    }

    public final bfq h() {
        if (this.g == null) {
            return null;
        }
        a aVar = new a();
        aVar.a = this.g.b;
        aVar.b = this.g.c;
        aVar.c = this.g.d;
        if (this.g.a >= 2) {
            aVar.e = this.g.e;
        }
        if (this.g.a >= 3 && this.g.f != null) {
            aVar.d = new bfm(this.g.f);
        }
        return aVar.a();
    }

    public final boolean i() {
        return this.h.contains("2") || this.h.contains("6");
    }

    public final boolean j() {
        return this.h.contains("6");
    }

    public final boolean k() {
        return this.h.contains("1") || this.h.contains("6");
    }

    public final boolean l() {
        return this.h.contains("3");
    }

    public final Map<String, Boolean> m() {
        return this.j;
    }
}
