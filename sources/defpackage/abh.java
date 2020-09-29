package defpackage;

import android.util.JsonReader;

/* renamed from: abh reason: default package */
public final class abh implements ace<Float> {
    public static final abh a = new abh();

    private abh() {
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f) {
        return Float.valueOf(abm.b(jsonReader) * f);
    }
}
