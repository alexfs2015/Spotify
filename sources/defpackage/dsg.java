package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

/* renamed from: dsg reason: default package */
final class dsg extends dsf<Boolean> {
    dsg(int i, String str, Boolean bool) {
        super(i, str, bool, 0);
    }

    public final /* synthetic */ void a(Editor editor, Object obj) {
        editor.putBoolean(this.b, ((Boolean) obj).booleanValue());
    }

    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(this.b, ((Boolean) this.c).booleanValue()));
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.b, ((Boolean) this.c).booleanValue()));
    }
}
