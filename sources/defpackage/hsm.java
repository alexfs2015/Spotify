package defpackage;

import android.content.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hsm reason: default package */
public final class hsm extends hsl<hse> {
    private final String b;
    private final String c;
    private final hrk d;

    hsm(Context context, hsi<hse> hsi, String str, String str2, RxResolver rxResolver, hec hec, hvl hvl, wug wug, hrk hrk) {
        super(context, hsi, str2, rxResolver, hec, hvl, wug);
        this.b = str;
        this.c = str2;
        this.d = hrk;
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final List<hse> a(byte[] bArr, ObjectMapper objectMapper) {
        gzz gzz = (gzz) objectMapper.readValue(bArr, HubsJsonViewModel.class);
        ArrayList arrayList = new ArrayList(gzz.body().size());
        for (gzt gzt : gzz.body()) {
            if (!gzt.children().isEmpty()) {
                ArrayList arrayList2 = new ArrayList(gzt.children().size());
                for (gzt a : gzt.children()) {
                    arrayList2.add(a(a, gzt));
                }
                arrayList.add(new hsf(gzt.id(), gzt.text().title(), arrayList2));
            } else {
                if (hsb.a(gzt) != null) {
                    arrayList.add(new hsa(gzt.id(), gzt.text().title(), a(gzt, (gzt) null)));
                }
            }
        }
        return arrayList;
    }

    private static hsd a(gzt gzt, gzt gzt2) {
        String a = hsb.a(gzt);
        String title = gzt.text().title();
        String title2 = gzt2 != null ? gzt2.text().title() : gzt.text().subtitle();
        String description = gzt.text().description();
        if (a == null) {
            a = "";
        }
        hsd hsd = new hsd("", title, title2, description, a, hsb.b(gzt), 0);
        return hsd;
    }

    /* access modifiers changed from: 0000 */
    public final hrk a(hrk hrk) {
        hrk a = super.a(hrk);
        hrk hrk2 = this.d;
        if (hrk2 != null) {
            a.a(hrk2);
        }
        a.a("region", this.c);
        return a;
    }
}
