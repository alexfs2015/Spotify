package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.facebook.FacebookPlaceholderActivity;
import com.spotify.music.libs.facebook.SocialState;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: saa reason: default package */
public class saa extends jrd implements jqx {
    @jyp
    private boolean T;
    public sal a;
    private final SerialDisposable b = new SerialDisposable();

    /* access modifiers changed from: private */
    public void a(SocialState socialState) {
        if (!socialState.enabled() || this.T) {
            if (!this.T) {
                this.T = true;
                startActivityForResult(new Intent(n(), FacebookPlaceholderActivity.class), 102);
            }
            return;
        }
        ah();
    }

    public static boolean a(jva jva) {
        return Uri.parse(jva.g()).getQueryParameterNames().contains("facebook-connect");
    }

    private void ah() {
        Intent a2 = new szl(o()).a(szk.a(ViewUris.s.toString()).a(true).a());
        a2.addFlags(67108864);
        a(a2);
    }

    public static jqx c() {
        return new saa();
    }

    public final void A() {
        super.A();
        this.b.a(Disposables.a());
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        if (i != 102 || i2 == -1) {
            q().finish();
        } else {
            ah();
        }
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.FACEBOOK_CONNECT, null);
    }

    public final uqm ag() {
        return uqo.S;
    }

    public final String b(Context context) {
        return "Spotify ❤ Facebook";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        jyq.b(this, bundle);
    }

    public final String e() {
        return ViewUris.aK.toString();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        jyq.a((Object) this, bundle);
    }

    public final void z() {
        super.z();
        this.b.a(this.a.b().a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$saa$O0fqXMWbxz78ePthVRtPMU8092g<Object>(this), (Consumer<? super Throwable>) $$Lambda$saa$pYJMAEeBcqTk1teYOivIXdWLLZo.INSTANCE));
    }
}
