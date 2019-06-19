package com.example.myrestaurants;

import android.support.v7.widget.RecyclerView;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
//
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


@RunWith(RobolectricTestRunner.class)

public class RestaurantListActivityTest {
    private RestaurantListActivity activity;
    private RecyclerView mRecyclerView;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(RestaurantListActivity.class);
        mRecyclerView = (RecyclerView) activity.findViewById(R.id.recyclerView);
    }
//    @Test
//    public void restaurantListViewPopulates() {
//        assertNotNull(mRestaurantListView.getAdapter());
//        assertEquals(mRestaurantListView.getAdapter().getCount(), 15);
//    }
}
