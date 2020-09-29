package defpackage;

/* renamed from: aeg reason: default package */
public class aeg extends afg implements aft {
    private String a;

    public aeg(aeb aeb, int i) {
        super(String.format("%s:%d", new Object[]{aeb.f(), Integer.valueOf(i)}));
    }

    public final void a(String str) {
        this.a = str;
    }

    public final String c() {
        return this.a;
    }
}
