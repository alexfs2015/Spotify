package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: nja reason: default package */
public final class nja implements xiy<hcs, hcs> {
    private static hcm a(hcm hcm) {
        if (hcm.children().isEmpty()) {
            if (!hcm.logging().keySet().isEmpty()) {
                hcm = hcm.toBuilder().c(b(hcm)).a();
            }
            return hcm;
        }
        ArrayList arrayList = new ArrayList(hcm.children().size());
        for (hcm a : hcm.children()) {
            arrayList.add(a(a));
        }
        return hcm.toBuilder().a((List<? extends hcm>) arrayList).c(b(hcm)).a();
    }

    private static hcj b(hcm hcm) {
        a builder = hcm.logging().toBuilder();
        String str = "ui:source";
        String string = hcm.logging().string(str);
        if (!fbo.a(string)) {
            String str2 = "-cached";
            if (!string.contains(str2)) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(str2);
                builder = builder.a(str, sb.toString());
            }
        }
        return builder.a();
    }

    public final /* synthetic */ Object call(Object obj) {
        hcj hcj;
        hcs hcs = (hcs) obj;
        List<hcm> body = hcs.body();
        ArrayList arrayList = new ArrayList(body.size());
        for (hcm a : body) {
            arrayList.add(a(a));
        }
        a a2 = hcs.toBuilder().a((List<? extends hcm>) arrayList);
        hcj custom = hcs.custom();
        String str = "recentlyPlayed";
        hcj bundle = custom.bundle(str);
        if (bundle != null) {
            String str2 = "logging";
            hcj bundle2 = bundle.bundle(str2);
            if (bundle2 != null) {
                String str3 = "ui:source";
                String string = bundle2.string(str3, "");
                if (!fbo.a(string)) {
                    String str4 = "-cached";
                    if (!string.contains(str4)) {
                        a builder = bundle2.toBuilder();
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append(str4);
                        hcj = custom.toBuilder().a(str, bundle.toBuilder().a(str2, builder.a(str3, sb.toString()).a()).a()).a();
                        return a2.a(hcj).a();
                    }
                }
            }
        }
        hcj = hcs.custom();
        return a2.a(hcj).a();
    }
}
