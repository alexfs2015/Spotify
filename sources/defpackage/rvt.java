package defpackage;

import com.google.common.collect.Maps.b;
import com.spotify.cosmos.router.Response;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: rvt reason: default package */
final class rvt {
    final String a;

    rvt(String str) {
        this.a = str;
    }

    static Response a(String str, xal xal) {
        return new Response(xal.c, str, (Map<String, String>) new b<String,String>(xal.f.a(), new $$Lambda$rvt$YI8teccZEynFUtQeLyYe6HK8lXE(xal)), xal.g.e());
    }

    static xac a(Map<String, String> map) {
        xac a2 = xac.a(new String[0]);
        if (map == null) {
            return a2;
        }
        a b = a2.b();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2 != null) {
                b.a(vev.a(str), vev.a(str2));
            } else {
                String a3 = vev.a(str);
                int indexOf = a3.indexOf(":");
                if (indexOf != -1) {
                    b.a(a3.substring(0, indexOf).trim(), a3.substring(indexOf + 1));
                } else {
                    StringBuilder sb = new StringBuilder("Unexpected header: ");
                    sb.append(a3);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return b.a();
    }
}
