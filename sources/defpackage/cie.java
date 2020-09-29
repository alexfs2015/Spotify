package defpackage;

import android.content.Context;
import org.json.JSONObject;

@cey
/* renamed from: cie reason: default package */
public final class cie implements chh {
    private ebg<JSONObject, JSONObject> a;
    private ebg<JSONObject, JSONObject> b;

    public cie(Context context) {
        ebo a2 = bjl.s().a(context, coy.a());
        ebk<JSONObject> ebk = ebl.a;
        this.a = a2.a("google.afma.request.getAdDictionary", ebk, ebk);
        ebo a3 = bjl.s().a(context, coy.a());
        ebk<JSONObject> ebk2 = ebl.a;
        this.b = a3.a("google.afma.sdkConstants.getSdkConstants", ebk2, ebk2);
    }

    public final ebg<JSONObject, JSONObject> a() {
        return this.a;
    }

    public final ebg<JSONObject, JSONObject> b() {
        return this.b;
    }
}
