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

/* renamed from: uks reason: default package */
public final class uks implements rnx<Button> {
    private final Flowable<PlayerState> a;
    private final uky b;
    private CompositeDisposable c = new CompositeDisposable();
    private String d;
    private String e;

    public uks(Flowable<PlayerState> flowable, uky uky) {
        String str = "";
        this.d = str;
        this.e = str;
        this.a = flowable;
        this.b = uky;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String a(Boolean bool) {
        uky uky = this.b;
        String str = this.e;
        if (bool.booleanValue()) {
            switch (AnonymousClass1.a[uky.b.b().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    str = uky.a.getString(R.string.spc_pause);
                    break;
                default:
                    return str;
            }
        } else {
            switch (AnonymousClass1.a[uky.b.b().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return uky.a.getString(R.string.spc_start_radio);
                case 4:
                    return uky.a.getString(R.string.spc_start_mix);
                case 5:
                    return uky.a.getString(R.string.spc_play_radio);
                case 6:
                    return uky.a.getString(R.string.spc_play_mix);
            }
        }
        return str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Object obj) {
        this.c.bd_();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.c.bd_();
    }

    /* access modifiers changed from: private */
    public boolean a(PlayerState playerState) {
        return playerState.contextUri().equals(this.d) && playerState.isPlaying() && !playerState.isPaused();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        this.c.bd_();
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
        gat.a();
        Button a2 = a.a(viewGroup.getContext());
        a2.setId(R.id.shuffle_play_confusion_button_id);
        return a2;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, a aVar, int[] iArr) {
        hdj.a((View) (Button) view, hcm, aVar, iArr);
    }

    public final /* synthetic */ void a(View view, hcm hcm, gwm gwm, b bVar) {
        Button button = (Button) view;
        this.e = fbo.b(hcm.text().title());
        this.d = (String) Optional.c(hcm.events().get("click")).a((Function<? super T, V>) $$Lambda$uks$7OVM1F71o0xgUPNhDsNVdkvMUHo.INSTANCE).a("");
        jso.a(button.getContext(), button, (SpotifyIconV2) a.a.a(fbo.c(hcm.images().icon())).d(), this.e);
        gwj.a(gwm, (View) button, hcm);
        this.c.bd_();
        this.c = new CompositeDisposable();
        CompositeDisposable compositeDisposable = this.c;
        Flowable c2 = this.a.c((io.reactivex.functions.Function<? super T, ? extends R>) new $$Lambda$uks$3iqaUFXT7Hb_nAvDRPtrPuhS3mE<Object,Object>(this)).c((io.reactivex.functions.Function<? super T, ? extends R>) new $$Lambda$uks$LeIDsN_liyimLauLVydP2rYIbvs<Object,Object>(this));
        button.getClass();
        compositeDisposable.a(c2.a((Consumer<? super T>) new $$Lambda$21RFyOA5k8VeZFT2I2pHWl4hpI<Object>(button), (Consumer<? super Throwable>) new $$Lambda$uks$ZvXbn4po5pJUiImXdx_DWd5tCLs<Object>(this)));
        CompositeDisposable compositeDisposable2 = this.c;
        fol.a(button, "view == null");
        compositeDisposable2.a(new fon(button, false).a((Consumer<? super T>) new $$Lambda$uks$2tG2XS_VJlxOm_xckOxSAeJwzZU<Object>(this), (Consumer<? super Throwable>) new $$Lambda$uks$3N2O9bwwIObxGmYZJgSPXgHZ4<Object>(this)));
    }

    public final int b() {
        return R.id.shuffle_play_confusion_button_id;
    }
}
