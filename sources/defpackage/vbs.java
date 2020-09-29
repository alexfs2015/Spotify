package defpackage;

/* renamed from: vbs reason: default package */
public abstract class vbs implements vbt {

    /* renamed from: vbs$a */
    public interface a {
        a a(boolean z);

        vbs a();
    }

    public abstract String f();

    public abstract a g();

    public static vbs a(String str, String str2, String str3, boolean z, String str4, String str5) {
        vbo vbo = new vbo(str, str2, str3, z, str4, str5);
        return vbo;
    }

    public final vbs a(boolean z) {
        return g().a(z).a();
    }
}
