package com.spotify.mobile.android.wrapped2019.stories.container.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

public class StoriesBottomActionContainerView extends ConstraintLayout {
    public StoriesBottomActionContainerView(Context context) {
        super(context);
        b();
    }

    public StoriesBottomActionContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public StoriesBottomActionContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        inflate(getContext(), R.layout.sharing_bottom_menu, this);
    }
}
