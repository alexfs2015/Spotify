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

/* renamed from: vxu reason: default package */
public final class vxu implements kmm<vxp, vxn>, vxv, wal {
    private final View a;
    private final Button b;
    private final DatePicker c;
    private final TextView d;
    private final PublishSubject<vxn> e = PublishSubject.a();

    public vxu(View view) {
        this.a = view;
        this.b = (Button) this.a.findViewById(R.id.age_next_button);
        this.c = (DatePicker) this.a.findViewById(R.id.datePicker);
        this.c.setMaxDate(new Date().getTime());
        this.d = (TextView) this.a.findViewById(R.id.age_error_message);
        this.b.setOnClickListener(new $$Lambda$vxu$hRQWInA1ZDIlrCxn_BvvEXaAUrE(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.e.onNext(new a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DatePicker datePicker, int i, int i2, int i3) {
        this.e.onNext(new c(i, i2, i3));
    }

    static /* synthetic */ void a(vxu vxu, vxp vxp) {
        if (vxp.e()) {
            if (vxp.d() instanceof c) {
                vxu.d.setVisibility(4);
                vxu.b.setEnabled(true);
            } else if (vxp.d() instanceof a) {
                vxu.d.setVisibility(0);
                vxu.b.setEnabled(false);
            }
        }
    }

    public final void a() {
    }

    public final void a(int i, int i2, int i3) {
        this.c.init(i, i2, i3, new $$Lambda$vxu$u4iY7CsnS6Q4caZFQ140lKQ5uzY(this));
    }

    public final kmn<vxp> connect(knw<vxn> knw) {
        PublishSubject<vxn> publishSubject = this.e;
        knw.getClass();
        final Disposable d2 = publishSubject.d((Consumer<? super T>) new $$Lambda$ppb7Lxwe_FGKxt5pbSpMGHxHbb8<Object>(knw));
        return new kmn<vxp>() {
            public final /* synthetic */ void accept(Object obj) {
                vxu.a(vxu.this, (vxp) obj);
            }

            public final void dispose() {
                d2.bd_();
            }
        };
    }
}
