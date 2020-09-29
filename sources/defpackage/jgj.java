package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.waze.WazeOptOutDialogActivity;
import com.spotify.mobile.android.spotlets.waze.WazeSlateActivity;
import com.spotify.mobile.android.waze.model.WazeBannerModel;
import com.spotify.mobile.android.waze.model.WazeBannerModel.Type;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: jgj reason: default package */
public final class jgj implements kfj {
    private final kfd a;
    private final kew b;
    private final kfb c;
    private final Context d;
    private final CompositeDisposable e = new CompositeDisposable();
    private final kfm f;
    private final sff g;
    private kfk h;

    public jgj(Context context, kew kew, kfd kfd, kfb kfb, kfm kfm, sff sff) {
        this.d = context;
        this.b = kew;
        this.a = kfd;
        this.c = kfb;
        this.f = kfm;
        this.g = sff;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(WazeBannerModel wazeBannerModel) {
        Logger.b("Applying Waze banner model", new Object[0]);
        this.h.a(wazeBannerModel);
    }

    private void d() {
        this.g.f();
        this.c.a();
    }

    private void e() {
        this.b.a(WazeBannerModel.a(Type.NO_BANNER).a());
    }

    public final void a() {
        this.e.c();
        this.h.c = null;
    }

    public final void a(kfk kfk) {
        this.h = kfk;
        this.h.c = this;
        this.e.a(this.b.a().a((Consumer<? super T>) new $$Lambda$jgj$zqk2OL3Utfg5d_fVwDp9xecniOY<Object>(this), (Consumer<? super Throwable>) $$Lambda$jgj$wlUffAe9t38yRhesyCgdT13fDs.INSTANCE));
    }

    public final void b() {
        Intent intent;
        if (this.f.e()) {
            this.g.f();
            Context context = this.d;
            if (this.f.c()) {
                intent = null;
            } else {
                Intent intent2 = new Intent(context, WazeSlateActivity.class);
                intent2.addFlags(268435456);
                intent = intent2;
            }
            if (intent != null) {
                this.d.startActivity(intent);
            }
            return;
        }
        if (!this.f.f()) {
            d();
        }
    }

    public final void c() {
        if (this.f.e()) {
            Intent intent = new Intent(this.d, WazeOptOutDialogActivity.class);
            intent.addFlags(268435456);
            this.d.startActivity(intent);
            e();
            this.c.b();
        } else if (this.a.a()) {
            d();
        } else {
            this.a.a(null);
            e();
            this.g.b("waze");
            this.f.a(true);
        }
    }
}
