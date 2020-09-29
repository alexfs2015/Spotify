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

/* renamed from: ftr reason: default package */
public final class ftr {
    List<fuh> a = Lists.a();
    private final Context b;
    private final fto c;

    public ftr(Context context, fto fto) {
        this.b = context;
        this.c = fto;
    }

    public final View a(int i, ViewGroup viewGroup) {
        fuh fuh = (fuh) this.a.get(i);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.b).inflate(R.layout.context_menu_top_bar_item, viewGroup, false);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) linearLayout.findViewById(R.id.top_bar_item_imageview);
        TextView textView = (TextView) linearLayout.findViewById(R.id.top_bar_item_textview);
        textView.setText(fuh.a);
        textView.setTextColor(fr.c(this.b, fuh.e ? R.color.white : R.color.cat_white_40));
        appCompatImageButton.setImageDrawable(fuh.a());
        linearLayout.setEnabled(fuh.e);
        linearLayout.setOnClickListener(new $$Lambda$ftr$mAgemdJVs4Bk4piqcmrFdye1qLQ(this, fuh, appCompatImageButton));
        return linearLayout;
    }

    public final int a() {
        return this.a.size();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fuh fuh, AppCompatImageButton appCompatImageButton, View view) {
        if (fuh.f != null) {
            fuh.f.onTopBarItemClicked(fuh);
        }
        if (fuh.d) {
            this.c.a();
            return;
        }
        fuh.c = (fuh.c + 1) % fuh.b.size();
        appCompatImageButton.setImageDrawable(fuh.a());
    }
}
