package com.spotify.music.features.user;

import android.content.Context;
import android.net.Uri;
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
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.user.ProfileListModel;
import com.spotify.mobile.android.spotlets.user.ProfileModel;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.NotAvailableViewManager;
import com.spotify.music.contentviewstate.NotAvailableViewManager.DataState;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.follow.FollowManager.b;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.Locale;

public class ProfilesListFragment extends kr implements jol {
    public spi T;
    public kxz U;
    public heg V;
    public hvl W;
    public FireAndForgetResolver X;
    public kyi Y;
    public FollowManager Z;
    public jwv aa;
    public rnf ab;
    private qos ac;
    /* access modifiers changed from: private */
    public ListView ad;
    /* access modifiers changed from: private */
    public Parcelable ae;
    /* access modifiers changed from: private */
    public ProfileModel[] af;
    private String ag;
    private String ah;
    /* access modifiers changed from: private */
    public NotAvailableViewManager ai;
    private Type aj;
    private final xag ak = new xag();
    private qoq al;
    public qor b;

    /* renamed from: com.spotify.music.features.user.ProfilesListFragment$3 reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.music.features.user.ProfilesListFragment$Type[] r0 = com.spotify.music.features.user.ProfilesListFragment.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.user.ProfilesListFragment$Type r1 = com.spotify.music.features.user.ProfilesListFragment.Type.FOLLOW_ARTISTS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.user.ProfilesListFragment$Type r1 = com.spotify.music.features.user.ProfilesListFragment.Type.FOLLOW_FACEBOOK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.user.ProfilesListFragment$Type r1 = com.spotify.music.features.user.ProfilesListFragment.Type.FOLLOWING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.features.user.ProfilesListFragment$Type r1 = com.spotify.music.features.user.ProfilesListFragment.Type.FOLLOWERS     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.user.ProfilesListFragment.AnonymousClass3.<clinit>():void");
        }
    }

    public enum Type {
        FOLLOWERS("hm://user-profile-view/v2/android/profile/%s/followers", R.string.profile_list_title_followers),
        FOLLOWING("hm://user-profile-view/v2/android/profile/%s/following", R.string.profile_list_title_following),
        FOLLOW_FACEBOOK("hm://follow-suggestions-view/v1/android/suggestions/%s/people/facebook_friends", R.string.header_follow_facebook_title),
        FOLLOW_ARTISTS("hm://follow-suggestions-view/v1/android/suggestions/%s/people/most_played_artists", R.string.header_follow_artists_title);
        
        final String mHermesUrlTemplate;
        final int mTitleResource;

        private Type(String str, int i) {
            this.mHermesUrlTemplate = str;
            this.mTitleResource = i;
        }
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public static ProfilesListFragment a(String str, Type type) {
        ProfilesListFragment profilesListFragment = new ProfilesListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("uri", str);
        bundle.putSerializable(MoatAdEvent.EVENT_TYPE, type);
        profilesListFragment.g(bundle);
        return profilesListFragment;
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.aj = (Type) ((Bundle) fay.a(this.i)).getSerializable(MoatAdEvent.EVENT_TYPE);
        if (bundle != null) {
            String str = "list";
            if (bundle.containsKey(str)) {
                this.ae = bundle.getParcelable(str);
            }
        }
        this.al = this.b.a(udt.be.a(), ((Bundle) fay.a(this.i)).getString("uri"));
    }

    public final void g() {
        super.g();
        this.ak.a(vun.a((wrf<T>) this.W.a).a((wun<? super T>) new wun() {
            public final void call(Object obj) {
                ProfilesListFragment.this.a((SessionState) obj);
            }
        }, (wun<Throwable>) $$Lambda$ProfilesListFragment$tzRvlpy6FjBO_HZmqe89or7z5Gk.INSTANCE));
        this.ak.a(vun.a((ObservableSource<T>) this.U.a(), BackpressureStrategy.BUFFER).a(vun.a(this.V.c())).a((wun<? super T>) new wun() {
            public final void call(Object obj) {
                ProfilesListFragment.this.a(((Boolean) obj).booleanValue());
            }
        }, (wun<Throwable>) $$Lambda$ProfilesListFragment$ap4sXZo4Sst92OeUTkLlnVvUiyw.INSTANCE));
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        ListView listView = this.ad;
        if (listView != null) {
            bundle.putParcelable("list", listView.onSaveInstanceState());
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.profile_list_frame, null);
        this.ad = (ListView) viewGroup2.findViewById(16908298);
        this.ai = new NotAvailableViewManager(p(), layoutInflater, this.ad, viewGroup2);
        return viewGroup2;
    }

    private void ah() {
        String str;
        if (!this.ai.a().booleanValue()) {
            this.ai.a(DataState.LOADING);
            Bundle bundle = (Bundle) fay.a(this.i);
            this.ag = bundle.getString("uri");
            Type type = (Type) fay.a(bundle.getSerializable(MoatAdEvent.EVENT_TYPE));
            int i = AnonymousClass3.a[type.ordinal()];
            if (i == 1 || i == 2) {
                str = Uri.encode(this.ah);
            } else {
                str = jdt.c(this.ag);
            }
            this.X.resolve(RequestBuilder.get(String.format(Locale.US, type.mHermesUrlTemplate, new Object[]{str})).build(), new JsonHttpCallbackReceiver<ProfileListModel>(new Handler(Looper.getMainLooper()), ProfileListModel.class, this.ab.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a()) {
                public final /* synthetic */ void onResolved(Response response, Object obj) {
                    ProfilesListFragment.this.af = ((ProfileListModel) obj).getProfiles();
                    if (ProfilesListFragment.this.af != null) {
                        ProfilesListFragment.b(ProfilesListFragment.this);
                    } else {
                        ProfilesListFragment.this.ai.a(DataState.LOADED);
                    }
                }

