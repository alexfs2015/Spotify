package defpackage;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: th reason: default package */
public final class th extends sy {
    public final tj a;
    public final String b;
    public final ExistingWorkPolicy c;
    public final List<? extends ta> d;
    public final List<String> e;
    public final List<th> f;
    public boolean g;
    private final List<String> h;
    private sw i;

    static {
        su.a("WorkContinuationImpl");
    }

    th(tj tjVar, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends ta> list) {
        this(tjVar, str, existingWorkPolicy, list, null);
    }

    private th(tj tjVar, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends ta> list, List<th> list2) {
        this.a = tjVar;
        this.b = str;
        this.c = existingWorkPolicy;
        this.d = list;
        this.f = null;
        this.e = new ArrayList(this.d.size());
        this.h = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String uuid = ((ta) list.get(i2)).a.toString();
            this.e.add(uuid);
            this.h.add(uuid);
        }
    }

    public static Set<String> a(th thVar) {
        HashSet hashSet = new HashSet();
        List<th> list = thVar.f;
        if (list != null && !list.isEmpty()) {
            for (th thVar2 : list) {
                hashSet.addAll(thVar2.e);
            }
        }
        return hashSet;
    }

    public static boolean a(th thVar, Set<String> set) {
        set.addAll(thVar.e);
        Set a2 = a(thVar);
        for (String contains : set) {
            if (a2.contains(contains)) {
                return true;
            }
        }
        List<th> list = thVar.f;
        if (list != null && !list.isEmpty()) {
            for (th a3 : list) {
                if (a(a3, set)) {
                    return true;
                }
            }
        }
        set.removeAll(thVar.e);
        return false;
    }

    public final sw a() {
        if (!this.g) {
            vf vfVar = new vf(this);
            this.a.d.a(vfVar);
            this.i = vfVar.a;
        } else {
            su.a();
            String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.e)});
        }
        return this.i;
    }
}
