package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: ccs reason: default package */
public final class ccs {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    private ccs(cct cct) {
        this.a = cct.a;
        this.b = cct.b;
        this.c = cct.c;
        this.d = cct.d;
        this.e = cct.e;
    }

    /* synthetic */ ccs(cct cct, byte b2) {
        this(cct);
    }

    public final JSONObject a() {
        try {
            return new JSONObject().put("sms", this.a).put("tel", this.b).put("calendar", this.c).put("storePicture", this.d).put("inlineVideo", this.e);
        } catch (JSONException e2) {
            cml.a("Error occured while obtaining the MRAID capabilities.", e2);
            return null;
        }
    }
}
