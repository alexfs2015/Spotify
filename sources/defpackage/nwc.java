package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.features.languagepicker.logger.LogInfo.UserIntent;
import com.spotify.music.features.languagepicker.logger.LogInfo.View;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber.SubscriptionState;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: nwc reason: default package */
public class nwc extends jrd implements jqx, lbp, nwd, a, uqq {
    public int T;
    public int U;
    private ViewGroup V;
    private TextView W;
    private RecyclerView X;
    private TextView Y;
    private nwb Z;
    public nvu a;
    private ProgressBar aa;
    private int ab;
    private int ac;
    public nus b;

    public static nwc ah() {
        return new nwc();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ai() {
        nvk nvk = this.a.d;
        View view = View.LANGUAGES;
        nvk.a.a(view.mItemUri, view.mSectionId, 0, InteractionType.SCROLL, UserIntent.SCROLL.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(android.view.View view) {
        nvu nvu = this.a;
        nvu.b.a();
        nvu.d.h();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(android.view.View view) {
        Activity activity = (Activity) fbp.a(p());
        activity.setResult(-1);
        String stringExtra = activity.getIntent().getStringExtra("chained_uri");
        nvu nvu = this.a;
        nvu.d.g();
        ((nwd) fbp.a(nvu.g)).a(false);
        nvu.g.b(true);
        nvu.g.a();
        nvu.a(false);
        ((nwd) fbp.a(nvu.g)).e(R.string.adding_languages_title);
        fbp.b(!nvu.b.c().isEmpty());
        nvu.f.unsubscribe();
        nvu.c.a(nvu.b.c()).a(5000, TimeUnit.MILLISECONDS, xig.a((Throwable) new TimeoutException())).b((xih) new xih(stringExtra) {
            private /* synthetic */ String a;

            {
                this.a = r2;
            }

            public final void a() {
                nvu.this.a.a(false);
                nvu.this.a(this.a);
            }

            public final void a(Throwable th) {
                nvu.this.a(this.a);
            }

            public final void a(xip xip) {
                nvu.this.f = xip;
            }
        });
    }

    private void j(boolean z) {
        int i = z ? this.ac : 0;
        RecyclerView recyclerView = this.X;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), this.X.getPaddingTop(), this.X.getPaddingRight(), this.ab + i);
    }

    public final android.view.View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_language_picker, viewGroup, false);
        this.X = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view);
        this.V = (ViewGroup) viewGroup2.findViewById(R.id.next_button_container);
        this.W = (TextView) this.V.findViewById(R.id.btn_next);
        this.ab = this.X.getPaddingBottom();
        this.ac = Math.round(o().getResources().getDimension(R.dimen.solar_button_height)) + ((MarginLayoutParams) this.W.getLayoutParams()).bottomMargin;
        this.W.setOnClickListener(new $$Lambda$nwc$2YA4nHfHL3b1P95R52sacow2xg(this));
        i(false);
        this.Y = (TextView) viewGroup2.findViewById(R.id.count);
        d(0);
        this.X.q = true;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(viewGroup2.getContext(), this.T);
        gridLayoutManager.b = this.b.f;
        this.X.a((i) gridLayoutManager);
        this.X.a((a) this.b);
        this.b.a((a) this.a);
        new nvz(new $$Lambda$nwc$XPQzcCKn7EvICMVxKJucMyzPdU(this), this.X, this.U);
        Context context = (Context) fbp.a(n());
        this.Z = new nwb(context, (ViewGroup) viewGroup2.findViewById(R.id.error_view_container), new $$Lambda$nwc$5Jf9RD1RwqD9WrahsHPk_PSQLic(this));
        this.aa = (ProgressBar) viewGroup2.findViewById(R.id.loading_view);
        this.aa.getIndeterminateDrawable().setColorFilter(fr.c(context, R.color.white), Mode.SRC_IN);
        return viewGroup2;
    }

    public final void a() {
        this.Z.a();
    }

    public final void a(int i, boolean z) {
        this.Z.a(i, z);
    }

    public final void a(boolean z) {
        this.X.setVisibility(z ? 0 : 4);
    }

    public final void aP_() {
        super.aP_();
        nvu nvu = this.a;
        nvu.g = (nwd) fbp.a(this);
        nvu.b.a(nvu.c.a(), nvu, nvu);
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.P;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.LANGUAGEPICKER, ViewUris.P.toString());
    }

    public final uqm ag() {
        return uqo.H;
    }

    public final gkq aj() {
        return PageIdentifiers.LANGUAGEPICKER;
    }

    public final String b(Context context) {
        return context.getString(R.string.title_picker);
    }

    public final void b() {
        nwf ah = nwf.ah();
        ah.a((kk) this.t, ah.getClass().getName());
    }

    public final void b(boolean z) {
        this.aa.setVisibility(z ? 0 : 8);
    }

    public final void d(int i) {
        this.Y.setText(o().getResources().getQuantityString(R.plurals.selected_count, i, new Object[]{Integer.valueOf(i)}));
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle != null) {
            this.a.b.b(bundle);
        }
    }

    public final String e() {
        return uqo.H.a();
    }

    public final void e(int i) {
        ((TextView) ((android.view.View) fbp.a(this.H)).findViewById(R.id.header)).setText(i);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.a.b.a(bundle);
    }

    public final void h() {
        super.h();
        this.a.b.b();
    }

    public final boolean i(boolean z) {
        int i = 0;
        if ((this.V.getVisibility() == 0) == z) {
            return false;
        }
        ViewGroup viewGroup = this.V;
        if (!z) {
            i = 8;
        }
        viewGroup.setVisibility(i);
        this.W.setEnabled(z);
        j(z);
        return true;
    }

    public boolean onBackPressed() {
        nvu nvu = this.a;
        SubscriptionState subscriptionState = nvu.e.b;
        if (subscriptionState == null) {
            return true;
        }
        int i = AnonymousClass2.a[subscriptionState.ordinal()];
        if (i == 1) {
            View.LOADING.a(nvu.d.a);
            return true;
        } else if (i == 2) {
            View.LANGUAGES.a(nvu.d.a);
            if (nvu.a() <= 0) {
                ((nwd) fbp.a(nvu.g)).b();
            }
            return true;
        } else if (i == 3) {
            View.ERROR.a(nvu.d.a);
            return false;
        } else if (i == 4) {
            View.NO_CONNECTION.a(nvu.d.a);
            return true;
        } else {
            throw new RuntimeException("Unsupported UiState");
        }
    }
}
