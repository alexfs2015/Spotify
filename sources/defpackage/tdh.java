package defpackage;

/* renamed from: tdh reason: default package */
public final class tdh implements c {
    private final gts a;
    private final gud b;
    private final hed c;
    private final twu d;
    private wuk e = wzp.a(wzk.a());

    public final String c() {
        return "DriverDistractionAlwaysOn";
    }

    public tdh(gts gts, gud gud, hed hed, twu twu) {
        this.a = gts;
        this.b = gud;
        this.c = hed;
        this.d = twu;
    }

    public final void ai_() {
        this.e = twu.a(this.c).a((wun<? super T>) new $$Lambda$tdh$FjCTUTpTBIdNWto7K4kxLqHXi6M<Object>(this), (wun<Throwable>) $$Lambda$tdh$0oy_pzKRZWV4gkaqn4_8E49e_iw.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (!this.a.b() || !bool.booleanValue()) {
            if (this.a.b()) {
                this.a.b(false);
            }
            return;
        }
        this.b.a(true);
    }

    public final void aj_() {
        if (!this.e.isUnsubscribed()) {
            this.e.unsubscribe();
        }
    }
}
