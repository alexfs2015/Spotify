package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;
import com.spotify.music.features.addtoplaylist.AddToPlaylistActivity;
import com.spotify.music.features.assistedcuration.AssistedCurationActivity;
import com.spotify.music.features.createplaylist.CreatePlaylistActivity;
import com.spotify.music.features.editplaylist.EditPlaylistActivity;
import com.spotify.music.features.playlistallsongs.PlaylistAllSongsActivity;
import com.spotify.music.features.renameplaylist.RenamePlaylistActivity;
import java.util.List;

/* renamed from: hed reason: default package */
public final class hed implements hec {
    private final Activity a;
    private final Bundle b = fb.a((Context) this.a, 17432576, 17432577).a();
    private final szl c;

    public hed(Activity activity, szl szl) {
        this.a = activity;
        this.c = szl;
    }

    public final void a(String str) {
        Activity activity = this.a;
        fr.a((Context) activity, AssistedCurationActivity.a((Context) activity, str), this.b);
    }

    public final void a(String str, AllSongsConfiguration allSongsConfiguration) {
        Activity activity = this.a;
        fr.a((Context) activity, PlaylistAllSongsActivity.a((Context) activity, str, allSongsConfiguration), this.b);
    }

    public final void a(String str, gkm gkm) {
        Intent a2 = this.c.a(szk.a(str).c(true).a());
        a.a(a2, gkm);
        this.a.startActivity(a2);
    }

    public final void a(String str, String str2) {
        Activity activity = this.a;
        activity.startActivity(RenamePlaylistActivity.a(activity, str, str2));
    }

    public final void a(String str, List<String> list) {
        Activity activity = this.a;
        fr.a((Context) activity, CreatePlaylistActivity.a(activity, str, list), this.b);
    }

    public final void a(List<String> list) {
        Activity activity = this.a;
        fr.a((Context) activity, CreatePlaylistActivity.a((Context) activity, list), this.b);
    }

    public final void a(List<String> list, String str, String str2) {
        Activity activity = this.a;
        fr.a((Context) activity, AddToPlaylistActivity.a(activity, list, str, str2), this.b);
    }

    public final void b(String str) {
        Activity activity = this.a;
        activity.startActivity(CreatePlaylistActivity.a((Context) activity, str));
    }

    public final void c(String str) {
        Activity activity = this.a;
        fr.a((Context) activity, EditPlaylistActivity.a((Context) activity, str), this.b);
    }

    public final void d(String str) {
        fr.a((Context) this.a, omj.b(this.c.a(szk.a(str).a())), this.b);
    }
}
