package defpackage;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: bam reason: default package */
final class bam implements azl {
    private final baj a;
    private final long[] b;
    private final Map<String, bal> c;
    private final Map<String, bak> d;

    public bam(baj baj, Map<String, bal> map, Map<String, bak> map2) {
        this.a = baj;
        this.d = map2;
        this.c = Collections.unmodifiableMap(map);
        this.b = baj.a();
    }

    public final int a(long j) {
        int b2 = bdw.b(this.b, j, false, false);
        if (b2 < this.b.length) {
            return b2;
        }
        return -1;
    }

    public final int b() {
        return this.b.length;
    }

    public final long b_(int i) {
        return this.b[i];
    }

    public final List<azi> b(long j) {
        baj baj = this.a;
        Map<String, bal> map = this.c;
        Map<String, bak> map2 = this.d;
        TreeMap treeMap = new TreeMap();
        baj.a(j, false, baj.c, treeMap);
        baj.a(j, map, treeMap);
        ArrayList arrayList = new ArrayList();
        for (Entry entry : treeMap.entrySet()) {
            bak bak = (bak) map2.get(entry.getKey());
            azi azi = new azi((CharSequence) baj.a((SpannableStringBuilder) entry.getValue()), (Alignment) null, bak.c, bak.d, bak.e, bak.b, Integer.MIN_VALUE, bak.f, bak.g, bak.h);
            arrayList.add(azi);
        }
        return arrayList;
    }
}
