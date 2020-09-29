package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

/* renamed from: dsh reason: default package */
final class dsh extends dsf<Integer> {
    dsh(int i, String str, Integer num) {
        super(i, str, num, 0);
    }

    public final /* synthetic */ void a(Editor editor, Object obj) {
        editor.putInt(this.b, ((Integer) obj).intValue());
    }

    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(this.b, ((Integer) this.c).intValue()));
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.b, ((Integer) this.c).intValue()));
    }
}
