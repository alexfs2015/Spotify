package defpackage;

/* renamed from: adi reason: default package */
public final class adi extends aer {
    private final afb a;
    private byte[] d = new byte[1];
    private final int e;
    private final afe f;

    public adi(String str, int i, afb afb) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(i);
        super(sb.toString());
        b.b("InternalButton set %s:%d", str, Integer.valueOf(i));
        this.e = i;
        this.a = afb;
        this.f = ((afe[]) afv.a(this.a, afe.class, 1))[0];
    }
}
