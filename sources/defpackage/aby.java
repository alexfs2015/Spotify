package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: aby reason: default package */
public final class aby implements ace<aco> {
    public static final aby a = new aby();

    private aby() {
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
        return new aco((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
