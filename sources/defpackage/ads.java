package defpackage;

/* renamed from: ads reason: default package */
public class ads extends aes implements aff {
    private String a;

    public ads(adn adn, int i) {
        super(String.format("%s:%d", new Object[]{adn.f(), Integer.valueOf(i)}));
    }

    public final String c() {
        return this.a;
    }

    public final void a(String str) {
        this.a = str;
    }
}
