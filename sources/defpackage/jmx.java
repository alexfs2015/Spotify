package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.c;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.activity.upsell.premiumdestination.PremiumDestinationHeader;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import io.reactivex.android.schedulers.AndroidSchedulers;

/* renamed from: jmx reason: default package */
public class jmx extends jrd implements c, d, NavigationItem, jnd, jnf, jqx, a, szs {
    private xip T;
    private CharSequence U;
    private RecyclerView V;
    private TextView W;
    private PremiumDestinationHeader X;
    private View Y;
    private GlueHeaderLayout Z;
    public jne a;
    private boolean aa;
    public ssf b;

    public static jmx a(fqn fqn) {
        jmx jmx = new jmx();
        fqo.a((Fragment) jmx, fqn);
        return jmx;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.a();
    }

    public final void A() {
        super.A();
        this.b.b();
    }

    public final void B() {
        super.B();
        jne jne = this.a;
        jne.a = null;
        jne.b.a();
        jne.b = null;
        jne.c.a.clear();
        jne.c = null;
        jne.d = null;
        jne.e.unsubscribe();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        this.Y = layoutInflater.inflate(R.layout.fragment_premium_destination, viewGroup, false);
        if (bundle == null) {
            z = true;
        }
        this.aa = z;
        return new FrameLayout(n());
    }

    public final void a(View view, Bundle bundle) {
        ((ViewGroup) view).addView(this.Y);
        this.Z = (GlueHeaderLayout) view.findViewById(R.id.glue_header_layout);
        this.X = (PremiumDestinationHeader) view.findViewById(R.id.header_view);
        this.W = (TextView) view.findViewById(R.id.button_upgrade);
        this.V = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.V.a((i) new LinearLayoutManager(view.getContext()));
        this.V.a((a) new jmw());
        this.V.a((h) new a(), -1);
        xii a2 = wit.a((xfk<T>) ((hxx) gih.a(hxx.class)).a).a(wit.a(AndroidSchedulers.a()));
        jne jne = this.a;
        jne.getClass();
        this.T = a2.a((xis<? super T>) new $$Lambda$wBb8Nr6VUcUlp60BfMHV9DXrZDU<Object>(jne), (xis<Throwable>) $$Lambda$jmx$G15pYR0sDfprbaxNrekX9JAuvFg.INSTANCE);
        this.W.setOnClickListener(new $$Lambda$jmx$tWbJTOpE9rEiwrAYrW9_YQq7EAk(this));
        this.W.setVisibility(8);
        this.X.b.b.setVisibility(4);
    }

    public final void a(CharSequence charSequence) {
        this.U = charSequence;
    }

    public final void a(String str, jmv[] jmvArr) {
        jmw jmw = (jmw) fbp.a((jmw) this.V.c());
        CharSequence charSequence = this.U;
        jmw.e = jmvArr;
        jmw.a = charSequence;
        jmw.d = str;
        jmw.e();
    }

    public final Fragment ae() {
        return this;
    }

    public final sso ae_() {
        return ViewUris.aQ;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PREMIUM_DESTINATION, ViewUris.aQ.toString());
    }

    public final uqm ag() {
        return uqo.aG;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.PREMIUM;
    }

    public final boolean ai() {
        return true;
    }

    public final boolean aj() {
        return this.aa;
    }

    public final boolean ak() {
        this.Z.d(true);
        return true;
    }

    public final void aw_() {
        super.aw_();
        this.Y = null;
        kf p = p();
        if (p != null && !p.isChangingConfigurations()) {
            jne jne = this.a;
            jne.h.a(jne.j, jne.k, jne.o, jne.l, "close", jne.m, jne.f);
        }
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(Bundle bundle) {
        this.aa = bundle == null;
        super.b(bundle);
    }

    public final void b(String str) {
        this.W.setText(str);
    }

    public final void c(String str) {
        this.X.b.b.setText(str);
    }

    public final void d(int i) {
        if (i == 0) {
            this.W.setAlpha(0.0f);
            this.W.setVisibility(i);
            this.W.animate().alpha(1.0f);
            return;
        }
        this.W.setVisibility(i);
    }

    public final void d(String str) {
        TextView textView = this.X.b.a;
        if (TextUtils.isEmpty(textView.getText())) {
            textView.setTranslationY((float) textView.getResources().getDimensionPixelSize(R.dimen.std_8dp));
            textView.setAlpha(0.0f);
        }
        textView.setText(str);
        textView.animate().alpha(1.0f).translationY(0.0f);
    }

    public final String e() {
        return "premium-destination";
    }

    public final void e(int i) {
        TextView textView = this.X.b.b;
        if (i == 8) {
            i = 4;
        }
        textView.setVisibility(i);
    }

    public final void h() {
        super.h();
        this.T.unsubscribe();
    }

    public final void z() {
        super.z();
        this.b.c();
    }
}
