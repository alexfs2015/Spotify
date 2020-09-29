package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause;
import com.spotify.music.R;
import com.spotify.music.features.findfriends.legacy.FindFriendsViewManager;
import com.spotify.music.features.findfriends.legacy.FindFriendsViewManager.State;
import com.spotify.music.features.findfriends.legacy.FindFriendsViewManager.TabType;
import com.spotify.music.features.findfriends.legacy.logging.FindFriendsLogger;
import com.spotify.music.features.findfriends.legacy.logging.FindFriendsLogger.UserIntent;
import com.spotify.music.features.findfriends.legacy.model.FindFriendsModel;
import com.spotify.music.features.findfriends.legacy.model.ResultModel;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.libs.facebook.SocialState;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import retrofit2.HttpException;

/* renamed from: mtt reason: default package */
public class mtt extends jrd implements jqx, a, uqq {
    FindFriendsModel T;
    public FindFriendsLogger U;
    public sgb V;
    public lbi W;
    public Scheduler X;
    public mtr Y;
    public FollowManager Z;
    FindFriendsViewManager a;
    public szp aa;
    public mtw ab;
    public sal ac;
    public jyx ad;
    public rwl ae;
    private fqn af;
    private ViewLoadingTracker ag;
    private ListView ah;
    private Parcelable ai;
    private boolean aj;
    private boolean ak;
    private boolean al = true;
    /* access modifiers changed from: private */
    public mts am;
    private String an;
    private Disposable ao = Disposables.b();
    private final SerialDisposable ap = new SerialDisposable();
    private final SerialDisposable aq = new SerialDisposable();
    private JsonCallbackReceiver<FindFriendsModel> ar;
    FindFriendsModel b;

