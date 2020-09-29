package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* renamed from: rbo reason: default package */
public final class rbo {
    public final szp a;
    public final Activity b;
    public final fqn c;
    public final hec d;
    public final Bundle e = fb.a((Context) this.b, 17432576, 17432577).a();

    public rbo(Activity activity, fqn fqn, szp szp, hec hec) {
        this.b = activity;
        this.c = fqn;
        this.a = szp;
        this.d = hec;
    }

    public final void a() {
        this.a.a("spotify:internal:hidden-content");
    }

    public final void b() {
        this.a.a("spotify:internal:preferences");
    }
}
