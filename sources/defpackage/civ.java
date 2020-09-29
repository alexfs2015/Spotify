package defpackage;

import android.content.Context;
import org.json.JSONObject;

@cfp
/* renamed from: civ reason: default package */
public final class civ implements chy {
    private ebx<JSONObject, JSONObject> a;
    private ebx<JSONObject, JSONObject> b;

    public civ(Context context) {
        ecf a2 = bkc.s().a(context, cpp.a());
        ecb<JSONObject> ecb = ecc.a;
        this.a = a2.a("google.afma.request.getAdDictionary", ecb, ecb);
        ecf a3 = bkc.s().a(context, cpp.a());
        ecb<JSONObject> ecb2 = ecc.a;
        this.b = a3.a("google.afma.sdkConstants.getSdkConstants", ecb2, ecb2);
    }

    public final ebx<JSONObject, JSONObject> a() {
        return this.a;
    }

    public final ebx<JSONObject, JSONObject> b() {
        return this.b;
    }
}
