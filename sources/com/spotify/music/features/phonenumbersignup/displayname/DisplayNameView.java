package com.spotify.music.features.phonenumbersignup.displayname;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.spotify.music.R;

public class DisplayNameView extends LinearLayout implements b {
    public a a;
    public EditText b;
    public Button c;
    public Position d;
    public View e;
    private final OnClickListener f = new OnClickListener() {
        public final void onClick(DialogInterface dialogInterface, int i) {
            DisplayNameView.this.a.a(true, true);
        }
    };

    public enum Position {
        LEFT,
        CENTER,
        RIGHT
    }

    public DisplayNameView(Context context) {
        super(context);
        b();
    }

    public DisplayNameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    private void b() {
        View.inflate(getContext(), R.layout.create_account_login_credentials_display_name, this);
        this.e = (View) fbp.a(findViewById(R.id.sign_up_display_name_input_field_container));
        this.b = (EditText) fbp.a(findViewById(R.id.sign_up_display_name));
        this.c = (Button) fbp.a(findViewById(R.id.sign_up_save_button));
        this.c.setEnabled(false);
        this.d = Position.RIGHT;
    }

    public final void a() {
        a aVar = new a(getContext(), 2132017714);
        aVar.a(R.string.choose_username_alert_title);
        aVar.h = true;
        aVar.b(R.string.choose_username_alert_connection);
        aVar.a((int) R.string.choose_username_alert_retry, this.f);
        aVar.b(R.string.choose_username_alert_cancel, new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        aVar.a().show();
    }

    public void a(boolean z) {
        this.c.setEnabled(z);
    }
}
