package defpackage;

/* renamed from: wen reason: default package */
public abstract class wen {

    /* renamed from: wen$a */
    public interface a {
        a a(int i);

        a a(String str);

        wen a();

        a b(String str);
    }

    public static a d() {
        return new a().a("speech-recognition.spotify.com").b("/v2/android/").a(443);
    }

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public final boolean e() {
        return "speech-recognition-test.spotify.com".equals(a());
    }
}
