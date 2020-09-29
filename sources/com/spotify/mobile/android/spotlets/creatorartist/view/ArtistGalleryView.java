package com.spotify.mobile.android.spotlets.creatorartist.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.spotify.music.R;

public class ArtistGalleryView extends FrameLayout {
    private ViewPager a = ((ViewPager) findViewById(R.id.pager));
    private PageIndicator b = ((PageIndicator) findViewById(R.id.page_indicator));

    public ArtistGalleryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.mobile_artist_header, this);
    }
}
