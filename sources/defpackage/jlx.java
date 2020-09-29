package defpackage;

import android.content.Context;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.music.spotlets.radio.service.RadioActionsService;

/* renamed from: jlx reason: default package */
public final class jlx implements ure {
    private final Context a;

    public jlx(Context context) {
        this.a = (Context) fbp.a(context);
    }

    public final void a() {
        Context context = this.a;
        context.startService(RadioActionsService.a(context));
    }

    public final void a(RadioStationModel radioStationModel, sso sso, uqm uqm, gkm gkm) {
        fbp.a(radioStationModel);
        fbp.a(sso);
        fbp.a(uqm);
        fbp.a(gkm);
        usf usf = new usf();
        usf.c = radioStationModel;
        usf.d = sso;
        usf.a = uqm;
        usf.b = gkm;
        this.a.startService(usf.a(this.a));
    }

    public final void a(RadioStationModel radioStationModel, sso sso, uqm uqm, gkm gkm, int i) {
        fbp.a(radioStationModel);
        fbp.a(sso);
        fbp.a(uqm);
        fbp.a(gkm);
        usf usf = new usf();
        usf.c = radioStationModel;
        usf.d = sso;
        usf a2 = usf.a(i);
        a2.a = uqm;
        a2.b = gkm;
        this.a.startService(a2.a(this.a));
    }

    public final void a(String str) {
        Context context = this.a;
        context.startService(RadioActionsService.a(context, str));
    }

    public final void a(boolean z) {
        Context context = this.a;
        context.startService(RadioActionsService.a(context, z ? ThumbState.UP : ThumbState.DOWN));
    }

    public final void a(String[] strArr, sso sso, boolean z, boolean z2, int i, long j, uqm uqm, gkm gkm, String[] strArr2) {
        fbp.a(strArr);
        fbp.a(true);
        fbp.a(sso);
        fbp.a(uqm);
        fbp.a(gkm);
        usf usf = new usf();
        usf.e = strArr;
        usf.d = sso;
        usf a2 = usf.a(false).b(false).a(i);
        a2.g = Long.valueOf(j);
        a2.a = uqm;
        a2.b = gkm;
        a2.f = null;
        this.a.startService(a2.a(this.a));
    }

    public final void a(String[] strArr, sso sso, boolean z, boolean z2, int i, uqm uqm, gkm gkm, String[] strArr2) {
        fbp.a(strArr);
        fbp.a(true);
        fbp.a(sso);
        fbp.a(uqm);
        fbp.a(gkm);
        usf usf = new usf();
        usf.e = strArr;
        usf.d = sso;
        usf a2 = usf.a(false).b(z2).a(-1);
        a2.a = uqm;
        a2.b = gkm;
        a2.f = strArr2;
        this.a.startService(a2.a(this.a));
    }

    public final void b() {
        Context context = this.a;
        context.startService(RadioActionsService.b(context));
    }

    public final void b(String str) {
        Context context = this.a;
        context.startService(RadioActionsService.b(context, str));
    }

    public final void c(String str) {
        Context context = this.a;
        context.startService(RadioActionsService.c(context, str));
    }

    public final void d(String str) {
        Context context = this.a;
        context.startService(RadioActionsService.d(context, str));
    }
}
