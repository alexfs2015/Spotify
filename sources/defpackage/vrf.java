package defpackage;

/* renamed from: vrf reason: default package */
public abstract class vrf {

    /* renamed from: vrf$a */
    public interface a {
        a a(int i);

        a a(String str);

        vrf a();

        a b(String str);
    }

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public final boolean e() {
        return "speech-recognition-test.spotify.com".equals(a());
    }

    public static a d() {
        return new a().a("speech-recognition.spotify.com").b("/v2/android/").a(443);
    }
}
