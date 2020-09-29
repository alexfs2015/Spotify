package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.otp.ui.AnimatorHelper;
import com.spotify.music.R;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: gmg reason: default package */
public abstract class gmg<H extends Parcelable> extends gmf<H> {
    final b b;
    TextView c;
    public gkq d;
    private final CompositeDisposable e = new CompositeDisposable();
    private final Context f;
    private final gkl g;
    private final Scheduler h;
    private final Scheduler i;
    private final a<H> j;
    private ViewGroup k;
    private TextView l;
    private TextView m;
    private TextView n;
    private final TextWatcher o = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            ((TextView) fay.a(gmg.this.c)).setEnabled(gmg.this.c());
            b bVar = gmg.this.b;
            gmg.this.b();
            bVar.f();
        }
    };

    /* renamed from: gmg$a */
    public interface a<H> {
        H create(gkq gkq, String str);
    }

    /* renamed from: gmg$b */
    public interface b {
        void c();

        void d();

        void e();

        void f();

        void g();
    }

    public final int a() {
        return R.id.request_otp;
    }

    /* access modifiers changed from: protected */
    public abstract void a(List<gkq> list, gkq gkq);

    public gmg(Context context, gkl gkl, Scheduler scheduler, Scheduler scheduler2, b bVar, a<H> aVar) {
        this.f = context;
        this.h = scheduler;
        this.i = scheduler2;
        this.g = gkl;
        this.b = bVar;
        this.j = aVar;
    }

    public final void a(ViewGroup viewGroup) {
        fay.a(this.a);
        fay.b(this.k == null);
        this.k = (ViewGroup) fay.a(viewGroup);
        this.l = (TextView) fay.a(viewGroup.findViewById(R.id.calling_code_country));
        this.m = (TextView) fay.a(viewGroup.findViewById(R.id.calling_code));
        this.n = (TextView) fay.a(viewGroup.findViewById(R.id.phone_number));
        this.c = (TextView) fay.a(viewGroup.findViewById(R.id.request_otp_button));
        TextView textView = this.l;
        jm.b(textView, null, null, glz.a(textView.getContext(), SpotifyIconV2.CHEVRON_RIGHT), null);
        gma.a(this.n, (View) this.c);
        this.c.setOnClickListener(new $$Lambda$gmg$cNigseII2xUkLznj0xrMVNbUmA(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        Parcelable parcelable = (Parcelable) this.j.create((gkq) fay.a(this.d), b());
        this.b.g();
        gme gme = (gme) fay.a(this.a);
        ((c) fay.a(gme.e)).a(true);
        gme.b.c(false);
        gme.a.a(parcelable);
    }

    public final void a(boolean z) {
        ((TextView) fay.a(this.c)).setEnabled(c());
        ((TextView) fay.a(this.n)).addTextChangedListener(this.o);
        ((ViewGroup) fay.a(this.k)).findViewById(R.id.phone_number_root).setVisibility(8);
        this.e.a(this.g.c().b(this.h).a(this.i).a((Consumer<? super T>) new $$Lambda$gmg$3tPNZOgUsXZFXQor1Y3ptDLPWM<Object>(this), (Consumer<? super Throwable>) $$Lambda$gmg$XngZ7Cv4XM9aIGPg24ei_ygKOg.INSTANCE));
        this.b.c();
        AnimatorHelper.a((View) fay.a(this.k), z, null);
    }

    /* access modifiers changed from: private */
    public void a(Map<String, gkq> map) {
        gkq gkq;
        boolean z = map.size() > 1;
        int i2 = z ? 0 : 8;
        int[] iArr = {R.id.horizontal_divider, R.id.calling_code_country};
        for (int i3 = 0; i3 < 2; i3++) {
            ((ViewGroup) fay.a(this.k)).findViewById(iArr[i3]).setVisibility(i2);
        }
        $$Lambda$gmg$epG7UNp19oz3QtdbsKH1OrGZNF4 r0 = z ? new $$Lambda$gmg$epG7UNp19oz3QtdbsKH1OrGZNF4(this) : null;
        ((TextView) fay.a(this.l)).setOnClickListener(r0);
        ((TextView) fay.a(this.m)).setOnClickListener(r0);
        ((ViewGroup) fay.a(this.k)).findViewById(R.id.phone_number_root).setVisibility(0);
        gkq gkq2 = this.d;
        if (gkq2 == null || !map.containsValue(gkq2)) {
            Context context = this.f;
            String simCountryIso = ((TelephonyManager) context.getSystemService("phone")).getSimCountryIso();
            String country = context.getResources().getConfiguration().locale.getCountry();
            fay.b(true ^ map.isEmpty());
            if (!TextUtils.isEmpty(simCountryIso)) {
                gkq gkq3 = (gkq) map.get(simCountryIso.toUpperCase(Locale.US));
                if (gkq3 != null) {
                    gkq = gkq3;
                }
            }
            gkq gkq4 = (gkq) map.get(country);
            if (gkq4 != null) {
                gkq = gkq4;
            } else {
                gkq = (gkq) map.values().iterator().next();
            }
        } else {
            gkq = this.d;
        }
        ((gme) fay.a(this.a)).a();
        a(gkq);
    }

    public final void b(boolean z) {
        AnimatorHelper.a((View) fay.a(this.k), z);
        ((TextView) fay.a(this.n)).removeTextChangedListener(this.o);
        this.e.c();
    }

    public final void a(gkq gkq) {
        fay.a(gkq);
        ((TextView) fay.a(this.l)).setText(gkq.c());
        ((TextView) fay.a(this.m)).setText(gkq.b());
        this.d = gkq;
        b bVar = this.b;
        this.m.getText().toString();
        bVar.e();
    }

    /* access modifiers changed from: 0000 */
    public final String b() {
        return ((TextView) fay.a(this.n)).getText().toString();
    }

    /* access modifiers changed from: private */
    public void a(List<gkq> list) {
        this.b.d();
        a(list, this.d);
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return this.d != null && !b().isEmpty();
    }

    public final void c(boolean z) {
        ((TextView) fay.a(this.l)).setEnabled(z);
        ((TextView) fay.a(this.m)).setEnabled(z);
        ((TextView) fay.a(this.n)).setEnabled(z);
        ((TextView) fay.a(this.c)).setEnabled(z && c());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.e.c();
        this.e.a(this.g.a().b(this.h).a(this.i).a((Consumer<? super T>) new $$Lambda$gmg$NowGkWWPeFbItxRog195lTcD0FU<Object>(this), (Consumer<? super Throwable>) $$Lambda$gmg$of5f9U6CCg0beo_5saMfQUS4vRc.INSTANCE));
    }
}
