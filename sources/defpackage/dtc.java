package defpackage;

import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

@cfp
/* renamed from: dtc reason: default package */
public final class dtc {
    final Collection<dsw<?>> a = new ArrayList();
    final Collection<dsw<String>> b = new ArrayList();
    final Collection<dsw<String>> c = new ArrayList();

    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        for (dsw a2 : this.b) {
            String str = (String) dqe.f().a(a2);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final void a(Editor editor, JSONObject jSONObject) {
        for (dsw dsw : this.a) {
            if (dsw.a == 1) {
                dsw.a(editor, dsw.a(jSONObject));
            }
        }
    }
}
