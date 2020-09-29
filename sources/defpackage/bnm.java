package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: bnm reason: default package */
public final class bnm {
    int a;
    String b;
    List<bnl> c;
    List<bwd> d;
    double e;

    /* renamed from: bnm$a */
    public static class a {
        final bnm a = new bnm(0);

        public final a a(JSONObject jSONObject) {
            bnm bnm = this.a;
            bnm.a();
            if (jSONObject != null) {
                String optString = jSONObject.optString("containerType", "");
                char c = 65535;
                int hashCode = optString.hashCode();
                if (hashCode != 6924225) {
                    if (hashCode == 828666841 && optString.equals("GENERIC_CONTAINER")) {
                        c = 0;
                    }
                } else if (optString.equals("AUDIOBOOK_CONTAINER")) {
                    c = 1;
                }
                if (c == 0) {
                    bnm.a = 0;
                } else if (c == 1) {
                    bnm.a = 1;
                }
                bnm.b = jSONObject.optString("title", null);
                JSONArray optJSONArray = jSONObject.optJSONArray("sections");
                if (optJSONArray != null) {
                    bnm.c = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            bnl bnl = new bnl();
                            bnl.a(optJSONObject);
                            bnm.c.add(bnl);
                        }
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("containerImages");
                if (optJSONArray2 != null) {
                    bnm.d = new ArrayList();
                    eie.a(bnm.d, optJSONArray2);
                }
                bnm.e = jSONObject.optDouble("containerDuration", bnm.e);
            }
            return this;
        }
    }

    private bnm() {
        a();
    }

    private bnm(bnm bnm) {
        this.a = bnm.a;
        this.b = bnm.b;
        this.c = bnm.c;
        this.d = bnm.d;
        this.e = bnm.e;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnm)) {
            return false;
        }
        bnm bnm = (bnm) obj;
        return this.a == bnm.a && TextUtils.equals(this.b, bnm.b) && bwv.a(this.c, bnm.c) && bwv.a(this.d, bnm.d) && this.e == bnm.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Double.valueOf(this.e)});
    }

    /* synthetic */ bnm(byte b2) {
        this();
    }

    /* synthetic */ bnm(bnm bnm, byte b2) {
        this(bnm);
    }
}
