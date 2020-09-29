package defpackage;

import android.util.JsonReader;

/* renamed from: aax reason: default package */
public final class aax implements abq<Integer> {
    public static final aax a = new aax();

    private aax() {
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f) {
        return Integer.valueOf(Math.round(aay.b(jsonReader) * f));
    }
}
