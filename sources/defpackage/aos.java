package defpackage;

import java.util.List;
import org.json.JSONObject;

/* renamed from: aos reason: default package */
public final class aos {

    /* renamed from: aos$a */
    public interface a {
        JSONObject a(apn apn);
    }

    private static Object a(Object obj, a aVar) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof apn) {
            if (aVar != null) {
                return aVar.a((apn) obj);
            }
            return null;
        } else if (obj instanceof apl) {
            return a((apl) obj, aVar);
        } else {
            if (obj instanceof List) {
                return a((List) obj, aVar);
            }
            StringBuilder sb = new StringBuilder("Invalid object found for JSON serialization: ");
            sb.append(obj.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r2v0, types: [java.util.List, java.util.List<java.lang.Object>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONArray a(java.util.List<java.lang.Object> r2, defpackage.aos.a r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aos.a(java.util.List, aos$a):org.json.JSONArray");
    }

    public static JSONObject a(apj apj, a aVar) {
        JSONObject jSONObject = new JSONObject();
        for (String str : apj.a.keySet()) {
            jSONObject.put(str, a(apj.a(str), aVar));
        }
        return jSONObject;
    }

    private static JSONObject a(apl apl, a aVar) {
        JSONObject jSONObject = new JSONObject();
        for (String str : apl.a.keySet()) {
            jSONObject.put(str, a(apl.a(str), aVar));
        }
        return jSONObject;
    }
}
