package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* renamed from: qsz reason: default package */
public final class qsz {
    public final spi a;
    public final Activity b;
    public final fpt c;
    public final hbj d;
    public final Bundle e = fb.a((Context) this.b, 17432576, 17432577).a();

    public qsz(Activity activity, fpt fpt, spi spi, hbj hbj) {
        this.b = activity;
        this.c = fpt;
        this.a = spi;
        this.d = hbj;
    }

    public final void a() {
        this.a.a("spotify:internal:hidden-content");
    }

    public final void b() {
        this.a.a("spotify:internal:preferences");
    }
}
