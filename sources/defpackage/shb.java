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

/* renamed from: shb reason: default package */
public final class shb implements a {
    private final Picasso a;
    private final Context b;
    private final Uri c;
    private final a d;
    private Emitter<shc> e;
    private int f;
    private final ues g = new ues(uer.a);

    public shb(Picasso picasso, Context context, Uri uri) {
        this.a = picasso;
        this.b = context;
        this.c = uri;
        this.g.a(this);
        this.d = new a();
        this.f = fr.c(this.b, R.color.cat_button_primary_text);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ObservableEmitter observableEmitter) {
        this.e = observableEmitter;
        this.a.a(this.c).a(gaa.c(this.b)).b(gaa.c(this.b)).a(this.g.a());
        observableEmitter.a((Cancellable) new $$Lambda$shb$m8p3JGe9vANGA_8jmoASxL3Z4HI(this));
    }

    private void b() {
        Emitter<shc> emitter = this.e;
        if (emitter != null) {
            emitter.a(this.d.a());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.e = null;
    }

    public final Observable<shc> a() {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$shb$kjRQaYeJmHYkINVvDAQyUNm7tkE<T>(this));
    }

    public final void a(Bitmap bitmap, LoadedFrom loadedFrom, nq nqVar) {
        this.d.a(nqVar == null ? this.f : nqVar.b(this.f)).a(bitmap).a((Drawable) null).b(ueu.a(nqVar, -11316397));
        b();
    }

    public final void a(Drawable drawable) {
        this.d.a((Bitmap) null).a(drawable).a(this.f).b(-11316397);
        b();
    }

    public final void b(Drawable drawable) {
        this.d.a((Bitmap) null).a(drawable).a(this.f).b(-11316397);
        b();
    }
}
