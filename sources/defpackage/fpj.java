package defpackage;

import defpackage.fpj;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fpj reason: default package */
public abstract class fpj<T extends fpj> implements fpi {
    private final JSONObject a = new JSONObject();

    /* access modifiers changed from: protected */
    public final T a(String str, int i) {
        try {
            this.a.put(str, i);
        } catch (JSONException e) {
            e.getMessage();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final T a(String str, String str2) {
        if (str2 != null) {
            try {
                this.a.put(str, str2);
            } catch (JSONException e) {
                e.getMessage();
            }
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" value is null");
        throw new IllegalArgumentException(sb.toString());
    }

    public final String a() {
        return this.a.toString();
    }

    /* access modifiers changed from: protected */
    public final void c(String str) {
        if (this.a.has(str)) {
            this.a.remove(str);
        }
    }
}
