package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import com.spotify.music.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.Date;

/* renamed from: vko reason: default package */
public final class vko implements kjd<vkj, vkh>, vkp, vnf {
    private final View a;
    private final Button b;
    private final DatePicker c;
    private final TextView d;
    private final PublishSubject<vkh> e = PublishSubject.a();

    public final void a() {
    }

    public vko(View view) {
        this.a = view;
        this.b = (Button) this.a.findViewById(R.id.age_next_button);
        this.c = (DatePicker) this.a.findViewById(R.id.datePicker);
        this.c.setMaxDate(new Date().getTime());
        this.d = (TextView) this.a.findViewById(R.id.age_error_message);
        this.b.setOnClickListener(new $$Lambda$vko$KU_hTlDhLwT_avIn8lgJRncVBsU(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.e.onNext(new a());
    }

    public final kje<vkj> connect(kkn<vkh> kkn) {
        PublishSubject<vkh> publishSubject = this.e;
        kkn.getClass();
        final Disposable d2 = publishSubject.d((Consumer<? super T>) new $$Lambda$pNGkwpGqlmgaMOcfJ9h6s5vM4PM<Object>(kkn));
        return new kje<vkj>() {
            public final /* synthetic */ void accept(Object obj) {
                vko.a(vko.this, (vkj) obj);
            }

            public final void dispose() {
                d2.bf_();
            }
        };
    }

    public final void a(int i, int i2, int i3) {
        this.c.init(i, i2, i3, new $$Lambda$vko$hkG_VRcuBvA7h00l3fL0YEtX2w(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DatePicker datePicker, int i, int i2, int i3) {
        this.e.onNext(new c(i, i2, i3));
    }

    static /* synthetic */ void a(vko vko, vkj vkj) {
        if (vkj.e()) {
            if (vkj.d() instanceof c) {
                vko.d.setVisibility(4);
                vko.b.setEnabled(true);
            } else if (vkj.d() instanceof a) {
                vko.d.setVisibility(0);
                vko.b.setEnabled(false);
            }
        }
    }
}
