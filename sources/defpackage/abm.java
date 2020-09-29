package defpackage;

import android.graphics.Path.FillType;
import android.util.JsonReader;

/* renamed from: abm reason: default package */
final class abm {
    static zz a(JsonReader jsonReader, xa xaVar) {
        String str = null;
        zd zdVar = null;
        zg zgVar = null;
        int i = 1;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -396065730) {
                if (hashCode != 99) {
                    if (hashCode != 111) {
                        if (hashCode != 114) {
                            if (hashCode == 3519 && nextName.equals("nm")) {
                                c = 0;
                            }
                        } else if (nextName.equals("r")) {
                            c = 4;
                        }
                    } else if (nextName.equals("o")) {
                        c = 2;
                    }
                } else if (nextName.equals("c")) {
                    c = 1;
                }
            } else if (nextName.equals("fillEnabled")) {
                c = 3;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                zdVar = aao.d(jsonReader, xaVar);
            } else if (c == 2) {
                zgVar = aao.a(jsonReader, xaVar);
            } else if (c == 3) {
                z = jsonReader.nextBoolean();
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                i = jsonReader.nextInt();
            }
        }
        zz zzVar = new zz(str, z, i == 1 ? FillType.WINDING : FillType.EVEN_ODD, zdVar, zgVar);
        return zzVar;
    }
}
