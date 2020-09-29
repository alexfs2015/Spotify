package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;

/* renamed from: ujk reason: default package */
public final class ujk extends jwp implements ujc {
    public static final String a = jsd.a("c68a50624239086c117357770c69436f163200741266466d0471", "397468627039786c6b7339776969376f753264746566306d7471");
    private int b;
    private vf c;
    private final ujf d;
    private final ujq e;
    private final ujm f;
    private final ujn g;
    private final jrs h;
    private final jjf i;

    public ujk(ujq ujq, ujm ujm, ujf ujf, ujn ujn, jrs jrs, jjf jjf) {
        this.e = ujq;
        this.f = ujm;
        this.d = ujf;
        this.g = ujn;
        this.h = jrs;
        this.i = jjf;
    }

    public final void a(Application application) {
        application.registerActivityLifecycleCallbacks(this);
        this.c = ujf.a(application);
        vf vfVar = this.c;
        vfVar.h = new $$Lambda$ujk$fjqrhgPnHo0lVIqXWjaP5VtyHv0(this);
        vi a2 = ve.a();
        if (vfVar == null) {
            vh.a().f("AdjustConfig missing", new Object[0]);
        } else if (!vfVar.a()) {
            vh.a().f("AdjustConfig not initialized correctly", new Object[0]);
        } else if (a2.a != null) {
            vh.a().f("Adjust already initialized", new Object[0]);
        } else {
            vfVar.j = null;
            vfVar.k = null;
            vfVar.l = null;
            vfVar.m = false;
            vfVar.a = null;
            vfVar.b = null;
            a2.a = vh.a(vfVar);
            wm.a((Runnable) new Runnable(vfVar.c) {
                private /* synthetic */ Context a;

                {
                    this.a = r2;
                }

                public final void run() {
                    new wl(this.a).b();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(Uri uri) {
        this.f.a(uri);
        return true;
    }

    public final void a(ScreenIdentifier screenIdentifier, ClickIdentifier clickIdentifier) {
        a(clickIdentifier, screenIdentifier, DialogIdentifier.NONE);
    }

    public final void a(ScreenIdentifier screenIdentifier, ClickIdentifier clickIdentifier, DialogIdentifier dialogIdentifier) {
        a(clickIdentifier, screenIdentifier, dialogIdentifier);
    }

    public final void a(ScreenIdentifier screenIdentifier) {
        a(ujr.f, screenIdentifier);
    }

    public final void a(ScreenIdentifier screenIdentifier, DialogIdentifier dialogIdentifier) {
        b(screenIdentifier, dialogIdentifier);
    }

    public final void a(ScreenIdentifier screenIdentifier, InputFieldIdentifier inputFieldIdentifier) {
        a(ujr.h, screenIdentifier, inputFieldIdentifier);
    }

    public final void a(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier) {
        b(screenIdentifier, eventIdentifier);
    }

    public final void a(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier, String str) {
        a(errorTypeIdentifier, screenIdentifier, inputFieldIdentifier, str);
    }

    public final void a(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier) {
        a(errorTypeIdentifier, screenIdentifier, inputFieldIdentifier, (String) null);
    }

    public final void b(ScreenIdentifier screenIdentifier) {
        a(ujr.b, screenIdentifier);
        this.i.a(new at(this.h.c(), this.h.b()));
    }

    public final void a() {
        a(ujr.e);
    }

    public final void b() {
        a(ujr.a);
        this.g.a(false);
    }

    public final void c() {
        this.g.a(true);
        this.h.b = null;
    }

    public final void onActivityResumed(Activity activity) {
        if (this.b == 0) {
            ve.b();
        }
        this.b++;
    }

    public final void onActivityPaused(Activity activity) {
        this.b--;
        if (this.b == 0) {
            ve.c();
        }
    }

    public void a(String str) {
        a(new ujr(str));
    }

    private void a(String str, ScreenIdentifier screenIdentifier, InputFieldIdentifier inputFieldIdentifier) {
        ujr ujr = new ujr(str);
        ujr.a("screen", screenIdentifier.mType);
        ujr.a("input_field", inputFieldIdentifier.mType);
        a(ujr);
    }

    private void a(ErrorTypeIdentifier errorTypeIdentifier, ScreenIdentifier screenIdentifier, InputFieldIdentifier inputFieldIdentifier, String str) {
        ujr ujr = new ujr(ujr.k);
        ujr.a("screen", screenIdentifier.mType);
        ujr.a("error_type", errorTypeIdentifier.mType);
        if (!(inputFieldIdentifier == null || InputFieldIdentifier.NONE == inputFieldIdentifier)) {
            ujr.a("input_field", inputFieldIdentifier.mType);
        }
        if (!fax.a(str)) {
            ujr.a("error_code", str);
        }
        a(ujr);
    }

    public void a(ClickIdentifier clickIdentifier, ScreenIdentifier screenIdentifier, DialogIdentifier dialogIdentifier) {
        ujr ujr = new ujr(ujr.j);
        ujr.a("screen", screenIdentifier.mType);
        ujr.a("clicked", clickIdentifier.mType);
        if (!(dialogIdentifier == null || DialogIdentifier.NONE == dialogIdentifier)) {
            ujr.a("dialog", dialogIdentifier.mType);
        }
        a(ujr);
    }

    private void a(String str, ScreenIdentifier screenIdentifier) {
        ujr ujr = new ujr(str);
        ujr.a("screen", screenIdentifier.mType);
        a(ujr);
    }

    public void b(ScreenIdentifier screenIdentifier, DialogIdentifier dialogIdentifier) {
        ujr ujr = new ujr(ujr.g);
        ujr.a("screen", screenIdentifier.mType);
        ujr.a("dialog", dialogIdentifier.mType);
        a(ujr);
    }

    public void b(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier) {
        ujr ujr = new ujr(ujr.i);
        ujr.a("screen", screenIdentifier.mType);
        ujr.a("event", eventIdentifier.mType);
        a(ujr);
    }

    public void a(ujr ujr) {
        this.e.a(ujr);
    }

    public final void a(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier, String str) {
        ujr ujr = new ujr(ujr.i);
        ujr.a("screen", screenIdentifier.mType);
        ujr.a("event", eventIdentifier.mType);
        ujr.a("test_group", str);
        a(ujr);
    }
}
