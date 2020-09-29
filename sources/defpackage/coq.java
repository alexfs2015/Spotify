package defpackage;

import android.util.JsonWriter;
import java.util.Map;

/* renamed from: coq reason: default package */
final /* synthetic */ class coq implements cov {
    private final String a;
    private final String b;
    private final Map c;
    private final byte[] d;

    coq(String str, String str2, Map map, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = bArr;
    }

    public final void a(JsonWriter jsonWriter) {
        cop.a(this.a, this.b, this.c, this.d, jsonWriter);
    }
}
