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

/* renamed from: wew reason: default package */
public final class wew<TRequest, TResponse> {
    private static final Pattern c = Pattern.compile("\\?.*");
    private static final Pattern d = Pattern.compile("^/+");
    public final Map<Uri, wex<TResponse>> a;
    public final wev<TResponse> b;
    private final wes<TRequest, TResponse> e;
    private final vvw<TResponse> f;
    private final CompositeDisposable g;
    private final Scheduler h;

    /* renamed from: wew$a */
    final class a implements defpackage.wev.a {
        private final Uri a;

        public a(Uri uri) {
            this.a = uri;
        }

        public final void a() {
            wex wex = (wex) wew.this.a.get(this.a);
            String str = "Something went wrong";
            if (wex == null) {
                Logger.e(str, new Object[0]);
                b();
                return;
            }
            wex.a = true;
            if (wex.b) {
                T t = wex.c;
                if (t != null) {
                    wew.this.b.a(t);
                } else {
                    Logger.e(str, new Object[0]);
                }
                wew.this.a.remove(this.a);
                return;
            }
            Logger.b("Search prepared, but no play requested.", new Object[0]);
        }

        public final void b() {
            wew.this.a.remove(this.a);
        }
    }

    public wew(wes<TRequest, TResponse> wes, wev<TResponse> wev, Scheduler scheduler) {
        this(wes, wev, new vvw(30, 4, 500), scheduler);
    }

    private wew(wes<TRequest, TResponse> wes, wev<TResponse> wev, vvw<TResponse> vvw, Scheduler scheduler) {
        this.a = new HashMap(3);
        this.e = wes;
        this.b = wev;
        this.f = vvw;
        this.h = scheduler;
        this.g = new CompositeDisposable();
    }

    public static String a(Uri uri) {
        if (!"alexa".equals(uri.getScheme())) {
            return uri.toString();
        }
        String path = uri.getPath();
        String str = "";
        return path == null ? c.matcher(uri.getSchemeSpecificPart()).replaceFirst(str) : d.matcher(path).replaceFirst(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri, Throwable th) {
        String str = "Error during search.";
        Logger.e(th, str, new Object[0]);
        Assertion.b(str, th);
        this.a.remove(uri);
        this.b.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Uri uri, Object obj) {
        wex wex = (wex) this.a.get(uri);
        if (wex != null) {
            wex.c = obj;
        }
        this.b.a(obj, new a(uri));
    }

    public final void a(Uri uri, TRequest trequest) {
        Logger.b("Search and prepare uri: %s", uri);
        this.a.put(uri, new wex());
        this.g.a(this.e.a(trequest).a((SingleTransformer<? super T, ? extends R>) this.f).a(this.h).a((Consumer<? super T>) new $$Lambda$wew$fkXE2Pwbsg8kgLuBVfojov7B6pk<Object>(this, uri), (Consumer<? super Throwable>) new $$Lambda$wew$w448C_IFeGnzaVPnWqbHRNlw47k<Object>(this, uri)));
    }
}
