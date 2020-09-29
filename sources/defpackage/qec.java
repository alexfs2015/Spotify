package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.spotify.mobile.android.util.loader.SettingsState;
import com.spotify.music.R;
import com.spotify.music.features.placebobanner.models.PlaceboBannerView;
import com.spotify.music.inappmessaging.MessageRequest;
import java.util.Arrays;

/* renamed from: qec reason: default package */
public final class qec extends qdu {
    final jug d;
    public defpackage.jug.a<Integer> e;
    public wut<SettingsState, Integer> f;
    /* access modifiers changed from: 0000 */
    public int g = -1;
    public b h;
    public a i;
    /* access modifiers changed from: private */
    public final Spinner j;
    /* access modifiers changed from: private */
    public String[] k;
    /* access modifiers changed from: private */
    public final rka l;
    /* access modifiers changed from: private */
    public final jsz m;
    private final OnItemSelectedListener n = new OnItemSelectedListener() {
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (qec.this.k == null || qec.this.k.length <= i || qec.this.k[i] == null) {
                int d = qec.this.g;
                qec.this.g = i;
                if (d != qec.this.g) {
                    if (qec.this.i != null) {
                        qec.this.i.a(i, d);
                    }
                    qec qec = qec.this;
                    if (qec.g >= 0) {
                        qec.d.a(qec.e, Integer.valueOf(qec.h.a(qec.g)));
                    }
                }
                return;
            }
            if (qec.this.k[i].equals("streaming-quality")) {
                qec.this.l.a(MessageRequest.a("upsell", qec.this.k[i], PlaceboBannerView.V1));
            } else {
                qec.this.m.a((int) R.string.toast_feature_not_available, 0, new Object[0]);
            }
            qec.this.j.setSelection(qec.this.g);
        }

        public final void onNothingSelected(AdapterView<?> adapterView) {
            qec.this.g = -1;
        }
    };

    /* renamed from: qec$a */
    public interface a {
        void a(int i, int i2);
    }

    /* renamed from: qec$b */
    public interface b {
        int a(int i);

        int b(int i);
    }

    public qec(View view, frh frh, jug jug, rka rka, jsz jsz) {
        super(view, frh);
        this.d = jug;
        this.j = new Spinner(this.a);
        this.b.a(this.j);
        this.l = rka;
        this.m = jsz;
    }

    public final void a(SettingsState settingsState) {
        this.j.setOnItemSelectedListener(null);
        this.g = this.h.b(((Integer) this.f.call(settingsState)).intValue());
        if (this.g >= this.j.getCount()) {
            this.g = this.j.getCount() - 1;
        }
        this.j.setSelection(this.g);
        this.j.setOnItemSelectedListener(this.n);
    }

    public final void a(SpinnerAdapter spinnerAdapter) {
        this.j.setOnItemSelectedListener(null);
        this.j.setAdapter(spinnerAdapter);
    }

    public final void a(String[] strArr) {
        this.k = (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public final void a(boolean z) {
        super.a(z);
        this.j.setEnabled(z);
    }
}
