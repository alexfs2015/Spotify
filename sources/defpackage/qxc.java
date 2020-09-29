package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
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
import com.spotify.mobile.android.spotlets.user.PlaylistListModel;
import com.spotify.mobile.android.spotlets.user.PlaylistModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.NotAvailableViewManager;
import com.spotify.music.contentviewstate.NotAvailableViewManager.DataState;
import com.spotify.remoteconfig.AndroidFeatureUserProperties;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.Locale;

/* renamed from: qxc reason: default package */
public class qxc extends kw implements jqx {
    public qxa T;
    public lbi U;
    public hhc V;
    public FireAndForgetResolver W;
    public AndroidFeatureUserProperties X;
    public jyx Y;
    public rwl Z;
    private qwz aa;
    private String ab;
    /* access modifiers changed from: private */
    public qww ac;
    /* access modifiers changed from: private */
    public ListView ad;
    /* access modifiers changed from: private */
    public Parcelable ae;
    /* access modifiers changed from: private */
    public NotAvailableViewManager af;
    private xip ag = xon.b();
    public szp b;

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.af.a(z);
    }

    public static qxc b(String str) {
        qxc qxc = new qxc();
        Bundle bundle = new Bundle();
        String c = jva.a(str).c();
        bundle.putString("uri_bundle_key", str);
        bundle.putString("username", c);
        qxc.g(bundle);
        return qxc;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.list, null);
        this.ad = (ListView) viewGroup2.findViewById(16908298);
        this.af = new NotAvailableViewManager(p(), layoutInflater, this.ad, viewGroup2);
        return viewGroup2;
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.ac = new qww((kf) fbp.a(p()), this.Y, this.X);
        a(this.ac);
        this.af.a(DataState.LOADING);
        this.W.resolve(RequestBuilder.get(String.format(Locale.US, "hm://user-profile-view/v1/android/profile/%s/playlists", new Object[]{Uri.encode(this.ab)})).build(), new JsonCallbackReceiver<PlaylistListModel>(new Handler(Looper.getMainLooper()), PlaylistListModel.class, this.Z.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a()) {
            public final void onError(Throwable th, ErrorCause errorCause) {
                qxc.this.af.a(DataState.FAILED_TO_LOAD);
            }

            public final /* synthetic */ void onResolved(Response response, Object obj) {
                PlaylistListModel playlistListModel = (PlaylistListModel) obj;
                if (response.getStatus() == 200) {
                    PlaylistModel[] playlists = playlistListModel.getPlaylists();
                    if (playlists != null) {
                        qxc.this.ac.a((T[]) playlists);
                        qxc.this.ad.post(new Runnable() {
                            public final void run() {
                                if (qxc.this.ae != null) {
                                    qxc.this.ad.onRestoreInstanceState(qxc.this.ae);
                                    qxc.this.ae = null;
                                }
                            }
                        });
                        qxc.this.af.a(DataState.LOADED);
                    } else {
                        qxc.this.af.a(DataState.FAILED_TO_LOAD);
                    }
                } else {
                    qxc.this.af.a(DataState.FAILED_TO_LOAD);
                }
            }
        });
    }

    public final void a(ListView listView, View view, int i, long j) {
        PlaylistModel playlistModel = (PlaylistModel) listView.getItemAtPosition(i);
        if (TextUtils.isEmpty(playlistModel.getUri())) {
            Assertion.b("Failed to open playlist, playlist uri missing.");
            return;
        }
        this.aa.a(null, playlistModel.getUri(), "navigate_forward", null);
        this.b.a(playlistModel.getUri());
    }

    public final void aP_() {
        super.aP_();
        this.ag = wit.a((ObservableSource<T>) this.U.a(), BackpressureStrategy.BUFFER).a(wit.a(this.V.c())).a((xis<? super T>) new $$Lambda$qxc$4wQ0Z5wuabxfOjGZdL6Hhk1TItA<Object>(this), (xis<Throwable>) $$Lambda$qxc$_E6yineGc2ZZJvRxZM2liT0vLpQ.INSTANCE);
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PROFILE_PLAYLISTS, null);
    }

    public final uqm ag() {
        return uqo.bc;
    }

    public final String b(Context context) {
        return context.getResources().getString(R.string.playlists_default_title);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.ab = ((Bundle) fbp.a(this.i)).getString("username");
        if (bundle != null) {
            String str = "list";
            if (bundle.containsKey(str)) {
                this.ae = bundle.getParcelable(str);
            }
        }
        this.aa = this.T.a(uqo.bc.a(), ((Bundle) fbp.a(this.i)).getString("uri_bundle_key", "spotify:user:playlists"));
    }

    public final String e() {
        return "spotify:user:playlists";
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        ListView listView = this.ad;
        if (listView != null) {
            bundle.putParcelable("list", listView.onSaveInstanceState());
        }
    }

    public final void h() {
        super.h();
        this.ag.unsubscribe();
    }
}
