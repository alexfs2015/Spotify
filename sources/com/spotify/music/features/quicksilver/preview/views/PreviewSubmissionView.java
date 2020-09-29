package com.spotify.music.features.quicksilver.preview.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.spotify.music.R;
import java.util.ArrayList;

public class PreviewSubmissionView extends LinearLayout {
    public EditText a;
    public Spinner b;
    public Button c;
    private Button d;

    public PreviewSubmissionView(Context context) {
        super(context, null, 2132017929);
        b();
    }

    public PreviewSubmissionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2132017929);
        b();
    }

    public PreviewSubmissionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        inflate(getContext(), R.layout.preview_submission, this);
        this.a = (EditText) ip.c((View) this, (int) R.id.creative_id);
        this.b = (Spinner) ip.c((View) this, (int) R.id.trigger_type);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add("Navigation");
        arrayList.add("Playback Started");
        arrayList.add("Client Event");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), R.layout.preview_submission_spinner_textview, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        this.b.setAdapter(arrayAdapter);
        this.b.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                PreviewSubmissionView.this.a(view, z);
            }
        });
        this.d = (Button) ip.c((View) this, (int) R.id.button_positive);
        this.c = (Button) ip.c((View) this, (int) R.id.button_negative);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, boolean z) {
        if (z) {
            a();
        }
    }

    public final void a() {
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
    }

    public final void a(OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
        this.a.setOnEditorActionListener(new OnEditorActionListener(onClickListener) {
            private final /* synthetic */ OnClickListener f$0;

            {
                this.f$0 = r1;
            }

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return PreviewSubmissionView.a(this.f$0, textView, i, keyEvent);
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(OnClickListener onClickListener, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 2 || onClickListener == null) {
            return false;
        }
        onClickListener.onClick(textView);
        return true;
    }
}
