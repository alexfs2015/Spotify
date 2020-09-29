package defpackage;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: st reason: default package */
public final class st extends sk {
    public final sv a;
    public final String b;
    public final ExistingWorkPolicy c;
    public final List<? extends sm> d;
    public final List<String> e;
    public final List<st> f;
    public boolean g;
    private final List<String> h;
    private si i;

    static {
        sg.a("WorkContinuationImpl");
    }

    st(sv svVar, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends sm> list) {
        this(svVar, str, existingWorkPolicy, list, null);
    }

    private st(sv svVar, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends sm> list, List<st> list2) {
        this.a = svVar;
        this.b = str;
        this.c = existingWorkPolicy;
        this.d = list;
        this.f = null;
        this.e = new ArrayList(this.d.size());
        this.h = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String uuid = ((sm) list.get(i2)).a.toString();
            this.e.add(uuid);
            this.h.add(uuid);
        }
    }

    public final si a() {
        if (!this.g) {
            ur urVar = new ur(this);
            this.a.d.a(urVar);
            this.i = urVar.a;
        } else {
            sg.a();
            String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.e)});
        }
        return this.i;
    }

    public static Set<String> a(st stVar) {
        HashSet hashSet = new HashSet();
        List<st> list = stVar.f;
        if (list != null && !list.isEmpty()) {
            for (st stVar2 : list) {
                hashSet.addAll(stVar2.e);
            }
        }
        return hashSet;
    }

    public static boolean a(st stVar, Set<String> set) {
        set.addAll(stVar.e);
        Set a2 = a(stVar);
        for (String contains : set) {
            if (a2.contains(contains)) {
                return true;
            }
        }
        List<st> list = stVar.f;
        if (list != null && !list.isEmpty()) {
            for (st a3 : list) {
                if (a(a3, set)) {
                    return true;
                }
            }
        }
        set.removeAll(stVar.e);
        return false;
    }
}
