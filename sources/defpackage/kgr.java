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

/* renamed from: kgr reason: default package */
public final class kgr {
    private final Picasso a;

    public kgr(Picasso picasso) {
        this.a = picasso;
    }

    private static fcp<String> a(List<String> list) {
        return fcp.a((Iterable<E>) list).a((fbq<? super E>) $$Lambda$kgr$Cr8ea5OpJb06vK99s2mo6SMxVk.INSTANCE);
    }

    private static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final String str, String str2, final CompletableEmitter completableEmitter) {
        AnonymousClass2 r0 = new wfz() {
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
        if (!fbo.a(str)) {
            b(str2, str).a((wfz) r0);
        } else {
            completableEmitter.a((Throwable) new IllegalStateException("imageUrl is null or empty"));
        }
        completableEmitter.a(c(str2, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final String str, String str2, final SingleEmitter singleEmitter) {
        if (!fbo.a(str)) {
            b(str2, str).a((wgx) new wgx() {
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

                public final void b(Drawable drawable) {
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
    public static /* synthetic */ boolean a(String str) {
        return !fbo.a(str);
    }

    private wgr b(String str, String str2) {
        return this.a.a(str2).a((Object) a(str, str2));
    }

    private Cancellable c(String str, String str2) {
        return new $$Lambda$kgr$Wxa84zUcYlH164GUuPhX87odkk(this, str2, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str, String str2) {
        if (!fbo.a(str)) {
            this.a.a((Object) a(str2, str));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single e(String str, String str2) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$kgr$PoWlZJmhontMdAVjYaYyh4bBZI<T>(this, str2, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Completable f(String str, String str2) {
        return Completable.a((CompletableOnSubscribe) new $$Lambda$kgr$aJH42DauUn7QOUorvrQ61acpI(this, str2, str));
    }

    public final Single<List<Bitmap>> a(String str, List<String> list) {
        Completable b = b(str, list);
        Flowable a2 = Single.a((Iterable<? extends SingleSource<? extends T>>) a(list).a((Function<? super E, T>) new $$Lambda$kgr$4JQUgOnKp_viiYcIXi3exOdBdfE<Object,T>(this, str)));
        int size = list.size();
        ObjectHelper.a(size, "capacityHint");
        return b.a((SingleSource<T>) RxJavaPlugins.a((Single<T>) new FlowableToListSingle<T>(a2, Functions.a(size))));
    }

    public final Completable b(String str, List<String> list) {
        return Completable.b((Iterable<? extends CompletableSource>) a(list).a((Function<? super E, T>) new $$Lambda$kgr$tI13CpCr9IRU7WhZiNXWrUJOUS8<Object,T>(this, str)));
    }
}
