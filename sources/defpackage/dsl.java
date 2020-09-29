package defpackage;

import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

@cey
/* renamed from: dsl reason: default package */
public final class dsl {
    final Collection<dsf<?>> a = new ArrayList();
    final Collection<dsf<String>> b = new ArrayList();
    final Collection<dsf<String>> c = new ArrayList();

    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        for (dsf a2 : this.b) {
            String str = (String) dpn.f().a(a2);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final void a(Editor editor, JSONObject jSONObject) {
        for (dsf dsf : this.a) {
            if (dsf.a == 1) {
                dsf.a(editor, dsf.a(jSONObject));
            }
        }
    }
}
