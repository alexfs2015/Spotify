package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abo reason: default package */
final class abo {
    static <T> List<acl<T>> a(JsonReader jsonReader, xo xoVar, float f, ace<T> ace) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            xoVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 107 && nextName.equals("k")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(abn.a(jsonReader, xoVar, f, ace, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(abn.a(jsonReader, xoVar, f, ace, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(abn.a(jsonReader, xoVar, f, ace, false));
            }
        }
        jsonReader.endObject();
        a(arrayList);
        return arrayList;
    }

    public static void a(List<? extends acl<?>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            acl acl = (acl) list.get(i2);
            i2++;
            acl.f = Float.valueOf(((acl) list.get(i2)).e);
        }
        acl acl2 = (acl) list.get(i);
        if (acl2.b == null) {
            list.remove(acl2);
        }
    }
}
