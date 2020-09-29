package defpackage;

import com.spotify.rcs.model.GranularConfiguration;
import com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: vup reason: default package */
public final class vup {
    private static final vup c = a((GranularConfiguration) GranularConfiguration.k().g());
    public final GranularConfiguration a;
    final Map<String, AssignedPropertyValue> b;

    private vup(GranularConfiguration granularConfiguration, Set<AssignedPropertyValue> set) {
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

    public static vup a(GranularConfiguration granularConfiguration) {
        return new vup(granularConfiguration, new HashSet(granularConfiguration.d));
    }

    public static vup d() {
        return c;
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
}
