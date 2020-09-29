package defpackage;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.util.ArrayList;

/* renamed from: aaz reason: default package */
public final class aaz {
    public static zv a(JsonReader jsonReader, xo xoVar) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(new yy(xoVar, abn.a(jsonReader, xoVar, ack.a(), abt.a, jsonReader.peek() == JsonToken.BEGIN_OBJECT)));
            }
            jsonReader.endArray();
            abo.a(arrayList);
        } else {
            arrayList.add(new acl(abm.b(jsonReader, ack.a())));
        }
        return new zv(arrayList);
    }

    static aad<PointF, PointF> b(JsonReader jsonReader, xo xoVar) {
        jsonReader.beginObject();
        aad<PointF, PointF> aad = null;
        zs zsVar = null;
        zs zsVar2 = null;
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
                            zsVar2 = abc.a(jsonReader, xoVar, true);
                        }
                    }
                    jsonReader.skipValue();
                } else if (jsonReader.peek() != JsonToken.STRING) {
                    zsVar = abc.a(jsonReader, xoVar, true);
                }
                z = true;
                jsonReader.skipValue();
            } else {
                aad = a(jsonReader, xoVar);
            }
        }
        jsonReader.endObject();
        if (z) {
            xoVar.a("Lottie doesn't support expressions.");
        }
        return aad != null ? aad : new zz(zsVar, zsVar2);
    }
}
