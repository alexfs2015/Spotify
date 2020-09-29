package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: oob reason: default package */
public final class oob {
    public static ooa a(uzb uzb, int i) {
        uzc b = uzb.b();
        uys a = uzb.a();
        ImmutableMap c = uzb.c();
        if (b != null) {
            return ooa.g().a(i).b(uzb.getTitle()).a(uzb.getUri()).c(uzb.d()).a((Map<String, String>) c).a();
        }
        if (a != null) {
            return ooa.g().a(i).b(uzb.getTitle()).a(uzb.getUri()).c(uzb.d()).a(a.w()).a((Map<String, String>) c).a();
        }
        return null;
    }
}
