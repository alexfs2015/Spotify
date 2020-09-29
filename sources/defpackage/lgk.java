package defpackage;

/* renamed from: lgk reason: default package */
public final class lgk implements vua<String> {
    private final wlc<ka> a;

    private lgk(wlc<ka> wlc) {
        this.a = wlc;
    }

    public static lgk a(wlc<ka> wlc) {
        return new lgk(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((ka) this.a.get()).getIntent().getStringExtra("INTENT_KEY_UTTERANCE_UID"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
