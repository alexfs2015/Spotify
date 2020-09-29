package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: mpt reason: default package */
public class mpt extends jor implements jol, mpw, a, udv {
    public mqe T;
    public gum U;
    private gup V;
    private Disposable W;
    public mqu a;
    public mqv b;

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(a aVar) {
        return aVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(b bVar) {
        return bVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(c cVar) {
        return cVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(d dVar) {
        return dVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(e eVar) {
        return eVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(f fVar) {
        return fVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(g gVar) {
        return gVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(h hVar) {
        return hVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(i iVar) {
        return iVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(j jVar) {
        return jVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(k kVar) {
        return kVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(l lVar) {
        return lVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(m mVar) {
        return mVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(n nVar) {
        return nVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(o oVar) {
        return oVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(p pVar) {
        return pVar;
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "spotify:followfeed";
    }

    public static mpt ah() {
        return new mpt();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.W = this.T.a.c((Function<? super T, ? extends R>) $$Lambda$mpt$MtpcBXOWjj1BYdZIe8KwMSAHdT4.INSTANCE).a(klb.a((c<M, E, F>) this.a.a(), mrj.a)).a(AndroidSchedulers.a()).c((Function<? super T, ? extends R>) new $$Lambda$mpt$N0apUpqEag4dNnLk00tNdCduDpY<Object,Object>(this)).a((Consumer<? super T>) new $$Lambda$mpt$oSr8AQEXhAIPTvSF9b04q2T0Lw<Object>(this), (Consumer<? super Throwable>) $$Lambda$mpt$eUThhNlzOr6JHAffujV8YESW_EM.INSTANCE);
        mqc mqc = new mqc(n(), viewGroup);
        this.V = new gup(this.U, mqc);
        return mqc.a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(mrj mrj) {
        return mqv.a(mrj);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mrh a(mrh mrh) {
        return (mrh) mrh.a($$Lambda$mpt$hrIzkHMKiR8WFR2kpWH7xiFuI48.INSTANCE, $$Lambda$mpt$EmoVM6qbNyDCVHw1EmjMy4q51g.INSTANCE, $$Lambda$mpt$_VRSfD2zGTFVruImH7TLUghiSA.INSTANCE, $$Lambda$mpt$hsPsyMKKH7IMl0GqgaHkc00neo.INSTANCE, $$Lambda$mpt$faWYkK0HSsmlMdw7ZOKaaueQlnQ.INSTANCE, $$Lambda$mpt$20_TjNvL83ykRONSFDcSaTkNjTU.INSTANCE, $$Lambda$mpt$yIc0F8ARA7uvIKqdPoNrCeqZtY.INSTANCE, $$Lambda$mpt$WfBhOFkZK6UEztWG_eSeL8GG1E.INSTANCE, $$Lambda$mpt$M_g8dqzqgG2sE1YQ8uNl7NGyiho.INSTANCE, $$Lambda$mpt$JiZK6ebHd78hwQjpzX8ZN7Qx3tY.INSTANCE, $$Lambda$mpt$rrI11DbFjqKzQNgos5jRAXNSUok.INSTANCE, $$Lambda$mpt$LAVf7k6Of0SghLepz2OIASUPXM4.INSTANCE, $$Lambda$mpt$yDqr1sPIe_FdDUR3X1m8PebFI4Y.INSTANCE, $$Lambda$mpt$Cv4FmjDZB_qjkaBjw9NpQF5Whu8.INSTANCE, $$Lambda$mpt$2ZPBTGkaHEQENJeHo4obX2OIAtY.INSTANCE, $$Lambda$mpt$FKALz0qSqzk4fVRnEqywXh8zZ1Y.INSTANCE);
    }

    /* access modifiers changed from: private */
    public void a(gzz gzz) {
        this.V.a(gzz, false);
    }

    public final void B() {
        super.B();
        this.W.bf_();
    }

    public final String b(Context context) {
        return context.getString(R.string.follow_feed_default_title);
    }

    public final rdh af() {
        return rdh.a(aj(), null);
    }

    public final udr ag() {
        return udt.W;
    }

    public final gjf aj() {
        return new gjf() {
            public final String a() {
                return "followfeed";
            }
        };
    }

    public final void ai() {
        Toast.makeText(n(), "Show Context Menu", 0).show();
    }

    public final void ak() {
        Toast.makeText(n(), "Show artist context menu ", 0).show();
    }

    public void al() {
        Toast.makeText(n(), "Network Error", 0).show();
    }

    public final sih ae_() {
        return ViewUris.aO;
    }
}
