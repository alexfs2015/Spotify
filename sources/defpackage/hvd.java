package defpackage;

import android.content.Context;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import java.util.List;

/* renamed from: hvd reason: default package */
public abstract class hvd<T> {
    public final hvc<T> a;
    private Context b;

    hvd(Context context, hva<T> hva, String str, RxResolver rxResolver, hgy hgy, hxx hxx, xil xil, jty jty) {
        this.b = (Context) fbp.a(context);
        hvc hvc = new hvc(this, (hva) fbp.a(hva), (String) fbp.a(str), (RxResolver) fbp.a(rxResolver), (hgy) fbp.a(hgy), (hxx) fbp.a(hxx), xil, ((rwl) gih.a(rwl.class)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(Include.NON_NULL).a(), jty);
        this.a = hvc;
    }

    public static hvd<huw> a(Context context, hva<huw> hva, String str, String str2, RxResolver rxResolver, hgy hgy, hxx hxx, xil xil, htw htw, jty jty) {
        hve hve = new hve(context, hva, str, str2, rxResolver, hgy, hxx, xil, htw, jty);
        return hve;
    }

    /* access modifiers changed from: 0000 */
    public htw a(htw htw) {
        return htw;
    }

    /* access modifiers changed from: 0000 */
    public abstract String a();

    /* access modifiers changed from: 0000 */
    public abstract List<T> a(byte[] bArr, ObjectMapper objectMapper);

    public final void a(int i, int i2) {
        this.a.a(0, 50);
    }
}
