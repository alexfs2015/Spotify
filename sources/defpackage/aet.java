package defpackage;

/* renamed from: aet reason: default package */
public class aet extends aeu implements a, b, c {
    private final String a;
    private final aey<Boolean> d = new aey<>();

    public aet(String str, String str2) {
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
