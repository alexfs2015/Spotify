package defpackage;

import android.content.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hsj reason: default package */
public final class hsj extends hsl<hse> {
    private final String b;
    private final String c;
    private final hrk d;

    hsj(Context context, hsi<hse> hsi, String str, String str2, RxResolver rxResolver, hec hec, hvl hvl, wug wug, hrk hrk) {
        super(context, hsi, str2, rxResolver, hec, hvl, wug);
        this.b = (String) fay.a(str);
        this.c = (String) fay.a(str2);
        this.d = hrk;
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final List<hse> a(byte[] bArr, ObjectMapper objectMapper) {
        gzz gzz = (gzz) objectMapper.readValue(bArr, HubsJsonViewModel.class);
        ArrayList arrayList = new ArrayList(20);
        if (!gzz.body().isEmpty()) {
            gzt gzt = (gzt) gzz.body().get(0);
            for (gzt gzt2 : gzt.children()) {
                String a = hsb.a(gzt2);
                if (a != null && a.startsWith("spotify:genre:")) {
                    arrayList.add(new hsa(hsb.a(gzt2), gzt2.text().title(), hsb.b(gzt2)));
                } else {
                    String title = gzt.text().title();
                    String a2 = hsb.a(gzt2);
                    String title2 = gzt2.text().title();
                    if (a2 == null) {
                        a2 = "";
                    }
                    hsd hsd = new hsd("", title2, null, "", a2, hsb.b(gzt2), 0);
                    arrayList.add(new hsa(gzt2.id(), title, hsd));
                }
            }
        }
        return arrayList;
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
