package defpackage;

@Deprecated
/* renamed from: gxt reason: default package */
public final class gxt implements gwo {
    private final a a;

    @Deprecated
    /* renamed from: gxt$a */
    public interface a {
        boolean a(hcm hcm);
    }

    @Deprecated
    public gxt(a aVar) {
        this.a = (a) fbp.a(aVar);
    }

    @Deprecated
    public static boolean a(hcm hcm) {
        return "1".equals(hcm.custom().get("hubs:glue:highlight"));
    }

    public final hcm decorate(hcm hcm) {
        return this.a.a(hcm) ? hcm.toBuilder().c("hubs:glue:highlight", "1").a() : hcm;
    }
}
