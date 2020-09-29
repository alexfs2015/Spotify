package defpackage;

/* renamed from: afi reason: default package */
public class afi extends afg implements agk {
    private static final agd a = agd.a("connected.car.sdk");
    private final afm<String> d = new afm<>();

    public afi(String str) {
        super(str);
    }

    public void a(String str) {
        a.b("setText(%s), mIdent=%s", str, this.c);
        if (this.d.a(str)) {
            g().e(this.c, str);
        }
    }
}
