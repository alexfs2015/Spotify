package defpackage;

import java.util.Map;

@cfp
/* renamed from: csx reason: default package */
public final class csx implements bhc<csh> {
    private static Integer a(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            sb.toString();
            cpn.a(5);
            return null;
        }
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        csh csh = (csh) obj;
        bkc.z();
        if (map.containsKey("abort")) {
            if (!css.a(csh)) {
                cpn.a(5);
            }
            return;
        }
        String str = (String) map.get("src");
        if (str != null) {
            if (css.b(csh) != null) {
                cpn.a(5);
                return;
            } else if (csh.e() == null) {
                cpn.a(5);
                return;
            } else {
                new csg((String) map.get("flags"));
                Integer a = a(map, "player");
                if (a == null) {
                    a = Integer.valueOf(0);
                }
                a.intValue();
                new csq(csh, csh.e().a.a(csh), str).c();
            }
        } else if (css.b(csh) == null) {
            cpn.a(5);
            return;
        }
        Integer a2 = a(map, "minBufferMs");
        if (a2 != null) {
            a2.intValue();
        }
        Integer a3 = a(map, "maxBufferMs");
        if (a3 != null) {
            a3.intValue();
        }
        Integer a4 = a(map, "bufferForPlaybackMs");
        if (a4 != null) {
            a4.intValue();
        }
        Integer a5 = a(map, "bufferForPlaybackAfterRebufferMs");
        if (a5 != null) {
            a5.intValue();
        }
    }
}
