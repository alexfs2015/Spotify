package defpackage;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: abg reason: default package */
public final class abg implements abq<PointF> {
    public static final abg a = new abg();

    private abg() {
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f) {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return aay.b(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return aay.b(jsonReader, f);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        StringBuilder sb = new StringBuilder("Cannot convert json to point. Next token is ");
        sb.append(peek);
        throw new IllegalArgumentException(sb.toString());
    }
}
