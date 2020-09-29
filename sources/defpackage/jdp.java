package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.h;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.spotlets.share.v2.ShareCapability;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import java.util.Map;

/* renamed from: jdp reason: default package */
public final class jdp extends wib implements jqx, a {
    private jev T;
    private jex U;
    private jeu V;
    private Disposable X = Disposables.a();
    private Bitmap Y;
    public jca a;
    public Scheduler b;

    /* access modifiers changed from: 0000 */
    public static jdp a(fqn fqn) {
        jdp jdp = new jdp();
        fqo.a((Fragment) jdp, fqn);
        return jdp;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Toast.makeText(n(), th.getMessage(), 0).show();
    }

    /* access modifiers changed from: private */
    public void a(jdz jdz) {
        jew jew = jdz.f().contains(ShareCapability.STORY) ? this.U : jdz.f().contains(ShareCapability.MESSAGE) ? this.T : this.V;
        this.X = this.a.a(jdz, jew).a(this.b).a((Action) new $$Lambda$jdp$BwGk4vFyxSqAWQgJoj5OfJ5nuzI(this), (Consumer<? super Throwable>) new $$Lambda$jdp$vazO7MRpoSqHIgGSOHP_Bj5V6aE<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ah() {
        Toast.makeText(n(), "Share completed", 0).show();
    }

    public final void B() {
        this.X.bd_();
        Bitmap bitmap = this.Y;
        if (bitmap != null) {
            bitmap.recycle();
        }
        super.B();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.share_api_test_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.share_destinations_recycler_view);
        jdt jdt = new jdt((Context) fbp.a(n()), new $$Lambda$jdp$qXLZY2Sw5DZw18FPDHXIxKPRYuo(this), this.a.a());
        recyclerView.a((h) new ob(n(), 1), -1);
        recyclerView.a((a) jdt);
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.aW;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.DEBUG, null);
    }

    public final uqm ag() {
        return uqo.aQ;
    }

    public final String b(Context context) {
        return "Test Share Api";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        Map singletonMap = Collections.singletonMap("redirect", "1");
        String str = "spotify:track:6Vjk8MNXpQpi0F4BefdTyq";
        String str2 = "spotify:playlist:37i9dQZF1DWXRqgorJj26U";
        this.T = jev.a(str).c("Check this awesome track").b(str2).a(singletonMap).a();
        this.Y = BitmapFactory.decodeResource(o().getResources(), R.drawable.ic_spotify_icon_rgb_green);
        this.U = jex.a(str).b(str2).a(this.Y).a(singletonMap).a();
        a aVar = new a();
        aVar.a = str;
        this.V = aVar.a(str2).a(singletonMap).a();
    }

    public final String e() {
        return "test-share-api";
    }
}
