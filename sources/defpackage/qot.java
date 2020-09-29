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

/* renamed from: qot reason: default package */
public class qot extends kr implements jol {
    public qor T;
    public kxz U;
    public heg V;
    public FireAndForgetResolver W;
    public AndroidFeatureUserProperties X;
    public jwv Y;
    public rnf Z;
    private qoq aa;
    private String ab;
    /* access modifiers changed from: private */
    public qon ac;
    /* access modifiers changed from: private */
    public ListView ad;
    /* access modifiers changed from: private */
    public Parcelable ae;
    /* access modifiers changed from: private */
    public NotAvailableViewManager af;
    private wuk ag = xaj.b();
    public spi b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "spotify:user:playlists";
    }

    public static qot b(String str) {
        qot qot = new qot();
        Bundle bundle = new Bundle();
        String c = jst.a(str).c();
        bundle.putString("uri_bundle_key", str);
        bundle.putString("username", c);
        qot.g(bundle);
        return qot;
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.ab = ((Bundle) fay.a(this.i)).getString("username");
        if (bundle != null) {
            String str = "list";
            if (bundle.containsKey(str)) {
                this.ae = bundle.getParcelable(str);
            }
        }
        this.aa = this.T.a(udt.bc.a(), ((Bundle) fay.a(this.i)).getString("uri_bundle_key", "spotify:user:playlists"));
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.list, null);
        this.ad = (ListView) viewGroup2.findViewById(16908298);
        this.af = new NotAvailableViewManager(p(), layoutInflater, this.ad, viewGroup2);
        return viewGroup2;
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.ac = new qon((ka) fay.a(p()), this.Y, this.X);
        a(this.ac);
        this.af.a(DataState.LOADING);
        this.W.resolve(RequestBuilder.get(String.format(Locale.US, "hm://user-profile-view/v1/android/profile/%s/playlists", new Object[]{Uri.encode(this.ab)})).build(), new JsonCallbackReceiver<PlaylistListModel>(new Handler(Looper.getMainLooper()), PlaylistListModel.class, this.Z.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a()) {
            public final /* synthetic */ void onResolved(Response response, Object obj) {
                PlaylistListModel playlistListModel = (PlaylistListModel) obj;
                if (response.getStatus() == 200) {
                    PlaylistModel[] playlists = playlistListModel.getPlaylists();
                    if (playlists != null) {
                        qot.this.ac.a((T[]) playlists);
                        qot.this.ad.post(new Runnable() {
                            public final void run() {
                                if (qot.this.ae != null) {
                                    qot.this.ad.onRestoreInstanceState(qot.this.ae);
                                    qot.this.ae = null;
                                }
                            }
                        });
                        qot.this.af.a(DataState.LOADED);
                    } else {
                        qot.this.af.a(DataState.FAILED_TO_LOAD);
                    }
                } else {
                    qot.this.af.a(DataState.FAILED_TO_LOAD);
                }
            }

            public final void onError(Throwable th, ErrorCause errorCause) {
                qot.this.af.a(DataState.FAILED_TO_LOAD);
            }
        });
    }

    public final void g() {
        super.g();
        this.ag = vun.a((ObservableSource<T>) this.U.a(), BackpressureStrategy.BUFFER).a(vun.a(this.V.c())).a((wun<? super T>) new $$Lambda$qot$Uw2gwb88xQpwKXpA8heZOhDCGp4<Object>(this), (wun<Throwable>) $$Lambda$qot$nePzf5Un71JBdukg8kfpSOgat6Y.INSTANCE);
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

    public final String b(Context context) {
        return context.getResources().getString(R.string.playlists_default_title);
    }

    public final udr ag() {
        return udt.bc;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.PROFILE_PLAYLISTS, null);
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.af.a(z);
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
}
