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

/* renamed from: vwc reason: default package */
public final class vwc {
    private static final String[] a = {"auth_server_url", "api_server_url"};
    private final Context b;
    private final vwa c;
    /* access modifiers changed from: private */
    public Optional<String> d = Optional.e();

    public vwc(vwa vwa, Context context) {
        this.c = vwa;
        this.b = context;
    }

    /* access modifiers changed from: private */
    public Observable<vwe> a(fow fow) {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$vwc$TUkxYbEHUhQXOWMtuoHS7fc6hyw<T>(this, fow));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final fow fow, final ObservableEmitter observableEmitter) {
        try {
            this.d = Optional.b(fow.a("q3voa1im9e", "foo", this.b.getPackageName(), new a() {
                public final void a(int i, boolean z, Bundle bundle) {
                }

                public final void b(int i, boolean z, Bundle bundle) {
                }

                public final void c(int i, boolean z, Bundle bundle) {
                }

                public final void d(int i, boolean z, Bundle bundle) {
                    Optional optional;
                    try {
                        if (vwc.this.d.b()) {
                            fow.a((String) vwc.this.d.c());
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
                                    optional = Optional.b(new vvz(bundle.getString(str), bundle.getString(str2), bundle.getString(str3), bundle.getString(str4)));
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
            if (!(this.d.b() ? fow.d(100, (String) this.d.c(), bundle) : false)) {
                observableEmitter.a((Throwable) new Exception("Request auth code failed!"));
            }
        } catch (RemoteException e) {
            observableEmitter.a((Throwable) new Exception("Failure with Service binding", e));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.c.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vwe vwe) {
        this.c.a();
    }

    public final Observable<vwe> a() {
        return this.c.a(this.b).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vwc$kAbIutRl0aG2x0X5FT0wFA6k8KA<Object,Object>(this), false).b((Consumer<? super T>) new $$Lambda$vwc$aPGEFJLeNt6ZCexdFPNYuSvOsA<Object>(this)).a((Consumer<? super Throwable>) new $$Lambda$vwc$HImiBWrt8yKHheSYOxWEXPl81o<Object>(this));
    }
}
