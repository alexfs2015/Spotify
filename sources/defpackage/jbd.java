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

/* renamed from: jbd reason: default package */
public final class jbd extends vtv implements jol, a {
    private jcj T;
    private jcl U;
    private jci V;
    private Disposable W = Disposables.a();
    private Bitmap Y;
    public izo a;
    public Scheduler b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "Test Share Api";
    }

    public final String e() {
        return "test-share-api";
    }

    /* access modifiers changed from: 0000 */
    public static jbd a(fpt fpt) {
        jbd jbd = new jbd();
        fpu.a((Fragment) jbd, fpt);
        return jbd;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.share_api_test_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.share_destinations_recycler_view);
        jbh jbh = new jbh((Context) fay.a(n()), new $$Lambda$jbd$K_R2e362CsNgKK9npIOYmdei83A(this), this.a.a());
        recyclerView.a((h) new nw(n(), 1), -1);
        recyclerView.a((a) jbh);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        Map singletonMap = Collections.singletonMap("redirect", "1");
        a aVar = new a();
        String str = "spotify:track:6Vjk8MNXpQpi0F4BefdTyq";
        aVar.a = str;
        String str2 = "spotify:playlist:37i9dQZF1DWXRqgorJj26U";
        this.T = aVar.b("Check this awesome track").a(str2).a(singletonMap).a();
        this.Y = BitmapFactory.decodeResource(o().getResources(), R.drawable.ic_spotify_icon_rgb_green);
        a aVar2 = new a();
        aVar2.a = str;
        this.U = aVar2.a(str2).a(this.Y).a(singletonMap).a();
        a aVar3 = new a();
        aVar3.a = str;
        this.V = aVar3.a(str2).a(singletonMap).a();
    }

    public final void B() {
        this.W.bf_();
        Bitmap bitmap = this.Y;
        if (bitmap != null) {
            bitmap.recycle();
        }
        super.B();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.DEBUG, null);
    }

    public final udr ag() {
        return udt.aQ;
    }

    /* access modifiers changed from: private */
    public void a(jbn jbn) {
        jck jck;
        if (jbn.e().contains(ShareCapability.STORY)) {
            jck = this.U;
        } else if (jbn.e().contains(ShareCapability.MESSAGE)) {
            jck = this.T;
        } else {
            jck = this.V;
        }
        this.W = this.a.a(jbn, jck).a(this.b).a((Action) new $$Lambda$jbd$DKroSFN4UfFMcsjZBQFEEPsE1fQ(this), (Consumer<? super Throwable>) new $$Lambda$jbd$ymi_4ZDyVBZJ5u6P6oQmVJB1PbI<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ah() {
        Toast.makeText(n(), "Share completed", 0).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Toast.makeText(n(), th.getMessage(), 0).show();
    }

    public final sih ae_() {
        return ViewUris.aX;
    }
}
