package defpackage;

/* renamed from: uli reason: default package */
public final class uli implements vua<String> {
    private final wlc<ka> a;

    private uli(wlc<ka> wlc) {
        this.a = wlc;
    }

    public static uli a(wlc<ka> wlc) {
        return new uli(wlc);
    }

    public final /* synthetic */ Object get() {
        String stringExtra = ((ka) this.a.get()).getIntent().getStringExtra("voice_internal_referrer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return (String) vuf.a(stringExtra, "Cannot return null from a non-@Nullable @Provides method");
    }
}
