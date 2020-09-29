package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: dud reason: default package */
public final class dud {
    public final int a;
    public final byte[] b;
    public final Map<String, String> c;
    public final List<dql> d;
    public final boolean e;
    private final long f;

    private dud(int i, byte[] bArr, Map<String, String> map, List<dql> list, boolean z, long j) {
        this.a = i;
        this.b = bArr;
        this.c = map;
        this.d = list == null ? null : Collections.unmodifiableList(list);
        this.e = z;
        this.f = j;
    }

    @Deprecated
    public dud(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        List arrayList;
        if (map == null) {
            arrayList = null;
        } else if (map.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                arrayList.add(new dql((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        List list = arrayList;
        this(i, bArr, map, list, z, j);
    }

    @Deprecated
    public dud(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0);
    }

    public dud(int i, byte[] bArr, boolean z, long j, List<dql> list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (dql dql : list) {
                treeMap.put(dql.a, dql.b);
            }
        }
        Map map = treeMap;
        this(i, bArr, map, list, z, j);
    }
}
