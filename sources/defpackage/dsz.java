package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

/* renamed from: dsz reason: default package */
final class dsz extends dsw<Long> {
    dsz(int i, String str, Long l) {
        super(i, str, l, 0);
    }

    public final /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.b, ((Long) this.c).longValue()));
    }

    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(this.b, ((Long) this.c).longValue()));
    }

    public final /* synthetic */ void a(Editor editor, Object obj) {
        editor.putLong(this.b, ((Long) obj).longValue());
    }
}
