package com.spotify.music.features.languagepicker.presenter;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.SessionState;
import defpackage.iqu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListSubscriber<VH extends iqu<T>, T extends Parcelable> {
    private static final String b = ListSubscriber.class.getSimpleName();
    public final iqt<VH, T> a;
    private final hvl c;
    private final heg d;
    private wuk e = xaj.b();
    private wuk f = xaj.b();
    private wud<List<T>> g;
    private b h;
    private a<T> i;
    private SubscriptionState j;

    public enum SubscriptionState {
        LOADING,
        LOADED,
        ERROR,
        NO_CONNECTION
    }

    public interface a<T> {
        void b();

        void c();
    }

    public interface b {
        void a(SubscriptionState subscriptionState);
    }

    public ListSubscriber(hvl hvl, heg heg, iqt<VH, T> iqt) {
        this.c = hvl;
        this.d = (heg) fay.a(heg);
        this.a = (iqt) fay.a(iqt);
    }

    public final void a(Bundle bundle) {
        bundle.putParcelableArrayList("items", new ArrayList(this.a.a));
    }

    public final void b(Bundle bundle) {
        fay.b(this.g == null);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("items");
        if (parcelableArrayList != null) {
            this.a.a(new ArrayList(parcelableArrayList));
        }
    }

    public final void a(wud<List<T>> wud, b bVar, a<T> aVar) {
        boolean z = true;
        fay.b(this.g == null);
        fay.b(this.h == null);
        if (this.i != null) {
            z = false;
        }
        fay.b(z);
        this.g = (wud) fay.a(wud);
        this.h = (b) fay.a(bVar);
        this.i = (a) fay.a(aVar);
        this.f.unsubscribe();
        this.f = f();
    }

    public final void a() {
        fay.b(this.j == SubscriptionState.ERROR);
        e();
    }

    public final void b() {
        this.e.unsubscribe();
        this.a.a.clear();
        this.f.unsubscribe();
        this.i = null;
        this.h = null;
        this.g = null;
        this.j = null;
    }

    /* access modifiers changed from: 0000 */
    public void a(List<T> list) {
        this.a.a(new ArrayList((Collection) fay.a(list)));
        ((a) fay.a(this.i)).b();
        a(SubscriptionState.LOADED);
    }

    public final List<T> c() {
        return this.a.a;
    }

    public final void a(int i2, T t) {
        this.a.a(i2, t);
        ((a) fay.a(this.i)).c();
    }

    public final T a(int i2) {
        return (Parcelable) this.a.f(i2);
    }

    private boolean d() {
        return c().isEmpty();
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        a(SubscriptionState.ERROR);
        Logger.e(th, "%s: failed to subscribe", b);
    }

    private void e() {
        if (!d()) {
            ((a) fay.a(this.i)).b();
            a(SubscriptionState.LOADED);
            return;
        }
        a(SubscriptionState.LOADING);
        this.e = ((wud) fay.a(this.g)).a(vun.a(this.d.c())).a((wun<? super T>) new wun() {
            public final void call(Object obj) {
                ListSubscriber.this.a((List) obj);
            }
        }, (wun<Throwable>) new wun() {
            public final void call(Object obj) {
                ListSubscriber.this.a((Throwable) obj);
            }
        });
    }

    private wuk f() {
        return vun.a((wrf<T>) this.c.a.a(this.d.c())).a((wun<? super T>) new wun() {
            public final void call(Object obj) {
                ListSubscriber.this.a((SessionState) obj);
            }
        }, (wun<Throwable>) $$Lambda$ListSubscriber$t61higBRt8L3eiELFJle5Ia_Yoo.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SessionState sessionState) {
        if (!sessionState.connected()) {
            a(SubscriptionState.NO_CONNECTION);
        } else {
            e();
        }
    }

    private void a(SubscriptionState subscriptionState) {
        if (this.j != subscriptionState) {
            this.j = subscriptionState;
            ((b) fay.a(this.h)).a(this.j);
        }
    }
}
