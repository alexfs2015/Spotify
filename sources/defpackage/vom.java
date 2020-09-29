package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: vom reason: default package */
public final class vom {
    public static AlertDialog a(View view, String str, String str2, String str3, String str4) {
        TextView textView = (TextView) view.findViewById(R.id.podcast_onboarding_skip_dialog_title);
        TextView textView2 = (TextView) view.findViewById(R.id.podcast_onboarding_skip_dialog_body);
        Button button = (Button) view.findViewById(R.id.podcast_onboarding_skip_dialog_continue_button);
        Button button2 = (Button) view.findViewById(R.id.podcast_onboarding_skip_dialog_skip_button);
        AlertDialog create = new Builder(view.getContext(), 2132017714).setView(view).create();
        textView.setText(str);
        textView2.setText(str2);
        button.setText(str3);
        button2.setText(str4);
        return create;
    }
}
