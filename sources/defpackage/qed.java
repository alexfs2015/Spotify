package defpackage;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.util.loader.SettingsState;
import com.spotify.music.R;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qed reason: default package */
public final class qed implements qea {
    public wuk a = xaj.b();
    private final View b;
    private final Context c;
    private final RxResolver d;
    private LayerDrawable e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    public final void a() {
    }

    public final void a(OnClickListener onClickListener) {
    }

    public final void a(SettingsState settingsState) {
    }

    public final void a(CharSequence charSequence) {
    }

    public final void a(String str) {
    }

    public qed(Context context, ViewGroup viewGroup) {
        this.b = LayoutInflater.from(context).inflate(R.layout.settings_storage_bar, viewGroup, false);
        this.c = context;
        this.d = (RxResolver) ggw.a(RxResolver.class);
        this.f = (TextView) this.b.findViewById(R.id.device_storage_other);
        this.g = (TextView) this.b.findViewById(R.id.device_storage_downloads);
        this.h = (TextView) this.b.findViewById(R.id.device_storage_cache);
        this.i = (TextView) this.b.findViewById(R.id.device_storage_free);
        this.e = (LayerDrawable) ((ImageView) this.b.findViewById(R.id.device_storage_progress)).getDrawable();
        b();
    }

    public final void b() {
        Request build = RequestBuilder.get("sp://storage/v1/statistics").build();
        this.a.unsubscribe();
        this.a = vun.a((ObservableSource<T>) this.d.resolve(build).a(AndroidSchedulers.a()), BackpressureStrategy.BUFFER).a((wun<? super T>) new $$Lambda$qed$D3LkudlNc2Z9IhXPjQDZSZKRY<Object>(this), (wun<Throwable>) $$Lambda$qed$LrXxfPTWb8ltr2xPYDCOObU.INSTANCE);
    }

    private void a(TextView textView, int i2, int i3) {
        if (i3 <= 0) {
            this.b.findViewById(i2).setVisibility(8);
            return;
        }
        this.b.findViewById(i2).setVisibility(0);
        textView.setText(a(this.c, i3));
    }

    private void a(int i2, int i3, int i4) {
        ((ClipDrawable) this.e.findDrawableByLayerId(i2).mutate()).setLevel((int) ((((float) i3) * 10000.0f) / ((float) i4)));
    }

    private static String a(Context context, int i2) {
        if (i2 >= 1024) {
            double d2 = (double) i2;
            Double.isNaN(d2);
            return context.getString(R.string.settings_storage_byte_unit_gigabytes_formatted_decimal, new Object[]{Double.valueOf(d2 / 1024.0d)});
        }
        return context.getString(R.string.settings_storage_byte_unit_megabytes_formatted_decimal, new Object[]{Double.valueOf((double) i2)});
    }

    public final View getView() {
        return this.b;
    }

    public final void a(int i2) {
        getView().setId(i2);
    }

    public final void a(boolean z) {
        getView().setEnabled(z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Response response) {
        if (response.getStatus() == 200) {
            try {
                JSONObject jSONObject = new JSONObject(response.getBodyString());
                int i2 = jSONObject.getInt("total_space");
                int i3 = jSONObject.getInt("free_space");
                int i4 = jSONObject.getInt("current_size");
                int i5 = jSONObject.getInt("current_locked_size");
                int i6 = (i2 - i3) - i4;
                a((int) R.id.storage_progress_cache, i6 + i4, i2);
                a((int) R.id.storage_progress_downloads, i6 + i5, i2);
                a((int) R.id.storage_progress_others, i6, i2);
                a(this.f, (int) R.id.device_storage_row_other, i6);
                a(this.g, (int) R.id.device_storage_row_downloads, i5);
                a(this.h, (int) R.id.device_storage_row_cache, i4 - i5);
                a(this.i, (int) R.id.device_storage_row_free, i3);
            } catch (JSONException unused) {
            }
        }
    }
}
