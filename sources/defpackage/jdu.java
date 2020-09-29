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

/* renamed from: jdu reason: default package */
public final class jdu implements kdi {
    private final kdc a;
    private final kcv b;
    private final kda c;
    private final Context d;
    private final CompositeDisposable e = new CompositeDisposable();
    private final kdl f;
    private final rvv g;
    private kdj h;

    public jdu(Context context, kcv kcv, kdc kdc, kda kda, kdl kdl, rvv rvv) {
        this.d = context;
        this.b = kcv;
        this.a = kdc;
        this.c = kda;
        this.f = kdl;
        this.g = rvv;
    }

    public final void a(kdj kdj) {
        this.h = kdj;
        this.h.c = this;
        this.e.a(this.b.a().a((Consumer<? super T>) new $$Lambda$jdu$9aOQ8eSZzVEvcdkVq7Ik8Z0L0<Object>(this), (Consumer<? super Throwable>) $$Lambda$jdu$S66EzdGgLenBUSbSbyz5R4kqF1c.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(WazeBannerModel wazeBannerModel) {
        Logger.b("Applying Waze banner model", new Object[0]);
        this.h.a(wazeBannerModel);
    }

    public final void a() {
        this.e.c();
        this.h.c = null;
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

    private void d() {
        this.g.f();
        this.c.a();
    }

    private void e() {
        this.b.a(WazeBannerModel.a(Type.NO_BANNER).a());
    }
}
