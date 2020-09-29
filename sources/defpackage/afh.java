package defpackage;

/* renamed from: afh reason: default package */
public class afh extends afi implements a, b, c {
    private final String a;
    private final afm<Boolean> d = new afm<>();

    public afh(String str, String str2) {
        super(str);
        this.a = str2;
    }

    public void a(boolean z) {
        super.a(z);
        if (this.d.a(Boolean.valueOf(z))) {
            g().c(this.a, z);
        }
    }
}
