package defpackage;

/* renamed from: vqf reason: default package */
public final class vqf implements vua<String> {
    private static final vqf a = new vqf();

    public static vqf a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        StringBuilder sb = new StringBuilder("--");
        sb.append(wpj.b(30));
        return (String) vuf.a(sb.toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
