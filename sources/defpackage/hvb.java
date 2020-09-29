package defpackage;

import android.content.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hvb reason: default package */
public final class hvb extends hvd<huw> {
    private final String b;
    private final String c;
    private final htw d;

    public hvb(Context context, hva<huw> hva, String str, String str2, RxResolver rxResolver, hgy hgy, hxx hxx, xil xil, htw htw, jty jty) {
        super(context, hva, str2, rxResolver, hgy, hxx, xil, jty);
        this.b = (String) fbp.a(str);
        this.c = (String) fbp.a(str2);
        this.d = htw;
    }

    /* access modifiers changed from: 0000 */
    public final htw a(htw htw) {
        htw a = super.a(htw);
        htw htw2 = this.d;
        if (htw2 != null) {
            a.a(htw2);
        }
        a.a("region", this.c);
        return a;
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final List<huw> a(byte[] bArr, ObjectMapper objectMapper) {
        hcs hcs = (hcs) objectMapper.readValue(bArr, HubsJsonViewModel.class);
        ArrayList arrayList = new ArrayList(20);
        if (!hcs.body().isEmpty()) {
            hcm hcm = (hcm) hcs.body().get(0);
            for (hcm hcm2 : hcm.children()) {
                String a = hut.a(hcm2);
                if (a != null && a.startsWith("spotify:genre:")) {
                    arrayList.add(new hus(hut.a(hcm2), hcm2.text().title(), hut.b(hcm2)));
                } else {
                    String title = hcm.text().title();
                    String a2 = hut.a(hcm2);
                    String title2 = hcm2.text().title();
                    if (a2 == null) {
                        a2 = "";
                    }
                    huv huv = new huv("", title2, null, "", a2, hut.b(hcm2), 0);
                    arrayList.add(new hus(hcm2.id(), title, huv));
                }
            }
        }
        return arrayList;
    }
}
