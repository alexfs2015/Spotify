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

/* renamed from: qov reason: default package */
public class qov extends kr implements jol {
    public qor T;
    public kxz U;
    public heg V;
    public FireAndForgetResolver W;
    public AndroidFeatureUserProperties X;
    public jwv Y;
    public rnf Z;
    private TopArtistModel[] aa;
    private String ab;
    private boolean ac;
    /* access modifiers changed from: private */
    public qou ad;
    /* access modifiers changed from: private */
    public ListView ae;
    /* access modifiers changed from: private */
    public Parcelable af;
    /* access modifiers changed from: private */
    public NotAvailableViewManager ag;
    private wuk ah = xaj.b();
    private qoq ai;
    public spi b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "com:spotify:user:artists";
    }

    public static qov b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("user-uri", str);
        qov qov = new qov();
        qov.g(bundle);
        return qov;
    }

    public final String b(Context context) {
        return context.getResources().getString(R.string.profile_section_title_recent_artists);
    }

    public final udr ag() {
        return udt.bf;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.PROFILE_ARTISTS, null);
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        Bundle bundle2 = (Bundle) fay.a(this.i);
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
            this.ab = jst.a(bundle2.getString(str2)).c();
            this.ac = true;
        }
        if (bundle != null) {
            String str3 = "list";
            if (bundle.containsKey(str3)) {
                this.af = bundle.getParcelable(str3);
            }
        }
        this.ai = this.T.a(udt.bf.a(), ((Bundle) fay.a(this.i)).getString(str2, "com:spotify:user:artists"));
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        ListView listView = this.ae;
        if (listView != null) {
            bundle.putParcelable("list", listView.onSaveInstanceState());
        }
    }

    public final void g() {
        super.g();
        this.ah = vun.a((ObservableSource<T>) this.U.a(), BackpressureStrategy.BUFFER).a(vun.a(this.V.c())).a((wun<? super T>) new $$Lambda$qov$fXjhT3c6V5OuBQzxI6v8MEBLuEU<Object>(this), (wun<Throwable>) $$Lambda$qov$AhFCuN5SohpXrk_DET4RCWknDKE.INSTANCE);
    }

    public final void h() {
        super.h();
        this.ah.unsubscribe();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.list, null);
        this.ae = (ListView) viewGroup2.findViewById(16908298);
        this.ag = new NotAvailableViewManager(p(), layoutInflater, this.ae, viewGroup2);
        return viewGroup2;
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.ad = new qou((ka) fay.a(p()), this.Y, this.X);
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

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.ag.a(z);
        if (z && this.ac) {
            ah();
        }
    }

    public final void a(ListView listView, View view, int i, long j) {
        TopArtistModel topArtistModel = (TopArtistModel) listView.getItemAtPosition(i);
        this.ai.a(null, topArtistModel.uri(), "navigate_forward", null);
        this.b.a(topArtistModel.uri());
    }

    private void ah() {
        this.W.resolve(RequestBuilder.get(String.format("hm://user-profile-view/v1/android/profile/%s/most-played-artists", new Object[]{this.ab})).build(), new JsonCallbackReceiver<TopArtistsListModel>(new Handler(Looper.getMainLooper()), TopArtistsListModel.class, this.Z.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a()) {
            public final /* synthetic */ void onResolved(Response response, Object obj) {
                qov.this.ad.a((T[]) ((TopArtistsListModel) obj).getTopArtists());
                qov.this.ae.post(new Runnable() {
                    public final void run() {
                        if (qov.this.af != null) {
                            qov.this.ae.onRestoreInstanceState(qov.this.af);
                            qov.this.af = null;
                        }
                    }
                });
                qov.this.ag.a(DataState.LOADED);
            }

            public final void onError(Throwable th, ErrorCause errorCause) {
                qov.this.ag.a(DataState.FAILED_TO_LOAD);
            }
        });
    }

    public static boolean b(Intent intent) {
        return intent != null && intent.getExtras().containsKey("artists-json");
    }
}
