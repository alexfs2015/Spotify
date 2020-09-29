package defpackage;

/* renamed from: sob reason: default package */
public final class sob implements wig<soa> {
    private final wzi<String> a;
    private final wzi<String> b;

    private sob(wzi<String> wzi, wzi<String> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sob a(wzi<String> wzi, wzi<String> wzi2) {
        return new sob(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new soa((String) this.a.get(), (String) this.b.get());
    }
}
