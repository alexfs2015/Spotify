package defpackage;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: bbd reason: default package */
final class bbd implements bac {
    private final bba a;
    private final long[] b;
    private final Map<String, bbc> c;
    private final Map<String, bbb> d;

    public bbd(bba bba, Map<String, bbc> map, Map<String, bbb> map2) {
        this.a = bba;
        this.d = map2;
        this.c = Collections.unmodifiableMap(map);
        this.b = bba.a();
    }

    public final int a(long j) {
        int b2 = ben.b(this.b, j, false, false);
        if (b2 < this.b.length) {
            return b2;
        }
        return -1;
    }

    public final int b() {
        return this.b.length;
    }

    public final List<azz> b(long j) {
        bba bba = this.a;
        Map<String, bbc> map = this.c;
        Map<String, bbb> map2 = this.d;
        TreeMap treeMap = new TreeMap();
        bba.a(j, false, bba.c, treeMap);
        bba.a(j, map, treeMap);
        ArrayList arrayList = new ArrayList();
        for (Entry entry : treeMap.entrySet()) {
            bbb bbb = (bbb) map2.get(entry.getKey());
            azz azz = new azz((CharSequence) bba.a((SpannableStringBuilder) entry.getValue()), (Alignment) null, bbb.c, bbb.d, bbb.e, bbb.b, Integer.MIN_VALUE, bbb.f, bbb.g, bbb.h);
            arrayList.add(azz);
        }
        return arrayList;
    }

    public final long b_(int i) {
        return this.b[i];
    }
}
