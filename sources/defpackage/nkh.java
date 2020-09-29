package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.util.List;

/* renamed from: nkh reason: default package */
public final class nkh {
    public static hcj a(String str, int i, String str2, String str3) {
        a builder = HubsImmutableComponentBundle.builder();
        if (!fbo.a(str)) {
            builder = builder.a("ui:group", str);
        }
        if (i >= 0) {
            builder = builder.a("ui:index_in_block", i);
        }
        if (!fbo.a(str2)) {
            builder = builder.a("ui:source", str2);
        }
        if (!fbo.a(str3)) {
            builder = builder.a("ui:uri", str3);
        }
        return builder.a();
    }

    public static boolean a(hcj hcj) {
        return hcj.boolValue("remote", false);
    }

    public static boolean a(hcj hcj, List<? extends hcm> list) {
        String str;
        String str2;
        if (hcj.boolValue("cached", false)) {
            return true;
        }
        int i = 0;
        while (true) {
            str = "";
            str2 = "ui:source";
            if (i >= list.size()) {
                i = -1;
                break;
            } else if (!fbo.a(((hcm) list.get(i)).logging().string(str2, str))) {
                break;
            } else {
                i++;
            }
        }
        return i != -1 && ((hcm) list.get(i)).logging().string(str2, str).contains("-cached");
    }

    public static boolean a(hcs hcs) {
        return hcs.custom().keySet().contains("autoDownloadEligible");
    }
}
