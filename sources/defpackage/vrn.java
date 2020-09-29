package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Scheduler;
import io.reactivex.SingleTransformer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: vrn reason: default package */
public final class vrn<TRequest, TResponse> {
    private static final Pattern c = Pattern.compile("\\?.*");
    private static final Pattern d = Pattern.compile("^/+");
    public final Map<Uri, vro<TResponse>> a;
    public final vrm<TResponse> b;
    private final vrj<TRequest, TResponse> e;
    private final vir<TResponse> f;
    private final CompositeDisposable g;
    private final Scheduler h;

    /* renamed from: vrn$a */
    final class a implements defpackage.vrm.a {
        private final Uri a;

        public a(Uri uri) {
            this.a = uri;
        }

        public final void a() {
            vro vro = (vro) vrn.this.a.get(this.a);
            String str = "Something went wrong";
            if (vro == null) {
                Logger.e(str, new Object[0]);
                b();
                return;
            }
            vro.a = true;
            if (vro.b) {
                T t = vro.c;
                if (t != null) {
                    vrn.this.b.a(t);
                } else {
                    Logger.e(str, new Object[0]);
                }
                vrn.this.a.remove(this.a);
                return;
            }
            Logger.b("Search prepared, but no play requested.", new Object[0]);
        }

        public final void b() {
            vrn.this.a.remove(this.a);
        }
    }

    public vrn(vrj<TRequest, TResponse> vrj, vrm<TResponse> vrm, Scheduler scheduler) {
        this(vrj, vrm, new vir(30, 4, 500), scheduler);
    }

    private vrn(vrj<TRequest, TResponse> vrj, vrm<TResponse> vrm, vir<TResponse> vir, Scheduler scheduler) {
        this.a = new HashMap(3);
        this.e = vrj;
        this.b = vrm;
        this.f = vir;
        this.h = scheduler;
        this.g = new CompositeDisposable();
    }

    public final void a(Uri uri, TRequest trequest) {
        Logger.b("Search and prepare uri: %s", uri);
        this.a.put(uri, new vro());
        this.g.a(this.e.a(trequest).a((SingleTransformer<? super T, ? extends R>) this.f).a(this.h).a((Consumer<? super T>) new $$Lambda$vrn$BVRQpfWy_5HSrFDxyCkM8pKFci4<Object>(this, uri), (Consumer<? super Throwable>) new $$Lambda$vrn$whiomk63IFEhkRlI6bsb7aLeY<Object>(this, uri)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Uri uri, Object obj) {
        vro vro = (vro) this.a.get(uri);
        if (vro != null) {
            vro.c = obj;
        }
        this.b.a(obj, new a(uri));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri, Throwable th) {
        String str = "Error during search.";
        Logger.e(th, str, new Object[0]);
        Assertion.b(str, th);
        this.a.remove(uri);
        this.b.a();
    }

    public static String a(Uri uri) {
        if (!"alexa".equals(uri.getScheme())) {
            return uri.toString();
        }
        String path = uri.getPath();
        String str = "";
        if (path == null) {
            return c.matcher(uri.getSchemeSpecificPart()).replaceFirst(str);
        }
        return d.matcher(path).replaceFirst(str);
    }
}
