package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

@cfp
/* renamed from: con reason: default package */
public final class con {
    static {
        new coo();
    }

    public static List<String> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }
}
