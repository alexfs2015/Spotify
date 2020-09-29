package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.Visibility;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.yourlibrary.container.YourLibraryPrefs;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import com.spotify.music.yourlibrary.interfaces.LoadingState;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import io.reactivex.Observable;
import java.util.Map.Entry;

/* renamed from: qrm reason: default package */
public class qrm extends jor implements a, NavigationItem, jol, jpb, qrq, a, spl, udv, uqq {
    public urb T;
    public qrk U;
    public qrp V;
    public YourLibraryPrefs W;
    public kyi X;
    private qsn Y;
    private b<qrx, qrv> Z;
    public qrn a;
    public qso b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final boolean ai() {
        return true;
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "android-spotlet-your-library";
    }

    public static qrm a(fpt fpt, String str, jst jst) {
        qrm qrm = new qrm();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        bundle.putString("YourLibraryFragment.uri", jst.h());
        qrm.g(bundle);
        fpu.a((Fragment) qrm, fpt);
        return qrm;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        YourLibraryPageId yourLibraryPageId;
        qso qso = this.b;
        qsn qsn = new qsn((LayoutInflater) qso.a(layoutInflater, 1), viewGroup, (Context) qso.a(qso.a.get(), 3), (qrk) qso.a(qso.b.get(), 4), (qsi) qso.a(qso.c.get(), 5), (qsd) qso.a(qso.d.get(), 6), (qsa) qso.a(qso.e.get(), 7), (qsk) qso.a(qso.f.get(), 8), (qri) qso.a(qso.g.get(), 9));
        this.Y = qsn;
        qrx a2 = qrx.a.f().a(this.T.a()).a();
        YourLibraryPrefs yourLibraryPrefs = this.W;
        if (!yourLibraryPrefs.a.a() || yourLibraryPrefs.c == null || !yourLibraryPrefs.c.focusedPageId().b()) {
            yourLibraryPageId = YourLibraryPageId.MUSIC_PLAYLISTS;
        } else {
            long a3 = uql.a(yourLibraryPrefs.a.a.b());
            yourLibraryPageId = (a3 <= 0 || yourLibraryPrefs.b.a() - yourLibraryPrefs.c.timestamp() <= a3) ? (YourLibraryPageId) yourLibraryPrefs.c.focusedPageId().c() : YourLibraryPageId.MUSIC_PLAYLISTS;
        }
        if (bundle != null) {
            String string = bundle.getString("YourLibraryFragment.focusedPageId");
            if (string != null) {
                yourLibraryPageId = (YourLibraryPageId) fav.a(YourLibraryPageId.a(string), yourLibraryPageId);
            }
            uqu uqu = (uqu) bundle.getParcelable("YourLibraryFragment.yourLibraryState");
            a2 = a2.a(uqu);
            qsn qsn2 = this.Y;
            qsn2.c.b = uqu.a();
            qsn2.b.f = uqu.a();
            this.Y.c.b(bundle.getInt("YourLibraryFragment.tabsOffset"));
        } else {
            Bundle bundle2 = this.i;
            if (bundle2 != null) {
                String string2 = bundle2.getString("YourLibraryFragment.uri");
                if (string2 != null) {
                    qrp qrp = this.V;
                    fdh R_ = qrp.a.a().h().iterator();
                    loop0:
                    while (true) {
                        if (!R_.hasNext()) {
                            break;
                        }
                        fdh R_2 = ((ImmutableList) ((Entry) R_.next()).getValue()).R_();
                        while (true) {
                            if (R_2.hasNext()) {
                                uqs b2 = qrp.a.b((YourLibraryPageId) R_2.next());
                                if (b2.a(string2)) {
                                    yourLibraryPageId = b2.a();
                                    break loop0;
                                }
                            }
                        }
                    }
                }
            }
        }
        this.Z = kjt.a(this.a.a(this.U, this.Y), a2.a(yourLibraryPageId), kkd.a());
        this.Z.a(this.Y);
        return this.Y.a;
    }

