package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

/* renamed from: dta reason: default package */
final class dta extends dsw<Float> {
    dta(int i, String str, Float f) {
        super(i, str, f, 0);
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(this.b, ((Float) this.c).floatValue()));
    }

    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(this.b, (double) ((Float) this.c).floatValue()));
    }

    public final /* synthetic */ void a(Editor editor, Object obj) {
        editor.putFloat(this.b, ((Float) obj).floatValue());
    }
}
