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

/* renamed from: uel reason: default package */
public final class uel {
    final jtz a;
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
    private uem l;

    /* renamed from: uel$a */
    public interface a {
        void a(uem uem);
    }

    /* renamed from: uel$b */
    public interface b {
        Observable<uem> b();
    }

    public uel(Context context, b bVar, jtz jtz, Scheduler scheduler) {
        this.i = bVar;
        this.a = jtz;
        this.j = scheduler;
        Resources resources = context.getResources();
        this.b = vfj.b(64.0f, resources);
        this.c = vfj.b(64.0f, resources);
        this.d = vfj.b(4.0f, resources);
        this.e = (float) vfj.b(2.0f, resources);
        float b2 = (float) vfj.b(20.0f, resources);
        this.f = new SpotifyIconDrawable(context, SpotifyIconV2.PLAY, b2);
        this.g = new SpotifyIconDrawable(context, SpotifyIconV2.PAUSE, b2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uem uem) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.a(uem);
            } else {
                it.remove();
            }
        }
        a();
        this.l = uem;
    }

    public void a() {
        if (this.h.isEmpty()) {
            this.k.bd_();
            this.l = null;
        }
    }

    public final void a(a aVar) {
        this.h.add(new WeakReference(aVar));
        if (this.k.b()) {
            this.k = this.i.b().a(this.j).a((Consumer<? super T>) new $$Lambda$uel$XHGzken0EAS5WvoTdIMqe3rwt7k<Object>(this), (Consumer<? super Throwable>) $$Lambda$uel$GP_4_EDzymweqrdZAX5RUCpEJ4.INSTANCE);
        }
        uem uem = this.l;
        if (uem != null) {
            aVar.a(uem);
        }
    }
}
