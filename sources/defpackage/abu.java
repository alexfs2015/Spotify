package defpackage;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: abu reason: default package */
public final class abu implements ace<PointF> {
    public static final abu a = new abu();

    private abu() {
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f) {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return abm.b(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return abm.b(jsonReader, f);
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
