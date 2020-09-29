package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: icy reason: default package */
public final class icy implements idh {
    private final ide a;
    private final idk b;
    private final idc c;
    private final idi d;

    public icy(ide ide, idk idk, idc idc, idi idi) {
        this.a = ide;
        this.b = idk;
        this.c = idc;
        this.d = idi;
    }

    public final Map<Class<? extends idg>, idg> a() {
        HashMap hashMap = new HashMap();
        hashMap.put(ide.class, this.a);
        hashMap.put(idk.class, this.b);
        hashMap.put(idc.class, this.c);
        hashMap.put(idi.class, this.d);
        return hashMap;
    }
}
