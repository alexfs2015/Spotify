package defpackage;

@Deprecated
/* renamed from: gvs reason: default package */
public final class gvs implements guo {
    private final a a;

    @Deprecated
    /* renamed from: gvs$a */
    public interface a {
        boolean a(gzt gzt);
    }

    @Deprecated
    public gvs(a aVar) {
        this.a = (a) fay.a(aVar);
    }

    public final gzt decorate(gzt gzt) {
        return this.a.a(gzt) ? gzt.toBuilder().c("hubs:glue:highlight", "1").a() : gzt;
    }

    @Deprecated
    public static boolean a(gzt gzt) {
        return "1".equals(gzt.custom().get("hubs:glue:highlight"));
    }
}
