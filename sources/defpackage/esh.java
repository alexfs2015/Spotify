package defpackage;

/* renamed from: esh reason: default package */
final class esh implements Runnable {
    private final /* synthetic */ esp a;
    private final /* synthetic */ ern b;

    esh(esp esp, ern ern) {
        this.a = esp;
        this.b = ern;
    }

    public final void run() {
        if (this.a.j == null) {
            this.b.c.a("Install Referrer Reporter is null");
            return;
        }
        esd esd = this.a.j;
        esd.a(esd.a.m().getPackageName());
    }
}
