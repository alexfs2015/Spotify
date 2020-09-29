package defpackage;

import android.content.Intent;

/* renamed from: spb reason: default package */
public final class spb {
    private final sov a;
    private final soz b;
    private final spk c;

    public spb(sov sov, soz soz, spk spk) {
        this.a = sov;
        this.b = soz;
        this.c = spk;
    }

    public final void a(jol jol, Intent intent) {
        sot a2 = sox.a(intent);
        sou a3 = this.a.a(intent, jol);
        soq b2 = sox.b(intent);
        this.c.applyReferrerFromIntent(jol, intent);
        this.b.a(a2, jol.ae(), a3, b2);
    }
}
