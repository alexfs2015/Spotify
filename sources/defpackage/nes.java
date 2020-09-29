package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.util.List;

/* renamed from: nes reason: default package */
public final class nes {
    public static boolean a(gzq gzq, List<? extends gzt> list) {
        String str;
        String str2;
        if (gzq.boolValue("cached", false)) {
            return true;
        }
        int i = 0;
        while (true) {
            str = "";
            str2 = "ui:source";
            if (i >= list.size()) {
                i = -1;
                break;
            } else if (!fax.a(((gzt) list.get(i)).logging().string(str2, str))) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1 || !((gzt) list.get(i)).logging().string(str2, str).contains("-cached")) {
            return false;
        }
        return true;
    }

    public static gzq a(String str, int i, String str2, String str3) {
        a builder = HubsImmutableComponentBundle.builder();
        if (!fax.a(str)) {
            builder = builder.a("ui:group", str);
        }
        if (i >= 0) {
            builder = builder.a("ui:index_in_block", i);
        }
        if (!fax.a(str2)) {
            builder = builder.a("ui:source", str2);
        }
        if (!fax.a(str3)) {
            builder = builder.a("ui:uri", str3);
        }
        return builder.a();
    }
}
