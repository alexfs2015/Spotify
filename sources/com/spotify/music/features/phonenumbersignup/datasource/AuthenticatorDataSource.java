package com.spotify.music.features.phonenumbersignup.datasource;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Single;
import io.reactivex.functions.Function;

public final class AuthenticatorDataSource extends c implements ohy {
    private final a a;
    private final got b;
    private String c;

    public static class SessionError extends RuntimeException {
        private static final long serialVersionUID = 1;
        final int mStatus;

        public SessionError(int i, String str) {
            if (str == null) {
                str = "";
            }
            super(str);
            this.mStatus = i;
        }
    }

    public AuthenticatorDataSource(a aVar, got got) {
        this.a = (a) fbp.a(aVar);
        this.b = (got) fbp.a(got);
        this.a.a(this);
    }

    private static SessionError a(c cVar) {
        return new SessionError(cVar.a, cVar.b);
    }

    /* access modifiers changed from: private */
    public a a(gov gov) {
        if (gov instanceof a) {
            a aVar = (a) gov;
            this.c = (String) fbp.a(aVar.a);
            return new a(aVar.c, (int) aVar.b, (int) aVar.d);
        } else if (gov instanceof c) {
            this.c = null;
            throw a((c) gov);
        } else {
            this.c = null;
            throw new IllegalStateException("unexpected response");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gny a(a aVar) {
        this.c = aVar.a;
        return new a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gny a(b bVar) {
        this.c = null;
        return gny.a(new b(bVar.a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gny a(d dVar) {
        this.c = null;
        return gny.a(new a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gny b(c cVar) {
        this.c = null;
        throw a(cVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gny b(gov gov) {
        return (gny) gov.a(new gee() {
            public final Object apply(Object obj) {
                return AuthenticatorDataSource.this.a((d) obj);
            }
        }, new gee() {
            public final Object apply(Object obj) {
                return AuthenticatorDataSource.this.b((c) obj);
            }
        }, new gee() {
            public final Object apply(Object obj) {
                return AuthenticatorDataSource.this.a((b) obj);
            }
        }, new gee() {
            public final Object apply(Object obj) {
                return AuthenticatorDataSource.this.a((a) obj);
            }
        });
    }

    private static String d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString("challenge-id");
    }

    public final /* synthetic */ Single a(Parcelable parcelable, String str) {
        String str2 = (String) fbp.a(this.c);
        this.c = null;
        return this.b.b(str2, str).f(new Function() {
            public final Object apply(Object obj) {
                return AuthenticatorDataSource.this.b((gov) obj);
            }
        });
    }

    public final /* synthetic */ Single a(Object obj) {
        ohl ohl = (ohl) obj;
        this.c = null;
        StringBuilder sb = new StringBuilder();
        sb.append(ohl.a().b());
        sb.append(ohl.b());
        return this.b.b(sb.toString()).f(new Function() {
            public final Object apply(Object obj) {
                return AuthenticatorDataSource.this.a((gov) obj);
            }
        });
    }

    public final Single<gou> a(String str) {
        return this.b.a(str);
    }

    public final void a(Bundle bundle) {
        bundle.putString("challenge-id", this.c);
    }

    public final boolean a(Throwable th) {
        return (th instanceof SessionError) && ((SessionError) th).mStatus == 11;
    }

    public final void aN_() {
        this.a.b(this);
    }

    public final Single<a> ax_() {
        String str = (String) fbp.a(this.c);
        this.c = null;
        return this.b.c(str).f(new Function() {
            public final Object apply(Object obj) {
                return AuthenticatorDataSource.this.a((gov) obj);
            }
        });
    }

    public final void b(Bundle bundle) {
        this.c = d(bundle);
    }

    public final boolean b(Throwable th) {
        return (th instanceof SessionError) && ((SessionError) th).mStatus == 10;
    }

    public final void c(Bundle bundle) {
        this.c = d(bundle);
    }

    public final boolean c(Throwable th) {
        return (th instanceof SessionError) && ((SessionError) th).mStatus == 7;
    }

    public final boolean d(Throwable th) {
        return th instanceof SessionError;
    }
}
