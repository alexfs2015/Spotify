package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.user.TopArtistModel;
import com.spotify.mobile.android.spotlets.user.TopArtistsListModel;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.NotAvailableViewManager;
import com.spotify.music.contentviewstate.NotAvailableViewManager.DataState;
import com.spotify.remoteconfig.AndroidFeatureUserProperties;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: qxe reason: default package */
public class qxe extends kw implements jqx {
    public qxa T;
    public lbi U;
    public hhc V;
    public FireAndForgetResolver W;
    public AndroidFeatureUserProperties X;
    public jyx Y;
    public rwl Z;
    private TopArtistModel[] aa;
    private String ab;
    private boolean ac;
    /* access modifiers changed from: private */
    public qxd ad;
    /* access modifiers changed from: private */
    public ListView ae;
    /* access modifiers changed from: private */
    public Parcelable af;
    /* access modifiers changed from: private */
    public NotAvailableViewManager ag;
    private xip ah = xon.b();
    private qwz ai;
    public szp b;

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.ag.a(z);
        if (z && this.ac) {
            ah();
        }
    }

    private void ah() {
        this.W.resolve(RequestBuilder.get(String.format("hm://user-profile-view/v1/android/profile/%s/most-played-artists", new Object[]{this.ab})).build(), new JsonCallbackReceiver<TopArtistsListModel>(new Handler(Looper.getMainLooper()), TopArtistsListModel.class, this.Z.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a()) {
            public final void onError(Throwable th, ErrorCause errorCause) {
                qxe.this.ag.a(DataState.FAILED_TO_LOAD);
            }

            public final /* synthetic */ void onResolved(Response response, Object obj) {
                qxe.this.ad.a((T[]) ((TopArtistsListModel) obj).getTopArtists());
                qxe.this.ae.post(new Runnable() {
                    public final void run() {
                        if (qxe.this.af != null) {
                            qxe.this.ae.onRestoreInstanceState(qxe.this.af);
                            qxe.this.af = null;
                        }
                    }
                });
                qxe.this.ag.a(DataState.LOADED);
            }
        });
    }

    public static qxe b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("user-uri", str);
        qxe qxe = new qxe();
        qxe.g(bundle);
        return qxe;
    }

    public static boolean b(Intent intent) {
        return intent != null && intent.getExtras().containsKey("artists-json");
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.list, null);
        this.ae = (ListView) viewGroup2.findViewById(16908298);
        this.ag = new NotAvailableViewManager(p(), layoutInflater, this.ae, viewGroup2);
        return viewGroup2;
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.ad = new qxd((kf) fbp.a(p()), this.Y, this.X);
        a(this.ad);
        TopArtistModel[] topArtistModelArr = this.aa;
        if (topArtistModelArr != null) {
            this.ad.a((T[]) topArtistModelArr);
            this.ag.a(DataState.LOADED);
        } else if (this.ac) {
            this.ag.a(DataState.LOADING);
            ah();
        } else {
            this.ag.a(DataState.FAILED_TO_LOAD);
        }
    }

    public final void a(ListView listView, View view, int i, long j) {
        TopArtistModel topArtistModel = (TopArtistModel) listView.getItemAtPosition(i);
        this.ai.a(null, topArtistModel.uri(), "navigate_forward", null);
        this.b.a(topArtistModel.uri());
    }

    public final void aP_() {
        super.aP_();
        this.ah = wit.a((ObservableSource<T>) this.U.a(), BackpressureStrategy.BUFFER).a(wit.a(this.V.c())).a((xis<? super T>) new $$Lambda$qxe$RaPMjKUk5w4krjahCFD5uSeBkqE<Object>(this), (xis<Throwable>) $$Lambda$qxe$jvnOAYQhKFq24oKoZWM48TjnVo.INSTANCE);
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PROFILE_ARTISTS, null);
    }

    public final uqm ag() {
        return uqo.bf;
    }

    public final String b(Context context) {
        return context.getResources().getString(R.string.profile_section_title_recent_artists);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        Bundle bundle2 = (Bundle) fbp.a(this.i);
        String str = "artists-json";
        String str2 = "user-uri";
        if (bundle2.containsKey(str)) {
            Parcelable[] parcelableArray = bundle2.getParcelableArray(str);
            TopArtistModel[] topArtistModelArr = new TopArtistModel[parcelableArray.length];
            for (int i = 0; i < parcelableArray.length; i++) {
                topArtistModelArr[i] = (TopArtistModel) parcelableArray[i];
            }
            this.aa = topArtistModelArr;
        } else if (bundle2.containsKey(str2)) {
            this.ab = jva.a(bundle2.getString(str2)).c();
            this.ac = true;
        }
        if (bundle != null) {
            String str3 = "list";
            if (bundle.containsKey(str3)) {
                this.af = bundle.getParcelable(str3);
            }
        }
        this.ai = this.T.a(uqo.bf.a(), ((Bundle) fbp.a(this.i)).getString(str2, "com:spotify:user:artists"));
    }

    public final String e() {
        return "com:spotify:user:artists";
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        ListView listView = this.ae;
        if (listView != null) {
            bundle.putParcelable("list", listView.onSaveInstanceState());
        }
    }

    public final void h() {
        super.h();
        this.ah.unsubscribe();
    }
}
