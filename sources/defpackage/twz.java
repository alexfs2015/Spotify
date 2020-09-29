package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: twz reason: default package */
public final class twz {
    final txc a;
    final jrp b;
    final int c;
    final int d;
    final float e;
    final SpotifyIconDrawable f;
    final SpotifyIconDrawable g;
    final Drawable h;
    public final List<WeakReference<a>> i = new ArrayList();
    private final heg j;
    private Disposable k = Disposables.b();
    private txh l;

    /* renamed from: twz$a */
    public interface a {
        void a(txh txh);
    }

    public twz(Context context, txc txc, jrp jrp, heg heg) {
        this.a = txc;
        this.b = jrp;
        this.j = heg;
        Resources resources = context.getResources();
        this.c = uts.b(48.0f, resources);
        this.d = uts.b(48.0f, resources);
        this.e = (float) uts.b(2.0f, resources);
        float b2 = (float) uts.b(20.0f, resources);
        this.f = new SpotifyIconDrawable(context, SpotifyIconV2.PLAY, b2);
        this.g = new SpotifyIconDrawable(context, SpotifyIconV2.PAUSE, b2);
        this.h = context.getResources().getDrawable(R.drawable.icn_loading_indicator);
    }

    public final void a(a aVar) {
        this.i.add(new WeakReference(aVar));
        if (this.k.b()) {
            this.k = this.a.b().a(this.j.c()).a((Consumer<? super T>) new $$Lambda$twz$LnwocKMdui3WVySCjPLsSwuqY<Object>(this), (Consumer<? super Throwable>) $$Lambda$twz$Uec_LxHF6JqDjcRfU_Bwmll87Ko.INSTANCE);
        }
        txh txh = this.l;
        if (txh != null) {
            aVar.a(txh);
        }
    }

    public void a() {
        if (this.i.isEmpty()) {
            this.k.bf_();
            this.l = null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(txh txh) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.a(txh);
            } else {
                it.remove();
            }
        }
        a();
        this.l = txh;
    }
}
