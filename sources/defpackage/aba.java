package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aba reason: default package */
final class aba {
    static <T> List<abx<T>> a(JsonReader jsonReader, xa xaVar, float f, abq<T> abq) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            xaVar.a("Lottie doesn't support expressions.");
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
                    arrayList.add(aaz.a(jsonReader, xaVar, f, abq, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(aaz.a(jsonReader, xaVar, f, abq, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(aaz.a(jsonReader, xaVar, f, abq, false));
            }
        }
        jsonReader.endObject();
        a(arrayList);
        return arrayList;
    }

    public static void a(List<? extends abx<?>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            abx abx = (abx) list.get(i2);
            i2++;
            abx.f = Float.valueOf(((abx) list.get(i2)).e);
        }
        abx abx2 = (abx) list.get(i);
        if (abx2.b == null) {
            list.remove(abx2);
        }
    }
}
