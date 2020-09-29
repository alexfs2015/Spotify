package defpackage;

/* renamed from: iks reason: default package */
public final class iks implements c {
    private final ikq a;

    public final String c() {
        return "BixbyHomeCardService";
    }

    public iks(ikq ikq) {
        this.a = ikq;
    }

    public final void ai_() {
        ikq ikq = this.a;
        if (ikq.d.a()) {
            if (ikq.d.b()) {
                ilb ilb = ikq.c;
                ilb.a.registerReceiver(ilb, ilb.b);
                ilb.c = true;
            }
            ikq.b.getApplicationContext().bindService(ikq.e, ikq.a, 65);
            ikq.f = true;
        }
    }

    public final void aj_() {
        ikq ikq = this.a;
        if (ikq.f) {
            ilb ilb = ikq.c;
            if (ilb.c) {
                ilb.a.unregisterReceiver(ilb);
                ilb.c = false;
            }
            ikq.b.getApplicationContext().unbindService(ikq.a);
            ikq.f = false;
        }
    }
}
