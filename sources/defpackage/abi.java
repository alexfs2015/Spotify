package defpackage;

import android.util.JsonReader;

/* renamed from: abi reason: default package */
final class abi {
    static zw a(JsonReader jsonReader, xa xaVar) {
        String str = null;
        zp zpVar = null;
        zi ziVar = null;
        ze zeVar = null;
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
                zpVar = aal.b(jsonReader, xaVar);
            } else if (c == 2) {
                ziVar = aao.b(jsonReader, xaVar);
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                zeVar = aao.a(jsonReader, xaVar, true);
            }
        }
        return new zw(str, zpVar, ziVar, zeVar);
    }
}
