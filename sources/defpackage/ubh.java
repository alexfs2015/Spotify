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

/* renamed from: ubh reason: default package */
public final class ubh {

    /* renamed from: ubh$a */
    static class a {
        public vsr a;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    public static ObservableTransformer<defpackage.ube.a, ubf> a(Context context, Picasso picasso, Scheduler scheduler) {
        return new $$Lambda$ubh$oZVH5jhXvGIlPGugveYlVGMM04(scheduler, context, picasso, new a(0));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(Context context, Picasso picasso, a aVar, Scheduler scheduler, defpackage.ube.a aVar2) {
        int color = context.getResources().getColor(ubt.a(aVar2.b));
        if (!aVar2.a.b()) {
            return Observable.b(Integer.valueOf(color));
        }
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$ubh$xBKSDCQVNWv2OuMJcuBFrW2eVY<T>(aVar, picasso, color, (String) aVar2.a.c())).a(5, TimeUnit.SECONDS, scheduler, (SingleSource<? extends T>) Single.b(Integer.valueOf(color))).d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, Picasso picasso, final int i, String str, final SingleEmitter singleEmitter) {
        if (aVar.a != null) {
            picasso.d(aVar.a);
        }
        aVar.a = new vsr() {
            public final void b(Drawable drawable) {
            }

            public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                fay.a(!bitmap.isRecycled());
                uus.a(bitmap).a(new $$Lambda$ubh$1$fN2MPfta5j6rX0BIBLscED9IN4(singleEmitter, i));
                fay.a(!bitmap.isRecycled());
            }

            public final void a(Drawable drawable) {
                singleEmitter.a(Integer.valueOf(i));
            }
        };
        picasso.a(str).a(aVar.a);
    }

    public static Consumer<e> a(Context context, uci uci) {
        return new $$Lambda$ubh$XvIS3Yh_VJmYFdHkgY2ruphxso(context, uci);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, uci uci, e eVar) {
        ((Activity) context).startActivityForResult(ScannableActivity.a(context), 1001);
        uci.a("scan-code", -1);
    }

    public static Consumer<d> a(defpackage.uay.a aVar) {
        return new $$Lambda$ubh$abGbBcpvUpejUJ339nSRPk2cWMM(aVar);
    }

    public static Consumer<f> a(Context context, iww iww) {
        return new $$Lambda$ubh$n7C3WHdznKnN6OGSbEeOENq1_g8(iww, context);
    }

    public static Consumer<g> a(udm udm, uci uci, ubi ubi) {
        return new $$Lambda$ubh$UYUObKytBvHUwJTCZdgyc7QUA8(udm, ubi, uci);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(udm udm, ubi ubi, uci uci, g gVar) {
        $$Lambda$ubh$mWZew4pLjnePxsQrgQuaSSzg4c4 r3 = new $$Lambda$ubh$mWZew4pLjnePxsQrgQuaSSzg4c4(ubi, uci);
        uci.getClass();
        udm.a((b) r3, (defpackage.udm.a) new $$Lambda$gqAc0SXuJfdYvLZv3vc_LYt_3G4(uci));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ubi ubi, uci uci) {
        ubi.accept(ubf.a(true));
        uci.a("confirm-end-session", "confirm-end-session-dialog", -1);
    }

    public static Consumer<h> a(udm udm) {
        return new $$Lambda$ubh$_4uH091l6NYChMaa27wnOXEyIJo(udm);
    }

    public static ObservableTransformer<b, ubf> a(Context context, uau uau, uwj uwj, Scheduler scheduler) {
        return new $$Lambda$ubh$AT2X7Es21SovVBlasGWPV_sURWA(uau, scheduler, uwj, context);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(uau uau, Scheduler scheduler, uwj uwj, Context context, b bVar) {
        Completable completable;
        Completable a2 = uau.b().a(scheduler);
        if (bVar.b) {
            completable = uwj.a(uwl.a(PauseCommand.builder().options(CommandOptions.builder().onlyForLocalDevice(true).build()).build())).b();
        } else {
            completable = Completable.a();
        }
        return a2.a((CompletableSource) completable).b((Action) new $$Lambda$ubh$9KtlyMmBiVi4cGbqZsvKwc17t_k(bVar, context)).a((ObservableSource<T>) Observable.d());
    }

    public static ObservableTransformer<c, ubf> a(uau uau) {
        return new $$Lambda$ubh$veJlIuACSoCHp8vxQgz8oInX_A(uau);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar, Context context) {
        if (bVar.a) {
            ((Activity) context).finish();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(iww iww, Context context, f fVar) {
        iww iww2 = iww;
        iww2.a(fVar.a, "", "", "", context.getString(R.string.social_listening_share_session_message_subtitle), "", jnu.a);
    }
}
