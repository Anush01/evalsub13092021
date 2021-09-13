package com.example.anushmp.eval13092021;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class VpAdapter extends FragmentPagerAdapter {

    ArrayList<String> movieposters;


    public VpAdapter(@NonNull FragmentManager fm, int behavior, ArrayList movieposters) {
        super(fm, behavior);
        this.movieposters = movieposters;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
