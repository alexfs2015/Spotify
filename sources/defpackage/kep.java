package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.common.base.Function;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableToListSingle;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.List;

/* renamed from: kep reason: default package */
public final class kep {
    private final Picasso a;

    public kep(Picasso picasso) {
        this.a = picasso;
    }

    public final Single<List<Bitmap>> a(String str, List<String> list) {
        Completable b = b(str, list);
        Flowable a2 = Single.a((Iterable<? extends SingleSource<? extends T>>) a(list).a((Function<? super E, T>) new $$Lambda$kep$bidF0sEzboPCuYKu6E8j7ZBx4<Object,T>(this, str)));
        int size = list.size();
        ObjectHelper.a(size, "capacityHint");
        return b.a((SingleSource<T>) RxJavaPlugins.a((Single<T>) new FlowableToListSingle<T>(a2, Functions.a(size))));
    }

    public final Completable b(String str, List<String> list) {
        return Completable.b((Iterable<? extends CompletableSource>) a(list).a((Function<? super E, T>) new $$Lambda$kep$HadDaUcZwVMHEPDu5rD1nH6ZjUQ<Object,T>(this, str)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final String str, String str2, final CompletableEmitter completableEmitter) {
        AnonymousClass2 r0 = new vrt() {
            public final void a() {
                completableEmitter.c();
            }

            public final void b() {
                CompletableEmitter completableEmitter = completableEmitter;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" could not be fetch");
                completableEmitter.b(new IllegalStateException(sb.toString()));
            }
        };
        if (!fax.a(str)) {
            b(str2, str).a((vrt) r0);
        } else {
            completableEmitter.a((Throwable) new IllegalStateException("imageUrl is null or empty"));
        }
        completableEmitter.a(c(str2, str));
    }

    private static fbx<String> a(List<String> list) {
        return fbx.a((Iterable<E>) list).a((faz<? super E>) $$Lambda$kep$eqmDCHP05KBHQb0jSJSNSjTwx1k.INSTANCE);
    }

    private static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    private vsl b(String str, String str2) {
        return this.a.a(str2).a((Object) a(str, str2));
    }

    private Cancellable c(String str, String str2) {
        return new $$Lambda$kep$GRU36pJLr52xv_Xuy1Tz4p9Ik_U(this, str2, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str, String str2) {
        if (!fax.a(str)) {
            this.a.a((Object) a(str2, str));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str) {
        return !fax.a(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final String str, String str2, final SingleEmitter singleEmitter) {
        if (!fax.a(str)) {
            b(str2, str).a((vsr) new vsr() {
                public final void b(Drawable drawable) {
                }

                public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
                    singleEmitter.a(bitmap);
                }

                public final void a(Drawable drawable) {
                    SingleEmitter singleEmitter = singleEmitter;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" could not be load");
                    singleEmitter.b(new IllegalStateException(sb.toString()));
                }
            });
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" could not be load");
            singleEmitter.a((Throwable) new IllegalStateException(sb.toString()));
        }
        singleEmitter.a(c(str2, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single e(String str, String str2) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$kep$zoRTqB2lekIa6aOSVO29GPWgO98<T>(this, str2, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Completable f(String str, String str2) {
        return Completable.a((CompletableOnSubscribe) new $$Lambda$kep$jevehR3t3QMCCD1D9uJVwyrk9AY(this, str2, str));
    }
}
