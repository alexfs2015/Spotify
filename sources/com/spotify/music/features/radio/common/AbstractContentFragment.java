package com.spotify.music.features.radio.common;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.ContentViewManager;
import com.spotify.music.contentviewstate.ContentViewManager.ContentState;
import com.spotify.music.contentviewstate.view.LoadingView;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

@Deprecated
public abstract class AbstractContentFragment<D extends Parcelable, V extends View> extends jrd implements jqx, defpackage.sso.a {
    V T;
    /* access modifiers changed from: protected */
    public ContentViewManager U;
    public hxx V;
    public szp W;
    public qbr X;
    public D Y;
    private LoadingView Z;
    public final a<D> a = new b(this, 0);
    private long aa = -1;
    private jtz ab = jtp.a;
    private final CompositeDisposable ac = new CompositeDisposable();
    private final Consumer<SessionState> ad = new Consumer() {
        public final void accept(Object obj) {
            AbstractContentFragment.this.d((SessionState) obj);
        }
    };
    /* access modifiers changed from: private */
    public DataRetrievingState ae = DataRetrievingState.IDLE;
    protected fvd b;

    public enum DataRetrievingState {
        IDLE,
        RETRIEVING,
        SUCCESS,
        FAILURE
    }

    public interface a<D> {
        void a();

        void a(D d);
    }

    class b implements a<D> {
        private b() {
        }

        /* synthetic */ b(AbstractContentFragment abstractContentFragment, byte b) {
            this();
        }

        public final void a() {
            AbstractContentFragment.this.ae = DataRetrievingState.FAILURE;
            AbstractContentFragment.this.U.c(true);
        }

        public final /* synthetic */ void a(Object obj) {
            D d = (Parcelable) obj;
            AbstractContentFragment abstractContentFragment = AbstractContentFragment.this;
            abstractContentFragment.Y = d;
            abstractContentFragment.ae = DataRetrievingState.SUCCESS;
            if (AbstractContentFragment.this.v()) {
                if (AbstractContentFragment.this.a(d)) {
                    AbstractContentFragment.this.U.b(ContentState.EMPTY_CONTENT);
                    return;
                }
                fbp.a(d);
                AbstractContentFragment.this.U.b((ContentState) null);
                AbstractContentFragment abstractContentFragment2 = AbstractContentFragment.this;
                if (d == null || abstractContentFragment2.T.getTag(R.id.content_view_data_tag) == null || abstractContentFragment2.T.getTag(R.id.content_view_data_tag) != d) {
                    AbstractContentFragment.this.T.setTag(R.id.content_view_data_tag, d);
                    AbstractContentFragment abstractContentFragment3 = AbstractContentFragment.this;
                    abstractContentFragment3.a(d, abstractContentFragment3.T);
                }
            }
        }
    }

    protected AbstractContentFragment() {
    }

    protected static void a(SessionState sessionState, ContentViewManager contentViewManager) {
        contentViewManager.a(!sessionState.connected());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(SessionState sessionState) {
        if (a(sessionState)) {
            b(sessionState);
        } else {
            c(sessionState);
        }
    }

    public final void A() {
        super.A();
        this.X.a();
        this.ac.c();
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_content_base, viewGroup, false);
        ViewStub viewStub = (ViewStub) viewGroup2.findViewById(R.id.content_fragment_empty_view_stub);
        fqv.f();
        fbp.a(p());
        this.b = fvg.a(viewStub);
        this.T = c(layoutInflater, viewGroup2, bundle);
        viewGroup2.addView(this.T);
        return viewGroup2;
    }

