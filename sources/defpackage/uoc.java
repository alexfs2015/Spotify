package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.spotify.music.R;
import com.spotify.music.spotlets.scannables.view.ScannableActivity;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* renamed from: uoc reason: default package */
public final class uoc {

    /* renamed from: uoc$a */
    static class a {
        public wgx a;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(Context context, Picasso picasso, a aVar, Scheduler scheduler, defpackage.unz.a aVar2) {
        int color = context.getResources().getColor(uoo.a(aVar2.b));
        if (!aVar2.a.b()) {
            return Observable.b(Integer.valueOf(color));
        }
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$uoc$vLs33XjX5PIz0QmGXhVvk0NLSrE<T>(aVar, picasso, color, (String) aVar2.a.c())).a(5, TimeUnit.SECONDS, scheduler, (SingleSource<? extends T>) Single.b(Integer.valueOf(color))).d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(unp unp, Scheduler scheduler, via via, Context context, b bVar) {
        return unp.b().a(scheduler).a((CompletableSource) bVar.b ? via.a(vic.a(PauseCommand.builder().options(CommandOptions.builder().onlyForLocalDevice(true).build()).build())).b() : Completable.a()).b((Action) new $$Lambda$uoc$6ERcCnEtIA1GiA5vABd5AMldNE(bVar, context)).a((ObservableSource<T>) Observable.d());
    }

    public static ObservableTransformer<defpackage.unz.a, uoa> a(Context context, Picasso picasso, Scheduler scheduler) {
        return new $$Lambda$uoc$XWcWXolH7GGSVblzbbLVitPH3Q(scheduler, context, picasso, new a(0));
    }

    public static ObservableTransformer<b, uoa> a(Context context, unp unp, via via, Scheduler scheduler) {
        return new $$Lambda$uoc$Ay7yBZfoitDOhIpYEhpBy1jeA7s(unp, scheduler, via, context);
    }

    public static ObservableTransformer<c, uoa> a(unp unp) {
        return new $$Lambda$uoc$pxj_O1JOx9WdHnhKvacxeRRlbXE(unp);
    }

    public static Consumer<f> a(Context context, izh izh) {
        return new $$Lambda$uoc$kIHqjWJ6vY5QEhnbv5tEvXc0Cgo(izh, context);
    }

    public static Consumer<e> a(Context context, upd upd) {
        return new $$Lambda$uoc$ptTlnOHc8LA5vUvjKwAw54xtdzA(context, upd);
    }

    public static Consumer<d> a(defpackage.unt.a aVar) {
        return new $$Lambda$uoc$eXa2DnJUDZmyEtD8HEuqUXIZiQ(aVar);
    }

    public static Consumer<h> a(uqh uqh) {
        return new $$Lambda$uoc$jfrunkcrdvQqeuobB8ldir2NUw(uqh);
    }

    public static Consumer<g> a(uqh uqh, upd upd, uod uod) {
        return new $$Lambda$uoc$nK4wIAqpEjjKoQxFNGE3uAXWTA(uqh, uod, upd);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, upd upd, e eVar) {
        ((Activity) context).startActivityForResult(ScannableActivity.a(context), 1001);
        upd.a("scan-code", -1);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(izh izh, Context context, f fVar) {
        izh izh2 = izh;
        izh2.a(fVar.a, "", "", "", context.getString(R.string.social_listening_share_session_message_subtitle), "", jqg.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar, Context context) {
        if (bVar.a) {
            ((Activity) context).finish();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, Picasso picasso, final int i, String str, final SingleEmitter singleEmitter) {
        if (aVar.a != null) {
            picasso.d(aVar.a);
        }
        aVar.a = new wgx() {
            public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                fbp.a(!bitmap.isRecycled());
                vgj.a(bitmap).a(new $$Lambda$uoc$1$auDsn7K2q__QSOcOQ1BrJsjjBs(singleEmitter, i));
                fbp.a(!bitmap.isRecycled());
            }

            public final void a(Drawable drawable) {
                singleEmitter.a(Integer.valueOf(i));
            }

            public final void b(Drawable drawable) {
            }
        };
        picasso.a(str).a(aVar.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(uod uod, upd upd) {
        uod.accept(uoa.a(true));
        upd.a("confirm-end-session", "confirm-end-session-dialog", -1);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(uqh uqh, uod uod, upd upd, g gVar) {
        $$Lambda$uoc$MYBzPDdvC_wq0Ns45BV61V8r6zU r3 = new $$Lambda$uoc$MYBzPDdvC_wq0Ns45BV61V8r6zU(uod, upd);
        upd.getClass();
        uqh.a((b) r3, (defpackage.uqh.a) new $$Lambda$N_De5k2TXfQ_oKrQOZwpJbejdMQ(upd));
    }
}
