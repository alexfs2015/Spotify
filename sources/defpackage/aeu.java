package defpackage;

/* renamed from: aeu reason: default package */
public class aeu extends aes implements afw {
    private static final afp a = afp.a("connected.car.sdk");
    private final aey<String> d = new aey<>();

    public aeu(String str) {
        super(str);
    }

    public void a(String str) {
        a.b("setText(%s), mIdent=%s", str, this.c);
        if (this.d.a(str)) {
            g().e(this.c, str);
        }
    }
}
