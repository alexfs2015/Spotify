package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.music.features.connect.dialogs.SwitchDeviceActivity;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: jpp reason: default package */
public class jpp extends jpm implements a<ConnectManager> {
    private final Handler T = new Handler();
    private boolean U;
    private boolean V;
    private Intent W;
    private wuk X = xaj.b();
    public hip a;
    private final wue<GaiaDevice> aa = new wue<GaiaDevice>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
        }

        public final /* synthetic */ void onNext(Object obj) {
            jpp.this.a((GaiaDevice) obj);
        }
    };
    public heg b;

    public static jpp a(fpt fpt) {
        jpp jpp = new jpp();
        fpu.a((Fragment) jpp, fpt);
        return jpp;
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            this.V = bundle.getBoolean("dialog_queued", false);
        }
    }

    public final void g() {
        super.g();
        this.a.a(this);
        this.a.a();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("dialog_queued", this.V);
    }

    public final void h() {
        this.a.b(this);
        this.X.unsubscribe();
        if (this.a.d()) {
            this.a.b();
        }
        super.h();
    }

    /* access modifiers changed from: private */
    public void ae() {
        hip hip = this.a;
        if (hip != null) {
            hip.c();
        }
    }

    public final void e() {
        this.U = false;
    }

    public final void c() {
        super.c();
        Intent intent = this.W;
        if (intent != null) {
            startActivityForResult(intent, this.Z);
        }
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.V = false;
    }

    public final void a(GaiaDevice gaiaDevice) {
        if (this.U && gaiaDevice != null) {
            String identifier = gaiaDevice.getIdentifier();
            Optional d = ((ConnectManager) this.a.i()).d();
            boolean z = false;
            boolean z2 = d.b() && ((String) d.c()).contains(identifier);
            fay.a(gaiaDevice);
            fay.a(gaiaDevice.getIdentifier());
            if (!gaiaDevice.isSelf() && !gaiaDevice.isAttached() && !gaiaDevice.isSocialConnect() && !z2) {
                z = true;
            }
            if (z) {
                this.W = SwitchDeviceActivity.a(p(), gaiaDevice);
                if (this.Y != null && !this.V) {
                    this.V = true;
                    this.Y.a((jpm) this);
                }
            }
            if (gaiaDevice.isSocialConnect()) {
                ((ConnectManager) this.a.i()).d(gaiaDevice.getAttachId());
            }
        }
    }

    public final /* synthetic */ void a(Object obj) {
        ConnectManager connectManager = (ConnectManager) this.a.i();
        if (connectManager.o()) {
            this.U = true;
            this.X.unsubscribe();
            this.X = vun.a((ObservableSource<T>) connectManager.g(), BackpressureStrategy.BUFFER).a(vun.a(this.b.c())).a(this.aa);
            return;
        }
        this.T.postDelayed(new $$Lambda$jpp$Ssytm0qRIqrR_pFlPue18kkqofg(this), 300);
    }
}
