package defpackage;

import android.util.JsonReader;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;

/* renamed from: abp reason: default package */
final class abp {
    static ShapeTrimPath a(JsonReader jsonReader, xa xaVar) {
        String str = null;
        Type type = null;
        ze zeVar = null;
        ze zeVar2 = null;
        ze zeVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 101) {
                if (hashCode != 109) {
                    if (hashCode != 111) {
                        if (hashCode != 115) {
                            if (hashCode == 3519 && nextName.equals("nm")) {
                                c = 3;
                            }
                        } else if (nextName.equals("s")) {
                            c = 0;
                        }
                    } else if (nextName.equals("o")) {
                        c = 2;
                    }
                } else if (nextName.equals("m")) {
                    c = 4;
                }
            } else if (nextName.equals("e")) {
                c = 1;
            }
            if (c == 0) {
                zeVar = aao.a(jsonReader, xaVar, false);
            } else if (c == 1) {
                zeVar2 = aao.a(jsonReader, xaVar, false);
            } else if (c == 2) {
                zeVar3 = aao.a(jsonReader, xaVar, false);
            } else if (c == 3) {
                str = jsonReader.nextString();
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                type = Type.a(jsonReader.nextInt());
            }
        }
        ShapeTrimPath shapeTrimPath = new ShapeTrimPath(str, type, zeVar, zeVar2, zeVar3);
        return shapeTrimPath;
    }
}
