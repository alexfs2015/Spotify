package defpackage;

import android.util.JsonReader;

/* renamed from: abd reason: default package */
final class abd {
    static aaf a(JsonReader jsonReader, xo xoVar, int i) {
        String str = null;
        boolean z = i == 3;
        aad aad = null;
        zw zwVar = null;
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
                aad = aaz.b(jsonReader, xoVar);
            } else if (c == 2) {
                zwVar = abc.b(jsonReader, xoVar);
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextInt() == 3;
            }
        }
        return new aaf(str, aad, zwVar, z);
    }
}
