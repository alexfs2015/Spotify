package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: asp reason: default package */
final class asp {
    private static String a(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    public static byte[] a(byte[] bArr) {
        if (ben.a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(ben.a(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(a(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(a(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return ben.c(sb.toString());
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder("Failed to adjust response data: ");
            sb2.append(ben.a(bArr));
            bdu.b("ClearKeyUtil", sb2.toString(), e);
            return bArr;
        }
    }
}
