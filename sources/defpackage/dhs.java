package defpackage;

/* renamed from: dhs reason: default package */
final class dhs implements Runnable {
    private final /* synthetic */ dhr a;

    dhs(dhr dhr) {
        this.a = dhr;
    }

    public final void run() {
        if (this.a.b == null) {
            synchronized (dhr.d) {
                if (this.a.b == null) {
                    boolean booleanValue = ((Boolean) dpn.f().a(dsp.bA)).booleanValue();
                    if (booleanValue) {
                        try {
                            dhr.a = new dnl(this.a.c.a, "ADSHIELD");
                        } catch (Throwable unused) {
                            booleanValue = false;
                        }
                    }
                    this.a.b = Boolean.valueOf(booleanValue);
                    dhr.d.open();
                }
            }
        }
    }
}
