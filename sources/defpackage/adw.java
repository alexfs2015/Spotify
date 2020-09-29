package defpackage;

/* renamed from: adw reason: default package */
public final class adw extends aff {
    private final afp a;
    private byte[] d = new byte[1];
    private final int e;
    private final afs f;

    public adw(String str, int i, afp afp) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(i);
        super(sb.toString());
        b.b("InternalButton set %s:%d", str, Integer.valueOf(i));
        this.e = i;
        this.a = afp;
        this.f = ((afs[]) agj.a(this.a, afs.class, 1))[0];
    }
}
