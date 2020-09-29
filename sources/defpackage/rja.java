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

/* renamed from: rja reason: default package */
public final class rja implements rev<View> {
    final CompositeDisposable a = new CompositeDisposable();
    private final Picasso b;
    private final Scheduler c;
    private final Flowable<PlayerState> d;
    private String e;

    public final void a(View view, gzt gzt, a<View> aVar, int... iArr) {
    }

    public final int b() {
        return R.id.home_promotion_component;
    }

    public rja(Picasso picasso, Flowable<PlayerState> flowable, Scheduler scheduler, a aVar) {
        this.b = picasso;
        this.d = flowable;
        this.c = scheduler;
        aVar.a(new c() {
            public final void a() {
                Logger.b("Stopping PlayerState subscription in Playable card component", new Object[0]);
                rja.this.a.c();
            }
        });
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        rjf rjf = new rjf(this.b, viewGroup);
        fqf.a(rjf);
        return rjf.getView();
    }

    public final void a(View view, gzt gzt, gum gum, b bVar) {
        rjg rjg = (rjg) fqf.a(view, rjg.class);
        a(rjg, gzt);
        gzw background = gzt.images().background();
        String str = null;
        rjg.a(background != null ? background.uri() : null, background != null ? background.placeholder() : null);
        rjg.b(gzt.text().subtitle());
        rjg.c(gzt.custom().string("metadata"));
        rjg.d(gzt.custom().string("label"));
        has.a(gum.c).a("click").a(gzt).a(rjg.getView()).a();
        String str2 = "logo";
        gzw gzw = (gzw) gzt.images().custom().get(str2);
        if (!TextUtils.isEmpty(gzw != null ? gzw.uri() : null)) {
            gzw gzw2 = (gzw) gzt.images().custom().get(str2);
            if (gzw2 != null) {
                str = gzw2.uri();
            }
            rjg.c(str, gzt.text().title());
        } else {
            a(rjg, gzt);
            gzw main = gzt.images().main();
            String uri = main != null ? main.uri() : null;
            if (main != null) {
                str = main.placeholder();
            }
            rjg.b(uri, str);
        }
        String str3 = "promotionPlayClick";
        if (gzt.events().containsKey(str3)) {
            gzp gzp = (gzp) gzt.events().get(str3);
            if (gzp != null) {
                this.e = gzp.data().string("uri");
                this.a.c();
                this.a.a(this.d.a(this.c).a((Consumer<? super T>) new $$Lambda$rja$43dYi_8AsvuVPmaC5cfN9l7RtM<Object>(this, rjg), (Consumer<? super Throwable>) $$Lambda$rja$b4W5ADRGdRWopPIliP3JA8QezWc.INSTANCE));
            }
            has.a(gum.c).a(str3).a(gzt).a(rjg.c()).a();
        }
    }

    private static void a(rjg rjg, gzt gzt) {
        rjg.a(gzt.text().title());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rjg rjg, PlayerState playerState) {
        if (rjd.a(playerState, this.e)) {
            rjg.b();
        } else {
            rjg.a();
        }
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }
}
