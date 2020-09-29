package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: abk reason: default package */
public final class abk implements abq<aca> {
    public static final abk a = new abk();

    private abk() {
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f) {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new aca((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
