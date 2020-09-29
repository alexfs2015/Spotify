package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.music.features.connect.dialogs.SwitchDeviceActivity;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: jsb reason: default package */
public class jsb extends jry {
    private boolean T;
    private Intent U;
    private final SerialDisposable V = new SerialDisposable();
    public ConnectManager a;
    public Scheduler b;

    public static jsb a(fqn fqn) {
        jsb jsb = new jsb();
        fqo.a((Fragment) jsb, fqn);
        return jsb;
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.T = false;
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public void a(GaiaDevice gaiaDevice) {
        String identifier = gaiaDevice.getIdentifier();
        Optional d = this.a.d();
        boolean z = false;
        boolean z2 = d.b() && ((String) d.c()).contains(identifier);
        fbp.a(gaiaDevice);
        fbp.a(gaiaDevice.getIdentifier());
        if (!gaiaDevice.isSelf() && !gaiaDevice.isAttached() && !gaiaDevice.isSocialConnect() && !z2) {
            z = true;
        }
        if (z) {
            this.U = SwitchDeviceActivity.a(p(), gaiaDevice);
            if (this.Y != null && !this.T) {
                this.T = true;
                this.Y.a((jry) this);
            }
        }
        if (gaiaDevice.isSocialConnect()) {
            this.a.d(gaiaDevice.getAttachId());
        }
    }

    public final void aP_() {
        super.aP_();
        this.V.a(this.a.g().a(this.b).d((Consumer<? super T>) new $$Lambda$eAlYu1dGlHlaEwO9ME0ekEEDelM<Object>(this)));
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            this.T = bundle.getBoolean("dialog_queued", false);
        }
    }

    public final void c() {
        super.c();
        Intent intent = this.U;
        if (intent != null) {
            startActivityForResult(intent, this.Z);
        }
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("dialog_queued", this.T);
    }

    public final void h() {
        this.V.a(Disposables.a());
        super.h();
    }
}
