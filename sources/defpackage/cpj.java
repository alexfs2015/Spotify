package defpackage;

import android.util.JsonWriter;
import java.util.Map;

/* renamed from: cpj reason: default package */
final /* synthetic */ class cpj implements cpm {
    private final int a;
    private final Map b;

    cpj(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    public final void a(JsonWriter jsonWriter) {
        cpg.a(this.a, this.b, jsonWriter);
    }
}
