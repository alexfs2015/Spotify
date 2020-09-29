package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.spotify.libs.glue.custom.playbutton.CirclePlayButtonView;

/* renamed from: glf reason: default package */
public interface glf {

    /* renamed from: glf$a */
    public interface a {
        glf a(Button button);

        glf a(CirclePlayButtonView circlePlayButtonView);
    }

    View a();

    void a(OnClickListener onClickListener);

    void a(boolean z);

    void b(boolean z);
}
