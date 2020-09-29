package defpackage;

/* renamed from: hwv reason: default package */
public final class hwv {
    public final String a;
    private final String b;

    public hwv(hwu hwu) {
        this.b = hwu.b;
        StringBuilder sb = new StringBuilder();
        if (hwu.c.b()) {
            sb.append((String) hwu.c.c());
        }
        this.a = sb.toString();
    }
}
