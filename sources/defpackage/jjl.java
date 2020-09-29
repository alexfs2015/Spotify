package defpackage;

import android.content.Context;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.music.spotlets.radio.service.RadioActionsService;

/* renamed from: jjl reason: default package */
public final class jjl implements ufq {
    private final Context a;

    public jjl(Context context) {
        this.a = (Context) fay.a(context);
    }

    public final void a(String[] strArr, sih sih, boolean z, boolean z2, int i, udr udr, gjb gjb, String[] strArr2) {
        fay.a(strArr);
        fay.a(true);
        fay.a(sih);
        fay.a(udr);
        fay.a(gjb);
        ugr ugr = new ugr();
        ugr.e = strArr;
        ugr.d = sih;
        ugr a2 = ugr.a(false).b(z2).a(-1);
        a2.a = udr;
        a2.b = gjb;
        a2.f = strArr2;
        this.a.startService(a2.a(this.a));
    }

    public final void a(String[] strArr, sih sih, boolean z, boolean z2, int i, long j, udr udr, gjb gjb, String[] strArr2) {
        fay.a(strArr);
        fay.a(true);
        fay.a(sih);
        fay.a(udr);
        fay.a(gjb);
        ugr ugr = new ugr();
        ugr.e = strArr;
        ugr.d = sih;
        ugr a2 = ugr.a(false).b(false).a(i);
        a2.g = Long.valueOf(j);
        a2.a = udr;
        a2.b = gjb;
        a2.f = null;
        this.a.startService(a2.a(this.a));
    }

    public final void a(RadioStationModel radioStationModel, sih sih, udr udr, gjb gjb) {
        fay.a(radioStationModel);
        fay.a(sih);
        fay.a(udr);
        fay.a(gjb);
        ugr ugr = new ugr();
        ugr.c = radioStationModel;
        ugr.d = sih;
        ugr.a = udr;
        ugr.b = gjb;
        this.a.startService(ugr.a(this.a));
    }

    public final void a(RadioStationModel radioStationModel, sih sih, udr udr, gjb gjb, int i) {
        fay.a(radioStationModel);
        fay.a(sih);
        fay.a(udr);
        fay.a(gjb);
        ugr ugr = new ugr();
        ugr.c = radioStationModel;
        ugr.d = sih;
        ugr a2 = ugr.a(i);
        a2.a = udr;
        a2.b = gjb;
        this.a.startService(a2.a(this.a));
    }

    public final void a(boolean z) {
        Context context = this.a;
        context.startService(RadioActionsService.a(context, z ? ThumbState.UP : ThumbState.DOWN));
    }

    public final void a(String str) {
        Context context = this.a;
        context.startService(RadioActionsService.a(context, str));
    }

    public final void b(String str) {
        Context context = this.a;
        context.startService(RadioActionsService.b(context, str));
    }

    public final void a() {
        Context context = this.a;
        context.startService(RadioActionsService.a(context));
    }

    public final void c(String str) {
        Context context = this.a;
        context.startService(RadioActionsService.c(context, str));
    }

    public final void d(String str) {
        Context context = this.a;
        context.startService(RadioActionsService.d(context, str));
    }

    public final void b() {
        Context context = this.a;
        context.startService(RadioActionsService.b(context));
    }
}
