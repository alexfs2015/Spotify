package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;

/* renamed from: rxr reason: default package */
public final class rxr implements a {
    private final Picasso a;
    private final Context b;
    private final Uri c;
    private final a d;
    private Emitter<rxs> e;
    private int f;
    private final tsp g = new tsp(tso.a);

    public rxr(Picasso picasso, Context context, Uri uri) {
        this.a = picasso;
        this.b = context;
        this.c = uri;
        this.g.a(this);
        this.d = new a();
        this.f = fr.c(this.b, R.color.cat_button_primary_text);
    }

    public final void a(Drawable drawable) {
        this.d.a((Bitmap) null).a(drawable).a(this.f).b(-11316397);
        b();
    }

    public final void b(Drawable drawable) {
        this.d.a((Bitmap) null).a(drawable).a(this.f).b(-11316397);
        b();
    }

    public final Observable<rxs> a() {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$rxr$_GoI5mvLEQPV2w0aWWC5pmrV0w<T>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ObservableEmitter observableEmitter) {
        this.e = observableEmitter;
        this.a.a(this.c).a(fzg.c(this.b)).b(fzg.c(this.b)).a(this.g.a());
        observableEmitter.a((Cancellable) new $$Lambda$rxr$urx5j5Xt0_lgPb6oSnL5YfKKM(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.e = null;
    }

    private void b() {
        Emitter<rxs> emitter = this.e;
        if (emitter != null) {
            emitter.a(this.d.a());
        }
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom, nl nlVar) {
        int i;
        int a2 = tsr.a(nlVar, -11316397);
        a aVar = this.d;
        if (nlVar == null) {
            i = this.f;
        } else {
            i = nlVar.b(this.f);
        }
        aVar.a(i).a(bitmap).a((Drawable) null).b(a2);
        b();
    }
}
