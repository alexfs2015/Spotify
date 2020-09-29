package com.spotify.music.features.phonenumbersignup.datasource;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Single;
import io.reactivex.functions.Function;

public final class AuthenticatorDataSource extends c implements oaz {
    private final a a;
    private final gne b;
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

    public final /* synthetic */ Single a(Object obj) {
        oas oas = (oas) obj;
        this.c = null;
        StringBuilder sb = new StringBuilder();
        sb.append(oas.a().b());
        sb.append(oas.b());
        return this.b.b(sb.toString()).f(new Function() {
            public final Object apply(Object obj) {
                return AuthenticatorDataSource.this.a((gng) obj);
            }
        });
    }

    public AuthenticatorDataSource(a aVar, gne gne) {
        this.a = (a) fay.a(aVar);
        this.b = (gne) fay.a(gne);
        this.a.a(this);
    }

    public final Single<a> ay_() {
        String str = (String) fay.a(this.c);
        this.c = null;
        return this.b.c(str).f(new Function() {
            public final Object apply(Object obj) {
                return AuthenticatorDataSource.this.a((gng) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gmj b(gng gng) {
        return (gmj) gng.a(new gct() {
            public final Object apply(Object obj) {
                return AuthenticatorDataSource.this.a((d) obj);
            }
        }, new gct() {
            public final Object apply(Object obj) {
                return AuthenticatorDataSource.this.b((c) obj);
            }
        }, new gct() {
            public final Object apply(Object obj) {
                return AuthenticatorDataSource.this.a((b) obj);
            }
        }, new gct() {
            public final Object apply(Object obj) {
                return AuthenticatorDataSource.this.a((a) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gmj a(d dVar) {
        this.c = null;
        return gmj.a(new a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gmj b(c cVar) {
        this.c = null;
        throw a(cVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gmj a(b bVar) {
        this.c = null;
        return gmj.a(new b(bVar.a));
    }

    public final Single<gnf> a(String str) {
        return this.b.a(str);
    }

    public final boolean a(Throwable th) {
        return (th instanceof SessionError) && ((SessionError) th).mStatus == 11;
    }

    public final boolean b(Throwable th) {
        return (th instanceof SessionError) && ((SessionError) th).mStatus == 10;
    }

    public final boolean c(Throwable th) {
        return (th instanceof SessionError) && ((SessionError) th).mStatus == 7;
    }

    public final boolean d(Throwable th) {
        return th instanceof SessionError;
    }

    public final void c(Bundle bundle) {
        this.c = d(bundle);
    }

    public final void aP_() {
        this.a.b(this);
    }

    public final void b(Bundle bundle) {
        this.c = d(bundle);
    }

    public final void a(Bundle bundle) {
        bundle.putString("challenge-id", this.c);
    }

    private static String d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString("challenge-id");
    }

    private static SessionError a(c cVar) {
        return new SessionError(cVar.a, cVar.b);
    }

    /* access modifiers changed from: private */
    public a a(gng gng) {
        if (gng instanceof a) {
            a aVar = (a) gng;
            this.c = (String) fay.a(aVar.a);
            return new a(aVar.c, (int) aVar.b, (int) aVar.d);
        } else if (gng instanceof c) {
            this.c = null;
            throw a((c) gng);
        } else {
            this.c = null;
            throw new IllegalStateException("unexpected response");
        }
    }

    public final /* synthetic */ Single a(Parcelable parcelable, String str) {
        String str2 = (String) fay.a(this.c);
        this.c = null;
        return this.b.b(str2, str).f(new Function() {
            public final Object apply(Object obj) {
                return AuthenticatorDataSource.this.b((gng) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gmj a(a aVar) {
        this.c = aVar.a;
        return new a();
    }
}
