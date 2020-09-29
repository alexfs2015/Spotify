package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: rwd reason: default package */
public final class rwd implements glk {
    private final jjf a;

    public rwd(jjf jjf) {
        this.a = jjf;
    }

    public final void a(String str, String str2, String str3, String str4, String str5, Map<String, Long> map, Map<String, String> map2) {
        Map<String, String> map3;
        if (map2.isEmpty()) {
            String str6 = "";
            map3 = ImmutableMap.b(str6, str6);
        } else {
            map3 = map2;
        }
        v vVar = new v(str, str2, str3, str4, str5, map, map3);
        this.a.a(vVar);
    }
}
