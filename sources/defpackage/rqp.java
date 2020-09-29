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

/* renamed from: rqp reason: default package */
public class rqp extends jor implements jol {
    @jwn
    private boolean T;
    public rra a;
    private final SerialDisposable b = new SerialDisposable();

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "Spotify ❤ Facebook";
    }

    public static jol c() {
        return new rqp();
    }

    public static boolean a(jst jst) {
        return Uri.parse(jst.g()).getQueryParameterNames().contains("facebook-connect");
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        jwo.b(this, bundle);
    }

    public final void z() {
        super.z();
        this.b.a(this.a.b().a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$rqp$qt5d199TrAwzCNe6kpOyGHvRrik<Object>(this), (Consumer<? super Throwable>) $$Lambda$rqp$GQ_dohghdtnteXSupH_uhbkpCcs.INSTANCE));
    }

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

    public final void A() {
        super.A();
        this.b.a(Disposables.a());
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        jwo.a((Object) this, bundle);
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        if (i != 102 || i2 == -1) {
            q().finish();
        } else {
            ah();
        }
    }

    private void ah() {
        Intent a2 = new spe(o()).a(spd.a(ViewUris.t.toString()).a(true).a());
        a2.addFlags(67108864);
        a(a2);
    }

    public final String e() {
        return ViewUris.aL.toString();
    }

    public final udr ag() {
        return udt.S;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.FACEBOOK_CONNECT, null);
    }
}
