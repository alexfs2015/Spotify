package com.spotify.music.features.pushnotifications.inapppreference.model;

import java.util.List;

final class AutoValue_Category extends Category {
    private final String name;
    private final List<NotificationV2> preferences;

    AutoValue_Category(String str, List<NotificationV2> list) {
        if (str != null) {
            this.name = str;
            if (list != null) {
                this.preferences = list;
                return;
            }
            throw new NullPointerException("Null preferences");
        }
        throw new NullPointerException("Null name");
    }

    public final String getName() {
        return this.name;
    }

    public final List<NotificationV2> getPreferences() {
        return this.preferences;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Category{name=");
        sb.append(this.name);
        sb.append(", preferences=");
        sb.append(this.preferences);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Category) {
            Category category = (Category) obj;
            return this.name.equals(category.getName()) && this.preferences.equals(category.getPreferences());
        }
    }

    public final int hashCode() {
        return ((this.name.hashCode() ^ 1000003) * 1000003) ^ this.preferences.hashCode();
    }
}
