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

/* renamed from: gnv reason: default package */
public abstract class gnv<H extends Parcelable> extends gnu<H> {
    final b b;
    TextView c;
    public gmc d;
    private final CompositeDisposable e = new CompositeDisposable();
    private final Context f;
    private final glx g;
    private final Scheduler h;
    private final Scheduler i;
    private final a<H> j;
    private ViewGroup k;
    private TextView l;
    private TextView m;
    private TextView n;
    private final TextWatcher o = new TextWatcher() {
        public final void afterTextChanged(Editable editable) {
            ((TextView) fbp.a(gnv.this.c)).setEnabled(gnv.this.c());
            b bVar = gnv.this.b;
            gnv.this.b();
            bVar.f();
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    };

    /* renamed from: gnv$a */
    public interface a<H> {
        H create(gmc gmc, String str);
    }

    /* renamed from: gnv$b */
    public interface b {
        void c();

        void d();

        void e();

        void f();

        void g();
    }

    public gnv(Context context, glx glx, Scheduler scheduler, Scheduler scheduler2, b bVar, a<H> aVar) {
        this.f = context;
        this.h = scheduler;
        this.i = scheduler2;
        this.g = glx;
        this.b = bVar;
        this.j = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.e.c();
        this.e.a(this.g.a().b(this.h).a(this.i).a((Consumer<? super T>) new $$Lambda$gnv$Jq8a8nEPYEYitTZLVoL9HVVQnAo<Object>(this), (Consumer<? super Throwable>) $$Lambda$gnv$D0a9inCI7R8NPFCjxqw9GAzZq1U.INSTANCE));
    }

    /* access modifiers changed from: private */
    public void a(List<gmc> list) {
        this.b.d();
        a(list, this.d);
    }

    /* access modifiers changed from: private */
    public void a(Map<String, gmc> map) {
        gmc gmc;
        boolean z = map.size() > 1;
        int i2 = z ? 0 : 8;
        int[] iArr = {R.id.horizontal_divider, R.id.calling_code_country};
        for (int i3 = 0; i3 < 2; i3++) {
            ((ViewGroup) fbp.a(this.k)).findViewById(iArr[i3]).setVisibility(i2);
        }
        $$Lambda$gnv$thJgEzw4fGXmq2jnalszFQfYFM r0 = z ? new $$Lambda$gnv$thJgEzw4fGXmq2jnalszFQfYFM(this) : null;
        ((TextView) fbp.a(this.l)).setOnClickListener(r0);
        ((TextView) fbp.a(this.m)).setOnClickListener(r0);
        ((ViewGroup) fbp.a(this.k)).findViewById(R.id.phone_number_root).setVisibility(0);
        gmc gmc2 = this.d;
        if (gmc2 == null || !map.containsValue(gmc2)) {
            Context context = this.f;
            String simCountryIso = ((TelephonyManager) context.getSystemService("phone")).getSimCountryIso();
            String country = context.getResources().getConfiguration().locale.getCountry();
            fbp.b(true ^ map.isEmpty());
            if (!TextUtils.isEmpty(simCountryIso)) {
                gmc gmc3 = (gmc) map.get(simCountryIso.toUpperCase(Locale.US));
                if (gmc3 != null) {
                    gmc = gmc3;
                }
            }
            gmc gmc4 = (gmc) map.get(country);
            gmc = gmc4 != null ? gmc4 : (gmc) map.values().iterator().next();
        } else {
            gmc = this.d;
        }
        ((gnt) fbp.a(this.a)).a();
        a(gmc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        Parcelable parcelable = (Parcelable) this.j.create((gmc) fbp.a(this.d), b());
        this.b.g();
        gnt gnt = (gnt) fbp.a(this.a);
        ((c) fbp.a(gnt.e)).a(true);
        gnt.b.c(false);
        gnt.a.a(parcelable);
    }

    public final int a() {
        return R.id.request_otp;
    }

    public final void a(ViewGroup viewGroup) {
        fbp.a(this.a);
        fbp.b(this.k == null);
        this.k = (ViewGroup) fbp.a(viewGroup);
        this.l = (TextView) fbp.a(viewGroup.findViewById(R.id.calling_code_country));
        this.m = (TextView) fbp.a(viewGroup.findViewById(R.id.calling_code));
        this.n = (TextView) fbp.a(viewGroup.findViewById(R.id.phone_number));
        this.c = (TextView) fbp.a(viewGroup.findViewById(R.id.request_otp_button));
        TextView textView = this.l;
        jm.b(textView, null, null, gno.a(textView.getContext(), SpotifyIconV2.CHEVRON_RIGHT), null);
        gnp.a(this.n, (View) this.c);
        this.c.setOnClickListener(new $$Lambda$gnv$FCeDW97tq8Aj8JDpe_gXEqtZDi8(this));
    }

    public final void a(gmc gmc) {
        fbp.a(gmc);
        ((TextView) fbp.a(this.l)).setText(gmc.c());
        ((TextView) fbp.a(this.m)).setText(gmc.b());
        this.d = gmc;
        b bVar = this.b;
        this.m.getText().toString();
        bVar.e();
    }

    /* access modifiers changed from: protected */
    public abstract void a(List<gmc> list, gmc gmc);

    public final void a(boolean z) {
        ((TextView) fbp.a(this.c)).setEnabled(c());
        ((TextView) fbp.a(this.n)).addTextChangedListener(this.o);
        ((ViewGroup) fbp.a(this.k)).findViewById(R.id.phone_number_root).setVisibility(8);
        this.e.a(this.g.c().b(this.h).a(this.i).a((Consumer<? super T>) new $$Lambda$gnv$yt7wDet7KXpMTMdZGKjCPqMFTJI<Object>(this), (Consumer<? super Throwable>) $$Lambda$gnv$8dA8Cz_yLAdTofZnwzkRSy8JtKY.INSTANCE));
        this.b.c();
        AnimatorHelper.a((View) fbp.a(this.k), z, null);
    }

    /* access modifiers changed from: 0000 */
    public final String b() {
        return ((TextView) fbp.a(this.n)).getText().toString();
    }

    public final void b(boolean z) {
        AnimatorHelper.a((View) fbp.a(this.k), z);
        ((TextView) fbp.a(this.n)).removeTextChangedListener(this.o);
        this.e.c();
    }

    public final void c(boolean z) {
        ((TextView) fbp.a(this.l)).setEnabled(z);
        ((TextView) fbp.a(this.m)).setEnabled(z);
        ((TextView) fbp.a(this.n)).setEnabled(z);
        ((TextView) fbp.a(this.c)).setEnabled(z && c());
    }

    /* access modifiers changed from: 0000 */
    public final boolean c() {
        return this.d != null && !b().isEmpty();
    }
}
