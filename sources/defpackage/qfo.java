package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.spotify.music.R;
import com.spotify.signup.api.services.model.EmailSignupRequestBody.Gender;

/* renamed from: qfo reason: default package */
public final class qfo extends jz implements OnItemClickListener {
    public a T;
    public Gender U;
    private ListView V;

    /* renamed from: qfo$a */
    public interface a {
        void a(Gender gender);
    }

    public static qfo i(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("should_include_neutral_gender", z);
        qfo qfo = new qfo();
        qfo.g(bundle);
        return qfo;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        a(2, (int) R.style.SignUpDialogFragment);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.signup_gender_picker_dialog, viewGroup);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.V = (ListView) view.findViewById(R.id.gender_list);
        this.V.setAdapter(new ArrayAdapter(view.getContext(), R.layout.signup_gender_picker_list_item, qfp.a(view.getContext(), ((Bundle) fay.a(this.i)).getBoolean("should_include_neutral_gender"))));
        Gender gender = this.U;
        if (gender != null) {
            this.V.setItemChecked(gender.ordinal(), true);
        }
        this.V.setOnItemClickListener(this);
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        a aVar = this.T;
        if (aVar != null) {
            aVar.a(qfp.a(i));
        }
        this.V.post(new $$Lambda$7N3PsRTdhmNV4903MIn_g2C_ms(this));
    }
}
