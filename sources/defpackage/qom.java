package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.user.InvitationCodeModel;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.remoteconfig.AndroidFeatureUserProperties;

/* renamed from: qom reason: default package */
public final class qom extends qow<InvitationCodeModel, fri> {
    private final int c;

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(fqz fqz, Object obj) {
        fri fri = (fri) fqz;
        InvitationCodeModel invitationCodeModel = (InvitationCodeModel) obj;
        fri.getView().setTag(invitationCodeModel);
        fri.a(invitationCodeModel.getCode());
        fri.getView().setEnabled(!invitationCodeModel.isClaimed());
        if (TextUtils.isEmpty(invitationCodeModel.getClaimedByDisplayName())) {
            fri.c(this.a.getString(R.string.profile_invitation_code_unclaimed));
        } else {
            fri.c(this.a.getString(R.string.profile_invitation_code_claimed, new Object[]{invitationCodeModel.getClaimedByDisplayName()}));
        }
        SpotifyIcon spotifyIcon = invitationCodeModel.isClaimed() ? SpotifyIcon.USER_16 : SpotifyIcon.SHARE_16;
        ImageView imageView = new ImageView(this.a);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.a, spotifyIcon);
        spotifyIconDrawable.a(this.c);
        imageView.setImageDrawable(spotifyIconDrawable);
        fri.a(imageView);
    }

    public final /* bridge */ /* synthetic */ void a(boolean z) {
        super.a(z);
    }

    public final /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public final /* bridge */ /* synthetic */ long getItemId(int i) {
        return super.getItemId(i);
    }

    public final /* bridge */ /* synthetic */ int getItemViewType(int i) {
        return super.getItemViewType(i);
    }

    public final /* bridge */ /* synthetic */ View getView(int i, View view, ViewGroup viewGroup) {
        return super.getView(i, view, viewGroup);
    }

    public final /* bridge */ /* synthetic */ int getViewTypeCount() {
        return super.getViewTypeCount();
    }

    public qom(Context context, jwv jwv, AndroidFeatureUserProperties androidFeatureUserProperties) {
        super(context, fri.class, false, jwv, androidFeatureUserProperties);
        this.c = fr.c(context, R.color.cat_grayscale_55);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ fqz a(Context context, ViewGroup viewGroup) {
        fqb.b();
        return frq.b(context, viewGroup, false);
    }
}
