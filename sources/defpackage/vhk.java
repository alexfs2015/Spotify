package defpackage;

import com.spotify.rcs.model.GranularConfiguration;
import com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: vhk reason: default package */
public final class vhk {
    private static final vhk c = a((GranularConfiguration) GranularConfiguration.k().g());
    public final GranularConfiguration a;
    final Map<String, AssignedPropertyValue> b;

    private vhk(GranularConfiguration granularConfiguration, Set<AssignedPropertyValue> set) {
        this.a = granularConfiguration;
        this.b = Collections.unmodifiableMap(a(set));
    }

    private static Map<String, AssignedPropertyValue> a(Set<AssignedPropertyValue> set) {
        HashMap hashMap = new HashMap();
        for (AssignedPropertyValue assignedPropertyValue : set) {
            StringBuilder sb = new StringBuilder();
            sb.append(assignedPropertyValue.f);
            sb.append(":");
            sb.append(assignedPropertyValue.h);
            hashMap.put(sb.toString(), assignedPropertyValue);
        }
        return hashMap;
    }

    public final Set<Integer> a() {
        e<AssignedPropertyValue> eVar = this.a.d;
        HashSet hashSet = new HashSet();
        for (AssignedPropertyValue assignedPropertyValue : eVar) {
            hashSet.add(Integer.valueOf((int) assignedPropertyValue.g));
        }
        return hashSet;
    }

    public final String b() {
        return this.a.f;
    }

    public final boolean c() {
        return a().isEmpty();
    }

    public static vhk d() {
        return c;
    }

    public static vhk a(GranularConfiguration granularConfiguration) {
        return new vhk(granularConfiguration, new HashSet(granularConfiguration.d));
    }
}
