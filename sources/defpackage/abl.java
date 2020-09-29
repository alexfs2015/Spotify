package defpackage;

import android.util.JsonReader;

/* renamed from: abl reason: default package */
public final class abl implements ace<Integer> {
    public static final abl a = new abl();

    private abl() {
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f) {
        return Integer.valueOf(Math.round(abm.b(jsonReader) * f));
    }
}
