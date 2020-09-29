package defpackage;

import com.google.common.collect.Maps.b;
import com.spotify.cosmos.router.Response;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: rmn reason: default package */
final class rmn {
    final String a;

    rmn(String str) {
        this.a = str;
    }

    static Response a(String str, wmf wmf) {
        return new Response(wmf.c, str, (Map<String, String>) new b<String,String>(wmf.f.a(), new $$Lambda$rmn$RMH35fckDvNWWGStzFIW2yIscpg(wmf)), wmf.g.e());
    }

    static wlw a(Map<String, String> map) {
        wlw a2 = wlw.a(new String[0]);
        if (map == null) {
            return a2;
        }
        a b = a2.b();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2 != null) {
                b.a(utq.a(str), utq.a(str2));
            } else {
                String a3 = utq.a(str);
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
