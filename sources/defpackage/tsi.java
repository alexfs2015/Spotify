package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: tsi reason: default package */
public final class tsi {
    final jrp a;
    final int b;
    final int c;
    final int d;
    final float e;
    final SpotifyIconDrawable f;
    final SpotifyIconDrawable g;
    public final List<WeakReference<a>> h = new ArrayList();
    private final b i;
    private final Scheduler j;
    private Disposable k = Disposables.b();
    private tsj l;

    /* renamed from: tsi$a */
    public interface a {
        void a(tsj tsj);
    }

    /* renamed from: tsi$b */
    public interface b {
        Observable<tsj> b();
    }

    public tsi(Context context, b bVar, jrp jrp, Scheduler scheduler) {
        this.i = bVar;
        this.a = jrp;
        this.j = scheduler;
        Resources resources = context.getResources();
        this.b = uts.b(64.0f, resources);
        this.c = uts.b(64.0f, resources);
        this.d = uts.b(4.0f, resources);
        this.e = (float) uts.b(2.0f, resources);
        float b2 = (float) uts.b(20.0f, resources);
        this.f = new SpotifyIconDrawable(context, SpotifyIconV2.PLAY, b2);
        this.g = new SpotifyIconDrawable(context, SpotifyIconV2.PAUSE, b2);
    }

    public final void a(a aVar) {
        this.h.add(new WeakReference(aVar));
        if (this.k.b()) {
            this.k = this.i.b().a(this.j).a((Consumer<? super T>) new $$Lambda$tsi$6gAEuIGqnwTza8DObfscYJ3K4c<Object>(this), (Consumer<? super Throwable>) $$Lambda$tsi$e5LUiDD8f3ugHFNIfbLfefpIc2k.INSTANCE);
        }
        tsj tsj = this.l;
        if (tsj != null) {
            aVar.a(tsj);
        }
    }

    public void a() {
        if (this.h.isEmpty()) {
            this.k.bf_();
            this.l = null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(tsj tsj) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.a(tsj);
            } else {
                it.remove();
            }
        }
        a();
        this.l = tsj;
    }
}
