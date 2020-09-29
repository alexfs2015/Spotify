package defpackage;

/* renamed from: idl reason: default package */
public final class idl {
    public final wzi<ide> a;
    public final wzi<icd> b;
    public final wzi<idj> c;

    public idl(wzi<ide> wzi, wzi<icd> wzi2, wzi<idj> wzi3) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
