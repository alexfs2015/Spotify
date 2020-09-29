package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

/* renamed from: dsk reason: default package */
final class dsk extends dsf<String> {
    dsk(int i, String str, String str2) {
        super(i, str, str2, 0);
    }

    public final /* synthetic */ void a(Editor editor, Object obj) {
        editor.putString(this.b, (String) obj);
    }

    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(this.b, (String) this.c);
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.b, (String) this.c);
    }
}
