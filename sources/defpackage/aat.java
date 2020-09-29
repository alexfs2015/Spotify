package defpackage;

import android.util.JsonReader;

/* renamed from: aat reason: default package */
public final class aat implements abq<Float> {
    public static final aat a = new aat();

    private aat() {
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f) {
        return Float.valueOf(aay.b(jsonReader) * f);
    }
}
