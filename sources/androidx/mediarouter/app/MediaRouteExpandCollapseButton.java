package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.R;

public class MediaRouteExpandCollapseButton extends AppCompatImageButton {
    final AnimationDrawable a;
    final AnimationDrawable b;
    final String c;
    final String d;
    boolean e;
    OnClickListener f;

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = (AnimationDrawable) fr.a(context, (int) R.drawable.mr_group_expand);
        this.b = (AnimationDrawable) fr.a(context, (int) R.drawable.mr_group_collapse);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(mw.b(context, i), Mode.SRC_IN);
        this.a.setColorFilter(porterDuffColorFilter);
        this.b.setColorFilter(porterDuffColorFilter);
        this.c = context.getString(R.string.mr_controller_expand_group);
        this.d = context.getString(R.string.mr_controller_collapse_group);
        setImageDrawable(this.a.getFrame(0));
        setContentDescription(this.c);
        super.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
                mediaRouteExpandCollapseButton.e = !mediaRouteExpandCollapseButton.e;
                if (MediaRouteExpandCollapseButton.this.e) {
                    MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = MediaRouteExpandCollapseButton.this;
                    mediaRouteExpandCollapseButton2.setImageDrawable(mediaRouteExpandCollapseButton2.a);
                    MediaRouteExpandCollapseButton.this.a.start();
                    MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton3 = MediaRouteExpandCollapseButton.this;
                    mediaRouteExpandCollapseButton3.setContentDescription(mediaRouteExpandCollapseButton3.d);
                } else {
                    MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton4 = MediaRouteExpandCollapseButton.this;
                    mediaRouteExpandCollapseButton4.setImageDrawable(mediaRouteExpandCollapseButton4.b);
                    MediaRouteExpandCollapseButton.this.b.start();
                    MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton5 = MediaRouteExpandCollapseButton.this;
                    mediaRouteExpandCollapseButton5.setContentDescription(mediaRouteExpandCollapseButton5.c);
                }
                if (MediaRouteExpandCollapseButton.this.f != null) {
                    MediaRouteExpandCollapseButton.this.f.onClick(view);
                }
            }
        });
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f = onClickListener;
    }
}
