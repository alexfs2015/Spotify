package com.spotify.music.features.pushnotifications.inapppreference;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.features.pushnotifications.inapppreference.model.Category;
import java.util.List;

public interface NotificationSettingsMvp {

    public enum Channel {
        PUSH,
        EMAIL;

        static {
            values();
        }
    }

    public interface a {
        void a();

        void a(b bVar);

        void a(String str, Channel channel, boolean z);

        void b();
    }

    public interface b {
        View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

        void a();

        void a(Bundle bundle);

        void a(a aVar);

        void a(a aVar, Bundle bundle);

        void a(String str, Channel channel, boolean z);

        void a(List<Category> list);

        void b();
    }
}
