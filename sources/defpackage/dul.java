package defpackage;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dul reason: default package */
final /* synthetic */ class dul implements ctz {
    private final duk a;
    private final Map b;
    private final ced c;

    dul(duk duk, Map map, ced ced) {
        this.a = duk;
        this.b = map;
        this.c = ced;
    }

    public final void a(boolean z) {
        duk duk = this.a;
        Map map = this.b;
        ced ced = this.c;
        String str = "id";
        duk.a.b = (String) map.get(str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageType", "htmlLoaded");
            jSONObject.put(str, duk.a.b);
            ced.a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            clu.a("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