                public final void onError(Throwable th, ErrorCause errorCause) {
                    Logger.e(th, "Profile List failed to load", new Object[0]);
                    ProfilesListFragment.this.ai.a(DataState.FAILED_TO_LOAD);
                }
            });
        }
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        this.Y.a(this, o().getResources().getString(((Type) fay.a((Type) ((Bundle) fay.a(this.i)).getSerializable(MoatAdEvent.EVENT_TYPE))).mTitleResource));
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.ai.a(z);
        if (z && this.ah != null) {
            ah();
        }
    }

    /* access modifiers changed from: private */
    public void a(SessionState sessionState) {
        String currentUser = sessionState.currentUser();
        boolean z = !currentUser.equals(this.ah);
        this.ah = currentUser;
        if (z) {
            ah();
        }
    }

    public final void a(ListView listView, View view, int i, long j) {
        String uri = ((ProfileModel) this.ac.getItem(i)).getUri();
        this.T.a(uri);
        this.al.a(null, uri, "navigate_forward", null);
    }

    public final String e() {
        return this.ag;
    }

    public final udr ag() {
        return udt.be;
    }

    public final rdh af() {
        int i = AnonymousClass3.a[this.aj.ordinal()];
        if (i == 3) {
            return rdh.a(PageIdentifiers.PROFILE_FOLLOWING, null);
        }
        if (i != 4) {
            return rdh.a("ProfilesListFragment");
        }
        return rdh.a(PageIdentifiers.PROFILE_FOLLOWERS, null);
    }

    public final void h() {
        super.h();
        this.ak.a();
    }

    public final void B() {
        qos qos = this.ac;
        if (qos != null) {
            for (ProfileModel uri : qos.a) {
                qos.b.b(uri.getUri(), (b) qos);
            }
        }
        super.B();
    }

    static /* synthetic */ void b(ProfilesListFragment profilesListFragment) {
        qos qos = new qos(profilesListFragment.p(), profilesListFragment.af, profilesListFragment.ah, profilesListFragment.Z, profilesListFragment.aa, profilesListFragment.al);
        profilesListFragment.ac = qos;
        profilesListFragment.a(profilesListFragment.ac);
        profilesListFragment.ai.a(DataState.LOADED);
        profilesListFragment.ad.post(new Runnable() {
            public final void run() {
                if (ProfilesListFragment.this.ae != null) {
                    ProfilesListFragment.this.ad.onRestoreInstanceState(ProfilesListFragment.this.ae);
                    ProfilesListFragment.this.ae = null;
                }
            }
        });
    }
}
