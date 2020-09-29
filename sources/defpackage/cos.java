package defpackage;

import android.util.JsonWriter;
import java.util.Map;

/* renamed from: cos reason: default package */
final /* synthetic */ class cos implements cov {
    private final int a;
    private final Map b;

    cos(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    public final void a(JsonWriter jsonWriter) {
        cop.a(this.a, this.b, jsonWriter);
    }
}
