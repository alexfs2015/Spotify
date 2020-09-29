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

/* renamed from: mpk reason: default package */
public class mpk extends jor implements jol, a, udv {
    FindFriendsModel T;
    public FindFriendsLogger U;
    public rwr V;
    public kxz W;
    public Scheduler X;
    public mpi Y;
    public FollowManager Z;
    FindFriendsViewManager a;
    public spi aa;
    public mpn ab;
    public rra ac;
    public jww ad;
    public rnf ae;
    private fpt af;
    private ViewLoadingTracker ag;
    private ListView ah;
    private Parcelable ai;
    private boolean aj;
    private boolean ak;
    private boolean al = true;
    /* access modifiers changed from: private */
    public mpj am;
    private String an;
    private Disposable ao = Disposables.b();
    private final SerialDisposable ap = new SerialDisposable();
    private final SerialDisposable aq = new SerialDisposable();
    private JsonCallbackReceiver<FindFriendsModel> ar;
    FindFriendsModel b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "spotify:findfriends";
    }

    public static mpk a(fpt fpt) {
        fay.a(fpt);
        mpk mpk = new mpk();
        fpu.a((Fragment) mpk, fpt);
        return mpk;
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("friends_model", this.b);
        bundle.putParcelable("featured_model", this.T);
        bundle.putParcelable("list_position", this.ah.onSaveInstanceState());
        bundle.putString("filter_text", this.a.a.a.getText().toString());
        bundle.putBoolean("orientation_was_landscape", jtc.b(p()));
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.af = fpu.a((Fragment) this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.findfriends_listview, viewGroup, false);
        this.ag = this.V.a(inflate, ViewUris.i.toString(), bundle, rdh.a(PageIdentifiers.FINDFRIENDS, null));
        this.ah = (ListView) inflate.findViewById(16908298);
        FindFriendsViewManager findFriendsViewManager = new FindFriendsViewManager(inflate, this.af, this.U, this.ag, this.ad, this.Z, this.aa);
        this.a = findFriendsViewManager;
        return inflate;
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        this.ah.setDescendantFocusability(262144);
        if (bundle != null) {
            bundle.setClassLoader(p().getClassLoader());
            this.b = (FindFriendsModel) bundle.getParcelable("friends_model");
            this.T = (FindFriendsModel) bundle.getParcelable("featured_model");
            this.ai = bundle.getParcelable("list_position");
            this.al = bundle.getBoolean("orientation_was_landscape") != jtc.b(p());
        }
    }

    public final void a(int i, int i2, Intent intent) {
        if (i2 == 1) {
            ak();
        }
    }

    private void ah() {
        this.ap.a(this.ab.a().a(this.X).a((Consumer<? super T>) new $$Lambda$mpk$8VXWM0xwq_Xoj_bBG4ApNrvnxKg<Object>(this), (Consumer<? super Throwable>) new $$Lambda$mpk$RU8_ACDHw0_Ff8LNTqwyzMqx9E<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(FindFriendsModel findFriendsModel) {
        this.b = findFriendsModel;
        this.a.a(TabType.FRIENDS, findFriendsModel);
        FindFriendsViewManager findFriendsViewManager = this.a;
        AnonymousClass1 r1 = new OnClickListener() {
            public final void onClick(View view) {
                mpk.this.U.a(null, "follow-all-button", InteractionType.HIT, UserIntent.FOLLOW);
                int size = mpk.this.b.getResults().size();
                if (size > 25) {
                    mpk.this.am = mpj.d(size);
                    mpk.this.am.a((Fragment) mpk.this, 0);
                    mpj a2 = mpk.this.am;
                    kg kgVar = mpk.this.t;
                    mpk.this.am;
                    a2.a((kf) kgVar, ViewUris.j.toString());
                    return;
                }
                mpk.this.ak();
            }
        };
        if (findFriendsModel != null) {
            Button button = (Button) findFriendsViewManager.b.findViewById(R.id.findfriends_follow_all_button);
            int size = findFriendsModel.getResults().size();
            fay.a(button);
            fay.a(r1);
            button.setText(button.getContext().getResources().getString(R.string.find_friends_flow_follow_all, new Object[]{Integer.valueOf(size)}));
            button.setOnClickListener(r1);
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
    public void a(boolean z) {
        this.aj = z;
        if (!z) {
            this.ai = this.ah.onSaveInstanceState();
            this.a.a(TabType.FRIENDS, State.OFFLINE);
            this.a.a(TabType.FEATURED, State.OFFLINE);
        }
        ai();
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

    public final void z() {
        super.z();
        if (this.ar == null) {
            this.ar = new JsonCallbackReceiver<FindFriendsModel>(new Handler(), FindFriendsModel.class, this.ae.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a()) {
                public final /* synthetic */ void onResolved(Response response, Object obj) {
                    FindFriendsModel findFriendsModel = (FindFriendsModel) obj;
                    mpk mpk = mpk.this;
                    mpk.T = findFriendsModel;
                    mpk.a.a(TabType.FEATURED, findFriendsModel);
                }

                public final void onError(Throwable th, ErrorCause errorCause) {
                    mpk.this.a.a(TabType.FEATURED, State.ERROR);
                }
            };
        }
        this.ao = this.W.a().a(this.X).a((Consumer<? super T>) new $$Lambda$mpk$MQVmv1svpleGXvMk5lbkdQTLsA4<Object>(this), (Consumer<? super Throwable>) $$Lambda$mpk$cZdzU3R92fSt3R3j9Bcn_HDEbd0.INSTANCE);
        this.aq.a(this.ac.b().a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$mpk$zaY64xJFWcaaRjli5Aw0BuXQ2vI<Object>(this), (Consumer<? super Throwable>) $$Lambda$mpk$yB10v6I8eMZoqrEswU7WLCa6IA.INSTANCE));
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

    public final void A() {
        super.A();
        this.ao.bf_();
        this.ap.a(Disposables.a());
        this.aq.a(Disposables.a());
    }

    public final void ax_() {
        super.ax_();
        this.ag.e();
    }

    public final String b(Context context) {
        return context.getResources().getString(R.string.find_friends_flow_title);
    }

    public final udr ag() {
        return udt.V;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.FINDFRIENDS, null);
    }

    public final gjf aj() {
        return PageIdentifiers.FINDFRIENDS;
    }

    public final sih ae_() {
        return ViewUris.i;
    }
}
