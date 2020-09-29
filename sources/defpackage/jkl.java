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

/* renamed from: jkl reason: default package */
public class jkl extends jor implements c, d, NavigationItem, jkr, jkt, jol, a, spl {
    private wuk T;
    private CharSequence U;
    private RecyclerView V;
    private TextView W;
    private PremiumDestinationHeader X;
    private View Y;
    private GlueHeaderLayout Z;
    public jks a;
    private boolean aa;
    public shy b;

    public final Fragment ae() {
        return this;
    }

    public final boolean ai() {
        return true;
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "premium-destination";
    }

    public static jkl a(fpt fpt) {
        jkl jkl = new jkl();
        fpu.a((Fragment) jkl, fpt);
        return jkl;
    }

    public final void b(Bundle bundle) {
        this.aa = bundle == null;
        super.b(bundle);
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

    public final void z() {
        super.z();
        this.b.c();
    }

    public final void a(View view, Bundle bundle) {
        ((ViewGroup) view).addView(this.Y);
        this.Z = (GlueHeaderLayout) view.findViewById(R.id.glue_header_layout);
        this.X = (PremiumDestinationHeader) view.findViewById(R.id.header_view);
        this.W = (TextView) view.findViewById(R.id.button_upgrade);
        this.V = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.V.a((i) new LinearLayoutManager(view.getContext()));
        this.V.a((a) new jkk());
        this.V.a((h) new a(), -1);
        wud a2 = vun.a((wrf<T>) ((hvl) ggw.a(hvl.class)).a).a(vun.a(AndroidSchedulers.a()));
        jks jks = this.a;
        jks.getClass();
        this.T = a2.a((wun<? super T>) new $$Lambda$d9_zsJuWVwEfsUvMAZDiL886I0<Object>(jks), (wun<Throwable>) $$Lambda$jkl$bcUYMaPAKwi9kAUjubIaoTxmsxk.INSTANCE);
        this.W.setOnClickListener(new $$Lambda$jkl$d5aElTDZw5RFTiAMoWkwzAY3uY(this));
        this.W.setVisibility(8);
        this.X.b.b.setVisibility(4);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.a();
    }

    public final void A() {
        super.A();
        this.b.b();
    }

    public final void h() {
        super.h();
        this.T.unsubscribe();
    }

    public final void ax_() {
        super.ax_();
        this.Y = null;
        ka p = p();
        if (p != null && !p.isChangingConfigurations()) {
            jks jks = this.a;
            jks.h.a(jks.j, jks.k, jks.o, jks.l, "close", jks.m, jks.f);
        }
    }

    public final void B() {
        super.B();
        jks jks = this.a;
        jks.a = null;
        jks.b.a();
        jks.b = null;
        jks.c.a.clear();
        jks.c = null;
        jks.d = null;
        jks.e.unsubscribe();
    }

    public final void b(String str) {
        this.W.setText(str);
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

    public final void c(String str) {
        this.X.b.b.setText(str);
    }

    public final void e(int i) {
        TextView textView = this.X.b.b;
        if (i == 8) {
            i = 4;
        }
        textView.setVisibility(i);
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

    public final void a(CharSequence charSequence) {
        this.U = charSequence;
    }

    public final void a(String str, jkj[] jkjArr) {
        jkk jkk = (jkk) fay.a((jkk) this.V.c());
        CharSequence charSequence = this.U;
        jkk.e = jkjArr;
        jkk.a = charSequence;
        jkk.d = str;
        jkk.e();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.PREMIUM_DESTINATION, ViewUris.aR.toString());
    }

    public final udr ag() {
        return udt.aG;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.PREMIUM;
    }

    public final boolean ak() {
        this.Z.d(true);
        return true;
    }

    public final sih ae_() {
        return ViewUris.aR;
    }

    public final boolean aj() {
        return this.aa;
    }
}
