package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.music.lyrics.model.ProviderAndroidIntent;
import com.spotify.music.lyrics.model.TrackLyrics;
import com.spotify.music.lyrics.views.LyricsAppearance;
import java.util.ArrayList;

/* renamed from: svr reason: default package */
public final class svr extends LinearLayout {
    public int a = -7829368;
    public TrackLyrics b;
    private final LyricsAppearance c;

    public svr(Context context, int i, LyricsAppearance lyricsAppearance) {
        super(context);
        this.c = lyricsAppearance;
        setOrientation(1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ProviderAndroidIntent providerAndroidIntent, View view) {
        Context context = getContext();
        String providerAndroidPackage = providerAndroidIntent.getProviderAndroidPackage();
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(providerAndroidPackage, 0);
            Intent intent = null;
            if (providerAndroidIntent.getAction() != null) {
                Intent intent2 = new Intent(providerAndroidIntent.getAction());
                intent2.setPackage(providerAndroidIntent.getProviderAndroidPackage());
                if (!(providerAndroidIntent.getData() == null || providerAndroidIntent.getContentType() == null)) {
                    intent2.setDataAndType(Uri.parse(providerAndroidIntent.getData()), providerAndroidIntent.getContentType());
                }
                if (!svp.b(context, intent2)) {
                    Logger.d("Unable to resolve activity for provider: %s", providerAndroidIntent.toString());
                } else {
                    intent = intent2;
                }
            }
            if (intent == null) {
                intent = packageManager.getLaunchIntentForPackage(applicationInfo.packageName);
            }
            if (svp.a(context, intent)) {
                return;
            }
        } catch (NameNotFoundException unused) {
            Logger.b("Application not installed: %s", providerAndroidPackage);
        } catch (Throwable th) {
            svp.a(context, svp.a(providerAndroidPackage));
            throw th;
        }
        svp.a(context, svp.a(providerAndroidPackage));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        String str;
        int size = MeasureSpec.getSize(i2);
        int b2 = vfj.b((float) this.c.mLineHeight, getResources());
        int i3 = size / b2;
        int i4 = i3 - (i3 % 2);
        if (i4 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int i5 = size / i4;
        if (i5 == b2) {
            i5 = b2;
        }
        removeAllViews();
        TrackLyrics trackLyrics = this.b;
        if (trackLyrics != null) {
            TextView textView = new TextView(getContext());
            vgl.a(getContext(), textView, 2132017668);
            textView.setId(R.id.text1);
            textView.setTextColor(this.a);
            textView.setGravity(80);
            ArrayList arrayList = new ArrayList(2);
            String provider = trackLyrics.getProvider();
            String str2 = "";
            if (provider != null) {
                str = getContext().getString(R.string.lyrics_full_screen_provider, new Object[]{provider});
            } else {
                str = str2;
            }
            arrayList.add(str);
            if ("プチリリ".equals(provider)) {
                if (TrackLyrics.KIND_TEXT.equals(trackLyrics.getKind())) {
                    arrayList.add(getContext().getString(R.string.lyrics_full_screen_sync_these_lyrics));
                    ProviderAndroidIntent providerAndroidIntent = trackLyrics.getProviderAndroidIntent();
                    if (providerAndroidIntent != null) {
                        textView.setOnClickListener(new $$Lambda$svr$8bowfKsYbMb3o3pVL5aROzD6XA(this, providerAndroidIntent));
                    }
                }
            }
            int size2 = ((i4 / 2) - (arrayList.size() + 1)) * i5;
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.setMargins(0, size2, 0, i5);
            textView.setMinHeight(i5 * arrayList.size());
            textView.setLayoutParams(layoutParams);
            textView.setText(jug.a(fbl.a(str2).a((Iterable<?>) arrayList)));
            addView(textView);
        }
        super.onMeasure(i, i2);
    }
}
