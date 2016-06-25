package org.kaerdan.mvp_navigation.example5_retainpresenter.favorite_list;

import java.util.List;

import org.kaerdan.mvp_navigation.core.data.Article;
import org.kaerdan.mvp_navigation.core.fragments.OnArticleClickListener;

import android.support.annotation.NonNull;

public interface RetainPresenterFavoriteListContract {
    interface Presenter extends org.kaerdan.presenterretainer.Presenter<View> {
        void setNavigator(@NonNull Navigator navigator);
    }

    interface View extends org.kaerdan.presenterretainer.Presenter.View {
        void displayArticles(@NonNull List<Article> articles, @NonNull OnArticleClickListener onArticleClickListener);
    }

    interface Navigator {
        void openArticle(int id);
    }

    interface NavigatorProvider {
        @NonNull
        Navigator getNavigator(RetainPresenterFavoriteListContract.Presenter presenter);
    }
}