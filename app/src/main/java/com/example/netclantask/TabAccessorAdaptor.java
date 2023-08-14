package com.example.netclantask;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAccessorAdaptor extends FragmentPagerAdapter {

    public TabAccessorAdaptor(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                PersonalFragment personalFragment = new PersonalFragment();
                return personalFragment;
            case 1:
                BusinessFragment businessFragment = new BusinessFragment();
                return businessFragment;
            case 2:
                MerchantFragment merchantFragment = new MerchantFragment();
                return merchantFragment;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "Personal";
            case 1:
                return "Business";
            case 2:
                return "Merchant";
            default:
                return null;

        }
    }
}
