package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: ovh reason: default package */
public final class ovh {
    public static ovg a(vle vle, int i) {
        vlf b = vle.b();
        vkv a = vle.a();
        ImmutableMap c = vle.c();
        if (b != null) {
            return ovg.g().a(i).b(vle.getTitle()).a(vle.getUri()).c(vle.d()).a((Map<String, String>) c).a();
        }
        if (a != null) {
            return ovg.g().a(i).b(vle.getTitle()).a(vle.getUri()).c(vle.d()).a(a.w()).a((Map<String, String>) c).a();
        }
        return null;
    }
}
