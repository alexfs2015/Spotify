package defpackage;

import java.util.List;
import org.json.JSONObject;

/* renamed from: aoe reason: default package */
public final class aoe {

    /* renamed from: aoe$a */
    public interface a {
        JSONObject a(aoz aoz);
    }

    public static JSONObject a(aov aov, a aVar) {
        JSONObject jSONObject = new JSONObject();
        for (String str : aov.a.keySet()) {
            jSONObject.put(str, a(aov.a(str), aVar));
        }
        return jSONObject;
    }

    private static JSONObject a(aox aox, a aVar) {
        JSONObject jSONObject = new JSONObject();
        for (String str : aox.a.keySet()) {
            jSONObject.put(str, a(aox.a(str), aVar));
        }
        return jSONObject;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r2v0, types: [java.util.List, java.util.List<java.lang.Object>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONArray a(java.util.List<java.lang.Object> r2, defpackage.aoe.a r3) {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0009:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = a(r1, r3)
            r0.put(r1)
            goto L_0x0009
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoe.a(java.util.List, aoe$a):org.json.JSONArray");
    }

    private static Object a(Object obj, a aVar) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof aoz) {
            if (aVar != null) {
                return aVar.a((aoz) obj);
            }
            return null;
        } else if (obj instanceof aox) {
            return a((aox) obj, aVar);
        } else {
            if (obj instanceof List) {
                return a((List) obj, aVar);
            }
            StringBuilder sb = new StringBuilder("Invalid object found for JSON serialization: ");
            sb.append(obj.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
