package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.base.Optional;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: vix reason: default package */
public final class vix {
    private static final String[] a = {"auth_server_url", "api_server_url"};
    private final Context b;
    private final viv c;
    /* access modifiers changed from: private */
    public Optional<String> d = Optional.e();

    public vix(viv viv, Context context) {
        this.c = viv;
        this.b = context;
    }

    public final Observable<viz> a() {
        return this.c.a(this.b).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vix$IYl1T0BRqF0m48o9heQZ_DcLNkg<Object,Object>(this), false).b((Consumer<? super T>) new $$Lambda$vix$n55ZKnIfCg9iwQrdiezWZIX1WKw<Object>(this)).a((Consumer<? super Throwable>) new $$Lambda$vix$D7PsNypAZm8FqLS3JlaisPrgTvQ<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(viz viz) {
        this.c.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.c.a();
    }

    /* access modifiers changed from: private */
    public Observable<viz> a(foc foc) {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$vix$W02hEFuFO1E9YMpnre44jCYst4<T>(this, foc));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final foc foc, final ObservableEmitter observableEmitter) {
        try {
            this.d = Optional.b(foc.a("q3voa1im9e", "foo", this.b.getPackageName(), new a() {
                public final void a(int i, boolean z, Bundle bundle) {
                }

                public final void b(int i, boolean z, Bundle bundle) {
                }

                public final void c(int i, boolean z, Bundle bundle) {
                }

                public final void d(int i, boolean z, Bundle bundle) {
                    Optional optional;
                    try {
                        if (vix.this.d.b()) {
                            foc.a((String) vix.this.d.c());
                        }
                    } catch (RemoteException unused) {
                    }
                    String str = "id_token";
                    if (bundle.containsKey(str)) {
                        String str2 = "authcode";
                        if (bundle.containsKey(str2)) {
                            String str3 = "api_server_url";
                            if (bundle.containsKey(str3)) {
                                String str4 = "auth_server_url";
                                if (bundle.containsKey(str4)) {
                                    optional = Optional.b(new viu(bundle.getString(str), bundle.getString(str2), bundle.getString(str3), bundle.getString(str4)));
                                    if (z || !optional.b()) {
                                        observableEmitter.a((Throwable) new Exception("Failed to fetch id token"));
                                    }
                                    observableEmitter.a(optional.c());
                                    observableEmitter.c();
                                    return;
                                }
                            }
                        }
                    }
                    optional = Optional.e();
                    if (z) {
                    }
                    observableEmitter.a((Throwable) new Exception("Failed to fetch id token"));
                }
            }));
            Bundle bundle = new Bundle();
            bundle.putStringArray("additional", a);
            bundle.putString("scope", "openid");
            if (!(this.d.b() ? foc.d(100, (String) this.d.c(), bundle) : false)) {
                observableEmitter.a((Throwable) new Exception("Request auth code failed!"));
            }
        } catch (RemoteException e) {
            observableEmitter.a((Throwable) new Exception("Failure with Service binding", e));
        }
    }
}
