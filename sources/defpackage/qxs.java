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

/* renamed from: qxs reason: default package */
public final class qxs {
    private static final Policy a;
    private final qxg b;
    private final qxq c;
    private vfk d;

    static {
        Map singletonMap = Collections.singletonMap("images", Boolean.TRUE);
        ListPolicy listPolicy = new ListPolicy();
        listPolicy.setListAttributes(singletonMap);
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        a = new Policy(decorationPolicy);
    }

    private qxs(qxg qxg, qxq qxq, vfk vfk) {
        this.b = qxg;
        this.c = qxq;
        this.d = vfk;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional a(Optional optional) {
        return optional.b() ? Optional.b(this.d.createDrawable((Bitmap) optional.c())) : Optional.e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(DecoratedUser decoratedUser) {
        if (decoratedUser == null || decoratedUser.images == null) {
            return null;
        }
        return decoratedUser.images.defaultUri;
    }

    public static qxs a(Context context, RxResolver rxResolver, xil xil, xil xil2) {
        int b2 = vfj.b(24.0f, context.getResources());
        return new qxs(qxg.a(rxResolver, xil, xil2), new qxq(b2, b2), vgq.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(String str) {
        return !TextUtils.isEmpty(str) ? xii.a((a<T>) new a<Bitmap>(((vhj) gih.a(vhj.class)).b(), str) {
            final /* synthetic */ vgw a;
            private /* synthetic */ String b;

            {
                this.a = r2;
                this.b = r3;
            }

            public final /* synthetic */ void call(Object obj) {
                final xio xio = (xio) obj;
                this.a.a(!TextUtils.isEmpty(this.b) ? Uri.parse(this.b) : Uri.EMPTY).b(qxq.this.a, qxq.this.b).d().a((wgx) new wgx() {
                    public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                        fbp.a(!bitmap.isRecycled());
                        xio.onNext(bitmap);
                        xio.onCompleted();
                        fbp.a(!bitmap.isRecycled());
                    }

                    public final void a(Drawable drawable) {
                        xio.onError(new Exception("Failed to load user image"));
                    }

                    public final void b(Drawable drawable) {
                    }
                });
                xio.add(new xip() {
                    public final boolean isUnsubscribed() {
                        return false;
                    }

                    public final void unsubscribe() {
                        AnonymousClass1.this.a.a();
                    }
                });
            }
        }).e((xiy<? super T, ? extends R>) $$Lambda$W4dXBMGzI2bKzAwLD4gB09OLVA.INSTANCE) : ScalarSynchronousObservable.d(Optional.e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii b(String str) {
        return this.b.a(str, a);
    }

    public final xii<Optional<Drawable>> a() {
        return wit.a((xfk<T>) ((hxx) gih.a(hxx.class)).a).e((xiy<? super T, ? extends R>) $$Lambda$nbqngfNSdfLKjtSNO4Px3HrEIDo.INSTANCE).c((xiy<? super T, Boolean>) $$Lambda$qxs$JE2qz981HCOU5t0Omzv6_KMc1OE.INSTANCE).b().d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$qxs$dw5BXw3IAfgpEKUWor2lRpOxw<Object,Object>(this)).e((xiy<? super T, ? extends R>) $$Lambda$qxs$_gyrkgL0nNT48xrx6mNRJI7S2A.INSTANCE).b().d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$qxs$4pnyYEW2IGjh84g1bh4kmdIYh_c<Object,Object>(this)).e((xiy<? super T, ? extends R>) new $$Lambda$qxs$GKpzZcsYY7CSy6pjuizOsSHBLCA<Object,Object>(this));
    }
}
