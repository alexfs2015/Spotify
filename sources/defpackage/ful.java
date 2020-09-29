package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.google.common.collect.Lists;
import com.spotify.music.R;
import java.util.List;

/* renamed from: ful reason: default package */
public final class ful {
    List<fvb> a = Lists.a();
    private final Context b;
    private final fui c;

    public ful(Context context, fui fui) {
        this.b = context;
        this.c = fui;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fvb fvb, AppCompatImageButton appCompatImageButton, View view) {
        if (fvb.f != null) {
            fvb.f.onTopBarItemClicked(fvb);
        }
        if (fvb.d) {
            this.c.a();
            return;
        }
        fvb.c = (fvb.c + 1) % fvb.b.size();
        appCompatImageButton.setImageDrawable(fvb.a());
    }

    public final int a() {
        return this.a.size();
    }

    public final View a(int i, ViewGroup viewGroup) {
        fvb fvb = (fvb) this.a.get(i);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.b).inflate(R.layout.context_menu_top_bar_item, viewGroup, false);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) linearLayout.findViewById(R.id.top_bar_item_imageview);
        TextView textView = (TextView) linearLayout.findViewById(R.id.top_bar_item_textview);
        textView.setText(fvb.a);
        textView.setTextColor(fr.c(this.b, fvb.e ? R.color.white : R.color.cat_white_40));
        appCompatImageButton.setImageDrawable(fvb.a());
        linearLayout.setEnabled(fvb.e);
        linearLayout.setOnClickListener(new $$Lambda$ful$o1bG0EihEoHkfS3vqDQ0D0uqc5o(this, fvb, appCompatImageButton));
        return linearLayout;
    }
}
