package defpackage;

import android.content.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hve reason: default package */
public final class hve extends hvd<huw> {
    private final String b;
    private final String c;
    private final htw d;

    hve(Context context, hva<huw> hva, String str, String str2, RxResolver rxResolver, hgy hgy, hxx hxx, xil xil, htw htw, jty jty) {
        super(context, hva, str2, rxResolver, hgy, hxx, xil, jty);
        this.b = str;
        this.c = str2;
        this.d = htw;
    }

    private static huv a(hcm hcm, hcm hcm2) {
        String a = hut.a(hcm);
        String title = hcm.text().title();
        String title2 = hcm2 != null ? hcm2.text().title() : hcm.text().subtitle();
        String description = hcm.text().description();
        if (a == null) {
            a = "";
        }
        huv huv = new huv("", title, title2, description, a, hut.b(hcm), 0);
        return huv;
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
        ArrayList arrayList = new ArrayList(hcs.body().size());
        for (hcm hcm : hcs.body()) {
            if (!hcm.children().isEmpty()) {
                ArrayList arrayList2 = new ArrayList(hcm.children().size());
                for (hcm a : hcm.children()) {
                    arrayList2.add(a(a, hcm));
                }
                arrayList.add(new hux(hcm.id(), hcm.text().title(), arrayList2));
            } else {
                if (hut.a(hcm) != null) {
                    arrayList.add(new hus(hcm.id(), hcm.text().title(), a(hcm, (hcm) null)));
                }
            }
        }
        return arrayList;
    }
}
