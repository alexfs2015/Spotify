package com.spotify.music.features.languagepicker.presenter;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.SessionState;
import defpackage.ith;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListSubscriber<VH extends ith<T>, T extends Parcelable> {
    private static final String b = ListSubscriber.class.getSimpleName();
    public final itg<VH, T> a;
    private final hxx c;
    private final hhc d;
    private xip e = xon.b();
    private xip f = xon.b();
    private xii<List<T>> g;
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

    public ListSubscriber(hxx hxx, hhc hhc, itg<VH, T> itg) {
        this.c = hxx;
        this.d = (hhc) fbp.a(hhc);
        this.a = (itg) fbp.a(itg);
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
            ((b) fbp.a(this.h)).a(this.j);
        }
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        a(SubscriptionState.ERROR);
        Logger.e(th, "%s: failed to subscribe", b);
    }

    private boolean d() {
        return c().isEmpty();
    }

    private void e() {
        if (!d()) {
            ((a) fbp.a(this.i)).b();
            a(SubscriptionState.LOADED);
            return;
        }
        a(SubscriptionState.LOADING);
        this.e = ((xii) fbp.a(this.g)).a(wit.a(this.d.c())).a((xis<? super T>) new xis() {
            public final void call(Object obj) {
                ListSubscriber.this.a((List) obj);
            }
        }, (xis<Throwable>) new xis() {
            public final void call(Object obj) {
                ListSubscriber.this.a((Throwable) obj);
            }
        });
    }

    private xip f() {
        return wit.a((xfk<T>) this.c.a.a(this.d.c())).a((xis<? super T>) new xis() {
            public final void call(Object obj) {
                ListSubscriber.this.a((SessionState) obj);
            }
        }, (xis<Throwable>) $$Lambda$ListSubscriber$jfcM9Qab5nR58FLMfCk8L30dg.INSTANCE);
    }

    public final T a(int i2) {
        return (Parcelable) this.a.f(i2);
    }

    public final void a() {
        fbp.b(this.j == SubscriptionState.ERROR);
        e();
    }

    public final void a(int i2, T t) {
        this.a.a(i2, t);
        ((a) fbp.a(this.i)).c();
    }

    public final void a(Bundle bundle) {
        bundle.putParcelableArrayList("items", new ArrayList(this.a.a));
    }

    /* access modifiers changed from: 0000 */
    public void a(List<T> list) {
        this.a.a(new ArrayList((Collection) fbp.a(list)));
        ((a) fbp.a(this.i)).b();
        a(SubscriptionState.LOADED);
    }

    public final void a(xii<List<T>> xii, b bVar, a<T> aVar) {
        boolean z = true;
        fbp.b(this.g == null);
        fbp.b(this.h == null);
        if (this.i != null) {
            z = false;
        }
        fbp.b(z);
        this.g = (xii) fbp.a(xii);
        this.h = (b) fbp.a(bVar);
        this.i = (a) fbp.a(aVar);
        this.f.unsubscribe();
        this.f = f();
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

    public final void b(Bundle bundle) {
        fbp.b(this.g == null);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("items");
        if (parcelableArrayList != null) {
            this.a.a(new ArrayList(parcelableArrayList));
        }
    }

    public final List<T> c() {
        return this.a.a;
    }
}
