package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: mlr reason: default package */
public final class mlr {
    private static final Pattern a = Pattern.compile("==", 16);
    private final WeakReference<Context> b;
    private final fqn c;
    private List<mlq> d;

    public mlr(Context context, fqn fqn) {
        this.b = new WeakReference<>(context);
        this.c = fqn;
    }

    private static a a(Context context, String str, String str2) {
        if (str2.contains("==")) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.DEVICES, (float) vfj.b(17.0f, context.getResources()));
            spotifyIconDrawable.a(fr.c(context, R.color.cat_grayscale_55));
            spotifyIconDrawable.setBounds(0, 0, spotifyIconDrawable.getIntrinsicWidth(), spotifyIconDrawable.getIntrinsicHeight());
            Matcher matcher = a.matcher(str2);
            String str3 = "\n==";
            String replaceAll = matcher.replaceAll(Matcher.quoteReplacement(str3));
            spannableStringBuilder.append(replaceAll);
            spannableStringBuilder.setSpan(new ImageSpan(spotifyIconDrawable, 0), replaceAll.indexOf(str3), replaceAll.indexOf(str3) + 3, 17);
            str2 = spannableStringBuilder;
        }
        return new a(str, str2);
    }

    private List<mlq> b() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(d());
        arrayList.add(e());
        arrayList.add(f());
        arrayList.add(h());
        arrayList.add(i());
        arrayList.add(j());
        return arrayList;
    }

    private List<mlq> c() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(d());
        arrayList.add(e());
        arrayList.add(f());
        arrayList.add(h());
        arrayList.add(i());
        arrayList.add(j());
        arrayList.add(g());
        return arrayList;
    }

    private mlq d() {
        Context context = (Context) this.b.get();
        if (context == null) {
            return mlq.a();
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(a(context, context.getString(R.string.connect_education_step_computer_1), context.getString(R.string.connect_education_step_computer_description_1)));
        arrayList.add(a(context, context.getString(R.string.connect_education_step_computer_2), context.getString(R.string.connect_education_step_computer_description_2)));
        arrayList.add(a(context, context.getString(R.string.connect_education_step_computer_3), context.getString(R.string.connect_education_step_computer_description_3)));
        mlq mlq = new mlq(0, context.getString(R.string.connect_education_title_computer), context.getString(R.string.connect_education_step_additional_computer), "https://www.spotify.com/connect/?utm_source=spotify%26utm_medium=android_app%26utm_campaign=connect_devicemenu_tutorial", context.getString(R.string.connect_education_short_description_computer), arrayList);
        return mlq;
    }

    private mlq e() {
        Context context = (Context) this.b.get();
        if (context == null) {
            return mlq.a();
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(a(context, context.getString(R.string.connect_education_step_tv_1), context.getString(R.string.connect_education_step_tv_description_1)));
        arrayList.add(a(context, context.getString(R.string.connect_education_step_tv_2), context.getString(R.string.connect_education_step_tv_description_2)));
        arrayList.add(a(context, context.getString(R.string.connect_education_step_tv_3), context.getString(R.string.connect_education_step_tv_description_3)));
        mlq mlq = new mlq(1, context.getString(R.string.connect_education_title_tv), context.getString(R.string.connect_education_step_additional_tv), "https://www.spotify.com/tv/?utm_source=spotify%26utm_medium=android_app%26utm_campaign=connect_devicemenu_tutorial", context.getString(R.string.connect_education_short_description_tv), arrayList);
        return mlq;
    }

    private mlq f() {
        Context context = (Context) this.b.get();
        if (context == null) {
            return mlq.a();
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(a(context, context.getString(R.string.connect_education_step_speaker_1), context.getString(R.string.connect_education_step_speaker_description_1)));
        arrayList.add(a(context, context.getString(R.string.connect_education_step_speaker_2), context.getString(R.string.connect_education_step_speaker_description_2)));
        arrayList.add(a(context, context.getString(R.string.connect_education_step_speaker_3), context.getString(R.string.connect_education_step_speaker_description_3)));
        mlq mlq = new mlq(2, context.getString(R.string.connect_education_title_speaker), context.getString(R.string.connect_education_step_additional_speaker), "https://www.spotify.com/speakers/?utm_source=spotify%26utm_medium=android_app%26utm_campaign=connect_devicemenu_tutorial", context.getString(R.string.connect_education_short_description_speaker), arrayList);
        return mlq;
    }

    private mlq g() {
        Context context = (Context) this.b.get();
        if (context == null) {
            return mlq.a();
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(a(context, context.getString(R.string.connect_education_step_social_listening_1), context.getString(R.string.connect_education_step_social_listening_description_1)));
        arrayList.add(a(context, context.getString(R.string.connect_education_step_social_listening_2), context.getString(R.string.connect_education_step_social_listening_description_2)));
        arrayList.add(a(context, context.getString(R.string.connect_education_step_social_listening_3), context.getString(R.string.connect_education_step_social_listening_description_3)));
        mlq mlq = new mlq(6, context.getString(R.string.connect_education_title_social_listening), null, null, context.getString(R.string.connect_education_short_description_social_listening), arrayList);
        return mlq;
    }

    private mlq h() {
        Context context = (Context) this.b.get();
        if (context == null) {
            return mlq.a();
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(a(context, null, context.getString(R.string.connect_education_step_gameconsole_description_1)));
        arrayList.add(a(context, context.getString(R.string.connect_education_step_gameconsole_title_ps), context.getString(R.string.connect_education_step_gameconsole_description_ps)));
        arrayList.add(a(context, context.getString(R.string.connect_education_step_gameconsole_title_xbox), context.getString(R.string.connect_education_step_gameconsole_description_xbox)));
        mlq mlq = new mlq(3, context.getString(R.string.connect_education_title_gameconsole), null, null, null, arrayList);
        return mlq;
    }

    private mlq i() {
        Context context = (Context) this.b.get();
        if (context == null) {
            return mlq.a();
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(a(context, context.getString(R.string.connect_education_step_chromecast_1), context.getString(R.string.connect_education_step_chromecast_description_1)));
        arrayList.add(a(context, context.getString(R.string.connect_education_step_chromecast_2), context.getString(R.string.connect_education_step_chromecast_description_2)));
        arrayList.add(a(context, context.getString(R.string.connect_education_step_chromecast_3), context.getString(R.string.connect_education_step_chromecast_description_3)));
        mlq mlq = new mlq(4, context.getString(R.string.connect_education_title_chromecast), context.getString(R.string.connect_education_step_additional_chromecast), "https://www.spotify.com/chromecast/?utm_source=spotify%26utm_medium=android_app%26utm_campaign=connect_devicemenu_tutorial", null, arrayList);
        return mlq;
    }

    private mlq j() {
        Context context = (Context) this.b.get();
        if (context == null) {
            return mlq.a();
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(a(context, context.getString(R.string.connect_education_step_bluetooth_1), context.getString(R.string.connect_education_step_bluetooth_description_1)));
        arrayList.add(a(context, context.getString(R.string.connect_education_step_bluetooth_2), context.getString(R.string.connect_education_step_bluetooth_description_2)));
        arrayList.add(a(context, context.getString(R.string.connect_education_step_bluetooth_3), context.getString(R.string.connect_education_step_bluetooth_description_3)));
        arrayList.add(a(context, context.getString(R.string.connect_education_step_bluetooth_4), context.getString(R.string.connect_education_step_bluetooth_description_4)));
        mlq mlq = new mlq(5, context.getString(R.string.connect_education_title_bluetooth), context.getString(R.string.connect_education_step_additional_bluetooth), "android.settings.BLUETOOTH_SETTINGS", null, arrayList);
        return mlq;
    }

    public final List<mlq> a() {
        if (this.d == null) {
            if (uok.a(this.c)) {
                this.d = c();
            } else {
                this.d = b();
            }
        }
        return this.d;
    }
}
