package defpackage;

import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: buh reason: default package */
final class buh extends bul {
    private final ArrayList<f> a;
    private final /* synthetic */ bub b;

    public buh(bub bub, ArrayList<f> arrayList) {
        this.b = bub;
        super(bub, 0);
        this.a = arrayList;
    }

    public final void a() {
        Set<Scope> set;
        bun bun = this.b.a.m;
        bub bub = this.b;
        if (bub.k == null) {
            set = Collections.emptySet();
        } else {
            Set<Scope> hashSet = new HashSet<>(bub.k.b);
            Map<bst<?>, b> map = bub.k.d;
            for (bst bst : map.keySet()) {
                if (!bub.a.g.containsKey(bst.b())) {
                    hashSet.addAll(((b) map.get(bst)).a);
                }
            }
            set = hashSet;
        }
        bun.c = set;
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
