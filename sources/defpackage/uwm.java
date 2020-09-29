package defpackage;

/* renamed from: uwm reason: default package */
public final class uwm implements wig<String> {
    private final wzi<kf> a;

    private uwm(wzi<kf> wzi) {
        this.a = wzi;
    }

    public static uwm a(wzi<kf> wzi) {
        return new uwm(wzi);
    }

    public final /* synthetic */ Object get() {
        String stringExtra = ((kf) this.a.get()).getIntent().getStringExtra("voice_internal_referrer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return (String) wil.a(stringExtra, "Cannot return null from a non-@Nullable @Provides method");
    }
}
