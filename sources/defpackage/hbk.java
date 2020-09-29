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

/* renamed from: hbk reason: default package */
public final class hbk implements hbj {
    private final Activity a;
    private final Bundle b = fb.a((Context) this.a, 17432576, 17432577).a();
    private final spe c;

    public hbk(Activity activity, spe spe) {
        this.a = activity;
        this.c = spe;
    }

    public final void a(String str) {
        Activity activity = this.a;
        fr.a((Context) activity, AssistedCurationActivity.a((Context) activity, str), this.b);
    }

    public final void a(String str, gjb gjb) {
        Intent a2 = this.c.a(spd.a(str).c(true).a());
        a.a(a2, gjb);
        this.a.startActivity(a2);
    }

    public final void b(String str) {
        Activity activity = this.a;
        activity.startActivity(CreatePlaylistActivity.a((Context) activity, str));
    }

    public final void a(List<String> list) {
        Activity activity = this.a;
        fr.a((Context) activity, CreatePlaylistActivity.a((Context) activity, list), this.b);
    }

    public final void a(String str, List<String> list) {
        Activity activity = this.a;
        fr.a((Context) activity, CreatePlaylistActivity.a(activity, str, list), this.b);
    }

    public final void a(String str, String str2) {
        Activity activity = this.a;
        activity.startActivity(RenamePlaylistActivity.a(activity, str, str2));
    }

    public final void a(List<String> list, String str, String str2) {
        Activity activity = this.a;
        fr.a((Context) activity, AddToPlaylistActivity.a(activity, list, str, str2), this.b);
    }

    public final void c(String str) {
        Activity activity = this.a;
        fr.a((Context) activity, EditPlaylistActivity.a((Context) activity, str), this.b);
    }

    public final void a(String str, AllSongsConfiguration allSongsConfiguration) {
        Activity activity = this.a;
        fr.a((Context) activity, PlaylistAllSongsActivity.a((Context) activity, str, allSongsConfiguration), this.b);
    }

    public final void d(String str) {
        fr.a((Context) this.a, off.b(this.c.a(spd.a(str).a())), this.b);
    }
}
