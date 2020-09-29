package defpackage;

/* renamed from: inf reason: default package */
public final class inf implements c {
    private final ind a;

    public inf(ind ind) {
        this.a = ind;
    }

    public final void ai_() {
        ind ind = this.a;
        if (ind.d.a()) {
            if (ind.d.b()) {
                ino ino = ind.c;
                ino.a.registerReceiver(ino, ino.b);
                ino.c = true;
            }
            ind.b.getApplicationContext().bindService(ind.e, ind.a, 65);
            ind.f = true;
        }
    }

    public final void aj_() {
        ind ind = this.a;
        if (ind.f) {
            ino ino = ind.c;
            if (ino.c) {
                ino.a.unregisterReceiver(ino);
                ino.c = false;
            }
            ind.b.getApplicationContext().unbindService(ind.a);
            ind.f = false;
        }
    }

    public final String c() {
        return "BixbyHomeCardService";
    }
}
