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

/* renamed from: ujc reason: default package */
public final class ujc {
    final ujf a;
    final jtz b;
    final int c;
    final int d;
    final float e;
    final SpotifyIconDrawable f;
    final SpotifyIconDrawable g;
    final Drawable h;
    public final List<WeakReference<a>> i = new ArrayList();
    private final hhc j;
    private Disposable k = Disposables.b();
    private ujk l;

    /* renamed from: ujc$a */
    public interface a {
        void a(ujk ujk);
    }

    public ujc(Context context, ujf ujf, jtz jtz, hhc hhc) {
        this.a = ujf;
        this.b = jtz;
        this.j = hhc;
        Resources resources = context.getResources();
        this.c = vfj.b(48.0f, resources);
        this.d = vfj.b(48.0f, resources);
        this.e = (float) vfj.b(2.0f, resources);
        float b2 = (float) vfj.b(20.0f, resources);
        this.f = new SpotifyIconDrawable(context, SpotifyIconV2.PLAY, b2);
        this.g = new SpotifyIconDrawable(context, SpotifyIconV2.PAUSE, b2);
        this.h = context.getResources().getDrawable(R.drawable.icn_loading_indicator);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ujk ujk) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.a(ujk);
            } else {
                it.remove();
            }
        }
        a();
        this.l = ujk;
    }

    public void a() {
        if (this.i.isEmpty()) {
            this.k.bd_();
            this.l = null;
        }
    }

    public final void a(a aVar) {
        this.i.add(new WeakReference(aVar));
        if (this.k.b()) {
            this.k = this.a.b().a(this.j.c()).a((Consumer<? super T>) new $$Lambda$ujc$NDghNahj5X_jW35Z_LRbFaUjCrI<Object>(this), (Consumer<? super Throwable>) $$Lambda$ujc$necnts5hxkKA6R6LUgpv6uxKoQ.INSTANCE);
        }
        ujk ujk = this.l;
        if (ujk != null) {
            aVar.a(ujk);
        }
    }
}
