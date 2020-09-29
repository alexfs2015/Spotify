package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.service.session.SessionState;
import java.lang.reflect.Field;

@Deprecated
/* renamed from: mit reason: default package */
public class mit<T extends Parcelable> {
    private final xii<SessionState> a;
    private xii<T> b;
    private SessionState c;
    private boolean d;
    private final xij<T> e = new xij<T>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
            mit.this.h.a(th);
        }

        public final /* synthetic */ void onNext(Object obj) {
            mit.this.a((Parcelable) obj);
        }
    };
    private final xij<SessionState> f = new xij<SessionState>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
            mit.this.h.a(th);
        }

        public final /* synthetic */ void onNext(Object obj) {
            mit.this.a((SessionState) obj);
        }
    };
    mir<T> h;
    xip i = xon.b();
    xip j = xon.b();
    @jyp
    String k;
    @jyp
    protected T l;

    public mit(xii<T> xii, xii<SessionState> xii2) {
        this.b = (xii) fbp.a(xii);
        this.a = (xii) fbp.a(xii2);
    }

    public final void a(Bundle bundle, T t) {
        Field[] declaredFields;
        boolean z = true;
        if (jyq.b(this, bundle)) {
            if (!fbn.a(this.k, SpotifyLocale.a())) {
                for (Field field : fbp.a(this).getClass().getDeclaredFields()) {
                    if (field.isAnnotationPresent(jyp.class)) {
                        Class type = field.getType();
                        boolean isAccessible = field.isAccessible();
                        field.setAccessible(true);
                        try {
                            if (type.equals(Boolean.TYPE)) {
                                field.setBoolean(this, false);
                            } else {
                                if (!type.equals(Integer.TYPE) && !type.equals(Long.TYPE) && !type.equals(Double.TYPE)) {
                                    if (!type.equals(Float.TYPE)) {
                                        field.set(this, null);
                                    }
                                }
                                field.setInt(this, 0);
                            }
                            field.setAccessible(isAccessible);
                        } catch (IllegalAccessException e2) {
                            StringBuilder sb = new StringBuilder("Problems loading states ");
                            sb.append(field.getName());
                            sb.append(':');
                            sb.append(e2.getMessage());
                            throw new AssertionError(sb.toString());
                        } catch (Throwable th) {
                            field.setAccessible(isAccessible);
                            throw th;
                        }
                    }
                }
            }
        } else if (t != null) {
            this.l = t;
        }
        if (this.l == null) {
            z = false;
        }
        this.d = z;
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
        this.l = (Parcelable) fbp.a(t);
        this.h.b(t);
    }

    /* access modifiers changed from: protected */
    public final void a(SessionState sessionState) {
        this.c = (SessionState) fbp.a(sessionState);
        if (this.l == null) {
            if (sessionState.connected()) {
                this.h.a();
                this.i.unsubscribe();
                this.i = this.b.a(wit.a(((hhc) gih.a(hhc.class)).c())).a(this.e);
                return;
            }
            this.h.ad_();
        }
    }

    public final void a(mir<T> mir) {
        this.h = (mir) fbp.a(mir);
        if (this.d) {
            T t = this.l;
            if (t != null) {
                a(t);
                return;
            }
        }
        this.j.unsubscribe();
        this.j = this.a.a(this.f);
    }

    public mir<T> c() {
        return this.h;
    }

    public final T d() {
        return this.l;
    }
}