    public final void z() {
        super.z();
        this.Z.c();
        this.X.a(this.Y);
    }

    public final void A() {
        super.A();
        this.Z.d();
        this.X.a(null);
    }

    public final void ax_() {
        super.ax_();
        Optional b2 = ((qrx) this.Z.e()).b();
        if (b2.b()) {
            YourLibraryPrefs yourLibraryPrefs = this.W;
            YourLibraryPageId yourLibraryPageId = (YourLibraryPageId) b2.c();
            if (yourLibraryPrefs.c != null) {
                yourLibraryPrefs.c = yourLibraryPrefs.c.toBuilder().a(Optional.b(yourLibraryPageId)).a();
            }
        }
        this.Z.b();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        qrx qrx = (qrx) this.Z.e();
        Optional b2 = qrx.b();
        if (b2.b()) {
            bundle.putString("YourLibraryFragment.focusedPageId", ((YourLibraryPageId) b2.c()).mId);
        }
        bundle.putParcelable("YourLibraryFragment.yourLibraryState", qrx.c());
        bundle.putInt("YourLibraryFragment.tabsOffset", this.Y.c.b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable am() {
        return this.U.c;
    }

    public final rdh af() {
        return rdh.a((a) new $$Lambda$qrm$a8ekzJ0KF6xwL7bkEh6NRy5aK44(this));
    }

    public final sih ae_() {
        return ViewUris.bb;
    }

    public final udr ag() {
        return udt.aZ;
    }

    public final gjf aj() {
        return PageIdentifiers.YOURLIBRARY;
    }

    public final uqp a(uqr uqr) {
        qrk qrk = this.U;
        return new uqp(qrk, uqr) {
            private /* synthetic */ qrk a;
            private /* synthetic */ uqr b;

            {
                this.a = r2;
                this.b = r3;
            }

            public final Observable<uqu> a() {
                return this.a.b;
            }

            public final void a(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
                Optional a2 = qrk.this.d.a(this.b);
                if (a2.b()) {
                    this.a.a.onNext(new j((YourLibraryPageId) a2.c(), yourLibraryTabsCollapseState, z));
                }
            }

            public final void a(boolean z) {
                Optional a2 = qrk.this.d.a(this.b);
                if (a2.b()) {
                    this.a.a.onNext(new i((YourLibraryPageId) a2.c(), z));
                }
            }

            public final void b(boolean z) {
                Optional a2 = qrk.this.d.a(this.b);
                if (a2.b()) {
                    this.a.a.onNext(new h((YourLibraryPageId) a2.c(), z));
                }
            }

            public final void b() {
                this.a.a.onNext(new a());
            }

            public final void c(boolean z) {
                Optional a2 = qrk.this.d.a(this.b);
                if (a2.b()) {
                    if (!z) {
                        this.a.a.onNext(new j((YourLibraryPageId) a2.c(), YourLibraryTabsCollapseState.EXPANDED, true));
                        this.a.a.onNext(new i((YourLibraryPageId) a2.c(), true));
                        return;
                    }
                    this.a.a.onNext(new i((YourLibraryPageId) a2.c(), false));
                }
            }

            public final void a(LoadingState loadingState) {
                Optional a2 = qrk.this.d.a(this.b);
                if (a2.b()) {
                    this.a.a.onNext(new f((YourLibraryPageId) a2.c(), loadingState));
                }
            }
        };
    }

    public final fpt b() {
        return fpu.a((Fragment) this);
    }

    public final boolean ak() {
        this.U.a.onNext(new g());
        return true;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.COLLECTION;
    }

    public final Visibility a() {
        return Visibility.HIDE;
    }

    public final String al() {
        Bundle bundle = this.i;
        String str = "";
        return bundle != null ? bundle.getString("username", str) : str;
    }
}
