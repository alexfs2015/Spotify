package defpackage;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.util.ArrayList;

/* renamed from: aal reason: default package */
public final class aal {
    public static zh a(JsonReader jsonReader, xa xaVar) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(new yk(xaVar, aaz.a(jsonReader, xaVar, abw.a(), abf.a, jsonReader.peek() == JsonToken.BEGIN_OBJECT)));
            }
            jsonReader.endArray();
            aba.a(arrayList);
        } else {
            arrayList.add(new abx(aay.b(jsonReader, abw.a())));
        }
        return new zh(arrayList);
    }

    static zp<PointF, PointF> b(JsonReader jsonReader, xa xaVar) {
        jsonReader.beginObject();
        zp<PointF, PointF> zpVar = null;
        ze zeVar = null;
        ze zeVar2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 107) {
                if (hashCode != 120) {
                    if (hashCode == 121 && nextName.equals("y")) {
                        c = 2;
                    }
                } else if (nextName.equals("x")) {
                    c = 1;
                }
            } else if (nextName.equals("k")) {
                c = 0;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c == 2) {
                        if (jsonReader.peek() != JsonToken.STRING) {
                            zeVar2 = aao.a(jsonReader, xaVar, true);
                        }
                    }
                    jsonReader.skipValue();
                } else if (jsonReader.peek() != JsonToken.STRING) {
                    zeVar = aao.a(jsonReader, xaVar, true);
                }
                z = true;
                jsonReader.skipValue();
            } else {
                zpVar = a(jsonReader, xaVar);
            }
        }
        jsonReader.endObject();
        if (z) {
            xaVar.a("Lottie doesn't support expressions.");
        }
        if (zpVar != null) {
            return zpVar;
        }
        return new zl(zeVar, zeVar2);
    }
}
