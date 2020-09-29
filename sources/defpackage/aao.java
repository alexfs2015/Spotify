package defpackage;

import android.util.JsonReader;
import java.util.List;

/* renamed from: aao reason: default package */
public final class aao {
    public static ze a(JsonReader jsonReader, xa xaVar, boolean z) {
        return new ze(a(jsonReader, z ? abw.a() : 1.0f, xaVar, aat.a));
    }

    static zg a(JsonReader jsonReader, xa xaVar) {
        return new zg(a(jsonReader, xaVar, (abq<T>) aax.a));
    }

    static zi b(JsonReader jsonReader, xa xaVar) {
        return new zi(a(jsonReader, abw.a(), xaVar, abg.a));
    }

    static zk c(JsonReader jsonReader, xa xaVar) {
        return new zk(a(jsonReader, abw.a(), xaVar, abl.a));
    }

    static zd d(JsonReader jsonReader, xa xaVar) {
        return new zd(a(jsonReader, xaVar, (abq<T>) aaq.a));
    }

    static zf a(JsonReader jsonReader, xa xaVar, int i) {
        return new zf(a(jsonReader, xaVar, (abq<T>) new aau<T>(i)));
    }

    static <T> List<abx<T>> a(JsonReader jsonReader, xa xaVar, abq<T> abq) {
        return aba.a(jsonReader, xaVar, 1.0f, abq);
    }

    private static <T> List<abx<T>> a(JsonReader jsonReader, float f, xa xaVar, abq<T> abq) {
        return aba.a(jsonReader, xaVar, f, abq);
    }
}
