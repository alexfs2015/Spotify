package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.spotify.music.R;

/* renamed from: fql reason: default package */
public final class fql extends Dialog {
    public final FrameLayout a = ((FrameLayout) findViewById(R.id.bottom_sheet_content));

    public fql(Context context) {
        super(context, 2132017703);
        View inflate = LayoutInflater.from(context).inflate(R.layout.glue_bottom_sheet, null);
        setContentView(inflate);
        inflate.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                fql.this.dismiss();
            }
        });
    }
}
