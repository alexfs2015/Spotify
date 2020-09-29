package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: tnc reason: default package */
public final class tnc {
    private final Context a;

    public tnc(Context context) {
        this.a = context;
    }

    public final tnb a() {
        return tnb.g().a(YourLibraryPageId.PODCAST_EPISODES).a(this.a.getString(R.string.your_library_podcast_tab_episodes_title)).b(this.a.getString(R.string.your_library_podcast_tab_episodes_empty_title)).c(this.a.getString(R.string.your_library_podcast_tab_empty_button_text)).a(ImmutableList.a(LinkType.COLLECTION_PODCASTS_EPISODES)).a();
    }

    public final tnb b() {
        a b = tnb.g().a(YourLibraryPageId.PODCAST_DOWNLOADS).a(this.a.getString(R.string.your_library_podcast_tab_downloads_title)).b(this.a.getString(R.string.your_library_podcast_tab_downloads_empty_title));
        Context context = this.a;
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.DOWNLOAD;
        String string = this.a.getString(R.string.your_library_podcast_tab_downloads_empty_subtitle);
        if (!(string.indexOf(123) == -1 || string.indexOf(125) == -1)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(string);
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) uts.b(15.0f, context.getResources()));
            spotifyIconDrawable.a(fr.c(context, R.color.cat_grayscale_55));
            spotifyIconDrawable.setBounds(0, 0, spotifyIconDrawable.getIntrinsicWidth(), spotifyIconDrawable.getIntrinsicHeight());
            spannableStringBuilder.setSpan(new uve(spotifyIconDrawable), string.indexOf(123), string.indexOf(125) + 1, 33);
            string = spannableStringBuilder;
        }
        return b.a((CharSequence) string).c(this.a.getString(R.string.your_library_podcast_tab_empty_button_text)).a(ImmutableList.a(LinkType.COLLECTION_PODCASTS_DOWNLOADS)).a();
    }

    public final tnb c() {
        a c = tnb.g().a(YourLibraryPageId.PODCAST_FOLLOWED).a(this.a.getString(R.string.your_library_podcast_tab_followed_title)).c(this.a.getString(R.string.your_library_podcast_tab_empty_button_text));
        c.b(this.a.getString(R.string.your_library_podcast_tab_followed_empty_title_follow));
        c.a((CharSequence) this.a.getString(R.string.your_library_podcast_tab_followed_empty_subtitle_follow));
        c.a(ImmutableList.a(LinkType.COLLECTION_PODCASTS_FOLLOWING));
        return c.a();
    }
}
