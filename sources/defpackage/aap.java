package defpackage;

import android.util.JsonReader;

/* renamed from: aap reason: default package */
final class aap {
    static zr a(JsonReader jsonReader, xa xaVar, int i) {
        String str = null;
        boolean z = i == 3;
        zp zpVar = null;
        zi ziVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 100) {
                if (hashCode != 112) {
                    if (hashCode != 115) {
                        if (hashCode == 3519 && nextName.equals("nm")) {
                            c = 0;
                        }
                    } else if (nextName.equals("s")) {
                        c = 2;
                    }
                } else if (nextName.equals("p")) {
                    c = 1;
                }
            } else if (nextName.equals("d")) {
                c = 3;
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
                z = jsonReader.nextInt() == 3;
            }
        }
        return new zr(str, zpVar, ziVar, z);
    }
}
