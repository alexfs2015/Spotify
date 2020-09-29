package defpackage;

import android.util.JsonReader;

/* renamed from: abn reason: default package */
final class abn {
    static aab a(JsonReader jsonReader, xa xaVar) {
        String str = null;
        zk zkVar = null;
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
                zkVar = aao.c(jsonReader, xaVar);
            }
        }
        return new aab(str, i, zkVar);
    }
}
