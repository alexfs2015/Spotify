package defpackage;

/* renamed from: lkj reason: default package */
public final class lkj implements wig<String> {
    private final wzi<kf> a;

    private lkj(wzi<kf> wzi) {
        this.a = wzi;
    }

    public static lkj a(wzi<kf> wzi) {
        return new lkj(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((kf) this.a.get()).getIntent().getStringExtra("INTENT_KEY_UTTERANCE_UID"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
