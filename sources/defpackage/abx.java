package defpackage;

import android.util.JsonReader;

/* renamed from: abx reason: default package */
final class abx {
    static aal a(JsonReader jsonReader, xo xoVar) {
        String str = null;
        zs zsVar = null;
        zs zsVar2 = null;
        aac aac = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 99) {
                if (hashCode != 111) {
                    if (hashCode != 3519) {
                        if (hashCode == 3710 && nextName.equals("tr")) {
                            c = 3;
                        }
                    } else if (nextName.equals("nm")) {
                        c = 0;
                    }
                } else if (nextName.equals("o")) {
                    c = 2;
                }
            } else if (nextName.equals("c")) {
                c = 1;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                zsVar = abc.a(jsonReader, xoVar, false);
            } else if (c == 2) {
                zsVar2 = abc.a(jsonReader, xoVar, false);
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                aac = abb.a(jsonReader, xoVar);
            }
        }
        return new aal(str, zsVar, zsVar2, aac);
    }
}
