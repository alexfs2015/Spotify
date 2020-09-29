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

/* renamed from: qnf reason: default package */
public final class qnf extends qmx {
    final jwo d;
    public defpackage.jwo.a<Integer> e;
    public xiy<SettingsState, Integer> f;
    /* access modifiers changed from: 0000 */
    public int g = -1;
    public b h;
    public a i;
    /* access modifiers changed from: private */
    public final Spinner j;
    /* access modifiers changed from: private */
    public String[] k;
    /* access modifiers changed from: private */
    public final rtg l;
    /* access modifiers changed from: private */
    public final jvf m;
    private final OnItemSelectedListener n = new OnItemSelectedListener() {
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (qnf.this.k == null || qnf.this.k.length <= i || qnf.this.k[i] == null) {
                int d = qnf.this.g;
                qnf.this.g = i;
                if (d != qnf.this.g) {
                    if (qnf.this.i != null) {
                        qnf.this.i.a(i, d);
                    }
                    qnf qnf = qnf.this;
                    if (qnf.g >= 0) {
                        qnf.d.a(qnf.e, Integer.valueOf(qnf.h.a(qnf.g)));
                    }
                }
                return;
            }
            if (qnf.this.k[i].equals("streaming-quality")) {
                qnf.this.l.a(MessageRequest.a("upsell", qnf.this.k[i], PlaceboBannerView.V1));
            } else {
                qnf.this.m.a((int) R.string.toast_feature_not_available, 0, new Object[0]);
            }
            qnf.this.j.setSelection(qnf.this.g);
        }

        public final void onNothingSelected(AdapterView<?> adapterView) {
            qnf.this.g = -1;
        }
    };

    /* renamed from: qnf$a */
    public interface a {
        void a(int i, int i2);
    }

    /* renamed from: qnf$b */
    public interface b {
        int a(int i);

        int b(int i);
    }

    public qnf(View view, fsb fsb, jwo jwo, rtg rtg, jvf jvf) {
        super(view, fsb);
        this.d = jwo;
        this.j = new Spinner(this.a);
        this.b.a(this.j);
        this.l = rtg;
        this.m = jvf;
    }

    public final void a(SpinnerAdapter spinnerAdapter) {
        this.j.setOnItemSelectedListener(null);
        this.j.setAdapter(spinnerAdapter);
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

    public final void a(boolean z) {
        super.a(z);
        this.j.setEnabled(z);
    }

    public final void a(String[] strArr) {
        this.k = (String[]) Arrays.copyOf(strArr, strArr.length);
    }
}
