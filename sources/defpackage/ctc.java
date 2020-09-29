package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.Map;
import org.json.JSONObject;

@cey
/* renamed from: ctc reason: default package */
public final class ctc extends FrameLayout implements csr {
    private final csr a;
    private final crh b;

    public ctc(csr csr) {
        super(csr.getContext());
        this.a = csr;
        this.b = new crh(csr.s(), (ViewGroup) this, (csr) this);
        addView(this.a.o());
    }

    public final dhx A() {
        return this.a.A();
    }

    public final boolean B() {
        return this.a.B();
    }

    public final int C() {
        return this.a.C();
    }

    public final boolean D() {
        return this.a.D();
    }

    public final void E() {
        this.b.b();
        this.a.E();
    }

    public final boolean F() {
        return this.a.F();
    }

    public final boolean G() {
        return this.a.G();
    }

    public final boolean H() {
        return this.a.H();
    }

    public final void I() {
        this.a.I();
    }

    public final void J() {
        this.a.J();
    }

    public final OnClickListener K() {
        return this.a.K();
    }

    public final dua L() {
        return this.a.L();
    }

    public final void M() {
        setBackgroundColor(0);
        this.a.setBackgroundColor(0);
    }

    public final void N() {
        TextView textView = new TextView(getContext());
        Resources d = bjl.i().d();
        textView.setText(d != null ? d.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    public final crh a() {
        return this.b;
    }

    public final void a(int i) {
        this.a.a(i);
    }

    public final void a(Context context) {
        this.a.a(context);
    }

    public final void a(bgs bgs) {
        this.a.a(bgs);
    }

    public final void a(bgt bgt) {
        this.a.a(bgt);
    }

    public final void a(ctg ctg) {
        this.a.a(ctg);
    }

    public final void a(cue cue) {
        this.a.a(cue);
    }

    public final void a(dlg dlg) {
        this.a.a(dlg);
    }

    public final void a(dua dua) {
        this.a.a(dua);
    }

    public final void a(String str) {
        this.a.a(str);
    }

    public final void a(String str, bgl<? super csr> bgl) {
        this.a.a(str, bgl);
    }

    public final void a(String str, bzp<bgl<? super csr>> bzp) {
        this.a.a(str, bzp);
    }

    public final void a(String str, String str2, String str3) {
        this.a.a(str, str2, str3);
    }

    public final void a(String str, Map<String, ?> map) {
        this.a.a(str, map);
    }

    public final void a(String str, JSONObject jSONObject) {
        this.a.a(str, jSONObject);
    }

    public final void a(boolean z) {
        this.a.a(z);
    }

    public final void a(boolean z, int i) {
        this.a.a(z, i);
    }

    public final void a(boolean z, int i, String str) {
        this.a.a(z, i, str);
    }

    public final void a(boolean z, int i, String str, String str2) {
        this.a.a(z, i, str, str2);
    }

    public final ctg b() {
        return this.a.b();
    }

    public final void b(int i) {
        this.a.b(i);
    }

    public final void b(bgt bgt) {
        this.a.b(bgt);
    }

    public final void b(String str) {
        this.a.b(str);
    }

    public final void b(String str, bgl<? super csr> bgl) {
        this.a.b(str, bgl);
    }

    public final void b(String str, JSONObject jSONObject) {
        this.a.b(str, jSONObject);
    }

    public final void b(boolean z) {
        this.a.b(z);
    }

    public final dta c() {
        return this.a.c();
    }

    public final void c(boolean z) {
        this.a.c(z);
    }

    public final Activity d() {
        return this.a.d();
    }

    public final void d(boolean z) {
        this.a.d(z);
    }

    public final void destroy() {
        this.a.destroy();
    }

    public final bki e() {
        return this.a.e();
    }

    public final void e(boolean z) {
        this.a.e(z);
    }

    public final void f() {
        this.a.f();
    }

    public final String g() {
        return this.a.g();
    }

    public final dtb j() {
        return this.a.j();
    }

    public final coy k() {
        return this.a.k();
    }

    public final int l() {
        return getMeasuredHeight();
    }

    public final void loadData(String str, String str2, String str3) {
        this.a.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.a.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.a.loadUrl(str);
    }

    public final int m() {
        return getMeasuredWidth();
    }

    public final WebView n() {
        return this.a.n();
    }

    public final View o() {
        return this;
    }

    public final void onResume() {
        this.a.onResume();
    }

    public final void p() {
        this.a.p();
    }

    public final void q() {
        this.a.q();
    }

    public final void r() {
        this.a.r();
    }

    public final Context s() {
        return this.a.s();
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(OnTouchListener onTouchListener) {
        this.a.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.a.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.a.setWebViewClient(webViewClient);
    }

    public final void stopLoading() {
        this.a.stopLoading();
    }

    public final bgt t() {
        return this.a.t();
    }

    public final bgt u() {
        return this.a.u();
    }

    public final cue v() {
        return this.a.v();
    }

    public final String w() {
        return this.a.w();
    }

    public final cty x() {
        return this.a.x();
    }

    public final void x_() {
        this.a.x_();
    }

    public final WebViewClient y() {
        return this.a.y();
    }

    public final void y_() {
        this.a.y_();
    }

    public final boolean z() {
        return this.a.z();
    }

    public final void onPause() {
        crh crh = this.b;
        bwx.b("onPause must be called from the UI thread.");
        if (crh.d != null) {
            crh.d.i();
        }
        this.a.onPause();
    }
}
