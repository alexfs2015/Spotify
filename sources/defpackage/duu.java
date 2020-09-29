package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: duu reason: default package */
public final class duu {
    public final int a;
    public final byte[] b;
    public final Map<String, String> c;
    public final List<drc> d;
    public final boolean e;
    private final long f;

    private duu(int i, byte[] bArr, Map<String, String> map, List<drc> list, boolean z, long j) {
        this.a = i;
        this.b = bArr;
        this.c = map;
        this.d = list == null ? null : Collections.unmodifiableList(list);
        this.e = z;
        this.f = j;
    }

    @Deprecated
    public duu(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        List arrayList;
        if (map == null) {
            arrayList = null;
        } else if (map.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                arrayList.add(new drc((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        List list = arrayList;
        this(i, bArr, map, list, z, j);
    }

    public duu(int i, byte[] bArr, boolean z, long j, List<drc> list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (drc drc : list) {
                treeMap.put(drc.a, drc.b);
            }
        }
        Map map = treeMap;
        this(i, bArr, map, list, z, j);
    }

    @Deprecated
    public duu(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0);
    }
}
