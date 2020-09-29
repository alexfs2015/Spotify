package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.features.user.model.DecoratedUser;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.util.Collections;
import java.util.Map;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: qpj reason: default package */
public final class qpj {
    private static final Policy a;
    private final qox b;
    private final qph c;
    private utt d;

    static {
        Map singletonMap = Collections.singletonMap("images", Boolean.TRUE);
        ListPolicy listPolicy = new ListPolicy();
        listPolicy.setListAttributes(singletonMap);
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        a = new Policy(decorationPolicy);
    }

    public static qpj a(Context context, RxResolver rxResolver, wug wug, wug wug2) {
        int b2 = uts.b(24.0f, context.getResources());
        return new qpj(qox.a(rxResolver, wug, wug2), new qph(b2, b2), uuz.a());
    }

    private qpj(qox qox, qph qph, utt utt) {
        this.b = qox;
        this.c = qph;
        this.d = utt;
    }

    public final wud<Optional<Drawable>> a() {
        return vun.a((wrf<T>) ((hvl) ggw.a(hvl.class)).a).f($$Lambda$KGsdFp7hwr4JnEfZ19jPX0Xzi_E.INSTANCE).c((wut<? super T, Boolean>) $$Lambda$qpj$byWo3F8WKhLq04tepQ_EibSeubU.INSTANCE).b().d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$qpj$xMFl2Vyo9ED0SCUc1e12uZknDQ<Object,Object>(this)).f($$Lambda$qpj$aHY_cSBhWbFWTvF1kwKBcsHVjk.INSTANCE).b().d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$qpj$8xgLn6d4RTWaygPYeEwiuJnYa5U<Object,Object>(this)).f(new $$Lambda$qpj$lYtNTX97XerrqpViGJ8jtLPXvdk(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud b(String str) {
        return this.b.a(str, a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(DecoratedUser decoratedUser) {
        if (decoratedUser == null || decoratedUser.images == null) {
            return null;
        }
        return decoratedUser.images.defaultUri;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return wud.a((a<T>) new a<Bitmap>(((uvt) ggw.a(uvt.class)).b(), str) {
                final /* synthetic */ uvf a;
                private /* synthetic */ String b;

                {
                    this.a = r2;
                    this.b = r3;
                }

                public final /* synthetic */ void call(Object obj) {
                    final wuj wuj = (wuj) obj;
                    this.a.a(!TextUtils.isEmpty(this.b) ? Uri.parse(this.b) : Uri.EMPTY).b(qph.this.a, qph.this.b).d().a((vsr) new vsr() {
                        public final void b(Drawable drawable) {
                        }

                        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                            fay.a(!bitmap.isRecycled());
                            wuj.onNext(bitmap);
                            wuj.onCompleted();
                            fay.a(!bitmap.isRecycled());
                        }

                        public final void a(Drawable drawable) {
                            wuj.onError(new Exception("Failed to load user image"));
                        }
                    });
                    wuj.add(new wuk() {
                        public final boolean isUnsubscribed() {
                            return false;
                        }

                        public final void unsubscribe() {
                            AnonymousClass1.this.a.a();
                        }
                    });
                }
            }).f($$Lambda$5G6d_sQL9jJrGeQsuQU7Yc78Cdc.INSTANCE);
        }
        return ScalarSynchronousObservable.d(Optional.e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional a(Optional optional) {
        if (optional.b()) {
            return Optional.b(this.d.createDrawable((Bitmap) optional.c()));
        }
        return Optional.e();
    }
}
