package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.EnumSet;

/* renamed from: txx reason: default package */
public final class txx implements rev<Button> {
    private final Flowable<PlayerState> a;
    private final tyd b;
    private CompositeDisposable c = new CompositeDisposable();
    private String d;
    private String e;

    public final int b() {
        return R.id.shuffle_play_confusion_button_id;
    }

    public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, a aVar, int[] iArr) {
        haq.a((View) (Button) view, gzt, aVar, iArr);
    }

    public final /* synthetic */ void a(View view, gzt gzt, gum gum, b bVar) {
        Button button = (Button) view;
        this.e = fax.b(gzt.text().title());
        this.d = (String) Optional.c(gzt.events().get("click")).a((Function<? super T, V>) $$Lambda$txx$IceulBH3MoW0SXjmTwVzlL_zdSU.INSTANCE).a("");
        jqd.a(button.getContext(), button, (SpotifyIconV2) a.a.a(fax.c(gzt.images().icon())).d(), this.e);
        guj.a(gum, (View) button, gzt);
        this.c.bf_();
        this.c = new CompositeDisposable();
        CompositeDisposable compositeDisposable = this.c;
        Flowable c2 = this.a.c((io.reactivex.functions.Function<? super T, ? extends R>) new $$Lambda$txx$s46DuRESysnI9t4XRBv_ix4QSvA<Object,Object>(this)).c((io.reactivex.functions.Function<? super T, ? extends R>) new $$Lambda$txx$JDgVeeCPEUI2kaUmcTEpeWHixU<Object,Object>(this));
        button.getClass();
        compositeDisposable.a(c2.a((Consumer<? super T>) new $$Lambda$21RFyOA5k8VeZFT2I2pHWl4hpI<Object>(button), (Consumer<? super Throwable>) new $$Lambda$txx$3KH4rPQn5HqkvVWSKDZhNaqVNg<Object>(this)));
        CompositeDisposable compositeDisposable2 = this.c;
        fnr.a(button, "view == null");
        compositeDisposable2.a(new fnt(button, false).a((Consumer<? super T>) new $$Lambda$txx$FcReb1fvPefNSY4OSm3GRkyek<Object>(this), (Consumer<? super Throwable>) new $$Lambda$txx$3r7K4PTBvzPpTzKgrL21yJDb5E<Object>(this)));
    }

    public txx(Flowable<PlayerState> flowable, tyd tyd) {
        String str = "";
        this.d = str;
        this.e = str;
        this.a = flowable;
        this.b = tyd;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String a(Boolean bool) {
        tyd tyd = this.b;
        String str = this.e;
        if (bool.booleanValue()) {
            switch (AnonymousClass1.a[tyd.b.b().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    str = tyd.a.getString(R.string.spc_pause);
                    break;
                default:
                    return str;
            }
        } else {
            switch (AnonymousClass1.a[tyd.b.b().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return tyd.a.getString(R.string.spc_start_radio);
                case 4:
                    return tyd.a.getString(R.string.spc_start_mix);
                case 5:
                    return tyd.a.getString(R.string.spc_play_radio);
                case 6:
                    return tyd.a.getString(R.string.spc_play_mix);
            }
        }
        return str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        this.c.bf_();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Object obj) {
        this.c.bf_();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.c.bf_();
    }

    /* access modifiers changed from: private */
    public boolean a(PlayerState playerState) {
        return playerState.contextUri().equals(this.d) && playerState.isPlaying() && !playerState.isPaused();
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gum gum) {
        fzz.a();
        Button a2 = a.a(viewGroup.getContext());
        a2.setId(R.id.shuffle_play_confusion_button_id);
        return a2;
    }
}
