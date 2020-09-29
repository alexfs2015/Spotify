package defpackage;

import android.util.JsonReader;

/* renamed from: abj reason: default package */
final class abj {
    static zx a(JsonReader jsonReader, xa xaVar) {
        String str = null;
        ze zeVar = null;
        ze zeVar2 = null;
        zo zoVar = null;
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
                zeVar = aao.a(jsonReader, xaVar, false);
            } else if (c == 2) {
                zeVar2 = aao.a(jsonReader, xaVar, false);
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                zoVar = aan.a(jsonReader, xaVar);
            }
        }
        return new zx(str, zeVar, zeVar2, zoVar);
    }
}
