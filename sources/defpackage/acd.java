package defpackage;

import android.util.JsonReader;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;

/* renamed from: acd reason: default package */
final class acd {
    static ShapeTrimPath a(JsonReader jsonReader, xo xoVar) {
        String str = null;
        Type type = null;
        zs zsVar = null;
        zs zsVar2 = null;
        zs zsVar3 = null;
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
                zsVar = abc.a(jsonReader, xoVar, false);
            } else if (c == 1) {
                zsVar2 = abc.a(jsonReader, xoVar, false);
            } else if (c == 2) {
                zsVar3 = abc.a(jsonReader, xoVar, false);
            } else if (c == 3) {
                str = jsonReader.nextString();
            } else if (c != 4) {
                jsonReader.skipValue();
            } else {
                type = Type.a(jsonReader.nextInt());
            }
        }
        ShapeTrimPath shapeTrimPath = new ShapeTrimPath(str, type, zsVar, zsVar2, zsVar3);
        return shapeTrimPath;
    }
}
