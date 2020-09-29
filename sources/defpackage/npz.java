package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
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
import com.spotify.music.features.languagepicker.logger.LogInfo;
import com.spotify.music.features.languagepicker.logger.LogInfo.UserIntent;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber.SubscriptionState;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: npz reason: default package */
public class npz extends jor implements jol, kyf, nqa, a, udv {
    public int T;
    public int U;
    private ViewGroup V;
    private TextView W;
    private RecyclerView X;
    private TextView Y;
    private npy Z;
    public npr a;
    private ProgressBar aa;
    private int ab;
    private int ac;
    public nop b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public static npz ah() {
        return new npz();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_language_picker, viewGroup, false);
        this.X = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view);
        this.V = (ViewGroup) viewGroup2.findViewById(R.id.next_button_container);
        this.W = (TextView) this.V.findViewById(R.id.btn_next);
        this.ab = this.X.getPaddingBottom();
        this.ac = Math.round(o().getResources().getDimension(R.dimen.solar_button_height)) + ((MarginLayoutParams) this.W.getLayoutParams()).bottomMargin;
        this.W.setOnClickListener(new $$Lambda$npz$YdXWUi_RFO0EV6gp8Zsbg8bwfcg(this));
        i(false);
        this.Y = (TextView) viewGroup2.findViewById(R.id.count);
        d(0);
        this.X.q = true;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(viewGroup2.getContext(), this.T);
        gridLayoutManager.b = this.b.f;
        this.X.a((i) gridLayoutManager);
        this.X.a((a) this.b);
        this.b.a((a) this.a);
        new npw(new $$Lambda$npz$j9eHoB2yJWtMhak_h3HzxJByddc(this), this.X, this.U);
        Context context = (Context) fay.a(n());
        this.Z = new npy(context, (ViewGroup) viewGroup2.findViewById(R.id.error_view_container), new $$Lambda$npz$7M77l1JSeda4MikddOKD8IJUXM(this));
        this.aa = (ProgressBar) viewGroup2.findViewById(R.id.loading_view);
        this.aa.getIndeterminateDrawable().setColorFilter(fr.c(context, R.color.white), Mode.SRC_IN);
        return viewGroup2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ai() {
        nph nph = this.a.d;
        LogInfo.View view = LogInfo.View.LANGUAGES;
        nph.a.a(view.mItemUri, view.mSectionId, 0, InteractionType.SCROLL, UserIntent.SCROLL.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        npr npr = this.a;
        npr.b.a();
        npr.d.h();
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle != null) {
            this.a.b.b(bundle);
        }
    }

    public final void g() {
        super.g();
        npr npr = this.a;
        npr.g = (nqa) fay.a(this);
        npr.b.a(npr.c.a(), npr, npr);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.a.b.a(bundle);
    }

    public final void h() {
        super.h();
        this.a.b.b();
    }

    public boolean onBackPressed() {
        npr npr = this.a;
        SubscriptionState subscriptionState = npr.e.b;
        if (subscriptionState == null) {
            return true;
        }
        int i = AnonymousClass2.a[subscriptionState.ordinal()];
        if (i == 1) {
            LogInfo.View.LOADING.a(npr.d.a);
            return true;
        } else if (i == 2) {
            LogInfo.View.LANGUAGES.a(npr.d.a);
            if (npr.a() <= 0) {
                ((nqa) fay.a(npr.g)).b();
            }
            return true;
        } else if (i == 3) {
            LogInfo.View.ERROR.a(npr.d.a);
            return false;
        } else if (i == 4) {
            LogInfo.View.NO_CONNECTION.a(npr.d.a);
            return true;
        } else {
            throw new RuntimeException("Unsupported UiState");
        }
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

    private void j(boolean z) {
        int i = z ? this.ac : 0;
        RecyclerView recyclerView = this.X;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), this.X.getPaddingTop(), this.X.getPaddingRight(), this.ab + i);
    }

    public final void d(int i) {
        this.Y.setText(o().getResources().getQuantityString(R.plurals.selected_count, i, new Object[]{Integer.valueOf(i)}));
    }

    public final void a(boolean z) {
        this.X.setVisibility(z ? 0 : 4);
    }

    public final void b(boolean z) {
        this.aa.setVisibility(z ? 0 : 8);
    }

    public final void a(int i, boolean z) {
        this.Z.a(i, z);
    }

    public final void a() {
        this.Z.a();
    }

    public final void b() {
        nqc ah = nqc.ah();
        ah.a((kf) this.t, ah.getClass().getName());
    }

    public final String b(Context context) {
        return context.getString(R.string.title_picker);
    }

    public final udr ag() {
        return udt.H;
    }

    public final sih ae_() {
        return ViewUris.Q;
    }

    public final gjf aj() {
        return PageIdentifiers.LANGUAGEPICKER;
    }

    public final void e(int i) {
        ((TextView) ((View) fay.a(this.H)).findViewById(R.id.header)).setText(i);
    }

    public final String e() {
        return udt.H.a();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.LANGUAGEPICKER, ViewUris.Q.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        Activity activity = (Activity) fay.a(p());
        activity.setResult(-1);
        String stringExtra = activity.getIntent().getStringExtra("chained_uri");
        npr npr = this.a;
        npr.d.g();
        ((nqa) fay.a(npr.g)).a(false);
        npr.g.b(true);
        npr.g.a();
        npr.a(false);
        ((nqa) fay.a(npr.g)).e(R.string.adding_languages_title);
        fay.b(!npr.b.c().isEmpty());
        npr.f.unsubscribe();
        npr.c.a(npr.b.c()).a(5000, TimeUnit.MILLISECONDS, wub.a((Throwable) new TimeoutException())).b((wuc) new wuc(stringExtra) {
            private /* synthetic */ String a;

            {
                this.a = r2;
            }

            public final void a() {
                npr.this.a.a(false);
                npr.this.a(this.a);
            }

            public final void a(Throwable th) {
                npr.this.a(this.a);
            }

            public final void a(wuk wuk) {
                npr.this.f = wuk;
            }
        });
    }
}