    public static mtt a(fqn fqn) {
        fbp.a(fqn);
        mtt mtt = new mtt();
        fqo.a((Fragment) mtt, fqn);
        return mtt;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(FindFriendsModel findFriendsModel) {
        this.b = findFriendsModel;
        this.a.a(TabType.FRIENDS, findFriendsModel);
        FindFriendsViewManager findFriendsViewManager = this.a;
        AnonymousClass1 r1 = new OnClickListener() {
            public final void onClick(View view) {
                mtt.this.U.a(null, "follow-all-button", InteractionType.HIT, UserIntent.FOLLOW);
                int size = mtt.this.b.getResults().size();
                if (size > 25) {
                    mtt.this.am = mts.d(size);
                    mtt.this.am.a((Fragment) mtt.this, 0);
                    mts a2 = mtt.this.am;
                    kl klVar = mtt.this.t;
                    mtt.this.am;
                    a2.a((kk) klVar, ViewUris.i.toString());
                    return;
                }
                mtt.this.ak();
            }
        };
        if (findFriendsModel != null) {
            Button button = (Button) findFriendsViewManager.b.findViewById(R.id.findfriends_follow_all_button);
            int size = findFriendsModel.getResults().size();
            fbp.a(button);
            fbp.a(r1);
            button.setText(button.getContext().getResources().getString(R.string.find_friends_flow_follow_all, new Object[]{Integer.valueOf(size)}));
            button.setOnClickListener(r1);
        }
    }

    /* access modifiers changed from: private */
    public void a(SocialState socialState) {
        this.ak = socialState.enabled();
        String accessToken = socialState.accessToken();
        if (!accessToken.equals("not-a-token")) {
            this.an = accessToken;
        }
        if (!this.ak) {
            this.a.a(TabType.FRIENDS, State.DISPLAY_NO_SOURCES_CONNECTED);
        }
        ai();
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.aj = z;
        if (!z) {
            this.ai = this.ah.onSaveInstanceState();
            this.a.a(TabType.FRIENDS, State.OFFLINE);
            this.a.a(TabType.FEATURED, State.OFFLINE);
        }
        ai();
    }

    private void ah() {
        this.ap.a(this.ab.a().a(this.X).a((Consumer<? super T>) new $$Lambda$mtt$18myn4aBQ4GDtb1giy42DVzFlfc<Object>(this), (Consumer<? super Throwable>) new $$Lambda$mtt$VEbn9vLzHYMF8UoWzh6RiiVd70<Object>(this)));
    }

    private void ai() {
        if (!this.aj) {
            this.ag.b();
            return;
        }
        if (this.T != null) {
            if (this.b != null) {
                this.a.a(TabType.FRIENDS, this.b);
            } else if (this.ak) {
                this.a.a(TabType.FRIENDS, State.LOADING);
                ah();
            } else {
                this.a.a(TabType.FRIENDS, State.DISPLAY_NO_SOURCES_CONNECTED);
            }
            FindFriendsViewManager findFriendsViewManager = this.a;
            TabType tabType = TabType.FRIENDS;
            if (findFriendsViewManager.c != tabType) {
                if (tabType == TabType.FRIENDS) {
                    findFriendsViewManager.a();
                } else if (tabType == TabType.FEATURED) {
                    findFriendsViewManager.b();
                }
            }
            Parcelable parcelable = this.ai;
            if (parcelable != null) {
                this.ah.onRestoreInstanceState(parcelable);
                if (!this.al) {
                    if (this.ak) {
                        ah();
                    }
                    this.Y.a(this.ar);
                }
                this.ai = null;
            }
        } else {
            if (this.ak) {
                this.a.a(TabType.FRIENDS, State.LOADING);
                ah();
            }
            this.a.a(TabType.FEATURED, State.LOADING);
            this.Y.a(this.ar);
        }
    }

    /* access modifiers changed from: private */
    public void ak() {
        for (ResultModel resultModel : this.b.getResults()) {
            if (!resultModel.isFollowing()) {
                resultModel.toggleFollowing();
                this.Z.a(resultModel.getUri(), true);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        if (th instanceof HttpException) {
            HttpException httpException = (HttpException) th;
            Logger.e("Find friends http error: %s", httpException.getMessage());
            if (httpException.code == 403) {
                this.a.a(TabType.FRIENDS, State.DISPLAY_NO_SOURCES_CONNECTED);
            } else {
                this.a.a(TabType.FRIENDS, State.ERROR);
            }
        } else {
            Logger.e("Find friends error: %s", th.getMessage());
            this.a.a(TabType.FRIENDS, State.ERROR);
        }
    }

    public final void A() {
        super.A();
        this.ao.bd_();
        this.ap.a(Disposables.a());
        this.aq.a(Disposables.a());
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.findfriends_listview, viewGroup, false);
        this.ag = this.V.a(inflate, ViewUris.h.toString(), bundle, rmf.a(PageIdentifiers.FINDFRIENDS, null));
        this.ah = (ListView) inflate.findViewById(16908298);
        FindFriendsViewManager findFriendsViewManager = new FindFriendsViewManager(inflate, this.af, this.U, this.ag, this.ad, this.Z, this.aa);
        this.a = findFriendsViewManager;
        return inflate;
    }

    public final void a(int i, int i2, Intent intent) {
        if (i2 == 1) {
            ak();
        }
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.h;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.FINDFRIENDS, null);
    }

    public final uqm ag() {
        return uqo.V;
    }

    public final gkq aj() {
        return PageIdentifiers.FINDFRIENDS;
    }

    public final void aw_() {
        super.aw_();
        this.ag.e();
    }

    public final String b(Context context) {
        return context.getResources().getString(R.string.find_friends_flow_title);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.af = fqo.a((Fragment) this);
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        this.ah.setDescendantFocusability(262144);
        if (bundle != null) {
            bundle.setClassLoader(p().getClassLoader());
            this.b = (FindFriendsModel) bundle.getParcelable("friends_model");
            this.T = (FindFriendsModel) bundle.getParcelable("featured_model");
            this.ai = bundle.getParcelable("list_position");
            this.al = bundle.getBoolean("orientation_was_landscape") != jvi.b(p());
        }
    }

    public final String e() {
        return "spotify:findfriends";
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("friends_model", this.b);
        bundle.putParcelable("featured_model", this.T);
        bundle.putParcelable("list_position", this.ah.onSaveInstanceState());
        bundle.putString("filter_text", this.a.a.a.getText().toString());
        bundle.putBoolean("orientation_was_landscape", jvi.b(p()));
    }

    public final void z() {
        super.z();
        if (this.ar == null) {
            this.ar = new JsonCallbackReceiver<FindFriendsModel>(new Handler(), FindFriendsModel.class, this.ae.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a()) {
                public final void onError(Throwable th, ErrorCause errorCause) {
                    mtt.this.a.a(TabType.FEATURED, State.ERROR);
                }

                public final /* synthetic */ void onResolved(Response response, Object obj) {
                    FindFriendsModel findFriendsModel = (FindFriendsModel) obj;
                    mtt mtt = mtt.this;
                    mtt.T = findFriendsModel;
                    mtt.a.a(TabType.FEATURED, findFriendsModel);
                }
            };
        }
        this.ao = this.W.a().a(this.X).a((Consumer<? super T>) new $$Lambda$mtt$sYL_1RQ07RipwLpj1YLL5hSdVI<Object>(this), (Consumer<? super Throwable>) $$Lambda$mtt$7qGQvM1b5LcMCeuYIskh3kjBAk.INSTANCE);
        this.aq.a(this.ac.b().a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$mtt$5cCfKEIXmtwtV6z2zNBOPv6LTUc<Object>(this), (Consumer<? super Throwable>) $$Lambda$mtt$W_ovSVj6g2tUfDNeJtYMYk1mubc.INSTANCE));
    }
}