    /* access modifiers changed from: protected */
    public abstract void a(D d, V v);

    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
        fbp.a(this.T);
        com.spotify.music.contentviewstate.ContentViewManager.a aVar = new com.spotify.music.contentviewstate.ContentViewManager.a((Context) fbp.a(p()), this.b, this.T);
        aVar.a = new com.spotify.music.contentviewstate.ContentViewManager.b() {
            public final void a(fvd fvd, ContentState contentState) {
                AbstractContentFragment.this.a(fvd, contentState);
            }
        };
        a(aVar);
        this.U = aVar.a();
        fbp.b(this.U.a(ContentState.EMPTY_CONTENT) && this.U.a(ContentState.SERVICE_ERROR) && this.U.a(ContentState.NO_NETWORK), "In setupContentViewManager(), EMPTY_CONTENT, SERVICE_ERROR, NO_NETWORK states' text should be defined. Otherwise, the app could be crashed.");
    }

    /* access modifiers changed from: protected */
    public abstract void a(com.spotify.music.contentviewstate.ContentViewManager.a aVar);

    /* access modifiers changed from: protected */
    public abstract void a(a<D> aVar);

    /* access modifiers changed from: protected */
    public void a(fvd fvd, ContentState contentState) {
    }

    /* access modifiers changed from: protected */
    public boolean a(D d) {
        return d == null;
    }

    /* access modifiers changed from: protected */
    public boolean a(SessionState sessionState) {
        return sessionState.connected() || this.ae == DataRetrievingState.SUCCESS;
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    /* access modifiers changed from: protected */
    public boolean aj() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean al() {
        if (this.ae != DataRetrievingState.SUCCESS && this.ae != DataRetrievingState.RETRIEVING) {
            return true;
        }
        DataRetrievingState dataRetrievingState = this.ae;
        DataRetrievingState dataRetrievingState2 = DataRetrievingState.SUCCESS;
        return false;
    }

    /* access modifiers changed from: protected */
    public final void am() {
        this.ae = DataRetrievingState.RETRIEVING;
        an();
        a(this.a);
    }

    /* access modifiers changed from: protected */
    public final void an() {
        LoadingView loadingView = this.Z;
        if (loadingView == null) {
            loadingView = LoadingView.a(LayoutInflater.from(p()));
            this.Z = loadingView;
            ViewGroup viewGroup = (ViewGroup) this.H;
            if (viewGroup != null) {
                viewGroup.addView(loadingView);
            }
        }
        if (!loadingView.d()) {
            this.U.a(loadingView);
        }
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            bundle.setClassLoader(((kf) fbp.a(p())).getClassLoader());
            this.Y = bundle.getParcelable("AbstractContentFragment.KEY_INSTANCE_STATE_PARCELABLE_DATA");
            this.ae = (DataRetrievingState) bundle.getSerializable("AbstractContentFragment.KEY_INSTANCE_STATE_DATA_RETRIEVING_STATE");
            this.aa = bundle.getLong("AbstractContentFragment.KEY_INSTANCE_STATE_NO_NETWORK_START");
        }
    }

    /* access modifiers changed from: protected */
    public void b(SessionState sessionState) {
        this.X.a();
        if (!a(this.Y)) {
            this.a.a(this.Y);
        } else if (al()) {
            am();
        } else {
            if (this.ae != DataRetrievingState.RETRIEVING) {
                this.U.b(ContentState.EMPTY_CONTENT);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract V c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    /* access modifiers changed from: protected */
    public void c(final SessionState sessionState) {
        if (sessionState.canConnect()) {
            long max = this.aa == -1 ? 0 : Math.max(0, this.ab.a() - this.aa);
            long max2 = Math.max(0, 800 - max);
            long max3 = Math.max(0, 20800 - max);
            if (max3 == 0) {
                a(sessionState, this.U);
            } else if (max2 == 0) {
                an();
                if (!this.X.a(new Runnable() {
                    public final void run() {
                        AbstractContentFragment.a(sessionState, AbstractContentFragment.this.U);
                    }
                }, max3)) {
                    a(sessionState, this.U);
                }
            } else if (!this.X.a(new Runnable() {
                public final void run() {
                    AbstractContentFragment.this.an();
                    AbstractContentFragment.this.X.b(new Runnable() {
                        public final void run() {
                            AbstractContentFragment.a(sessionState, AbstractContentFragment.this.U);
                        }
                    }, 20000);
                }
            }, max2)) {
                a(sessionState, this.U);
            }
            if (this.aa == -1) {
                this.aa = this.ab.a();
            }
            return;
        }
        a(sessionState, this.U);
    }

    public void e(Bundle bundle) {
        super.e(bundle);
        if (aj()) {
            bundle.putParcelable("AbstractContentFragment.KEY_INSTANCE_STATE_PARCELABLE_DATA", this.Y);
            bundle.putSerializable("AbstractContentFragment.KEY_INSTANCE_STATE_DATA_RETRIEVING_STATE", this.ae != DataRetrievingState.RETRIEVING ? this.ae : DataRetrievingState.IDLE);
        }
        bundle.putLong("AbstractContentFragment.KEY_INSTANCE_STATE_NO_NETWORK_START", this.aa);
    }

    public final void z() {
        super.z();
        this.ac.a(this.V.a.a(this.ad, (Consumer<? super Throwable>) $$Lambda$AbstractContentFragment$Rc8_SrX8M3XZnghoQHXVaWIgG30.INSTANCE));
    }
}
