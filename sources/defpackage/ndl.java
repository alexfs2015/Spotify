package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ndl reason: default package */
public final class ndl implements wut<gzz, gzz> {
    public final /* synthetic */ Object call(Object obj) {
        gzq gzq;
        gzz gzz = (gzz) obj;
        List<gzt> body = gzz.body();
        ArrayList arrayList = new ArrayList(body.size());
        for (gzt a : body) {
            arrayList.add(a(a));
        }
        a a2 = gzz.toBuilder().a((List<? extends gzt>) arrayList);
        gzq custom = gzz.custom();
        String str = "recentlyPlayed";
        gzq bundle = custom.bundle(str);
        if (bundle != null) {
            String str2 = "logging";
            gzq bundle2 = bundle.bundle(str2);
            if (bundle2 != null) {
                String str3 = "ui:source";
                String string = bundle2.string(str3, "");
                if (!fax.a(string)) {
                    String str4 = "-cached";
                    if (!string.contains(str4)) {
                        a builder = bundle2.toBuilder();
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append(str4);
                        gzq = custom.toBuilder().a(str, bundle.toBuilder().a(str2, builder.a(str3, sb.toString()).a()).a()).a();
                        return a2.a(gzq).a();
                    }
                }
            }
        }
        gzq = gzz.custom();
        return a2.a(gzq).a();
    }

    private static gzt a(gzt gzt) {
        if (gzt.children().isEmpty()) {
            if (!gzt.logging().keySet().isEmpty()) {
                gzt = gzt.toBuilder().c(b(gzt)).a();
            }
            return gzt;
        }
        ArrayList arrayList = new ArrayList(gzt.children().size());
        for (gzt a : gzt.children()) {
            arrayList.add(a(a));
        }
        return gzt.toBuilder().a((List<? extends gzt>) arrayList).c(b(gzt)).a();
    }

    private static gzq b(gzt gzt) {
        a builder = gzt.logging().toBuilder();
        String str = "ui:source";
        String string = gzt.logging().string(str);
        if (!fax.a(string)) {
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
}
