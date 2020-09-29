package defpackage;

import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: btq reason: default package */
final class btq extends btu {
    private final ArrayList<f> a;
    private final /* synthetic */ btk b;

    public btq(btk btk, ArrayList<f> arrayList) {
        this.b = btk;
        super(btk, 0);
        this.a = arrayList;
    }

    public final void a() {
        Set<Scope> set;
        btw btw = this.b.a.m;
        btk btk = this.b;
        if (btk.k == null) {
            set = Collections.emptySet();
        } else {
            Set<Scope> hashSet = new HashSet<>(btk.k.b);
            Map<bsc<?>, b> map = btk.k.d;
            for (bsc bsc : map.keySet()) {
                if (!btk.a.g.containsKey(bsc.b())) {
                    hashSet.addAll(((b) map.get(bsc)).a);
                }
            }
            set = hashSet;
        }
        btw.c = set;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((f) obj).a(this.b.h, this.b.a.m.c);
        }
    }
}
