package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: jvf reason: default package */
public final class jvf {
    private final Map<Integer, WeakReference<Toast>> a = new HashMap(8);
    private final Context b;

    public jvf(Context context) {
        this.b = context;
    }

    public void a(int i, int i2, Object... objArr) {
        Toast toast;
        if (objArr.length > 0) {
            Context context = this.b;
            toast = Toast.makeText(context, context.getString(i, objArr), i2);
        } else {
            toast = Toast.makeText(this.b, i, i2);
        }
        toast.show();
    }

    public final synchronized void a(SpotifyIconV2 spotifyIconV2, int i, int i2) {
        a(spotifyIconV2, this.b.getString(i), i, i2);
    }

    public final synchronized void a(SpotifyIconV2 spotifyIconV2, String str, int i, int i2) {
        synchronized (this.a) {
            Iterator it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                Toast toast = (Toast) ((WeakReference) entry.getValue()).get();
                if (toast == null) {
                    it.remove();
                } else if (((Integer) entry.getKey()).intValue() == i) {
                    toast.cancel();
                    it.remove();
                }
            }
        }
        LayoutInflater from = LayoutInflater.from(new ContextThemeWrapper(this.b, 2132017713));
        from.setFactory(new gar());
        View inflate = from.inflate(R.layout.toast, null);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        textView.setText(str);
        textView.setCompoundDrawablesWithIntrinsicBounds(null, new SpotifyIconDrawable(this.b, spotifyIconV2, (float) this.b.getResources().getDimensionPixelSize(R.dimen.icon_toast)), null, null);
        Toast toast2 = new Toast(this.b.getApplicationContext());
        toast2.setView(inflate);
        toast2.setGravity(17, 0, 0);
        toast2.setDuration(i2);
        toast2.show();
        synchronized (this.a) {
            this.a.put(Integer.valueOf(i), new WeakReference(toast2));
        }
    }
}
