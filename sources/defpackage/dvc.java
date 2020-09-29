package defpackage;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dvc reason: default package */
final /* synthetic */ class dvc implements cuq {
    private final dvb a;
    private final Map b;
    private final ceu c;

    dvc(dvb dvb, Map map, ceu ceu) {
        this.a = dvb;
        this.b = map;
        this.c = ceu;
    }

    public final void a(boolean z) {
        dvb dvb = this.a;
        Map map = this.b;
        ceu ceu = this.c;
        String str = "id";
        dvb.a.b = (String) map.get(str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageType", "htmlLoaded");
            jSONObject.put(str, dvb.a.b);
            ceu.a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            cml.a("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
