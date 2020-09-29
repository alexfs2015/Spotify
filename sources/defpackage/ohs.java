package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;
import java.util.Calendar;

/* renamed from: ohs reason: default package */
public final class ohs extends ke {
    public a T;
    public Calendar U;

    /* renamed from: ohs$a */
    public interface a {
        void a(int i, int i2, int i3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DatePicker datePicker, View view) {
        a aVar = this.T;
        if (aVar != null) {
            aVar.a(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
        }
        c();
    }

    private static boolean a(LinearLayout linearLayout) {
        return linearLayout.getChildCount() > 1;
    }

    public static ohs ae() {
        return new ohs();
    }

    private void b(View view) {
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            View childAt = linearLayout.getChildAt(a(linearLayout) ? 1 : 0);
            if (childAt instanceof EditText) {
                ((EditText) childAt).setTextSize(1, 14.0f);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        c();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.signup_datepicker_dialog, viewGroup);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        DatePicker datePicker = (DatePicker) view.findViewById(R.id.datepicker);
        if (datePicker.getChildAt(0) instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) datePicker.getChildAt(0);
            if (linearLayout.getChildAt(0) instanceof LinearLayout) {
                LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(0);
                b(linearLayout2.getChildAt(0));
                b(linearLayout2.getChildAt(1));
                b(linearLayout2.getChildAt(2));
            }
        }
        Calendar calendar = this.U;
        if (calendar != null) {
            datePicker.updateDate(calendar.get(1), this.U.get(2), this.U.get(5));
        }
        ((Button) view.findViewById(R.id.signup_datepicker_ok)).setOnClickListener(new $$Lambda$ohs$fQGp8kwzdC0fnBTZgka8u9ZQDlE(this, datePicker));
        ((Button) view.findViewById(R.id.signup_datepicker_cancel)).setOnClickListener(new $$Lambda$ohs$oCFOm9q7Q6mRFdzbjYSPUpoVqsU(this));
    }

    public final void a(kk kkVar, String str) {
        kkVar.a().a((Fragment) this, str).c();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        a(2, (int) R.style.SignUpDialogFragment);
    }
}
