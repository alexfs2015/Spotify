package defpackage;

/* renamed from: hwt reason: default package */
public final class hwt {
    public final String a;

    public hwt(hwu hwu) {
        StringBuilder sb = new StringBuilder();
        sb.append(hwu.b);
        if (hwu.c.b()) {
            sb.append(" — ");
            sb.append((String) hwu.c.c());
        }
        this.a = sb.toString();
    }
}
