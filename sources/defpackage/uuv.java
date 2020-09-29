package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: uuv reason: default package */
public final class uuv extends jyr implements uun {
    public static final String a = jun.a("c68a50624239086c117357770c69436f163200741266466d0471", "397468627039786c6b7339776969376f753264746566306d7471");
    private int b;
    private vt c;
    private final uuq d;
    private final uvb e;
    private final uux f;
    private final uuy g;
    private final juc h;
    private final jlr i;

    public uuv(uvb uvb, uux uux, uuq uuq, uuy uuy, juc juc, jlr jlr) {
        this.e = uvb;
        this.f = uux;
        this.d = uuq;
        this.g = uuy;
        this.h = juc;
        this.i = jlr;
    }

    private void a(ErrorTypeIdentifier errorTypeIdentifier, ScreenIdentifier screenIdentifier, InputFieldIdentifier inputFieldIdentifier, String str) {
        uvc uvc = new uvc(uvc.k);
        uvc.a("screen", screenIdentifier.mType);
        uvc.a("error_type", errorTypeIdentifier.mType);
        if (!(inputFieldIdentifier == null || InputFieldIdentifier.NONE == inputFieldIdentifier)) {
            uvc.a("input_field", inputFieldIdentifier.mType);
        }
        if (!fbo.a(str)) {
            uvc.a("error_code", str);
        }
        a(uvc);
    }

    private void a(String str, ScreenIdentifier screenIdentifier) {
        uvc uvc = new uvc(str);
        uvc.a("screen", screenIdentifier.mType);
        a(uvc);
    }

    private void a(String str, ScreenIdentifier screenIdentifier, InputFieldIdentifier inputFieldIdentifier) {
        uvc uvc = new uvc(str);
        uvc.a("screen", screenIdentifier.mType);
        uvc.a("input_field", inputFieldIdentifier.mType);
        a(uvc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(Uri uri) {
        this.f.a(uri);
        return true;
    }

    public final void a() {
        a(uvc.e);
    }

    public final void a(Application application) {
        application.registerActivityLifecycleCallbacks(this);
        this.c = uuq.a(application);
        vt vtVar = this.c;
        vtVar.h = new $$Lambda$uuv$fzBCVm85O_SxpWCsqD_sDzEVIA(this);
        vw a2 = vs.a();
        if (vtVar == null) {
            vv.a().f("AdjustConfig missing", new Object[0]);
        } else if (!vtVar.a()) {
            vv.a().f("AdjustConfig not initialized correctly", new Object[0]);
        } else if (a2.a != null) {
            vv.a().f("Adjust already initialized", new Object[0]);
        } else {
            vtVar.j = null;
            vtVar.k = null;
            vtVar.l = null;
            vtVar.m = false;
            vtVar.a = null;
            vtVar.b = null;
            a2.a = vv.a(vtVar);
            xa.a((Runnable) new Runnable(vtVar.c) {
                private /* synthetic */ Context a;

                {
                    this.a = r2;
                }

                public final void run() {
                    new wz(this.a).b();
                }
            });
        }
    }

    public void a(ImmutableMap<String, String> immutableMap) {
        uvc uvc = new uvc(uvc.i);
        fdz R_ = immutableMap.entrySet().iterator();
        while (R_.hasNext()) {
            Entry entry = (Entry) R_.next();
            uvc.a((String) entry.getKey(), (String) entry.getValue());
        }
        a(uvc);
    }

    public void a(ClickIdentifier clickIdentifier, ScreenIdentifier screenIdentifier, DialogIdentifier dialogIdentifier) {
        uvc uvc = new uvc(uvc.j);
        uvc.a("screen", screenIdentifier.mType);
        uvc.a("clicked", clickIdentifier.mType);
        if (!(dialogIdentifier == null || DialogIdentifier.NONE == dialogIdentifier)) {
            uvc.a("dialog", dialogIdentifier.mType);
        }
        a(uvc);
    }

    public final void a(EventIdentifier eventIdentifier, ImmutableMap<String, String> immutableMap) {
        a(ImmutableMap.g().b("event", eventIdentifier.mType).a((Map<? extends K, ? extends V>) immutableMap).b());
    }

    public final void a(ScreenIdentifier screenIdentifier) {
        a(uvc.f, screenIdentifier);
    }

    public final void a(ScreenIdentifier screenIdentifier, ClickIdentifier clickIdentifier) {
        a(clickIdentifier, screenIdentifier, DialogIdentifier.NONE);
    }

    public final void a(ScreenIdentifier screenIdentifier, DialogIdentifier dialogIdentifier) {
        b(screenIdentifier, dialogIdentifier);
    }

    public final void a(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier) {
        a(errorTypeIdentifier, screenIdentifier, inputFieldIdentifier, (String) null);
    }

    public final void a(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier, String str) {
        a(errorTypeIdentifier, screenIdentifier, inputFieldIdentifier, str);
    }

    public final void a(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier) {
        String str = "event";
        a(ImmutableMap.g().b("screen", screenIdentifier.mType).b(str, eventIdentifier.mType).b());
    }

    public final void a(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier, String str) {
        String str2 = "event";
        a(ImmutableMap.g().b("screen", screenIdentifier.mType).b(str2, eventIdentifier.mType).b("test_group", str).b());
    }

    public final void a(ScreenIdentifier screenIdentifier, InputFieldIdentifier inputFieldIdentifier) {
        a(uvc.h, screenIdentifier, inputFieldIdentifier);
    }

    public void a(String str) {
        a(new uvc(str));
    }

    public void a(uvc uvc) {
        this.e.a(uvc);
    }

    public final void b() {
        a(uvc.a);
        this.g.a(false);
    }

    public final void b(ScreenIdentifier screenIdentifier) {
        a(uvc.b, screenIdentifier);
        this.i.a(new as(this.h.c(), this.h.b()));
    }

    public void b(ScreenIdentifier screenIdentifier, DialogIdentifier dialogIdentifier) {
        uvc uvc = new uvc(uvc.g);
        uvc.a("screen", screenIdentifier.mType);
        uvc.a("dialog", dialogIdentifier.mType);
        a(uvc);
    }

    public final void c() {
        this.g.a(true);
        this.h.b = null;
    }

    public final void onActivityPaused(Activity activity) {
        this.b--;
        if (this.b == 0) {
            vs.c();
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (this.b == 0) {
            vs.b();
        }
        this.b++;
    }
}
