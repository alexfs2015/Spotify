package defpackage;

/* renamed from: dij reason: default package */
final class dij implements Runnable {
    private final /* synthetic */ dii a;

    dij(dii dii) {
        this.a = dii;
    }

    public final void run() {
        if (this.a.b == null) {
            synchronized (dii.d) {
                if (this.a.b == null) {
                    boolean booleanValue = ((Boolean) dqe.f().a(dtg.bA)).booleanValue();
                    if (booleanValue) {
                        try {
                            dii.a = new doc(this.a.c.a, "ADSHIELD");
                        } catch (Throwable unused) {
                            booleanValue = false;
                        }
                    }
                    this.a.b = Boolean.valueOf(booleanValue);
                    dii.d.open();
                }
            }
        }
    }
}
