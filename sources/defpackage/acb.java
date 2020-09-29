package defpackage;

import android.util.JsonReader;

/* renamed from: acb reason: default package */
final class acb {
    static aap a(JsonReader jsonReader, xo xoVar) {
        String str = null;
        zy zyVar = null;
        int i = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 3432) {
                if (hashCode != 3519) {
                    if (hashCode == 104415 && nextName.equals("ind")) {
                        c = 1;
                    }
                } else if (nextName.equals("nm")) {
                    c = 0;
                }
            } else if (nextName.equals("ks")) {
                c = 2;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                i = jsonReader.nextInt();
            } else if (c != 2) {
                jsonReader.skipValue();
            } else {
                zyVar = abc.c(jsonReader, xoVar);
            }
        }
        return new aap(str, i, zyVar);
    }
}
