package asp.studio.com.firebase.view;

import com.google.firebase.database.Query;

/**
 * Created by Amrit on 13/02/2018.
 */

public class NewPostFragment extends PostListFragment {
    @Override
    Query setQuery() {
        return mReference.child("New Posts");
    }
}
