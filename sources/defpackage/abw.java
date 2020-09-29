package defpackage;

import android.util.JsonReader;

/* renamed from: abw reason: default package */
final class abw {
    static aak a(JsonReader jsonReader, xo xoVar) {
        String str = null;
        aad aad = null;
        zw zwVar = null;
        zs zsVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 112) {
                if (hashCode != 3519) {
                    if (hashCode != 114) {
                        if (hashCode == 115 && nextName.equals("s")) {
                            c = 2;
                        }
                    } else if (nextName.equals("r")) {
                        c = 3;
                    }
                } else if (nextName.equals("nm")) {
                    c = 0;
                }
            } else if (nextName.equals("p")) {
                c = 1;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                aad = aaz.b(jsonReader, xoVar);
            } else if (c == 2) {
                zwVar = abc.b(jsonReader, xoVar);
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                zsVar = abc.a(jsonReader, xoVar, true);
            }
        }
        return new aak(str, aad, zwVar, zsVar);
    }
}
