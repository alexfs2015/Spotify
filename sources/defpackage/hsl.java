package defpackage;

import android.content.Context;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import java.util.List;

/* renamed from: hsl reason: default package */
public abstract class hsl<T> {
    public final hsk<T> a;
    private Context b;

    /* access modifiers changed from: 0000 */
    public hrk a(hrk hrk) {
        return hrk;
    }

    /* access modifiers changed from: 0000 */
    public abstract String a();

    /* access modifiers changed from: 0000 */
    public abstract List<T> a(byte[] bArr, ObjectMapper objectMapper);

    public static hsl<hse> a(Context context, hsi<hse> hsi, String str, String str2, RxResolver rxResolver, hec hec, hvl hvl, wug wug, hrk hrk) {
        hsm hsm = new hsm(context, hsi, str, str2, rxResolver, hec, hvl, wug, hrk);
        return hsm;
    }

    public static hsl<hse> b(Context context, hsi<hse> hsi, String str, String str2, RxResolver rxResolver, hec hec, hvl hvl, wug wug, hrk hrk) {
        hsj hsj = new hsj(context, hsi, str, str2, rxResolver, hec, hvl, wug, hrk);
        return hsj;
    }

    hsl(Context context, hsi<T> hsi, String str, RxResolver rxResolver, hec hec, hvl hvl, wug wug) {
        this.b = (Context) fay.a(context);
        hsk hsk = new hsk(this, (hsi) fay.a(hsi), (String) fay.a(str), (RxResolver) fay.a(rxResolver), (hec) fay.a(hec), (hvl) fay.a(hvl), wug, ((rnf) ggw.a(rnf.class)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(Include.NON_NULL).a());
        this.a = hsk;
    }

    public final void a(int i, int i2) {
        this.a.a(0, 50);
    }
}
