package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: ccb reason: default package */
public final class ccb {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    /* synthetic */ ccb(ccc ccc, byte b2) {
        this(ccc);
    }

    public final JSONObject a() {
        try {
            return new JSONObject().put("sms", this.a).put("tel", this.b).put("calendar", this.c).put("storePicture", this.d).put("inlineVideo", this.e);
        } catch (JSONException e2) {
            clu.a("Error occured while obtaining the MRAID capabilities.", e2);
            return null;
        }
    }

    private ccb(ccc ccc) {
        this.a = ccc.a;
        this.b = ccc.b;
        this.c = ccc.c;
        this.d = ccc.d;
        this.e = ccc.e;
    }
}
