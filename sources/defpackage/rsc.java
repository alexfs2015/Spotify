package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.EnumSet;

/* renamed from: rsc reason: default package */
public final class rsc implements rnx<View> {
    final CompositeDisposable a = new CompositeDisposable();
    private final Picasso b;
    private final Scheduler c;
    private final Flowable<PlayerState> d;
    private String e;

    public rsc(Picasso picasso, Flowable<PlayerState> flowable, Scheduler scheduler, a aVar) {
        this.b = picasso;
        this.d = flowable;
        this.c = scheduler;
        aVar.a(new c() {
            public final void a() {
                Logger.b("Stopping PlayerState subscription in Playable card component", new Object[0]);
                rsc.this.a.c();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rsi rsi, PlayerState playerState) {
        if (rsf.a(playerState, this.e)) {
            rsi.b();
        } else {
            rsi.a();
        }
    }

    private static void a(rsi rsi, hcm hcm) {
        rsi.a(hcm.text().title());
    }

    public final View a(ViewGroup viewGroup, gwm gwm) {
        rsh rsh = new rsh(this.b, viewGroup);
        fqz.a(rsh);
        return rsh.getView();
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final void a(View view, hcm hcm, a<View> aVar, int... iArr) {
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
        rsi rsi = (rsi) fqz.a(view, rsi.class);
        a(rsi, hcm);
        hcp background = hcm.images().background();
        String str = null;
        rsi.a(background != null ? background.uri() : null, background != null ? background.placeholder() : null);
        rsi.b(hcm.text().subtitle());
        rsi.c(hcm.custom().string("metadata"));
        rsi.d(hcm.custom().string("label"));
        hdl.a(gwm.c).a("click").a(hcm).a(rsi.getView()).a();
        String str2 = "logo";
        hcp hcp = (hcp) hcm.images().custom().get(str2);
        if (!TextUtils.isEmpty(hcp != null ? hcp.uri() : null)) {
            hcp hcp2 = (hcp) hcm.images().custom().get(str2);
            if (hcp2 != null) {
                str = hcp2.uri();
            }
            rsi.c(str, hcm.text().title());
        } else {
            a(rsi, hcm);
            hcp main = hcm.images().main();
            String uri = main != null ? main.uri() : null;
            if (main != null) {
                str = main.placeholder();
            }
            rsi.b(uri, str);
        }
        String str3 = "promotionPlayClick";
        if (hcm.events().containsKey(str3)) {
            hci hci = (hci) hcm.events().get(str3);
            if (hci != null) {
                this.e = hci.data().string("uri");
                this.a.c();
                this.a.a(this.d.a(this.c).a((Consumer<? super T>) new $$Lambda$rsc$AotZW8rAVMWftz7foCQHsFXD_vU<Object>(this, rsi), (Consumer<? super Throwable>) $$Lambda$rsc$rPnVfz9BYudvyjaYhrr05H1Jcxo.INSTANCE));
            }
            hdl.a(gwm.c).a(str3).a(hcm).a(rsi.c()).a();
        }
    }

    public final int b() {
        return R.id.home_promotion_component;
    }
}
