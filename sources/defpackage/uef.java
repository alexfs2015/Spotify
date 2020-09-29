package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.service.session.SessionState;
import java.lang.reflect.Field;

@Deprecated
/* renamed from: uef reason: default package */
public class uef<T extends Parcelable> {
    private final wud<SessionState> a;
    private wud<T> b;
    private SessionState c;
    private boolean d;
    private final wue<T> e = new wue<T>() {
        public final void onCompleted() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            uef.this.a((Parcelable) obj);
        }

        public final void onError(Throwable th) {
            uef.this.h.a(th);
        }
    };
    private final wue<SessionState> f = new wue<SessionState>() {
        public final void onCompleted() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            uef.this.a((SessionState) obj);
        }

        public final void onError(Throwable th) {
            uef.this.h.a(th);
        }
    };
    ued<T> h;
    wuk i = xaj.b();
    wuk j = xaj.b();
    @jwn
    String k;
    @jwn
    protected T l;

    public uef(wud<T> wud, wud<SessionState> wud2) {
        this.b = (wud) fay.a(wud);
        this.a = (wud) fay.a(wud2);
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
        this.l = (Parcelable) fay.a(t);
        this.h.b(t);
    }

    /* access modifiers changed from: protected */
    public final void a(SessionState sessionState) {
        this.c = (SessionState) fay.a(sessionState);
        if (this.l == null) {
            if (sessionState.connected()) {
                this.h.a();
                this.i.unsubscribe();
                this.i = this.b.a(vun.a(((heg) ggw.a(heg.class)).c())).a(this.e);
                return;
            }
            this.h.ad_();
        }
    }

    public final void a(Bundle bundle, T t) {
        Field[] declaredFields;
        boolean z = true;
        if (jwo.b(this, bundle)) {
            if (!faw.a(this.k, SpotifyLocale.a())) {
                for (Field field : fay.a(this).getClass().getDeclaredFields()) {
                    if (field.isAnnotationPresent(jwn.class)) {
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

    public final void a(ued<T> ued) {
        this.h = (ued) fay.a(ued);
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

    public final T d() {
        return this.l;
    }

    public ued<T> c() {
        return this.h;
    }
}
